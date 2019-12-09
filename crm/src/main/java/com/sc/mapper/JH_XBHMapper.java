package com.sc.mapper;

import com.sc.entity.JH_XBH;
import com.sc.entity.JH_XBHExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JH_XBHMapper {
    int countByExample(JH_XBHExample example);

    int deleteByExample(JH_XBHExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JH_XBH record);

    int insertSelective(JH_XBH record);

    List<JH_XBH> selectByExample(JH_XBHExample example);

    JH_XBH selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JH_XBH record, @Param("example") JH_XBHExample example);

    int updateByExample(@Param("record") JH_XBH record, @Param("example") JH_XBHExample example);

    int updateByPrimaryKeySelective(JH_XBH record);

    int updateByPrimaryKey(JH_XBH record);
}