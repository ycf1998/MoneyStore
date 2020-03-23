package com.money.store.openplatform.dao;

import com.money.store.model.UmsPersonDevExample;
import java.util.List;

import com.money.store.openplatform.domain.UmsPersonDeveloper;
import org.apache.ibatis.annotations.Param;

public interface UmsPersonDeveloperMapper {
    int countByExample(UmsPersonDevExample example);

    int deleteByExample(UmsPersonDevExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsPersonDeveloper record);

    int insertSelective(UmsPersonDeveloper record);

    List<UmsPersonDeveloper> selectByExample(UmsPersonDevExample example);

    UmsPersonDeveloper selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsPersonDeveloper record, @Param("example") UmsPersonDevExample example);

    int updateByExample(@Param("record") UmsPersonDeveloper record, @Param("example") UmsPersonDevExample example);

    int updateByPrimaryKeySelective(UmsPersonDeveloper record);

    int updateByPrimaryKey(UmsPersonDeveloper record);
}