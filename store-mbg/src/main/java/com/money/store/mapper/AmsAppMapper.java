package com.money.store.mapper;

import com.money.store.model.AmsApp;
import com.money.store.model.AmsAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmsAppMapper {
    int countByExample(AmsAppExample example);

    int deleteByExample(AmsAppExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmsApp record);

    int insertSelective(AmsApp record);

    List<AmsApp> selectByExampleWithBLOBs(AmsAppExample example);

    List<AmsApp> selectByExample(AmsAppExample example);

    AmsApp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmsApp record, @Param("example") AmsAppExample example);

    int updateByExampleWithBLOBs(@Param("record") AmsApp record, @Param("example") AmsAppExample example);

    int updateByExample(@Param("record") AmsApp record, @Param("example") AmsAppExample example);

    int updateByPrimaryKeySelective(AmsApp record);

    int updateByPrimaryKeyWithBLOBs(AmsApp record);

    int updateByPrimaryKey(AmsApp record);
}