package com.money.store.openplatform.controller;

import com.money.store.common.api.CommonResult;
import com.money.store.common.constant.UserTypeEnum;
import com.money.store.model.UmsCompanyDev;
import com.money.store.model.UmsPersonDev;
import com.money.store.model.UmsUser;
import com.money.store.model.UmsUserLoginLog;
import com.money.store.openplatform.dto.UpdateProfileParam;
import com.money.store.openplatform.dto.UpdateUserPasswordParam;
import com.money.store.openplatform.service.UmsUserService;
import com.money.store.openplatform.service.UploadFileService;
import com.money.store.openplatform.util.file.UploadUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: store
 * @description: 个人信息业务处理
 * @author: Money
 * @create: 2020/03/25 21:12
 */
@Api(value="个人信息业务处理", tags="个人信息业务处理")
@RestController
@RequestMapping("/dev")
public class UmsProfileController {

    @Autowired
    private UmsUserService umsUserService;
    @Autowired
    private UploadFileService uploadFileService;

    @ApiOperation(value = "获取登录日志")
    @GetMapping(value = "/loginLog")
    @ResponseBody
    public CommonResult loginLog(Principal principal) {
        String username = principal.getName();
        List<UmsUserLoginLog> loginLog = umsUserService.getLoginLog(username);
        return CommonResult.success(loginLog);
    }

    @ApiOperation(value = "获取当前登录用户个人主页信息")
    @GetMapping(value = "/profile")
    @ResponseBody
    public CommonResult profile(Principal principal) {
        Map<String, Object> data = new HashMap<>();
        String username = principal.getName();
        UmsUser umsUser = umsUserService.getUserByUsername(username);
        data.put("user", umsUser);
        data.put("roles", new String[]{"DEV"});
        return CommonResult.success(data);
    }

    @ApiOperation(value = "获取当前登录用户开发者资质")
    @GetMapping(value = "/devProfile/{type}")
    @ResponseBody
    public CommonResult devProfile(@PathVariable("type") int type, Principal principal) {
        Map<String, Object> data = new HashMap<>();
        String username = principal.getName();
        if (type == UserTypeEnum.PERSON_DEV.getId()) {
            UmsPersonDev personDevProFile = umsUserService.getPersonDevProFile(username);
            data.put("dev", personDevProFile);
        } else if (type == UserTypeEnum.COMPANY_DEV.getId()) {
            UmsCompanyDev companyDevProFile = umsUserService.getCompanyDevProFile(username);
            data.put("dev", companyDevProFile);
        } else {
            return CommonResult.failed("开发者类型错误");
        }
        return CommonResult.success(data);
    }

    @ApiOperation(value = "修改个人基本资料")
    @PutMapping("/profile")
    public CommonResult updateProfile(@RequestBody UpdateProfileParam updateProfileParam) {
        int count = umsUserService.update(updateProfileParam);
        if (count > 0) {
            return CommonResult.success(count, "修改成功");
        } else {
            return CommonResult.failed("修改失败");
        }
    }

    @ApiOperation(value = "修改密码")
    @PutMapping("/updatePwd")
    public CommonResult updatePwd(@RequestBody UpdateUserPasswordParam updateUserPasswordParam) {
        int status = umsUserService.updatePassword(updateUserPasswordParam);
        switch (status) {
            case -1: return CommonResult.failed("参数不合法");
            case -2: return CommonResult.failed("账号不存在");
            case -3: return CommonResult.failed("原密码不正确");
            default: return CommonResult.success(status, "修改成功");
        }
    }

    @ApiOperation(value = "更新头像")
    @PostMapping("/avatar")
    public CommonResult avatar(@RequestParam MultipartFile file, Principal principal) {
        UploadUtil uploadUtil = new UploadUtil();
        String newIcon = uploadFileService.uploadIcon(file);
        if (newIcon != null) {
            String username = principal.getName();
            int count = umsUserService.updateAvatar(username, newIcon);
            if (count > 0) {
                return CommonResult.success(newIcon, "修改成功");
            } else {
                return CommonResult.failed("修改失败");
            }
        } else {
            return CommonResult.failed("上传失败");
        }
    }

    @ApiOperation(value = "修改邮箱")
    @PutMapping(value = "/updateEmail")
    @ResponseBody
    public CommonResult updateEmail(String email, String password, Principal principal) {
        String username = principal.getName();
        int count = umsUserService.updateEmail(email, username, password);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed("修改失败");
        }
    }
}
