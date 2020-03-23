package com.money.store.mapper;

import com.money.store.model.AmsVersionApplyRecord;
import com.money.store.model.AmsVersionApplyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmsVersionApplyRecordMapper {
    int countByExample(AmsVersionApplyRecordExample example);

    int deleteByExample(AmsVersionApplyRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AmsVersionApplyRecord record);

    int insertSelective(AmsVersionApplyRecord record);

    List<AmsVersionApplyRecord> selectByExample(AmsVersionApplyRecordExample example);

    AmsVersionApplyRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AmsVersionApplyRecord record, @Param("example") AmsVersionApplyRecordExample example);

    int updateByExample(@Param("record") AmsVersionApplyRecord record, @Param("example") AmsVersionApplyRecordExample example);

    int updateByPrimaryKeySelective(AmsVersionApplyRecord record);

    int updateByPrimaryKey(AmsVersionApplyRecord record);
}