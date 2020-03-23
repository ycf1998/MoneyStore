package com.money.store.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AmsAppVersion implements Serializable {
    private Long id;

    @ApiModelProperty(value = "app")
    private Long appId;

    @ApiModelProperty(value = "应用名")
    private String name;

    @ApiModelProperty(value = "APK名称")
    private String apkName;

    @ApiModelProperty(value = "APK大小")
    private String apkSize;

    @ApiModelProperty(value = "包名")
    private String packageName;

    @ApiModelProperty(value = "版本名")
    private String versionName;

    @ApiModelProperty(value = "版本号")
    private String versionNumber;

    @ApiModelProperty(value = "最低兼容安卓版本")
    private String sdkVersion;

    @ApiModelProperty(value = "最优兼容安卓版本")
    private String targetSdkVersion;

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

    @ApiModelProperty(value = "版权证明图片，逗号分隔")
    private String copyright;

    @ApiModelProperty(value = "上线时间")
    private Date onlineDate;

    @ApiModelProperty(value = "下线时间")
    private Date offlineDate;

    @ApiModelProperty(value = "申请者/开发者")
    private Long applyUser;

    @ApiModelProperty(value = "申请更新时间")
    private Date applyTime;

    @ApiModelProperty(value = "申请/审核记录id")
    private Long applyRecordId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getApkName() {
        return apkName;
    }

    public void setApkName(String apkName) {
        this.apkName = apkName == null ? null : apkName.trim();
    }

    public String getApkSize() {
        return apkSize;
    }

    public void setApkSize(String apkSize) {
        this.apkSize = apkSize == null ? null : apkSize.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName == null ? null : versionName.trim();
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber == null ? null : versionNumber.trim();
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion == null ? null : sdkVersion.trim();
    }

    public String getTargetSdkVersion() {
        return targetSdkVersion;
    }

    public void setTargetSdkVersion(String targetSdkVersion) {
        this.targetSdkVersion = targetSdkVersion == null ? null : targetSdkVersion.trim();
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

    public Date getOnlineDate() {
        return onlineDate;
    }

    public void setOnlineDate(Date onlineDate) {
        this.onlineDate = onlineDate;
    }

    public Date getOfflineDate() {
        return offlineDate;
    }

    public void setOfflineDate(Date offlineDate) {
        this.offlineDate = offlineDate;
    }

    public Long getApplyUser() {
        return applyUser;
    }

    public void setApplyUser(Long applyUser) {
        this.applyUser = applyUser;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Long getApplyRecordId() {
        return applyRecordId;
    }

    public void setApplyRecordId(Long applyRecordId) {
        this.applyRecordId = applyRecordId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", name=").append(name);
        sb.append(", apkName=").append(apkName);
        sb.append(", apkSize=").append(apkSize);
        sb.append(", packageName=").append(packageName);
        sb.append(", versionName=").append(versionName);
        sb.append(", versionNumber=").append(versionNumber);
        sb.append(", sdkVersion=").append(sdkVersion);
        sb.append(", targetSdkVersion=").append(targetSdkVersion);
        sb.append(", language=").append(language);
        sb.append(", screenSize=").append(screenSize);
        sb.append(", expenses=").append(expenses);
        sb.append(", price=").append(price);
        sb.append(", logo=").append(logo);
        sb.append(", video=").append(video);
        sb.append(", pics=").append(pics);
        sb.append(", copyright=").append(copyright);
        sb.append(", onlineDate=").append(onlineDate);
        sb.append(", offlineDate=").append(offlineDate);
        sb.append(", applyUser=").append(applyUser);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", applyRecordId=").append(applyRecordId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}