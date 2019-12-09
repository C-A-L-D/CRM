package com.sc.mapper;

import com.sc.entity.SYS_DEPARTMENT;
import com.sc.entity.SYS_DEPARTMENTExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SYS_DEPARTMENTMapper {
    int countByExample(SYS_DEPARTMENTExample example);

    int deleteByExample(SYS_DEPARTMENTExample example);

    int deleteByPrimaryKey(BigDecimal did);

    int insert(SYS_DEPARTMENT record);

    int insertSelective(SYS_DEPARTMENT record);

    List<SYS_DEPARTMENT> selectByExample(SYS_DEPARTMENTExample example);

    SYS_DEPARTMENT selectByPrimaryKey(BigDecimal did);

    int updateByExampleSelective(@Param("record") SYS_DEPARTMENT record, @Param("example") SYS_DEPARTMENTExample example);

    int updateByExample(@Param("record") SYS_DEPARTMENT record, @Param("example") SYS_DEPARTMENTExample example);

    int updateByPrimaryKeySelective(SYS_DEPARTMENT record);

    int updateByPrimaryKey(SYS_DEPARTMENT record);
}