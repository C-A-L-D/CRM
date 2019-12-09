package com.sc.mapper;

import com.sc.entity.OFF_PERPLAN;
import com.sc.entity.OFF_PERPLANExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OFF_PERPLANMapper {
    int countByExample(OFF_PERPLANExample example);

    int deleteByExample(OFF_PERPLANExample example);

    int deleteByPrimaryKey(Long planid);

    int insert(OFF_PERPLAN record);

    int insertSelective(OFF_PERPLAN record);

    List<OFF_PERPLAN> selectByExample(OFF_PERPLANExample example);

    OFF_PERPLAN selectByPrimaryKey(Long planid);

    int updateByExampleSelective(@Param("record") OFF_PERPLAN record, @Param("example") OFF_PERPLANExample example);

    int updateByExample(@Param("record") OFF_PERPLAN record, @Param("example") OFF_PERPLANExample example);

    int updateByPrimaryKeySelective(OFF_PERPLAN record);

    int updateByPrimaryKey(OFF_PERPLAN record);
}