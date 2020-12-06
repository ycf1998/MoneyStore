package com.money.store.openplatform.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.money.store.common.api.CommonResult;
import com.money.store.model.AmsApp;
import com.money.store.openplatform.dto.AppQueryParams;
import com.money.store.openplatform.dto.ApplyAppParams;
import com.money.store.openplatform.service.AmsAppCategoryService;
import com.money.store.openplatform.service.AmsAppService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.security.Principal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: store
 * @description: App应用管理Controller
 * @author: Money
 * @create: 2020/04/07 15:50
 */
@RestController
@RequestMapping("/devAms")
public class AmsAppController {

    @Autowired
    private AmsAppService amsAppService;
    @Autowired
    private AmsAppCategoryService appCategoryService;

    @ApiOperation(value = "上传APK文件")
    @PostMapping("/apk")
    public CommonResult uploadApk(MultipartFile file, String packageName, String versionName, String versionCode, String dev) {
        Map<String, String> map = new HashMap<>();
        String appFileName = amsAppService.uploadApk(file, packageName, versionName, versionCode, dev);
        if (appFileName != null) {
            map.put("appFileName", appFileName);
            return CommonResult.success(map);
        }
        return CommonResult.failed("解析失败请重新上传");
    }

    @ApiOperation(value = "申请应用上架")
    @PostMapping("/app")
    public CommonResult<String> applyApp(@Valid ApplyAppParams applyAppParams, MultipartFile logoFile,
                                         MultipartFile[] picsFiles, MultipartFile[] copyrightFiles, Principal principal) {
        if (StrUtil.isNotBlank(applyAppParams.getOnSaleDateStr())) {
            LocalDateTime onSaleDate = LocalDateTime.parse(applyAppParams.getOnSaleDateStr(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            applyAppParams.setOnSaleDate(onSaleDate);
        }
        applyAppParams.setDev(principal.getName());
        return amsAppService.appApply(applyAppParams, logoFile, picsFiles, copyrightFiles);
    }

    @ApiOperation(value = "查询应用")
    @GetMapping("/app")
    public CommonResult getAppList(Principal principal, AppQueryParams appQueryParams, Page<AmsApp> page) {
        appQueryParams.setDev(principal.getName());
        return CommonResult.success(amsAppService.appList(appQueryParams, page));
    }

    @ApiOperation(value = "获取应用分类")
    @GetMapping("/categoryTreeList")
    public CommonResult categoryTreeList() {
        return CommonResult.success(appCategoryService.categoryTreeList());
    }

}
