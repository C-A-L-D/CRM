package com.sc.mapper;

import com.sc.entity.JH_CGDXQ;
import com.sc.entity.JH_CGDXQExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JH_CGDXQMapper {
    int countByExample(JH_CGDXQExample example);

    int deleteByExample(JH_CGDXQExample example);

    int deleteByPrimaryKey(Long cgXqId);

    int insert(JH_CGDXQ record);

    int insertSelective(JH_CGDXQ record);

    List<JH_CGDXQ> selectByExample(JH_CGDXQExample example);

    JH_CGDXQ selectByPrimaryKey(Long cgXqId);

    int updateByExampleSelective(@Param("record") JH_CGDXQ record, @Param("example") JH_CGDXQExample example);

    int updateByExample(@Param("record") JH_CGDXQ record, @Param("example") JH_CGDXQExample example);

    int updateByPrimaryKeySelective(JH_CGDXQ record);

    int updateByPrimaryKey(JH_CGDXQ record);
}