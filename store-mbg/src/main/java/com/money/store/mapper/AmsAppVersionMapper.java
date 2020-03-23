package com.money.store.mapper;

import com.money.store.model.AmsAppVersion;
import com.money.store.model.AmsAppVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmsAppVersionMapper {
    int countByExample(AmsAppVersionExample example);

    int deleteByExample(AmsAppVersionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmsAppVersion record);

    int insertSelective(AmsAppVersion record);

    List<AmsAppVersion> selectByExample(AmsAppVersionExample example);

    AmsAppVersion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmsAppVersion record, @Param("example") AmsAppVersionExample example);

    int updateByExample(@Param("record") AmsAppVersion record, @Param("example") AmsAppVersionExample example);

    int updateByPrimaryKeySelective(AmsAppVersion record);

    int updateByPrimaryKey(AmsAppVersion record);
}