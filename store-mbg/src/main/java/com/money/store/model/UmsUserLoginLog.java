package com.money.store.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsUserLoginLog implements Serializable {
    private Long id;

    private Long userId;

    private Date createTime;

    private String ip;

    @ApiModelProperty(value = "登录地址")
    private String address;

    @ApiModelProperty(value = "登录类型：0->PC；1->android;2->ios;3->小程序")
    private Integer loginType;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", ip=").append(ip);
        sb.append(", address=").append(address);
        sb.append(", loginType=").append(loginType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}