package com.sc.mapper;

import com.sc.entity.OFF_MESSDETAIL;
import com.sc.entity.OFF_MESSDETAILExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OFF_MESSDETAILMapper {
    int countByExample(OFF_MESSDETAILExample example);

    int deleteByExample(OFF_MESSDETAILExample example);

    int deleteByPrimaryKey(Long detailid);

    int insert(OFF_MESSDETAIL record);

    int insertSelective(OFF_MESSDETAIL record);

    List<OFF_MESSDETAIL> selectByExample(OFF_MESSDETAILExample example);

    OFF_MESSDETAIL selectByPrimaryKey(Long detailid);

    int updateByExampleSelective(@Param("record") OFF_MESSDETAIL record, @Param("example") OFF_MESSDETAILExample example);

    int updateByExample(@Param("record") OFF_MESSDETAIL record, @Param("example") OFF_MESSDETAILExample example);

    int updateByPrimaryKeySelective(OFF_MESSDETAIL record);

    int updateByPrimaryKey(OFF_MESSDETAIL record);
}