package com.money.store.openplatform.dto;/**
 * @Author: YCF
 * @Date: 2020/1/27 12:50
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *@program: appstore
 *@description: 公司类型开发者注册参数
 *@author: Money
 *@create: 2020/01/27 12:50
 */
@Getter
@Setter
public class UmsCompanyDevParam {

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

    @ApiModelProperty(value = "个人信息")
    private String info;

    @ApiModelProperty(value = "公司全称", required = true)
    private String companyName;

    @ApiModelProperty(value = "营业执照注册号", required = true)
    @NotEmpty(message = "营业执照注册号不能为空")
    private String businessLicenseRegNumber;

    @ApiModelProperty(value = "营业执照照片", required = true)
    private String businessLicense;

    @ApiModelProperty(value = "联系人", required = true)
    private String contact;

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
