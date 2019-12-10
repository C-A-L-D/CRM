package com.sc.mapper;

import com.sc.entity.StoreGinfo;
import com.sc.entity.StoreGinfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreGinfoMapper {
    int countByExample(StoreGinfoExample example);

    int deleteByExample(StoreGinfoExample example);

    int deleteByPrimaryKey(BigDecimal gid);

    int insert(StoreGinfo record);

    int insertSelective(StoreGinfo record);

    List<StoreGinfo> selectByExample(StoreGinfoExample example);

    StoreGinfo selectByPrimaryKey(BigDecimal gid);

    int updateByExampleSelective(@Param("record") StoreGinfo record, @Param("example") StoreGinfoExample example);

    int updateByExample(@Param("record") StoreGinfo record, @Param("example") StoreGinfoExample example);

    int updateByPrimaryKeySelective(StoreGinfo record);

    int updateByPrimaryKey(StoreGinfo record);
}