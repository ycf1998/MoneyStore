package com.money.store.openplatform.domain;

import com.money.store.model.UmsUser;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UmsCompanyDeveloper extends UmsUser implements Serializable {
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

    @ApiModelProperty(value = "联系人")
    private String contact;

    @ApiModelProperty(value = "持卡人")
    private String cardholder;

    @ApiModelProperty(value = "银行卡类型")
    private String bankCardType;

    @ApiModelProperty(value = "银行卡号")
    private String bankCardNumber;

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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getBusinessLicenseRegNumber() {
        return businessLicenseRegNumber;
    }

    public void setBusinessLicenseRegNumber(String businessLicenseRegNumber) {
        this.businessLicenseRegNumber = businessLicenseRegNumber == null ? null : businessLicenseRegNumber.trim();
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder == null ? null : cardholder.trim();
    }

    public String getBankCardType() {
        return bankCardType;
    }

    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType == null ? null : bankCardType.trim();
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber == null ? null : bankCardNumber.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", appId=").append(appId);
        sb.append(", appKey=").append(appKey);
        sb.append(", companyName=").append(companyName);
        sb.append(", businessLicenseRegNumber=").append(businessLicenseRegNumber);
        sb.append(", businessLicense=").append(businessLicense);
        sb.append(", contact=").append(contact);
        sb.append(", cardholder=").append(cardholder);
        sb.append(", bankCardType=").append(bankCardType);
        sb.append(", bankCardNumber=").append(bankCardNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}