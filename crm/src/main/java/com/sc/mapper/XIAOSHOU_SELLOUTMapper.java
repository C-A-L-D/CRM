package com.sc.mapper;

import com.sc.entity.XIAOSHOU_SELLOUT;
import com.sc.entity.XIAOSHOU_SELLOUTExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIAOSHOU_SELLOUTMapper {
    int countByExample(XIAOSHOU_SELLOUTExample example);

    int deleteByExample(XIAOSHOU_SELLOUTExample example);

    int deleteByPrimaryKey(BigDecimal sid);

    int insert(XIAOSHOU_SELLOUT record);

    int insertSelective(XIAOSHOU_SELLOUT record);

    List<XIAOSHOU_SELLOUT> selectByExample(XIAOSHOU_SELLOUTExample example);

    XIAOSHOU_SELLOUT selectByPrimaryKey(BigDecimal sid);

    int updateByExampleSelective(@Param("record") XIAOSHOU_SELLOUT record, @Param("example") XIAOSHOU_SELLOUTExample example);

    int updateByExample(@Param("record") XIAOSHOU_SELLOUT record, @Param("example") XIAOSHOU_SELLOUTExample example);

    int updateByPrimaryKeySelective(XIAOSHOU_SELLOUT record);

    int updateByPrimaryKey(XIAOSHOU_SELLOUT record);
}