package com.money.store.openplatform.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 *@program: appstore
 *@description: 商店用户升级个人类型开发者注册参数
 *@author: Money
 *@create: 2020/02/05 17:36
 */
@Getter
@Setter
public class UmsUpgradePersonDevParam {
    @ApiModelProperty(value = "账号", required = true)
    @NotEmpty(message = "账号不能为空")
    private String username;

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
    private String idCard;

    @ApiModelProperty(value = "手持身份证照片", required = true)
    private String idCardPic;

    @ApiModelProperty(value = "邮箱", required = true)
    private String email;

    @ApiModelProperty(value = "省", required = true)
    private String province;

    @ApiModelProperty(value = "城市", required = true)
    private String city;

    @ApiModelProperty(value = "详细地址", required = true)
    private String address;
}
