package com.money.store.openplatform.constant;

/**
 * @program: store
 * @description: 应用状态
 * @author: Money
 * @create: 2020/11/07 22:52:06
 */
public enum AppStatusEnum {
    /**
     * 应用状态
     */
    UNAUDITED(1, "未审核"),

    AUDIT_FAILED(2, "审核未通过"),

    AUDIT_PASS(3, "审核通过"),

    ON_SALE(4,"已上架"),

    OFF_SALE(5,"已下架");


    private Integer id;

    private String name;

    private AppStatusEnum(Integer id, String name) {
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

