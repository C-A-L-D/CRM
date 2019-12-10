package com.sc.mapper;

import com.sc.entity.XiaoshouKehulianxiren;
import com.sc.entity.XiaoshouKehulianxirenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XiaoshouKehulianxirenMapper {
    int countByExample(XiaoshouKehulianxirenExample example);

    int deleteByExample(XiaoshouKehulianxirenExample example);

    int deleteByPrimaryKey(Long lid);

    int insert(XiaoshouKehulianxiren record);

    int insertSelective(XiaoshouKehulianxiren record);

    List<XiaoshouKehulianxiren> selectByExample(XiaoshouKehulianxirenExample example);

    XiaoshouKehulianxiren selectByPrimaryKey(Long lid);

    int updateByExampleSelective(@Param("record") XiaoshouKehulianxiren record, @Param("example") XiaoshouKehulianxirenExample example);

    int updateByExample(@Param("record") XiaoshouKehulianxiren record, @Param("example") XiaoshouKehulianxirenExample example);

    int updateByPrimaryKeySelective(XiaoshouKehulianxiren record);

    int updateByPrimaryKey(XiaoshouKehulianxiren record);
}