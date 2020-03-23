package com.money.store.mapper;

import com.money.store.model.AmsAppCategory;
import com.money.store.model.AmsAppCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmsAppCategoryMapper {
    int countByExample(AmsAppCategoryExample example);

    int deleteByExample(AmsAppCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmsAppCategory record);

    int insertSelective(AmsAppCategory record);

    List<AmsAppCategory> selectByExample(AmsAppCategoryExample example);

    AmsAppCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmsAppCategory record, @Param("example") AmsAppCategoryExample example);

    int updateByExample(@Param("record") AmsAppCategory record, @Param("example") AmsAppCategoryExample example);

    int updateByPrimaryKeySelective(AmsAppCategory record);

    int updateByPrimaryKey(AmsAppCategory record);
}