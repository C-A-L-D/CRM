package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysUsers;

public interface SysUsersService {
	
	//查询除了当前用户的其他所有用户信息-办公
	public List<SysUsers> selectuser(BigDecimal uid);

	//查询单个用户
	public SysUsers login(String uname);
	
	//用户账户表和公司信息表连接查询
	public SysUsers login(String u, BigDecimal id);
	
	//查询全部用户列表
	public PageInfo<SysUsers> selectAllUsersAndRoleAndUsersInfo(int pageNum, int pageSize);
	
	//查询该账户ID对应的角色
	public SysUsers selectUsersAndRoleAndUsersInfoOne(BigDecimal userId);
	
	//查询账户对应的用户以及职务，部门
	public SysUsers selectUsersAndRoleAndUsersInfoOne2(BigDecimal userId);
	
	//添加一条用户记录
	public void addUser(SysUsers u);
	
	//修改用户状态
	public void updateUserStatus(BigDecimal userId);
	
	//修改制定ID的用户
	public SysUsers goUpdateUserOne(BigDecimal userId);
	
	//根据公司ID查公司表
	public SysGongsiinfo selectGSOne(BigDecimal gongsiId);
	
	//查询当前账户对应的员工信息，职务信息，部门信息
	public SysUsers selectUsersinfoJobDepartment(BigDecimal userId);
	
	//修改该账户ID对应的密码
	public void updatePassword(SysUsers sysUsers);
	
}
