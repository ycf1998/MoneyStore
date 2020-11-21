package com.money.store.openplatform.service;

import com.money.store.openplatform.pojo.AppCategoryNode;

import java.util.List;

/**
 * @program: store
 * @description: 应用分类Service
 * @author: Money
 * @create: 2020/04/11 19:38
 */
public interface AmsAppCategoryService {

    /**
     * 以树形结构获取所有应用分类
     * @return
     */
    List<AppCategoryNode> categoryTreeList();
}
