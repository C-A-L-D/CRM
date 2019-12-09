package com.sc.mapper;

import com.sc.entity.SYS_ROLE;
import com.sc.entity.SYS_ROLEExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SYS_ROLEMapper {
    int countByExample(SYS_ROLEExample example);

    int deleteByExample(SYS_ROLEExample example);

    int deleteByPrimaryKey(BigDecimal rid);

    int insert(SYS_ROLE record);

    int insertSelective(SYS_ROLE record);

    List<SYS_ROLE> selectByExample(SYS_ROLEExample example);

    SYS_ROLE selectByPrimaryKey(BigDecimal rid);

    int updateByExampleSelective(@Param("record") SYS_ROLE record, @Param("example") SYS_ROLEExample example);

    int updateByExample(@Param("record") SYS_ROLE record, @Param("example") SYS_ROLEExample example);

    int updateByPrimaryKeySelective(SYS_ROLE record);

    int updateByPrimaryKey(SYS_ROLE record);
}