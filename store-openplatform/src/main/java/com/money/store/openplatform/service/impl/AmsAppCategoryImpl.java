package com.money.store.openplatform.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.money.store.mapper.AmsAppCategoryMapper;
import com.money.store.model.AmsAppCategory;
import com.money.store.openplatform.pojo.AppCategoryNode;
import com.money.store.openplatform.service.AmsAppCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: store
 * @description: 应用分类Service实现类
 * @author: Money
 * @create: 2020/07/11 15:37
 */
@Service
public class AmsAppCategoryImpl implements AmsAppCategoryService {

    @Autowired
    private AmsAppCategoryMapper amsAppCategoryMapper;

    @Override
    public List<AppCategoryNode> categoryTreeList() {
        List<AmsAppCategory> allList = amsAppCategoryMapper.selectList(null);
        List<AppCategoryNode> result = allList.stream().filter(item -> item.getParentId().equals(0L))
                .map(item -> covert(item, allList)).collect(Collectors.toList());
        return result;
    }

    /**
     * 递归填充子节点
     * @param item 上级应用分类
     * @param allList 所有应用分类数据
     * @return
     */
    private AppCategoryNode covert(AmsAppCategory item, List<AmsAppCategory> allList) {
        AppCategoryNode node = new AppCategoryNode();
        BeanUtil.copyProperties(item, node);
        List<AppCategoryNode> children = allList.stream().filter(subItem -> subItem.getParentId().equals(item.getId()))
                .map(subItem -> covert(subItem, allList)).collect(Collectors.toList());
        if (children.size() > 0) {
            node.setChildren(children);
        }
        return node;
    }
}
