package com.sc.mapper;

import com.sc.entity.OFF_MESS;
import com.sc.entity.OFF_MESSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OFF_MESSMapper {
    int countByExample(OFF_MESSExample example);

    int deleteByExample(OFF_MESSExample example);

    int deleteByPrimaryKey(Long messid);

    int insert(OFF_MESS record);

    int insertSelective(OFF_MESS record);

    List<OFF_MESS> selectByExample(OFF_MESSExample example);

    OFF_MESS selectByPrimaryKey(Long messid);

    int updateByExampleSelective(@Param("record") OFF_MESS record, @Param("example") OFF_MESSExample example);

    int updateByExample(@Param("record") OFF_MESS record, @Param("example") OFF_MESSExample example);

    int updateByPrimaryKeySelective(OFF_MESS record);

    int updateByPrimaryKey(OFF_MESS record);
}