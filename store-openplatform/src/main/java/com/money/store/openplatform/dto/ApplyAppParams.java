package com.money.store.openplatform.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @program: store
 * @description: 提交审核App应用参数
 * @author: Money
 * @create: 2020/04/08 22:27
 */
@Getter
@Setter
public class ApplyAppParams {

    @ApiModelProperty(value = "软件名称")
    @NotBlank(message = "应用名称不能为空")
    private String name;

    @ApiModelProperty(value = "开发者")
    private String dev;

    @ApiModelProperty(value = "apk/ipa文件")
    private String installFile;

    @ApiModelProperty(value = "apk/ipa文件大小")
    private String size;

    @ApiModelProperty(value = "包名")
    private String packageName;

    @ApiModelProperty(value = "版本名")
    private String versionName;

    @ApiModelProperty(value = "版本号")
    private String versionCode;

    @ApiModelProperty(value = "语言")
    @NotBlank(message = "请选择语言")
    private String language;

    @ApiModelProperty(value = "资费")
    @NotBlank
    @NotBlank(message = "请选择资费类型")
    private String expenses;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "广告语")
    @Size(max=20, message = "广告语不能大于20个字符")
    private String advertisement;

    @ApiModelProperty(value = "logo图标")
    private String logo;

    @ApiModelProperty(value = "介绍视频")
    private String video;

    @ApiModelProperty(value = "软件截图，2-5张，以逗号分割")
    private String pics;

    @ApiModelProperty(value = "版权证明图片，逗号分隔")
    private String copyright;

    @ApiModelProperty(value = "应用官网")
    private String link;

    @ApiModelProperty(value = "github仓库地址")
    private String github;

    @ApiModelProperty(value = "标签，最多3个，以逗号分割")
    private String keywords;

    @ApiModelProperty(value = "上架申请时的备注")
    private String remarks;

    @ApiModelProperty(value = "上架时间")
    private String onSaleDateStr;

    @ApiModelProperty(value = "上架时间")
    private LocalDateTime onSaleDate;

    @ApiModelProperty(value = "分类(xx,xx,xx)")
    private List<Integer> category;

    @ApiModelProperty(value = "详细信息")
    @NotBlank(message = "详细信息不能未空")
    private String detailDesc;
}
