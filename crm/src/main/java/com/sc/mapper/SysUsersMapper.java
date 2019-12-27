package com.sc.mapper;

import com.sc.entity.SysUsers;
import com.sc.entity.SysUsersExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUsersMapper {
	
	//查询员工信息-	办公
	List<SysUsers> selectuser(BigDecimal uid);
	
	//查询接受者姓名-办公
	SysUsers selectu(String uname);
	
    int countByExample(SysUsersExample example);

    int deleteByExample(SysUsersExample example);

    int deleteByPrimaryKey(BigDecimal userId);

    int insert(SysUsers record);

    int insertSelective(SysUsers record);

    List<SysUsers> selectByExample(SysUsersExample example);

    SysUsers selectByPrimaryKey(BigDecimal userId);

    int updateByExampleSelective(@Param("record") SysUsers record, @Param("example") SysUsersExample example);

    int updateByExample(@Param("record") SysUsers record, @Param("example") SysUsersExample example);

    int updateByPrimaryKeySelective(SysUsers record);

    int updateByPrimaryKey(SysUsers record);
    
    List<SysUsers> selectAllUsersAndRoleAndUsersInfo();
    
    SysUsers selectUsersAndRoleAndUsersInfoOne(BigDecimal userId);
    
    SysUsers selectUsersAndRoleAndUsersInfoOne2(BigDecimal userId);
    
    List<SysUsers> selectAllUsers(@Param("gongsiid") BigDecimal gongsiid);
}