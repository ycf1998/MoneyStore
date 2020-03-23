package com.money.store.openplatform.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * @program: store
 * @description: Mybatis配置类
 * @author: Money
 * @create: 2020/03/01 15:09
 */
@Component
@MapperScan({"com.money.store.mapper", "com.money.store.openplatform.dao"})
public class MybatisConfig {
}
