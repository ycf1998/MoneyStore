package com.money.store.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AmsApp implements Serializable {
    private Long id;

    @ApiModelProperty(value = "软件名称")
    private String name;

    @ApiModelProperty(value = "软件大小")
    private String size;

    @ApiModelProperty(value = "apk名称")
    private String apkName;

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

    @ApiModelProperty(value = "上架状态：0->下架；1->上架")
    private Integer pulishStatus;

    @ApiModelProperty(value = "审核状态：0->未审核；1->审核通过；2->审核未通过")
    private Integer verifyStatus;

    @ApiModelProperty(value = "下载量")
    private String downloads;

    @ApiModelProperty(value = "logo图标")
    private String logo;

    @ApiModelProperty(value = "介绍视频")
    private String video;

    @ApiModelProperty(value = "软件截图，2-5张，以逗号分割")
    private String pics;

    @ApiModelProperty(value = "版权证明图片，逗号分隔")
    private String copyright;

    @ApiModelProperty(value = "标签，最多5个，以逗号分割")
    private String label;

    @ApiModelProperty(value = "上架申请时的备注")
    private String remarks;

    @ApiModelProperty(value = "申请审核时间")
    private Date addTime;

    @ApiModelProperty(value = "更新日期")
    private Date updateDate;

    @ApiModelProperty(value = "上架时间")
    private Date onSaleDate;

    @ApiModelProperty(value = "下架时间")
    private Date offSaleDate;

    @ApiModelProperty(value = "一级分类")
    private Integer categoryLevel1;

    @ApiModelProperty(value = "二级分类")
    private Integer categoryLevel2;

    @ApiModelProperty(value = "三级分类")
    private Integer categoryLevel3;

    @ApiModelProperty(value = "版本id")
    private Long nowVersion;

    private Long applyRecordId;

    @ApiModelProperty(value = "详细信息")
    private String detailDesc;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getApkName() {
        return apkName;
    }

    public void setApkName(String apkName) {
        this.apkName = apkName == null ? null : apkName.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize == null ? null : screenSize.trim();
    }

    public String getExpenses() {
        return expenses;
    }

    public void setExpenses(String expenses) {
        this.expenses = expenses == null ? null : expenses.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(String advertisement) {
        this.advertisement = advertisement == null ? null : advertisement.trim();
    }

    public Integer getPulishStatus() {
        return pulishStatus;
    }

    public void setPulishStatus(Integer pulishStatus) {
        this.pulishStatus = pulishStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public String getDownloads() {
        return downloads;
    }

    public void setDownloads(String downloads) {
        this.downloads = downloads == null ? null : downloads.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright == null ? null : copyright.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getOnSaleDate() {
        return onSaleDate;
    }

    public void setOnSaleDate(Date onSaleDate) {
        this.onSaleDate = onSaleDate;
    }

    public Date getOffSaleDate() {
        return offSaleDate;
    }

    public void setOffSaleDate(Date offSaleDate) {
        this.offSaleDate = offSaleDate;
    }

    public Integer getCategoryLevel1() {
        return categoryLevel1;
    }

    public void setCategoryLevel1(Integer categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
    }

    public Integer getCategoryLevel2() {
        return categoryLevel2;
    }

    public void setCategoryLevel2(Integer categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
    }

    public Integer getCategoryLevel3() {
        return categoryLevel3;
    }

    public void setCategoryLevel3(Integer categoryLevel3) {
        this.categoryLevel3 = categoryLevel3;
    }

    public Long getNowVersion() {
        return nowVersion;
    }

    public void setNowVersion(Long nowVersion) {
        this.nowVersion = nowVersion;
    }

    public Long getApplyRecordId() {
        return applyRecordId;
    }

    public void setApplyRecordId(Long applyRecordId) {
        this.applyRecordId = applyRecordId;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc == null ? null : detailDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", size=").append(size);
        sb.append(", apkName=").append(apkName);
        sb.append(", language=").append(language);
        sb.append(", screenSize=").append(screenSize);
        sb.append(", expenses=").append(expenses);
        sb.append(", price=").append(price);
        sb.append(", score=").append(score);
        sb.append(", advertisement=").append(advertisement);
        sb.append(", pulishStatus=").append(pulishStatus);
        sb.append(", verifyStatus=").append(verifyStatus);
        sb.append(", downloads=").append(downloads);
        sb.append(", logo=").append(logo);
        sb.append(", video=").append(video);
        sb.append(", pics=").append(pics);
        sb.append(", copyright=").append(copyright);
        sb.append(", label=").append(label);
        sb.append(", remarks=").append(remarks);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", onSaleDate=").append(onSaleDate);
        sb.append(", offSaleDate=").append(offSaleDate);
        sb.append(", categoryLevel1=").append(categoryLevel1);
        sb.append(", categoryLevel2=").append(categoryLevel2);
        sb.append(", categoryLevel3=").append(categoryLevel3);
        sb.append(", nowVersion=").append(nowVersion);
        sb.append(", applyRecordId=").append(applyRecordId);
        sb.append(", detailDesc=").append(detailDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}