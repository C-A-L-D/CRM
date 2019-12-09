package com.sc.mapper;

import com.sc.entity.SYS_JOBINFO;
import com.sc.entity.SYS_JOBINFOExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SYS_JOBINFOMapper {
    int countByExample(SYS_JOBINFOExample example);

    int deleteByExample(SYS_JOBINFOExample example);

    int deleteByPrimaryKey(BigDecimal jid);

    int insert(SYS_JOBINFO record);

    int insertSelective(SYS_JOBINFO record);

    List<SYS_JOBINFO> selectByExample(SYS_JOBINFOExample example);

    SYS_JOBINFO selectByPrimaryKey(BigDecimal jid);

    int updateByExampleSelective(@Param("record") SYS_JOBINFO record, @Param("example") SYS_JOBINFOExample example);

    int updateByExample(@Param("record") SYS_JOBINFO record, @Param("example") SYS_JOBINFOExample example);

    int updateByPrimaryKeySelective(SYS_JOBINFO record);

    int updateByPrimaryKey(SYS_JOBINFO record);
}