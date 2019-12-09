package com.sc.mapper;

import com.sc.entity.XIAOSHOU_KEHUXINXI;
import com.sc.entity.XIAOSHOU_KEHUXINXIExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIAOSHOU_KEHUXINXIMapper {
    int countByExample(XIAOSHOU_KEHUXINXIExample example);

    int deleteByExample(XIAOSHOU_KEHUXINXIExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(XIAOSHOU_KEHUXINXI record);

    int insertSelective(XIAOSHOU_KEHUXINXI record);

    List<XIAOSHOU_KEHUXINXI> selectByExample(XIAOSHOU_KEHUXINXIExample example);

    XIAOSHOU_KEHUXINXI selectByPrimaryKey(Long kid);

    int updateByExampleSelective(@Param("record") XIAOSHOU_KEHUXINXI record, @Param("example") XIAOSHOU_KEHUXINXIExample example);

    int updateByExample(@Param("record") XIAOSHOU_KEHUXINXI record, @Param("example") XIAOSHOU_KEHUXINXIExample example);

    int updateByPrimaryKeySelective(XIAOSHOU_KEHUXINXI record);

    int updateByPrimaryKey(XIAOSHOU_KEHUXINXI record);
}