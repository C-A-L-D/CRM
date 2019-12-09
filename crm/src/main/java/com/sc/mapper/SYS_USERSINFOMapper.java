package com.sc.mapper;

import com.sc.entity.SYS_USERSINFO;
import com.sc.entity.SYS_USERSINFOExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SYS_USERSINFOMapper {
    int countByExample(SYS_USERSINFOExample example);

    int deleteByExample(SYS_USERSINFOExample example);

    int deleteByPrimaryKey(BigDecimal sid);

    int insert(SYS_USERSINFO record);

    int insertSelective(SYS_USERSINFO record);

    List<SYS_USERSINFO> selectByExample(SYS_USERSINFOExample example);

    SYS_USERSINFO selectByPrimaryKey(BigDecimal sid);

    int updateByExampleSelective(@Param("record") SYS_USERSINFO record, @Param("example") SYS_USERSINFOExample example);

    int updateByExample(@Param("record") SYS_USERSINFO record, @Param("example") SYS_USERSINFOExample example);

    int updateByPrimaryKeySelective(SYS_USERSINFO record);

    int updateByPrimaryKey(SYS_USERSINFO record);
}