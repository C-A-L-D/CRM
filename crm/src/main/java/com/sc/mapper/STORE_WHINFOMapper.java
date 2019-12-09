package com.sc.mapper;

import com.sc.entity.STORE_WHINFO;
import com.sc.entity.STORE_WHINFOExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface STORE_WHINFOMapper {
    int countByExample(STORE_WHINFOExample example);

    int deleteByExample(STORE_WHINFOExample example);

    int deleteByPrimaryKey(BigDecimal whid);

    int insert(STORE_WHINFO record);

    int insertSelective(STORE_WHINFO record);

    List<STORE_WHINFO> selectByExample(STORE_WHINFOExample example);

    STORE_WHINFO selectByPrimaryKey(BigDecimal whid);

    int updateByExampleSelective(@Param("record") STORE_WHINFO record, @Param("example") STORE_WHINFOExample example);

    int updateByExample(@Param("record") STORE_WHINFO record, @Param("example") STORE_WHINFOExample example);

    int updateByPrimaryKeySelective(STORE_WHINFO record);

    int updateByPrimaryKey(STORE_WHINFO record);
}