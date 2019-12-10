package com.sc.mapper;

import com.sc.entity.StoreWhinfo;
import com.sc.entity.StoreWhinfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreWhinfoMapper {
    int countByExample(StoreWhinfoExample example);

    int deleteByExample(StoreWhinfoExample example);

    int deleteByPrimaryKey(BigDecimal whid);

    int insert(StoreWhinfo record);

    int insertSelective(StoreWhinfo record);

    List<StoreWhinfo> selectByExample(StoreWhinfoExample example);

    StoreWhinfo selectByPrimaryKey(BigDecimal whid);

    int updateByExampleSelective(@Param("record") StoreWhinfo record, @Param("example") StoreWhinfoExample example);

    int updateByExample(@Param("record") StoreWhinfo record, @Param("example") StoreWhinfoExample example);

    int updateByPrimaryKeySelective(StoreWhinfo record);

    int updateByPrimaryKey(StoreWhinfo record);
}