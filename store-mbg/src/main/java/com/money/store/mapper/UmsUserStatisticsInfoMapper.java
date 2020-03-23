package com.money.store.mapper;

import com.money.store.model.UmsUserStatisticsInfo;
import com.money.store.model.UmsUserStatisticsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsUserStatisticsInfoMapper {
    int countByExample(UmsUserStatisticsInfoExample example);

    int deleteByExample(UmsUserStatisticsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsUserStatisticsInfo record);

    int insertSelective(UmsUserStatisticsInfo record);

    List<UmsUserStatisticsInfo> selectByExample(UmsUserStatisticsInfoExample example);

    UmsUserStatisticsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsUserStatisticsInfo record, @Param("example") UmsUserStatisticsInfoExample example);

    int updateByExample(@Param("record") UmsUserStatisticsInfo record, @Param("example") UmsUserStatisticsInfoExample example);

    int updateByPrimaryKeySelective(UmsUserStatisticsInfo record);

    int updateByPrimaryKey(UmsUserStatisticsInfo record);
}