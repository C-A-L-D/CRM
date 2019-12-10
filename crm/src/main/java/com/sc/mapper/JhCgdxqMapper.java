package com.sc.mapper;

import com.sc.entity.JhCgdxq;
import com.sc.entity.JhCgdxqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JhCgdxqMapper {
    int countByExample(JhCgdxqExample example);

    int deleteByExample(JhCgdxqExample example);

    int deleteByPrimaryKey(Long cgXqId);

    int insert(JhCgdxq record);

    int insertSelective(JhCgdxq record);

    List<JhCgdxq> selectByExample(JhCgdxqExample example);

    JhCgdxq selectByPrimaryKey(Long cgXqId);

    int updateByExampleSelective(@Param("record") JhCgdxq record, @Param("example") JhCgdxqExample example);

    int updateByExample(@Param("record") JhCgdxq record, @Param("example") JhCgdxqExample example);

    int updateByPrimaryKeySelective(JhCgdxq record);

    int updateByPrimaryKey(JhCgdxq record);
}