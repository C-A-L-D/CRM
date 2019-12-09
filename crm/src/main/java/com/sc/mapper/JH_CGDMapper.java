package com.sc.mapper;

import com.sc.entity.JH_CGD;
import com.sc.entity.JH_CGDExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JH_CGDMapper {
    int countByExample(JH_CGDExample example);

    int deleteByExample(JH_CGDExample example);

    int deleteByPrimaryKey(Long cgdId);

    int insert(JH_CGD record);

    int insertSelective(JH_CGD record);

    List<JH_CGD> selectByExample(JH_CGDExample example);

    JH_CGD selectByPrimaryKey(Long cgdId);

    int updateByExampleSelective(@Param("record") JH_CGD record, @Param("example") JH_CGDExample example);

    int updateByExample(@Param("record") JH_CGD record, @Param("example") JH_CGDExample example);

    int updateByPrimaryKeySelective(JH_CGD record);

    int updateByPrimaryKey(JH_CGD record);
}