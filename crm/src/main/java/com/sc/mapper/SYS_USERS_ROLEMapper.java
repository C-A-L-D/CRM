package com.sc.mapper;

import com.sc.entity.SYS_USERS_ROLE;
import com.sc.entity.SYS_USERS_ROLEExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SYS_USERS_ROLEMapper {
    int countByExample(SYS_USERS_ROLEExample example);

    int deleteByExample(SYS_USERS_ROLEExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SYS_USERS_ROLE record);

    int insertSelective(SYS_USERS_ROLE record);

    List<SYS_USERS_ROLE> selectByExample(SYS_USERS_ROLEExample example);

    SYS_USERS_ROLE selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SYS_USERS_ROLE record, @Param("example") SYS_USERS_ROLEExample example);

    int updateByExample(@Param("record") SYS_USERS_ROLE record, @Param("example") SYS_USERS_ROLEExample example);

    int updateByPrimaryKeySelective(SYS_USERS_ROLE record);

    int updateByPrimaryKey(SYS_USERS_ROLE record);
}