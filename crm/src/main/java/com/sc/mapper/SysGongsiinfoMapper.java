package com.sc.mapper;

import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysGongsiinfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysGongsiinfoMapper {
    int countByExample(SysGongsiinfoExample example);

    int deleteByExample(SysGongsiinfoExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysGongsiinfo record);

    int insertSelective(SysGongsiinfo record);

    List<SysGongsiinfo> selectByExample(SysGongsiinfoExample example);

    SysGongsiinfo selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysGongsiinfo record, @Param("example") SysGongsiinfoExample example);

    int updateByExample(@Param("record") SysGongsiinfo record, @Param("example") SysGongsiinfoExample example);

    int updateByPrimaryKeySelective(SysGongsiinfo record);

    int updateByPrimaryKey(SysGongsiinfo record);
}