package com.money.store.mapper;

import com.money.store.model.UmsCompanyDev;
import com.money.store.model.UmsCompanyDevExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsCompanyDevMapper {
    int countByExample(UmsCompanyDevExample example);

    int deleteByExample(UmsCompanyDevExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsCompanyDev record);

    int insertSelective(UmsCompanyDev record);

    List<UmsCompanyDev> selectByExample(UmsCompanyDevExample example);

    UmsCompanyDev selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsCompanyDev record, @Param("example") UmsCompanyDevExample example);

    int updateByExample(@Param("record") UmsCompanyDev record, @Param("example") UmsCompanyDevExample example);

    int updateByPrimaryKeySelective(UmsCompanyDev record);

    int updateByPrimaryKey(UmsCompanyDev record);
}