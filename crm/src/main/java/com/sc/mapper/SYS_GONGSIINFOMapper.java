package com.sc.mapper;

import com.sc.entity.SYS_GONGSIINFO;
import com.sc.entity.SYS_GONGSIINFOExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SYS_GONGSIINFOMapper {
    int countByExample(SYS_GONGSIINFOExample example);

    int deleteByExample(SYS_GONGSIINFOExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SYS_GONGSIINFO record);

    int insertSelective(SYS_GONGSIINFO record);

    List<SYS_GONGSIINFO> selectByExample(SYS_GONGSIINFOExample example);

    SYS_GONGSIINFO selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SYS_GONGSIINFO record, @Param("example") SYS_GONGSIINFOExample example);

    int updateByExample(@Param("record") SYS_GONGSIINFO record, @Param("example") SYS_GONGSIINFOExample example);

    int updateByPrimaryKeySelective(SYS_GONGSIINFO record);

    int updateByPrimaryKey(SYS_GONGSIINFO record);
}