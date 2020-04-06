package com.money.store.openplatform.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: store
 * @description: 修改个人基本资料参数
 * @author: Money
 * @create: 2020/03/26 17:38
 */
@Setter
@Getter
public class UpdateProfileParam {

    @ApiModelProperty(value = "账号", required = true)
    private String username;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "性别")
    private Integer gender;

    @ApiModelProperty(value = "个人简介")
    private String info;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "开发者类型")
    private Integer type;

    @ApiModelProperty(value = "联系人")
    private String contact;

    @ApiModelProperty(value = "手机号码")
    private String phone;
}
