package com.money.store.openplatform.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


/**
 *@program: appstore
 *@description: 个人类型开发者注册参数
 *@author: Money
 *@create: 2020/01/27 12:46
 */
@Getter
@Setter
public class UmsPersonDevParam {

    @ApiModelProperty(value = "账号", required = true)
    @Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,12}$",
            message = "账号仅且必须包含英文和数字，且长度在6-12个字符")
    private String username;

    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    @Size(min = 6, message = "密码至少需要6个字符")
    private String password;

    @ApiModelProperty(value = "头像", required = true)
    private String icon;

    @ApiModelProperty(value = "昵称", required = true)
    private String nickname;

    @ApiModelProperty(value = "性别：0->未知；1->男；2->女")
    private Integer gender;

    @ApiModelProperty(value = "个人信息")
    private String info;

    @ApiModelProperty(value = "真实姓名", required = true)
    private String realName;

    @ApiModelProperty(value = "18位身份证", required = true)
    @NotEmpty(message = "身份证不能为空")
    private String idCard;

    @ApiModelProperty(value = "手持身份证照片", required = true)
    private String idCardPic;

    @ApiModelProperty(value = "手机号", required = true)
    private String phone;

    @ApiModelProperty(value = "邮箱", required = true)
    @Email(message = "邮箱格式不合法")
    private String email;

    @ApiModelProperty(value = "省", required = true)
    private String province;

    @ApiModelProperty(value = "城市", required = true)
    private String city;

    @ApiModelProperty(value = "详细地址", required = true)
    private String address;
}
