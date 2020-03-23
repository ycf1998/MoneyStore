package com.money.store.openplatform.config;

import com.money.store.openplatform.service.UmsUserService;
import com.money.store.security.config.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @program: store
 * @description: Security认证权限配置
 * @author: Money
 * @create: 2020/03/01 15:33
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class StoreSecurityConfig extends SecurityConfig {

    @Autowired
    private UmsUserService umsUserService;

    @Override
    @Bean
    public UserDetailsService userDetailsService() {
        //获取登录用户信息
        return username -> umsUserService.loadUserByUsername(username);
    }
}