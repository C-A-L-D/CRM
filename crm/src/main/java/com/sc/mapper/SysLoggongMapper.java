package com.sc.mapper;

import com.sc.entity.SysLoggong;
import com.sc.entity.SysLoggongExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLoggongMapper {
    int countByExample(SysLoggongExample example);

    int deleteByExample(SysLoggongExample example);

    int deleteByPrimaryKey(BigDecimal lid);

    int insert(SysLoggong record);

    int insertSelective(SysLoggong record);

    List<SysLoggong> selectByExample(SysLoggongExample example);

    SysLoggong selectByPrimaryKey(BigDecimal lid);

    int updateByExampleSelective(@Param("record") SysLoggong record, @Param("example") SysLoggongExample example);

    int updateByExample(@Param("record") SysLoggong record, @Param("example") SysLoggongExample example);

    int updateByPrimaryKeySelective(SysLoggong record);

    int updateByPrimaryKey(SysLoggong record);
}