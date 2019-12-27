package com.sc.mapper;

import com.sc.entity.SysPowerinfo;
import com.sc.entity.SysPowerinfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPowerinfoMapper {
    int countByExample(SysPowerinfoExample example);

    int deleteByExample(SysPowerinfoExample example);

    int deleteByPrimaryKey(BigDecimal pid);

    int insert(SysPowerinfo record);

    int insertSelective(SysPowerinfo record);

    List<SysPowerinfo> selectByExample(SysPowerinfoExample example);

    SysPowerinfo selectByPrimaryKey(BigDecimal pid);

    int updateByExampleSelective(@Param("record") SysPowerinfo record, @Param("example") SysPowerinfoExample example);

    int updateByExample(@Param("record") SysPowerinfo record, @Param("example") SysPowerinfoExample example);

    int updateByPrimaryKeySelective(SysPowerinfo record);

    int updateByPrimaryKey(SysPowerinfo record);
    
    List<SysPowerinfo> selectAllPowerAndCol();
    
    List<SysPowerinfo> selectPowerChecked(BigDecimal rid);
   
}