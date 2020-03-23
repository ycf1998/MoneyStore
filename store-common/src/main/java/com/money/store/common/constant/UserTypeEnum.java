package com.money.store.common.constant;

/**
 * @Author: Money y
 * @Date: 2020/2/5 18:10
 */
public enum UserTypeEnum {

    /**
     * 商店用户仅能登录应用商店，可升级为个人类型开发者
     * 任何类型开发者能登录商店和平台
     */
    STORE_USER(0, "商店用户"),

    PERSON_DEV(1, "个人类型开发者"),

    COMPANY_DEV(2, "公司类型开发者");


    private Integer id;

    private String name;

    private UserTypeEnum(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}
