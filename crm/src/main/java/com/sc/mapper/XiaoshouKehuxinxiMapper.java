package com.sc.mapper;

import com.sc.entity.XiaoshouKehuxinxi;
import com.sc.entity.XiaoshouKehuxinxiExample;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XiaoshouKehuxinxiMapper {
    int countByExample(XiaoshouKehuxinxiExample example);

    int deleteByExample(XiaoshouKehuxinxiExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(XiaoshouKehuxinxi record);

    int insertSelective(XiaoshouKehuxinxi record);

    List<XiaoshouKehuxinxi> selectByExample(XiaoshouKehuxinxiExample example);

    XiaoshouKehuxinxi selectByPrimaryKey(Long kid);

    int updateByExampleSelective(@Param("record") XiaoshouKehuxinxi record, @Param("example") XiaoshouKehuxinxiExample example);

    int updateByExample(@Param("record") XiaoshouKehuxinxi record, @Param("example") XiaoshouKehuxinxiExample example);

    int updateByPrimaryKeySelective(XiaoshouKehuxinxi record);

    int updateByPrimaryKey(XiaoshouKehuxinxi record);
}