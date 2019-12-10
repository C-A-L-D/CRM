package com.sc.mapper;

import com.sc.entity.OffAssesstarget;
import com.sc.entity.OffAssesstargetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OffAssesstargetMapper {
    int countByExample(OffAssesstargetExample example);

    int deleteByExample(OffAssesstargetExample example);

    int deleteByPrimaryKey(Long targetid);

    int insert(OffAssesstarget record);

    int insertSelective(OffAssesstarget record);

    List<OffAssesstarget> selectByExample(OffAssesstargetExample example);

    OffAssesstarget selectByPrimaryKey(Long targetid);

    int updateByExampleSelective(@Param("record") OffAssesstarget record, @Param("example") OffAssesstargetExample example);

    int updateByExample(@Param("record") OffAssesstarget record, @Param("example") OffAssesstargetExample example);

    int updateByPrimaryKeySelective(OffAssesstarget record);

    int updateByPrimaryKey(OffAssesstarget record);
}