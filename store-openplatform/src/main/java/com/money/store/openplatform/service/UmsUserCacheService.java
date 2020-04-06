package com.money.store.openplatform.service;

import com.money.store.model.UmsUser;

/**
 * @program: store
 * @description: 用户缓存Service
 * @author: Money
 * @create: 2020/04/06 14:27
 */
public interface UmsUserCacheService {

    /**
     * 通过账号从缓存中获取用户信息
     * @param username
     * @return
     */
    UmsUser getUser(String username);

    /**
     * 将用户存入缓存
     * @param user
     */
    void setUser(UmsUser user);

    /**
     * 从缓存中删除某用户信息
     * @param username
     */
    void delUser(String username);
}
