package com.money.store.openplatform.service;

import com.money.store.model.UmsCompanyDev;
import com.money.store.model.UmsPersonDev;
import com.money.store.model.UmsUser;
import com.money.store.openplatform.domain.UmsCompanyDeveloper;
import com.money.store.openplatform.dto.UpdateProfileParam;
import com.money.store.openplatform.dto.UpdateUserPasswordParam;
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
     * 获得个人类型开发者资质信息
     * @param username
     * @return
     */
    UmsPersonDev getPersonDevProFile(String username);

    /**
     * 获得公司类型开发者资质信息
     * @param username
     * @return
     */
    UmsCompanyDev getCompanyDevProFile(String username);

    /**
     * 用户修改个人基本资料
     * @param param
     * @return
     */
    int update(UpdateProfileParam param);

    /**
     * 用户修改密码
     * @param param
     * @return
     */
    int updatePassword(UpdateUserPasswordParam param);

    /**
     * 更新头像
     * @param username
     * @param newIcon
     * @return
     */
    int updateAvatar(String username, String newIcon);

    int updateEmail(String email, String username, String password);

    /**
     * 刷新token
     * @param oldToken
     * @return
     */
    String refreshToken(String oldToken);

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
