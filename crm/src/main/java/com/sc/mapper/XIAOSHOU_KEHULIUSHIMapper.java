package com.sc.mapper;

import com.sc.entity.XIAOSHOU_KEHULIUSHI;
import com.sc.entity.XIAOSHOU_KEHULIUSHIExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIAOSHOU_KEHULIUSHIMapper {
    int countByExample(XIAOSHOU_KEHULIUSHIExample example);

    int deleteByExample(XIAOSHOU_KEHULIUSHIExample example);

    int deleteByPrimaryKey(Long ksid);

    int insert(XIAOSHOU_KEHULIUSHI record);

    int insertSelective(XIAOSHOU_KEHULIUSHI record);

    List<XIAOSHOU_KEHULIUSHI> selectByExample(XIAOSHOU_KEHULIUSHIExample example);

    XIAOSHOU_KEHULIUSHI selectByPrimaryKey(Long ksid);

    int updateByExampleSelective(@Param("record") XIAOSHOU_KEHULIUSHI record, @Param("example") XIAOSHOU_KEHULIUSHIExample example);

    int updateByExample(@Param("record") XIAOSHOU_KEHULIUSHI record, @Param("example") XIAOSHOU_KEHULIUSHIExample example);

    int updateByPrimaryKeySelective(XIAOSHOU_KEHULIUSHI record);

    int updateByPrimaryKey(XIAOSHOU_KEHULIUSHI record);
}