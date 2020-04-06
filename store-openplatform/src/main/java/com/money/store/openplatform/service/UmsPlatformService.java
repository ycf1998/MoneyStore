package com.money.store.openplatform.service;

import com.money.store.model.UmsUser;
import com.money.store.openplatform.dto.UmsCompanyDevParam;
import com.money.store.openplatform.dto.UmsPersonDevParam;
import com.money.store.openplatform.dto.UmsUpgradePersonDevParam;

/**
 * @program: store
 * @description: 用户平台管理Service(注册、忘记密码)
 * @author: Money
 * @create: 2020/03/01 15:33
 */
public interface UmsPlatformService {

    /**
     * 注册功能 登录商店用户升级个人开发者
     *
     * @param username
     * @return
     */
    UmsUser regLogin(String username, String password);

    /**
     * 注册功能 个人类型开发者
     *
     * @param umsPersonDevParam
     * @return
     */
    UmsUser personDevRegister(UmsPersonDevParam umsPersonDevParam);

    /**
     * 商店用户升级个人开发者
     *
     * @param umsUpgradePersonDevParam
     * @return
     */
    UmsUser upgradePersonDev(UmsUpgradePersonDevParam umsUpgradePersonDevParam);

    /**
     * 注册功能 公司类型开发者
     *
     * @param umsCompanyDevParam
     * @return
     */
    UmsUser companyDevRegister(UmsCompanyDevParam umsCompanyDevParam);

    /**
     * 激活开发者资质
     *
     * @param username
     */
    void activateDev(String username);

    /**
     * 是否已激活开发者资质
     *
     * @param username
     * @return
     */
    boolean isActivationDev(String username);

    /**
     * 修改邮箱
     *
     * @param username
     * @param password
     * @param email
     * @return
     */
    int changeEmail(String username, String password, String email);

    /**
     * 重置密码
     * @param id
     * @param newPassword
     * @return
     */
    int resetPassword(Long id, String newPassword);
}
