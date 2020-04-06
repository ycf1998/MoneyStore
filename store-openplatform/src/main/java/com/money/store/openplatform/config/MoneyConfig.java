package com.money.store.openplatform.config;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: store
 * @description: Money项目配置类
 * @author: Money
 * @create: 2020/03/26 21:19
 */
@Component
@ConfigurationProperties(prefix = "money")
public class MoneyConfig {

    /** 项目名称 */
    private String name;

    /** 项目url */
    private String baseUrl;

    /** 上传路径 */
    private static String basePath;

    public String getName() {
        return this.name;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        MoneyConfig.basePath = basePath;
    }

}
