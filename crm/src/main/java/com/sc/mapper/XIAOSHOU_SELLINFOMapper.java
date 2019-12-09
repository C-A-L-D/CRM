package com.sc.mapper;

import com.sc.entity.XIAOSHOU_SELLINFO;
import com.sc.entity.XIAOSHOU_SELLINFOExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIAOSHOU_SELLINFOMapper {
    int countByExample(XIAOSHOU_SELLINFOExample example);

    int deleteByExample(XIAOSHOU_SELLINFOExample example);

    int deleteByPrimaryKey(BigDecimal ssid);

    int insert(XIAOSHOU_SELLINFO record);

    int insertSelective(XIAOSHOU_SELLINFO record);

    List<XIAOSHOU_SELLINFO> selectByExample(XIAOSHOU_SELLINFOExample example);

    XIAOSHOU_SELLINFO selectByPrimaryKey(BigDecimal ssid);

    int updateByExampleSelective(@Param("record") XIAOSHOU_SELLINFO record, @Param("example") XIAOSHOU_SELLINFOExample example);

    int updateByExample(@Param("record") XIAOSHOU_SELLINFO record, @Param("example") XIAOSHOU_SELLINFOExample example);

    int updateByPrimaryKeySelective(XIAOSHOU_SELLINFO record);

    int updateByPrimaryKey(XIAOSHOU_SELLINFO record);
}