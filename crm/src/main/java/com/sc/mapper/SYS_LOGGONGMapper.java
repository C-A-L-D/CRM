package com.sc.mapper;

import com.sc.entity.SYS_LOGGONG;
import com.sc.entity.SYS_LOGGONGExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SYS_LOGGONGMapper {
    int countByExample(SYS_LOGGONGExample example);

    int deleteByExample(SYS_LOGGONGExample example);

    int deleteByPrimaryKey(BigDecimal lid);

    int insert(SYS_LOGGONG record);

    int insertSelective(SYS_LOGGONG record);

    List<SYS_LOGGONG> selectByExample(SYS_LOGGONGExample example);

    SYS_LOGGONG selectByPrimaryKey(BigDecimal lid);

    int updateByExampleSelective(@Param("record") SYS_LOGGONG record, @Param("example") SYS_LOGGONGExample example);

    int updateByExample(@Param("record") SYS_LOGGONG record, @Param("example") SYS_LOGGONGExample example);

    int updateByPrimaryKeySelective(SYS_LOGGONG record);

    int updateByPrimaryKey(SYS_LOGGONG record);
}