package com.money.store.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 个人类型开发者
 * </p>
 *
 * @author money
 * @since 2020-12-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UmsPersonDev对象", description="个人类型开发者")
public class UmsPersonDev implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;

    @ApiModelProperty(value = "专用APPID")
    private String appId;

    @ApiModelProperty(value = "专用APPKEY")
    private String appKey;

    @ApiModelProperty(value = "真实姓名")
    private String realName;

    @ApiModelProperty(value = "18位身份证")
    private String idCard;

    @ApiModelProperty(value = "手持身份证照片")
    private String idCardPic;

    @ApiModelProperty(value = "持卡人")
    private String cardholder;

    @ApiModelProperty(value = "银行卡类型")
    private String bankCardType;

    @ApiModelProperty(value = "银行卡号")
    private String bankCardNumber;


}
