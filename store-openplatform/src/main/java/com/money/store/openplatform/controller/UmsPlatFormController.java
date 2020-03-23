package com.money.store.openplatform.controller;

import com.money.store.common.api.CommonResult;
import com.money.store.common.constant.UserTypeEnum;
import com.money.store.openplatform.dto.*;
import com.money.store.openplatform.util.UploadUtil;
import com.money.store.openplatform.domain.UmsCompanyDeveloper;
import com.money.store.openplatform.domain.UmsPersonDeveloper;
import com.money.store.model.UmsUser;
import com.money.store.openplatform.service.UmsPlatformService;
import com.money.store.openplatform.service.UmsUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: store
 * @description: 平台用户注册管理Controller
 * @author: Money
 * @create: 2020/03/01 16:18
 */
@Controller
@Api(value="平台用户注册管理controller", tags="平台用户注册管理")
@RequestMapping("/platform")
public class UmsPlatFormController {
    @Autowired
    private UmsUserService umsUserService;
    @Autowired
    private UmsPlatformService platformService;
    @Autowired
    private UploadUtil uploadUtil;

    @ApiOperation(value = "激活开发者资质")
    @GetMapping(value = "/activeDev/{token}")
    @ResponseBody
    public CommonResult activeDev(@PathVariable("token") String token) {
        String username = umsUserService.getAuthValue(token);
        if (!StringUtils.isEmpty(username)) {
            // 激活开发者
            platformService.activateDev(username);
            return CommonResult.success(null,"验证成功，已激活开发者资质！");
        }
        return CommonResult.failed("验证失败或已失效！");
    }

    @ApiOperation(value = "检查账号的唯一性")
    @GetMapping(value = "/checkUsername/{username}")
    @ResponseBody
    public CommonResult checkUsername(@PathVariable("username") String username) {
        if (umsUserService.getUserByUsername(username) == null) {
            return CommonResult.success(0, "可以使用！");
        } else {
            return CommonResult.failed(" 账号已被注册！");
        }
    }

    @ApiOperation(value = "检查邮箱的唯一性")
    @GetMapping(value = "/checkEmail")
    @ResponseBody
    public CommonResult checkEmail(String email) {
        if (umsUserService.getUserByEmail(email) == null) {
            return CommonResult.success(0, "可以使用！");
        } else {
            return CommonResult.failed("邮箱已被注册！");
        }
    }

    @ApiOperation(value = "检查是否已经验证邮箱")
    @GetMapping(value = "/checkVerify/{username}")
    @ResponseBody
    public CommonResult checkVerify(@PathVariable("username") String username) {
        if (platformService.isActivationDev(username)) {
            return CommonResult.success("验证成功！");
        } else {
            return CommonResult.failed("还未验证！");
        }
    }

