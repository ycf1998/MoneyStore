package com.money.store.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UmsUserStatisticsInfo implements Serializable {
    private Long id;

    private Long userId;

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
    private Date recentDownloadTime;

    @ApiModelProperty(value = "发布的App总量（包括下架）")
    private Integer appCount;

    @ApiModelProperty(value = "发售中的App总量")
    private Integer onSaleAppCount;

    @ApiModelProperty(value = "被下载量")
    private Integer devDownloadedCount;

    @ApiModelProperty(value = "开发平台登录次数")
    private Integer devLoginCount;

    @ApiModelProperty(value = "最后申请上架时间")
    private Date recentPublishTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDownloadAmount() {
        return downloadAmount;
    }

    public void setDownloadAmount(String downloadAmount) {
        this.downloadAmount = downloadAmount == null ? null : downloadAmount.trim();
    }

    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Integer getAttendCount() {
        return attendCount;
    }

    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    public Integer getFansCount() {
        return fansCount;
    }

    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    public Integer getCollectAppCount() {
        return collectAppCount;
    }

    public void setCollectAppCount(Integer collectAppCount) {
        this.collectAppCount = collectAppCount;
    }

    public Integer getCollectTopicCount() {
        return collectTopicCount;
    }

    public void setCollectTopicCount(Integer collectTopicCount) {
        this.collectTopicCount = collectTopicCount;
    }

    public Date getRecentDownloadTime() {
        return recentDownloadTime;
    }

    public void setRecentDownloadTime(Date recentDownloadTime) {
        this.recentDownloadTime = recentDownloadTime;
    }

    public Integer getAppCount() {
        return appCount;
    }

    public void setAppCount(Integer appCount) {
        this.appCount = appCount;
    }

    public Integer getOnSaleAppCount() {
        return onSaleAppCount;
    }

    public void setOnSaleAppCount(Integer onSaleAppCount) {
        this.onSaleAppCount = onSaleAppCount;
    }

    public Integer getDevDownloadedCount() {
        return devDownloadedCount;
    }

    public void setDevDownloadedCount(Integer devDownloadedCount) {
        this.devDownloadedCount = devDownloadedCount;
    }

    public Integer getDevLoginCount() {
        return devLoginCount;
    }

    public void setDevLoginCount(Integer devLoginCount) {
        this.devLoginCount = devLoginCount;
    }

    public Date getRecentPublishTime() {
        return recentPublishTime;
    }

    public void setRecentPublishTime(Date recentPublishTime) {
        this.recentPublishTime = recentPublishTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", downloadAmount=").append(downloadAmount);
        sb.append(", consumeAmount=").append(consumeAmount);
        sb.append(", orderCount=").append(orderCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", loginCount=").append(loginCount);
        sb.append(", attendCount=").append(attendCount);
        sb.append(", fansCount=").append(fansCount);
        sb.append(", collectAppCount=").append(collectAppCount);
        sb.append(", collectTopicCount=").append(collectTopicCount);
        sb.append(", recentDownloadTime=").append(recentDownloadTime);
        sb.append(", appCount=").append(appCount);
        sb.append(", onSaleAppCount=").append(onSaleAppCount);
        sb.append(", devDownloadedCount=").append(devDownloadedCount);
        sb.append(", devLoginCount=").append(devLoginCount);
        sb.append(", recentPublishTime=").append(recentPublishTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}