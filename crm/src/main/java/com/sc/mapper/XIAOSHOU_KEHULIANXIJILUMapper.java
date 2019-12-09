package com.sc.mapper;

import com.sc.entity.XIAOSHOU_KEHULIANXIJILU;
import com.sc.entity.XIAOSHOU_KEHULIANXIJILUExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIAOSHOU_KEHULIANXIJILUMapper {
    int countByExample(XIAOSHOU_KEHULIANXIJILUExample example);

    int deleteByExample(XIAOSHOU_KEHULIANXIJILUExample example);

    int deleteByPrimaryKey(Long ljid);

    int insert(XIAOSHOU_KEHULIANXIJILU record);

    int insertSelective(XIAOSHOU_KEHULIANXIJILU record);

    List<XIAOSHOU_KEHULIANXIJILU> selectByExample(XIAOSHOU_KEHULIANXIJILUExample example);

    XIAOSHOU_KEHULIANXIJILU selectByPrimaryKey(Long ljid);

    int updateByExampleSelective(@Param("record") XIAOSHOU_KEHULIANXIJILU record, @Param("example") XIAOSHOU_KEHULIANXIJILUExample example);

    int updateByExample(@Param("record") XIAOSHOU_KEHULIANXIJILU record, @Param("example") XIAOSHOU_KEHULIANXIJILUExample example);

    int updateByPrimaryKeySelective(XIAOSHOU_KEHULIANXIJILU record);

    int updateByPrimaryKey(XIAOSHOU_KEHULIANXIJILU record);
}