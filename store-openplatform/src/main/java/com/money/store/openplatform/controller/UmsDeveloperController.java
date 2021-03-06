package com.money.store.openplatform.controller;

import com.money.store.common.api.CommonResult;
import com.money.store.model.UmsUser;
import com.money.store.openplatform.dto.UmsUserLoginParam;
import com.money.store.openplatform.service.UmsUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: store
 * @description: 用户登录管理Controller
 * @author: Money
 * @create: 2020/03/01 16:13
 */
@Controller
@Api(value="用户注册controller", tags="用户登录管理")
@RequestMapping("/sso")
public class UmsDeveloperController {

    @Autowired
    private UmsUserService umsUserService;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "获取当前登录用户信息")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAdminInfo(Principal principal) {
        String username = principal.getName();
        UmsUser umsUser = umsUserService.getUserByUsername(username);
        Map<String, Object> data = new HashMap<>();
        data.put("username", umsUser.getUsername());
        data.put("icon", umsUser.getIcon());
        data.put("type", umsUser.getType());
        data.put("roles", new String[]{"DEV"});
        return CommonResult.success(data);
    }

    @ApiOperation(value = "登录以后返回token")
    @PostMapping(value = "/login")
    @ResponseBody
    public CommonResult login(@RequestBody UmsUserLoginParam umsUserLoginParam, BindingResult result) {
        String token = umsUserService.login(umsUserLoginParam.getUsername(), umsUserLoginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>(2);
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation(value = "登出功能")
    @PostMapping(value = "/logout")
    @ResponseBody
    public CommonResult logout() {
        return CommonResult.success(null);
    }
}
