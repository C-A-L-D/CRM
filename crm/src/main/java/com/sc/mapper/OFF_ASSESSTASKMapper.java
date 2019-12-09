package com.sc.mapper;

import com.sc.entity.OFF_ASSESSTASK;
import com.sc.entity.OFF_ASSESSTASKExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OFF_ASSESSTASKMapper {
    int countByExample(OFF_ASSESSTASKExample example);

    int deleteByExample(OFF_ASSESSTASKExample example);

    int deleteByPrimaryKey(Long taskid);

    int insert(OFF_ASSESSTASK record);

    int insertSelective(OFF_ASSESSTASK record);

    List<OFF_ASSESSTASK> selectByExample(OFF_ASSESSTASKExample example);

    OFF_ASSESSTASK selectByPrimaryKey(Long taskid);

    int updateByExampleSelective(@Param("record") OFF_ASSESSTASK record, @Param("example") OFF_ASSESSTASKExample example);

    int updateByExample(@Param("record") OFF_ASSESSTASK record, @Param("example") OFF_ASSESSTASKExample example);

    int updateByPrimaryKeySelective(OFF_ASSESSTASK record);

    int updateByPrimaryKey(OFF_ASSESSTASK record);
}