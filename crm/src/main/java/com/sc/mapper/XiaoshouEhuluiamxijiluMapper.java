package com.sc.mapper;

import com.sc.entity.XiaoshouEhuluiamxijilu;
import com.sc.entity.XiaoshouEhuluiamxijiluExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XiaoshouEhuluiamxijiluMapper {
    int countByExample(XiaoshouEhuluiamxijiluExample example);

    int deleteByExample(XiaoshouEhuluiamxijiluExample example);

    int deleteByPrimaryKey(Long ljid);

    int insert(XiaoshouEhuluiamxijilu record);

    int insertSelective(XiaoshouEhuluiamxijilu record);

    List<XiaoshouEhuluiamxijilu> selectByExample(XiaoshouEhuluiamxijiluExample example);

    XiaoshouEhuluiamxijilu selectByPrimaryKey(Long ljid);

    int updateByExampleSelective(@Param("record") XiaoshouEhuluiamxijilu record, @Param("example") XiaoshouEhuluiamxijiluExample example);

    int updateByExample(@Param("record") XiaoshouEhuluiamxijilu record, @Param("example") XiaoshouEhuluiamxijiluExample example);

    int updateByPrimaryKeySelective(XiaoshouEhuluiamxijilu record);

    int updateByPrimaryKey(XiaoshouEhuluiamxijilu record);
}