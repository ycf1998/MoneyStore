package com.money.store.openplatform.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @program: store
 * @description: 重置密码参数
 * @author: Money
 * @create: 2020/03/01 18:44
 */
@Getter
@Setter
public class ResetPasswordParams {

    @ApiModelProperty(value = "id", required = true)
    @NotNull(message = "缺少id")
    private Long id;

    @ApiModelProperty(value = "token", required = true)
    private String token;

    @ApiModelProperty(value = "新密码", required = true)
    @NotEmpty(message = "新密码不能为空")
    @Size(min = 6, message = "密码至少需要6个字符")
    private String newPassword;
}
