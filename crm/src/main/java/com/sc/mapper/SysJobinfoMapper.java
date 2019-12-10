package com.sc.mapper;

import com.sc.entity.SysJobinfo;
import com.sc.entity.SysJobinfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysJobinfoMapper {
    int countByExample(SysJobinfoExample example);

    int deleteByExample(SysJobinfoExample example);

    int deleteByPrimaryKey(BigDecimal jid);

    int insert(SysJobinfo record);

    int insertSelective(SysJobinfo record);

    List<SysJobinfo> selectByExample(SysJobinfoExample example);

    SysJobinfo selectByPrimaryKey(BigDecimal jid);

    int updateByExampleSelective(@Param("record") SysJobinfo record, @Param("example") SysJobinfoExample example);

    int updateByExample(@Param("record") SysJobinfo record, @Param("example") SysJobinfoExample example);

    int updateByPrimaryKeySelective(SysJobinfo record);

    int updateByPrimaryKey(SysJobinfo record);
}