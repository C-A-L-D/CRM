package com.sc.mapper;

import com.sc.entity.SYS_POWER_ROLE;
import com.sc.entity.SYS_POWER_ROLEExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SYS_POWER_ROLEMapper {
    int countByExample(SYS_POWER_ROLEExample example);

    int deleteByExample(SYS_POWER_ROLEExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SYS_POWER_ROLE record);

    int insertSelective(SYS_POWER_ROLE record);

    List<SYS_POWER_ROLE> selectByExample(SYS_POWER_ROLEExample example);

    SYS_POWER_ROLE selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SYS_POWER_ROLE record, @Param("example") SYS_POWER_ROLEExample example);

    int updateByExample(@Param("record") SYS_POWER_ROLE record, @Param("example") SYS_POWER_ROLEExample example);

    int updateByPrimaryKeySelective(SYS_POWER_ROLE record);

    int updateByPrimaryKey(SYS_POWER_ROLE record);
}