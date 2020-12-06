package com.money.store.model;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * App应用上架申请/审核记录
 * </p>
 *
 * @author money
 * @since 2020-12-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AmsAppApplyRecord对象", description="App应用上架申请/审核记录")
public class AmsAppApplyRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    private Long appId;

    @ApiModelProperty(value = "app名称")
    private String appName;

    @ApiModelProperty(value = "开发者")
    private String dev;

    @ApiModelProperty(value = "申请时间")
    private LocalDateTime applyTime;

    @ApiModelProperty(value = "审核员")
    private Long auditUser;

    @ApiModelProperty(value = "审核时间")
    private LocalDateTime auditTime;

    @ApiModelProperty(value = "结果")
    private Integer result;

    @ApiModelProperty(value = "审核描述")
    private String description;


}
