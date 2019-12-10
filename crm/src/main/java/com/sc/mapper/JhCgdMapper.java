package com.sc.mapper;

import com.sc.entity.JhCgd;
import com.sc.entity.JhCgdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JhCgdMapper {
    int countByExample(JhCgdExample example);

    int deleteByExample(JhCgdExample example);

    int deleteByPrimaryKey(Long cgdId);

    int insert(JhCgd record);

    int insertSelective(JhCgd record);

    List<JhCgd> selectByExample(JhCgdExample example);

    JhCgd selectByPrimaryKey(Long cgdId);

    int updateByExampleSelective(@Param("record") JhCgd record, @Param("example") JhCgdExample example);

    int updateByExample(@Param("record") JhCgd record, @Param("example") JhCgdExample example);

    int updateByPrimaryKeySelective(JhCgd record);

    int updateByPrimaryKey(JhCgd record);
}