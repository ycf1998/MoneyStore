package com.money.store.openplatform.dao;/**
 * @Author: Money
 * @Date: 2020/11/8 12:18
 */

import com.money.store.model.AmsApp;

/**
 *@program: store
 *@description:
 *@author: Money
 *@create: 2020/11/08 12:18:50
 */
public interface AppMapper {
    int insert(AmsApp record);

    int updateByPrimaryKey(AmsApp record);
}
