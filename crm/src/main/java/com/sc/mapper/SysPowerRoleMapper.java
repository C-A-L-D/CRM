package com.sc.mapper;

import com.sc.entity.SysPowerRole;
import com.sc.entity.SysPowerRoleExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPowerRoleMapper {
    int countByExample(SysPowerRoleExample example);

    int deleteByExample(SysPowerRoleExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysPowerRole record);

    int insertSelective(SysPowerRole record);

    List<SysPowerRole> selectByExample(SysPowerRoleExample example);

    SysPowerRole selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysPowerRole record, @Param("example") SysPowerRoleExample example);

    int updateByExample(@Param("record") SysPowerRole record, @Param("example") SysPowerRoleExample example);

    int updateByPrimaryKeySelective(SysPowerRole record);

    int updateByPrimaryKey(SysPowerRole record);
    
    List<SysPowerRole> selectRP(@Param("roleId") BigDecimal roleId, @Param ("pcolumnId")BigDecimal pcolumnId);
    
    void delPow(BigDecimal pid);
}