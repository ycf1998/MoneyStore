package com.money.store.openplatform.service.impl;

import com.money.store.mapper.UmsUserMapper;
import com.money.store.model.UmsUser;
import com.money.store.common.service.RedisService;
import com.money.store.openplatform.service.UmsUserCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @program: store
 * @description: 用户缓存Service实现类
 * @author: Money
 * @create: 2020/04/06 14:30
 */
@Service
public class UmsUserCacheServiceImpl implements UmsUserCacheService {

    @Autowired
    private RedisService redisService;
    @Autowired
    private UmsUserMapper umsUserMapper;
    @Value("${redis.key.user}")
    private String REDIS_KEY_USER;
    @Value(("${redis.expire.common}"))
    private Long REDIS_EXPIRE;

    @Override
    public UmsUser getUser(String username) {
        String key = REDIS_KEY_USER + ":" +  username;
        return (UmsUser) redisService.get(key);
    }

    @Override
    public void setUser(UmsUser user) {
        String key = REDIS_KEY_USER + ":" + user.getUsername();
        redisService.set(key, user, REDIS_EXPIRE);
    }

    @Override
    public void delUser(String username) {
        String key = REDIS_KEY_USER + ":" + username;
        redisService.del(key);
    }
}
