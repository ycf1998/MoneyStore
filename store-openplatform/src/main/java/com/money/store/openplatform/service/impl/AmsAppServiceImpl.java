package com.money.store.openplatform.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.money.store.common.api.CommonResult;
import com.money.store.mapper.*;
import com.money.store.model.*;
import com.money.store.openplatform.constant.AppStatusEnum;
import com.money.store.openplatform.dto.AppQueryParams;
import com.money.store.openplatform.dto.ApplyAppParams;
import com.money.store.openplatform.service.AmsAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

import static org.springframework.transaction.annotation.Propagation.REQUIRED;


/**
 * @program: store
 * @description: 应用Service
 * @author: Money
 * @create: 2020/08/29 23:35:17
 */
@Service
public class AmsAppServiceImpl implements AmsAppService {

    @Autowired
    private UploadFileServiceImpl uploadFileService;
    @Autowired
    private AmsAppTemporaryMapper amsAppTemporaryMapper;
    @Autowired
    private AmsAppMapper amsAppMapper;
    @Autowired
    private AmsAppVersionMapper amsAppVersionMapper;
    @Autowired
    private AmsAppApplyRecordMapper amsAppApplyRecordMapper;
    @Autowired
    private UmsUserStatisticsInfoMapper umsUserStatisticsInfoMapper;

    @Override
    public String uploadApk(MultipartFile file, String packageName, String versionName, String versionCode, String dev) {
        // 上传apk
        String filePath = uploadFileService.uploadApk(file, packageName);
        if (filePath != null) {
            // 存入暂存表
            AmsAppTemporary appTemporary = new AmsAppTemporary();
            appTemporary.setDev(dev);
            appTemporary.setInstallFile(filePath);
            appTemporary.setPackageName(packageName);
            appTemporary.setVersionCode(versionCode);
            appTemporary.setVersionName(versionName);
            appTemporary.setCreateTime(LocalDateTime.now());
            amsAppTemporaryMapper.insert(appTemporary);
        }
        return filePath;
    }

    @Override
    @Transactional(propagation = REQUIRED, rollbackFor = Exception.class)
    public CommonResult<String> appApply(ApplyAppParams applyAppParams, MultipartFile logoFile,
                                 MultipartFile[] picsFiles, MultipartFile[] copyrightFiles) {
        // 查询存不存在该应用
        String appName = applyAppParams.getName();
        QueryWrapper<AmsApp> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", appName);
        List<AmsApp> amsApps = amsAppMapper.selectList(queryWrapper);
        if (CollectionUtil.isNotEmpty(amsApps)) {
            return CommonResult.failed("该应用名称已存在");
        }
        // 上传Logo、截图和版权
        String logo = uploadFileService.uploadLogo(logoFile);
        String pics =  uploadFileService.uploadPics(picsFiles);
        String copyright =  uploadFileService.uploadCopyright(copyrightFiles);
        LocalDateTime now = LocalDateTime.now();
        AmsApp amsApp = new AmsApp();
        AmsAppVersion appVersion = new AmsAppVersion();
        AmsAppApplyRecord record = new AmsAppApplyRecord();
        // 保存应用信息表
        BeanUtil.copyProperties(applyAppParams, amsApp);
        amsApp.setCategoryLevel1(applyAppParams.getCategory().get(0));
        amsApp.setCategoryLevel2(applyAppParams.getCategory().get(1));
        amsApp.setCategoryLevel3(applyAppParams.getCategory().get(2));
        amsApp.setLogo(logo);
        amsApp.setCopyright(copyright);
        amsApp.setCreateDate(now);
        amsApp.setStatus(AppStatusEnum.UNAUDITED.getId());
        amsApp.setType(1);
        BeanUtil.copyProperties(amsApp, appVersion);
        amsAppMapper.insert(amsApp);
        // 保存版本信息表
        appVersion.setAppId(amsApp.getId());
        appVersion.setVersionName(applyAppParams.getVersionName());
        appVersion.setVersionCode(applyAppParams.getVersionCode());
        appVersion.setPics(pics);
        amsAppVersionMapper.insert(appVersion);
        // 保存应用申请表
        record.setAppId(amsApp.getId());
        record.setApplyDate(now);
        record.setDev(applyAppParams.getDev());
        record.setAppName(applyAppParams.getName());
        amsAppApplyRecordMapper.insert(record);
        // 应用信息添加最新版本和申请记录
        amsApp.setNowVersion(appVersion.getId());
        amsApp.setApplyRecordId(record.getId());
        amsAppMapper.updateById(amsApp);
        // 更新用户统计表，增加发布次数 apply_app_count
        UpdateWrapper<UmsUserStatisticsInfo> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("user", amsApp.getDev());
        updateWrapper.setSql("apply_app_count = apply_app_count + 1");
        umsUserStatisticsInfoMapper.update(new UmsUserStatisticsInfo(), updateWrapper);
        return CommonResult.success("应用申请提交成功");
    }

    @Override
    public Page<AmsApp> appList(AppQueryParams appQueryParams, Page<AmsApp> page) {
        QueryWrapper<AmsApp> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("dev", appQueryParams.getDev());
        if (StrUtil.isNotBlank(appQueryParams.getName())) {
            queryWrapper.like("name", appQueryParams.getName());
        }
        if (StrUtil.isNotBlank(appQueryParams.getType())) {
            queryWrapper.eq("type", appQueryParams.getType());
        }
        if (appQueryParams.getStatus() != null) {
            queryWrapper.eq("status", appQueryParams.getStatus());
        }
        if (appQueryParams.getCreateTime() != null) {
            queryWrapper.eq("create_time", appQueryParams.getCreateTime());
        }
        if (StrUtil.isNotBlank(appQueryParams.getExpense())) {
            queryWrapper.eq("expense", appQueryParams.getExpense());
        }
        if (StrUtil.isNotBlank(appQueryParams.getLanguage())) {
            queryWrapper.eq("language", appQueryParams.getLanguage());
        }
        if (appQueryParams.getOnSaleTime() != null) {
            queryWrapper.eq("on_sale_date", appQueryParams.getOnSaleTime());
        }
        if (appQueryParams.getOffSaleTime() != null) {
            queryWrapper.eq("off_sale_date", appQueryParams.getOffSaleTime());
        }
        if (appQueryParams.getCategory_1() != null) {
            queryWrapper.eq("category_level1", appQueryParams.getCategory_1());
        }
        if (appQueryParams.getCategory_2() != null) {
            queryWrapper.eq("category_level2", appQueryParams.getCategory_2());
        }
        if (appQueryParams.getCategory_3() != null) {
            queryWrapper.eq("category_level3", appQueryParams.getCategory_3());
        }
        return amsAppMapper.selectPage(page, queryWrapper);
    }
}
