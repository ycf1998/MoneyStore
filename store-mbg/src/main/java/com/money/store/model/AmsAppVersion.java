package com.money.store.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * App版本信息
 * </p>
 *
 * @author Money
 * @since 2020-11-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AmsAppVersion对象", description="App版本信息")
public class AmsAppVersion implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "app")
    private Long appId;

    @ApiModelProperty(value = "应用名")
    private String name;

    @ApiModelProperty(value = "Apk大小")
    private String size;

    @ApiModelProperty(value = "安装包")
    private String installFile;

    @ApiModelProperty(value = "包名")
    private String packageName;

    @ApiModelProperty(value = "版本名")
    private String versionName;

    @ApiModelProperty(value = "版本号")
    private String versionCode;

    @ApiModelProperty(value = "语言")
    private String language;

    @ApiModelProperty(value = "支持屏幕大小")
    private String screenSize;

    @ApiModelProperty(value = "资费")
    private String expenses;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "logo")
    private String logo;

    @ApiModelProperty(value = "介绍视频")
    private String video;

    @ApiModelProperty(value = "软件截图，2-5张，以逗号分割")
    private String pics;

    private LocalDateTime createDate;

    @ApiModelProperty(value = "上线时间")
    private LocalDateTime onlineDate;

    @ApiModelProperty(value = "下线时间")
    private LocalDateTime offlineDate;

    @ApiModelProperty(value = "状态：1->未审核；2->审核未通过；3->审核通过；4->已上线；5->已下线；6->驻点")
    private Integer status;

    @ApiModelProperty(value = "申请/审核记录id")
    private Long applyRecordId;


}
