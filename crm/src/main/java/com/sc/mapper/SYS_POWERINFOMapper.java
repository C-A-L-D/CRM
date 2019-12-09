package com.sc.mapper;

import com.sc.entity.SYS_POWERINFO;
import com.sc.entity.SYS_POWERINFOExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SYS_POWERINFOMapper {
    int countByExample(SYS_POWERINFOExample example);

    int deleteByExample(SYS_POWERINFOExample example);

    int deleteByPrimaryKey(BigDecimal pid);

    int insert(SYS_POWERINFO record);

    int insertSelective(SYS_POWERINFO record);

    List<SYS_POWERINFO> selectByExample(SYS_POWERINFOExample example);

    SYS_POWERINFO selectByPrimaryKey(BigDecimal pid);

    int updateByExampleSelective(@Param("record") SYS_POWERINFO record, @Param("example") SYS_POWERINFOExample example);

    int updateByExample(@Param("record") SYS_POWERINFO record, @Param("example") SYS_POWERINFOExample example);

    int updateByPrimaryKeySelective(SYS_POWERINFO record);

    int updateByPrimaryKey(SYS_POWERINFO record);
}