package com.money.store.openplatform.service;

import com.money.store.model.UmsUser;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @program: store
 * @description: 开发者管理Service
 * @author: Money
 * @create: 2020/03/01 15:33
 */
public interface UmsUserService {

    /**
     * 根据账号获得用户
     * @param username
     * @return
     */
    UmsUser getUserByUsername(String username);

    /**
     * 通过邮箱获取个人信息
     * @param email
     * @return
     */
    UmsUser getUserByEmail(String email);

    /**
     * 登录功能
     * @param username 账号
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 重置密码
     * @param id
     * @param newPassword
     * @return
     */
    boolean resetPassword(Long id, String newPassword);

    /**
     * 自定义键值对放入redis
     * @param key
     * @param value
     * @Param expireTime 过期时间s
     * @return
     */
    String generateAuth(String key, String value, int expireTime);

    /**
     * 获得某键的值
     * @param key
     * @return
     */
    String getAuthValue(String key);








    /**
     * 获取用户信息
     * @param username
     * @return
     */
    UserDetails loadUserByUsername(String username);
}
