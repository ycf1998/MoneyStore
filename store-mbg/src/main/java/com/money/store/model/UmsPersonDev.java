package com.money.store.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UmsPersonDev implements Serializable {
    private Long id;

    private Long userId;

    @ApiModelProperty(value = "专用APPID")
    private String appId;

    @ApiModelProperty(value = "专用APPKEY")
    private String appKey;

    @ApiModelProperty(value = "真实姓名")
    private String realName;

    @ApiModelProperty(value = "18位身份证")
    private String idCard;

    @ApiModelProperty(value = "手持身份证照片")
    private String idCardPic;

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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getIdCardPic() {
        return idCardPic;
    }

    public void setIdCardPic(String idCardPic) {
        this.idCardPic = idCardPic == null ? null : idCardPic.trim();
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
        sb.append(", realName=").append(realName);
        sb.append(", idCard=").append(idCard);
        sb.append(", idCardPic=").append(idCardPic);
        sb.append(", cardholder=").append(cardholder);
        sb.append(", bankCardType=").append(bankCardType);
        sb.append(", bankCardNumber=").append(bankCardNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}