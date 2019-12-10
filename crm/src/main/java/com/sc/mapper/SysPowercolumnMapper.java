package com.sc.mapper;

import com.sc.entity.SysPowercolumn;
import com.sc.entity.SysPowercolumnExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPowercolumnMapper {
    int countByExample(SysPowercolumnExample example);

    int deleteByExample(SysPowercolumnExample example);

    int deleteByPrimaryKey(BigDecimal cid);

    int insert(SysPowercolumn record);

    int insertSelective(SysPowercolumn record);

    List<SysPowercolumn> selectByExample(SysPowercolumnExample example);

    SysPowercolumn selectByPrimaryKey(BigDecimal cid);

    int updateByExampleSelective(@Param("record") SysPowercolumn record, @Param("example") SysPowercolumnExample example);

    int updateByExample(@Param("record") SysPowercolumn record, @Param("example") SysPowercolumnExample example);

    int updateByPrimaryKeySelective(SysPowercolumn record);

    int updateByPrimaryKey(SysPowercolumn record);
}