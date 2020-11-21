package com.money.store.model;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 基础用户
 * </p>
 *
 * @author Money
 * @since 2020-11-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UmsUser对象", description="基础用户")
public class UmsUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "账号")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "联系人")
    private String contact;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "帐号启用状态:0->禁用；1->启用；")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "头像")
    private String icon;

    @ApiModelProperty(value = "性别：0->未知；1->男；2->女")
    private Integer gender;

    @ApiModelProperty(value = "生日")
    private LocalDate birthday;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "个人信息")
    private String info;

    @ApiModelProperty(value = "关注量")
    private Integer attendCount;

    @ApiModelProperty(value = "粉丝量")
    private Integer fansCount;

    @ApiModelProperty(value = "是否激活开发者资质：0->未激活；1->已激活")
    private Integer activation;

    @ApiModelProperty(value = "用户类型：0->商店用户；1->个人；2->公司")
    private Integer type;

    @ApiModelProperty(value = "用户类型升级时间")
    private LocalDateTime upgradeTime;


}
