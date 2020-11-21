package com.money.store.openplatform.dao;/**
 * @Author: Money
 * @Date: 2020/11/8 12:46
 */

import com.money.store.model.UmsUserStatisticsInfo;

/**
 *@program: store
 *@description:
 *@author: Money
 *@create: 2020/11/08 12:46:27
 */
public interface UserStatisticsInfoMapper {

    int updateStatisticsByUser(UmsUserStatisticsInfo record);
}
