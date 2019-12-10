package com.sc.mapper;

import com.sc.entity.XiaoshouSellinfo;
import com.sc.entity.XiaoshouSellinfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XiaoshouSellinfoMapper {
    int countByExample(XiaoshouSellinfoExample example);

    int deleteByExample(XiaoshouSellinfoExample example);

    int deleteByPrimaryKey(BigDecimal ssid);

    int insert(XiaoshouSellinfo record);

    int insertSelective(XiaoshouSellinfo record);

    List<XiaoshouSellinfo> selectByExample(XiaoshouSellinfoExample example);

    XiaoshouSellinfo selectByPrimaryKey(BigDecimal ssid);

    int updateByExampleSelective(@Param("record") XiaoshouSellinfo record, @Param("example") XiaoshouSellinfoExample example);

    int updateByExample(@Param("record") XiaoshouSellinfo record, @Param("example") XiaoshouSellinfoExample example);

    int updateByPrimaryKeySelective(XiaoshouSellinfo record);

    int updateByPrimaryKey(XiaoshouSellinfo record);
}