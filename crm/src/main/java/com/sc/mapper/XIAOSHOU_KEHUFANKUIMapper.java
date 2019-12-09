package com.sc.mapper;

import com.sc.entity.XIAOSHOU_KEHUFANKUI;
import com.sc.entity.XIAOSHOU_KEHUFANKUIExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIAOSHOU_KEHUFANKUIMapper {
    int countByExample(XIAOSHOU_KEHUFANKUIExample example);

    int deleteByExample(XIAOSHOU_KEHUFANKUIExample example);

    int deleteByPrimaryKey(Long fid);

    int insert(XIAOSHOU_KEHUFANKUI record);

    int insertSelective(XIAOSHOU_KEHUFANKUI record);

    List<XIAOSHOU_KEHUFANKUI> selectByExample(XIAOSHOU_KEHUFANKUIExample example);

    XIAOSHOU_KEHUFANKUI selectByPrimaryKey(Long fid);

    int updateByExampleSelective(@Param("record") XIAOSHOU_KEHUFANKUI record, @Param("example") XIAOSHOU_KEHUFANKUIExample example);

    int updateByExample(@Param("record") XIAOSHOU_KEHUFANKUI record, @Param("example") XIAOSHOU_KEHUFANKUIExample example);

    int updateByPrimaryKeySelective(XIAOSHOU_KEHUFANKUI record);

    int updateByPrimaryKey(XIAOSHOU_KEHUFANKUI record);
}