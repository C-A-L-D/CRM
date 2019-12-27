package com.sc.mapper;

import com.sc.entity.SysUsersInfo;
import com.sc.entity.SysUsersInfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUsersInfoMapper {
	//查询员工信息-	办公
	List<SysUsersInfo> selectuser(BigDecimal sid);
	
	//查询同公司员工信息-办公
	List<SysUsersInfo> selectusergc(SysUsersInfo record);

	//查询接受者姓名-办公
	SysUsersInfo selectu(String sname);

	
	
    int countByExample(SysUsersInfoExample example);

    int deleteByExample(SysUsersInfoExample example);

    int deleteByPrimaryKey(BigDecimal sid);

    int insert(SysUsersInfo record);

    int insertSelective(SysUsersInfo record);

    List<SysUsersInfo> selectByExample(SysUsersInfoExample example);

    SysUsersInfo selectByPrimaryKey(BigDecimal sid);

    int updateByExampleSelective(@Param("record") SysUsersInfo record, @Param("example") SysUsersInfoExample example);

    int updateByExample(@Param("record") SysUsersInfo record, @Param("example") SysUsersInfoExample example);

    int updateByPrimaryKeySelective(SysUsersInfo record);

    int updateByPrimaryKey(SysUsersInfo record);
    
}