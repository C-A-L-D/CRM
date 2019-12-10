package com.sc.mapper;

import com.sc.entity.XiaoshouKehuliusgi;
import com.sc.entity.XiaoshouKehuliusgiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XiaoshouKehuliusgiMapper {
    int countByExample(XiaoshouKehuliusgiExample example);

    int deleteByExample(XiaoshouKehuliusgiExample example);

    int deleteByPrimaryKey(Long ksid);

    int insert(XiaoshouKehuliusgi record);

    int insertSelective(XiaoshouKehuliusgi record);

    List<XiaoshouKehuliusgi> selectByExample(XiaoshouKehuliusgiExample example);

    XiaoshouKehuliusgi selectByPrimaryKey(Long ksid);

    int updateByExampleSelective(@Param("record") XiaoshouKehuliusgi record, @Param("example") XiaoshouKehuliusgiExample example);

    int updateByExample(@Param("record") XiaoshouKehuliusgi record, @Param("example") XiaoshouKehuliusgiExample example);

    int updateByPrimaryKeySelective(XiaoshouKehuliusgi record);

    int updateByPrimaryKey(XiaoshouKehuliusgi record);
}