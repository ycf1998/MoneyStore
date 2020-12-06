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
 * 用户统计信息
 * </p>
 *
 * @author money
 * @since 2020-12-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UmsUserStatisticsInfo对象", description="用户统计信息")
public class UmsUserStatisticsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String user;

    @ApiModelProperty(value = "下载量")
    private String downloadAmount;

    @ApiModelProperty(value = "累计消费金额")
    private BigDecimal consumeAmount;

    @ApiModelProperty(value = "订单总量")
    private Integer orderCount;

    @ApiModelProperty(value = "评论量")
    private Integer commentCount;

    @ApiModelProperty(value = "登录次数")
    private Integer loginCount;

    @ApiModelProperty(value = "关注量")
    private Integer attendCount;

    @ApiModelProperty(value = "粉丝量")
    private Integer fansCount;

    @ApiModelProperty(value = "收藏App数量")
    private Integer collectAppCount;

    @ApiModelProperty(value = "收藏专题数量")
    private Integer collectTopicCount;

    @ApiModelProperty(value = "最后一次下载时间")
    private LocalDateTime recentDownloadTime;

    @ApiModelProperty(value = "申请应用上架次数")
    private Integer applyAppCount;

    @ApiModelProperty(value = "发布的App总量（包括下架）")
    private Integer appCount;

    @ApiModelProperty(value = "发售中的App总量")
    private Integer onSaleAppCount;

    @ApiModelProperty(value = "被下载量")
    private Integer devDownloadedCount;

    @ApiModelProperty(value = "开发平台登录次数")
    private Integer devLoginCount;

    @ApiModelProperty(value = "最后申请上架时间")
    private LocalDateTime recentPublishTime;


}
