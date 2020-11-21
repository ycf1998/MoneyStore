package com.money.store.openplatform.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.money.store.common.api.CommonResult;
import com.money.store.model.AmsApp;
import com.money.store.openplatform.dto.AppQueryParams;
import com.money.store.openplatform.dto.ApplyAppParams;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @program: store
 * @description: 应用Service
 * @author: Money
 * @create: 2020/08/29 19:38
 */
public interface AmsAppService {

    /**
     * 上传APK文件
     * @param file
     * @param packageName
     * @return
     */
    String uploadApk(MultipartFile file, String packageName, String versionName, String versionCode, String dev);

    /**
     * 申请应用上架
     * @param applyAppParams
     * @return
     */
    CommonResult appApply(ApplyAppParams applyAppParams, MultipartFile logoFile,
                          MultipartFile[] picsFiles, MultipartFile[] copyrightFiles);

    /**
     * 查询应用
     * @param appQueryParams
     * @param page
     * @return
     */
    List<AmsApp> appList(AppQueryParams appQueryParams, Page<AmsApp> page);
}
