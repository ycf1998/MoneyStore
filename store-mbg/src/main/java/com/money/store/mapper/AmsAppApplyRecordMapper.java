package com.money.store.mapper;

import com.money.store.model.AmsAppApplyRecord;
import com.money.store.model.AmsAppApplyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmsAppApplyRecordMapper {
    int countByExample(AmsAppApplyRecordExample example);

    int deleteByExample(AmsAppApplyRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmsAppApplyRecord record);

    int insertSelective(AmsAppApplyRecord record);

    List<AmsAppApplyRecord> selectByExample(AmsAppApplyRecordExample example);

    AmsAppApplyRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmsAppApplyRecord record, @Param("example") AmsAppApplyRecordExample example);

    int updateByExample(@Param("record") AmsAppApplyRecord record, @Param("example") AmsAppApplyRecordExample example);

    int updateByPrimaryKeySelective(AmsAppApplyRecord record);

    int updateByPrimaryKey(AmsAppApplyRecord record);
}