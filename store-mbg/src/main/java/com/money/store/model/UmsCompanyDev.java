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
 * 公司类型开发者
 * </p>
 *
 * @author money
 * @since 2020-12-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UmsCompanyDev对象", description="公司类型开发者")
public class UmsCompanyDev implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;

    @ApiModelProperty(value = "专用APPID")
    private String appId;

    @ApiModelProperty(value = "专用APPKEY")
    private String appKey;

    @ApiModelProperty(value = "公司全称")
    private String companyName;

    @ApiModelProperty(value = "营业执照注册号")
    private String businessLicenseRegNumber;

    @ApiModelProperty(value = "营业执照照片")
    private String businessLicense;

    @ApiModelProperty(value = "持卡人")
    private String cardholder;

    @ApiModelProperty(value = "银行卡类型")
    private String bankCardType;

    @ApiModelProperty(value = "银行卡号")
    private String bankCardNumber;


}
