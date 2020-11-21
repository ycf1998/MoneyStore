package com.money.store.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * App应用信息
 * </p>
 *
 * @author Money
 * @since 2020-11-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AmsApp对象", description="App应用信息")
public class AmsApp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "开发者")
    private String dev;

    @ApiModelProperty(value = "软件名称")
    private String name;

    @ApiModelProperty(value = "Apk大小")
    private String size;

    @ApiModelProperty(value = "安装包类型：1-> 安卓；2->IOS")
    private Integer type;

    @ApiModelProperty(value = "安装包")
    private String installFile;

    @ApiModelProperty(value = "包名")
    private String packageName;

    @ApiModelProperty(value = "语言")
    private String language;

    @ApiModelProperty(value = "支持屏幕大小")
    private String screenSize;

    @ApiModelProperty(value = "资费")
    private String expenses;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "评分")
    private BigDecimal score;

    @ApiModelProperty(value = "广告语")
    private String advertisement;

    @ApiModelProperty(value = "详细信息")
    private String detailDesc;

    @ApiModelProperty(value = "状态：1->未审核；2->审核未通过；3->审核通过；4->已上架；5->已下架")
    private Integer status;

    @ApiModelProperty(value = "下载量")
    private String downloads;

    @ApiModelProperty(value = "logo图标")
    private String logo;

    @ApiModelProperty(value = "版权证明图片，逗号分隔")
    private String copyright;

    @ApiModelProperty(value = "标签，最多3个，以逗号分割")
    private String label;

    @ApiModelProperty(value = "关键词，最多3个，以逗号分割")
    private String keywords;

    @ApiModelProperty(value = "上架申请时的备注")
    private String remarks;

    @ApiModelProperty(value = "开源应用的github地址")
    private String github;

    @ApiModelProperty(value = "官方链接")
    private String link;

    @ApiModelProperty(value = "申请审核时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "更新日期")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "上架时间")
    private LocalDateTime onSaleDate;

    @ApiModelProperty(value = "下架时间")
    private LocalDateTime offSaleDate;

    @ApiModelProperty(value = "一级分类")
    private Integer categoryLevel1;

    @ApiModelProperty(value = "二级分类")
    private Integer categoryLevel2;

    @ApiModelProperty(value = "三级分类")
    private Integer categoryLevel3;

    @ApiModelProperty(value = "版本id")
    private Long nowVersion;

    private Long applyRecordId;


}