    @ApiOperation(value = "注册时验证为商店用户")
    @PostMapping(value = "/register/login")
    @ResponseBody
    public CommonResult regLogin(@RequestBody UmsUserLoginParam umsUserLoginParam, BindingResult result) {
        UmsUser umsUser = platformService.regLogin(umsUserLoginParam.getUsername(), umsUserLoginParam.getPassword());
        if (umsUser == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, Object> data = new HashMap<>();
        data.put("username", umsUser.getUsername());
        data.put("icon", umsUser.getIcon());
        data.put("nickname", umsUser.getNickname());
        data.put("gender", umsUser.getGender());
        data.put("info", umsUser.getInfo());
        data.put("phone", umsUser.getPhone());
        data.put("type", umsUser.getType());
        return CommonResult.success(data);
    }


    @ApiOperation(value = "个人类型开发者注册")
    @PostMapping(value = "/register/person")
    @ResponseBody
    public CommonResult<UmsPersonDeveloper> register(@Valid UmsPersonDevParam umsPersonDevParams,
                                                     @RequestParam(required=false) MultipartFile iconFile,
                                                     @RequestParam(required=false) MultipartFile idCardPicFile,
                                                     BindingResult result) {
        if (result.hasErrors()) {
            return CommonResult.failed(result.getAllErrors().get(0).getDefaultMessage());
        }
        String icon = uploadUtil.uploadIcon(iconFile);
        String idCardPic = uploadUtil.uploadDocumentation(UserTypeEnum.PERSON_DEV.getId(), idCardPicFile);
        if (icon == null) {
            icon = "person.jpg";
        }
        if (idCardPic != null) {
            umsPersonDevParams.setIcon(icon);
            umsPersonDevParams.setIdCardPic(idCardPic);
            UmsPersonDeveloper umsPersonDeveloper = platformService.personDevRegister(umsPersonDevParams);
            if (umsPersonDeveloper == null) {
                return CommonResult.failed("不好意思，注册失败！系统繁忙，请稍后再试！");
            }
            return CommonResult.success(umsPersonDeveloper);
        } else {
            return CommonResult.failed("手持身份证件照上传失败");
        }
    }

    @ApiOperation(value = "商店用户升级个人开发者")
    @PostMapping(value = "/register/upgradePersonDev")
    @ResponseBody
    public CommonResult<UmsPersonDeveloper> upgradePersonDev(@Valid UmsUpgradePersonDevParam umsUpgradePersonDevParam,
                                                             @RequestParam(required=false) MultipartFile iconFile,
                                                             @RequestParam(required=false) MultipartFile idCardPicFile,
                                                             BindingResult result) {
        if (result.hasErrors()) {
            return CommonResult.failed(result.getAllErrors().get(0).getDefaultMessage());
        }
        String icon = uploadUtil.uploadIcon(iconFile);
        String idCardPic = uploadUtil.uploadDocumentation(UserTypeEnum.PERSON_DEV.getId(), idCardPicFile);
        if (idCardPic != null) {
            umsUpgradePersonDevParam.setIcon(icon);
            umsUpgradePersonDevParam.setIdCardPic(idCardPic);
            UmsPersonDeveloper umsPersonDeveloper = platformService.upgradePersonDev(umsUpgradePersonDevParam);
            if (umsPersonDeveloper == null) {
                return CommonResult.failed("不好意思，注册失败！系统繁忙，请稍后再试！");
            }
            return CommonResult.success(umsPersonDeveloper);
        } else {
            return CommonResult.failed("手持身份证件照上传失败");
        }
    }

    @ApiOperation(value = "公司类型开发者注册")
    @PostMapping(value = "/register/company")
    @ResponseBody
    public CommonResult<UmsCompanyDeveloper> register(@Valid UmsCompanyDevParam umsCompanyDevParam,
                                                      @RequestParam(required=false) MultipartFile iconFile,
                                                      @RequestParam(required=false) MultipartFile businessLicenseFile,
                                                      BindingResult result) {
        if (result.hasErrors()) {
            return CommonResult.failed(result.getAllErrors().get(0).getDefaultMessage());
        }
        String icon = uploadUtil.uploadIcon(iconFile);
        String businessLicense = uploadUtil.uploadDocumentation(UserTypeEnum.COMPANY_DEV.getId(), businessLicenseFile);
        if (icon == null) {
            icon = "company.jpg";
        }
        if (businessLicense != null) {
            umsCompanyDevParam.setIcon(icon);
            umsCompanyDevParam.setBusinessLicense(businessLicense);
            UmsCompanyDeveloper umsCompanyDeveloper = platformService.companyDevRegister(umsCompanyDevParam);
            if (umsCompanyDeveloper == null) {
                return CommonResult.failed("不好意思，注册失败！系统繁忙，请稍后再试！");
            }
            return CommonResult.success(umsCompanyDeveloper);
        } else {
            return CommonResult.failed("营业照上传失败");
        }
    }

    @ApiOperation(value = "修改邮箱")
    @PostMapping(value = "/changeEmail")
    @ResponseBody
    public CommonResult changeEmail(@RequestBody UmsUser umsUser) {
        String username = umsUser.getUsername();
        String password = umsUser.getPassword();
        String email = umsUser.getEmail();
        if(platformService.changeEmail(username, password, email)) {
            return CommonResult.success(new Date(), "修改成功");
        } else {
            return CommonResult.failed("修改失败");
        }
    }

    @ApiOperation(value = "邮箱重置密码")
    @PostMapping(value = "/resetPassword")
    @ResponseBody
    public CommonResult resetPassword(@RequestBody @Valid ResetPasswordParams resetPasswordParams,
                                      BindingResult result) {
        if (result.hasErrors()) {
            return CommonResult.failed(result.getAllErrors().get(0).getDefaultMessage());
        }
        String realId = umsUserService.getAuthValue(resetPasswordParams.getToken());
        if (!StringUtils.isEmpty(realId)) {
            if (umsUserService.resetPassword(Long.parseLong(realId), resetPasswordParams.getNewPassword())) {
                return CommonResult.success(null, "修改成功");
            } else {
                return CommonResult.failed("十分抱歉，系统出错！");
            }
        } else {
            return CommonResult.failed("验证失败！");
        }
    }

}
