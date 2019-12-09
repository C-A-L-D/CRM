package com.sc.mapper;

import com.sc.entity.OFF_ASSESSTARGET;
import com.sc.entity.OFF_ASSESSTARGETExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OFF_ASSESSTARGETMapper {
    int countByExample(OFF_ASSESSTARGETExample example);

    int deleteByExample(OFF_ASSESSTARGETExample example);

    int deleteByPrimaryKey(Long targetid);

    int insert(OFF_ASSESSTARGET record);

    int insertSelective(OFF_ASSESSTARGET record);

    List<OFF_ASSESSTARGET> selectByExample(OFF_ASSESSTARGETExample example);

    OFF_ASSESSTARGET selectByPrimaryKey(Long targetid);

    int updateByExampleSelective(@Param("record") OFF_ASSESSTARGET record, @Param("example") OFF_ASSESSTARGETExample example);

    int updateByExample(@Param("record") OFF_ASSESSTARGET record, @Param("example") OFF_ASSESSTARGETExample example);

    int updateByPrimaryKeySelective(OFF_ASSESSTARGET record);

    int updateByPrimaryKey(OFF_ASSESSTARGET record);
}