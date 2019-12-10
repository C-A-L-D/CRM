package com.sc.mapper;

import com.sc.entity.XiaoshouSellout;
import com.sc.entity.XiaoshouSelloutExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XiaoshouSelloutMapper {
    int countByExample(XiaoshouSelloutExample example);

    int deleteByExample(XiaoshouSelloutExample example);

    int deleteByPrimaryKey(BigDecimal sid);

    int insert(XiaoshouSellout record);

    int insertSelective(XiaoshouSellout record);

    List<XiaoshouSellout> selectByExample(XiaoshouSelloutExample example);

    XiaoshouSellout selectByPrimaryKey(BigDecimal sid);

    int updateByExampleSelective(@Param("record") XiaoshouSellout record, @Param("example") XiaoshouSelloutExample example);

    int updateByExample(@Param("record") XiaoshouSellout record, @Param("example") XiaoshouSelloutExample example);

    int updateByPrimaryKeySelective(XiaoshouSellout record);

    int updateByPrimaryKey(XiaoshouSellout record);
}