package com.money.store.mapper;

import com.money.store.model.UmsPersonDev;
import com.money.store.model.UmsPersonDevExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsPersonDevMapper {
    int countByExample(UmsPersonDevExample example);

    int deleteByExample(UmsPersonDevExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsPersonDev record);

    int insertSelective(UmsPersonDev record);

    List<UmsPersonDev> selectByExample(UmsPersonDevExample example);

    UmsPersonDev selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsPersonDev record, @Param("example") UmsPersonDevExample example);

    int updateByExample(@Param("record") UmsPersonDev record, @Param("example") UmsPersonDevExample example);

    int updateByPrimaryKeySelective(UmsPersonDev record);

    int updateByPrimaryKey(UmsPersonDev record);
}