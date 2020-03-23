package com.money.store.openplatform.dao;


import com.money.store.model.UmsCompanyDevExample;
import java.util.List;

import com.money.store.openplatform.domain.UmsCompanyDeveloper;
import org.apache.ibatis.annotations.Param;

public interface UmsCompanyDeveloperMapper {
    int countByExample(UmsCompanyDevExample example);

    int deleteByExample(UmsCompanyDevExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsCompanyDeveloper record);

    int insertSelective(UmsCompanyDeveloper record);

    List<UmsCompanyDeveloper> selectByExample(UmsCompanyDevExample example);

    UmsCompanyDeveloper selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsCompanyDeveloper record, @Param("example") UmsCompanyDevExample example);

    int updateByExample(@Param("record") UmsCompanyDeveloper record, @Param("example") UmsCompanyDevExample example);

    int updateByPrimaryKeySelective(UmsCompanyDeveloper record);

    int updateByPrimaryKey(UmsCompanyDeveloper record);
}