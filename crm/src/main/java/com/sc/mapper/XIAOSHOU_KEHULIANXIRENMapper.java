package com.sc.mapper;

import com.sc.entity.XIAOSHOU_KEHULIANXIREN;
import com.sc.entity.XIAOSHOU_KEHULIANXIRENExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIAOSHOU_KEHULIANXIRENMapper {
    int countByExample(XIAOSHOU_KEHULIANXIRENExample example);

    int deleteByExample(XIAOSHOU_KEHULIANXIRENExample example);

    int deleteByPrimaryKey(Long lid);

    int insert(XIAOSHOU_KEHULIANXIREN record);

    int insertSelective(XIAOSHOU_KEHULIANXIREN record);

    List<XIAOSHOU_KEHULIANXIREN> selectByExample(XIAOSHOU_KEHULIANXIRENExample example);

    XIAOSHOU_KEHULIANXIREN selectByPrimaryKey(Long lid);

    int updateByExampleSelective(@Param("record") XIAOSHOU_KEHULIANXIREN record, @Param("example") XIAOSHOU_KEHULIANXIRENExample example);

    int updateByExample(@Param("record") XIAOSHOU_KEHULIANXIREN record, @Param("example") XIAOSHOU_KEHULIANXIRENExample example);

    int updateByPrimaryKeySelective(XIAOSHOU_KEHULIANXIREN record);

    int updateByPrimaryKey(XIAOSHOU_KEHULIANXIREN record);
}