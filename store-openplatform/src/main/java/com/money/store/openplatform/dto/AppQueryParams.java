package com.money.store.openplatform.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @program: store
 * @description: 查询应用参数
 * @author: Money
 * @create: 2020/11/21 12:36:19
 */
@Getter
@Setter
public class AppQueryParams {

    private String dev;

    @ApiModelProperty(value = "软件名称")
    private String name;

    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "语言")
    private String language;

    @ApiModelProperty(value = "资费")
    private String expense;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "上架时间")
    private LocalDateTime onSaleTime;

    @ApiModelProperty(value = "下架时间")
    private LocalDateTime offSaleTime;

    @ApiModelProperty(value = "一级分类")
    private Integer category_1;

    @ApiModelProperty(value = "二级分类")
    private Integer category_2;

    @ApiModelProperty(value = "三级分类")
    private Integer category_3;
}
