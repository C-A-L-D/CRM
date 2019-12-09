package com.sc.mapper;

import com.sc.entity.STORE_GINFO;
import com.sc.entity.STORE_GINFOExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface STORE_GINFOMapper {
    int countByExample(STORE_GINFOExample example);

    int deleteByExample(STORE_GINFOExample example);

    int deleteByPrimaryKey(BigDecimal gid);

    int insert(STORE_GINFO record);

    int insertSelective(STORE_GINFO record);

    List<STORE_GINFO> selectByExample(STORE_GINFOExample example);

    STORE_GINFO selectByPrimaryKey(BigDecimal gid);

    int updateByExampleSelective(@Param("record") STORE_GINFO record, @Param("example") STORE_GINFOExample example);

    int updateByExample(@Param("record") STORE_GINFO record, @Param("example") STORE_GINFOExample example);

    int updateByPrimaryKeySelective(STORE_GINFO record);

    int updateByPrimaryKey(STORE_GINFO record);
}