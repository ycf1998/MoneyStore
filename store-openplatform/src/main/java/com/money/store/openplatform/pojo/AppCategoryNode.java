package com.money.store.openplatform.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @program: store
 * @description: 应用分类节点
 * @author: Money
 * @create: 2020/07/11 15:48
 */
@Setter
@Getter
public class AppCategoryNode {

    // 分类值
    private Integer id;

    // 标签
    private String categoryName;

    // 子分类
    private List<AppCategoryNode> children;
}
