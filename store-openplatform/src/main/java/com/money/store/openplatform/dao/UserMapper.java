package com.money.store.openplatform.dao; /**
 * @Author: YCF
 * @Date: 2020/2/5 18:14
 */

import com.money.store.model.UmsUser;
import org.springframework.data.repository.query.Param;

/**
 *@program: store
 *@description: 用户(开发者)数据库操作类
 *@author: Money
 *@create: 2020/03/01 18:14
 */
public interface UserMapper {

    /**
     * 添加用户，并把自动生成的id填入userId
     *
     * @param record
     * @return
     */
    int insertAndPkToUserId(UmsUser record);

    /**
     * 更新密码
     * @param id
     * @param newPassword
     * @return
     */
    int updatePasswordByPrimaryKey(@Param("id") Long id, @Param("newPassword") String newPassword);

    /**
     * 激活开发者资质
     * @param username
     * @return
     */
    int updateActivationStatus(String username);

    /**
     * 查看开发者资质激活状态
     * @param username
     * @return
     */
    Integer selectActivationStatus(String username);

    /**
     *  查询用户类型
     * @param username
     * @return
     */
    int selectUserTypeByUsername(String username);

    int updateEmailByUsername(@Param("username") String username, @Param("email") String email);
}
