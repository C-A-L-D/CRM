package com.sc.mapper;

import com.sc.entity.OFF_TASKDETAIL;
import com.sc.entity.OFF_TASKDETAILExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OFF_TASKDETAILMapper {
    int countByExample(OFF_TASKDETAILExample example);

    int deleteByExample(OFF_TASKDETAILExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OFF_TASKDETAIL record);

    int insertSelective(OFF_TASKDETAIL record);

    List<OFF_TASKDETAIL> selectByExample(OFF_TASKDETAILExample example);

    OFF_TASKDETAIL selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OFF_TASKDETAIL record, @Param("example") OFF_TASKDETAILExample example);

    int updateByExample(@Param("record") OFF_TASKDETAIL record, @Param("example") OFF_TASKDETAILExample example);

    int updateByPrimaryKeySelective(OFF_TASKDETAIL record);

    int updateByPrimaryKey(OFF_TASKDETAIL record);
}