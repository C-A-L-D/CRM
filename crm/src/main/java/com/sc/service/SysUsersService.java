package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysUsers;

public interface SysUsersService {
	
	//查询除了当前用户的其他所有用户信息-办公
	public List<SysUsers> selectuser(BigDecimal uid);

	//查询单个用户
	public SysUsers login(String u);
	
	//用户账户表和公司信息表连接查询
	public SysUsers login(String u, BigDecimal id);
	
	//账户表和角色表连接
	
	
	//查询全部用户列表
	public PageInfo<SysUsers> selectAllUsersAndRoleAndUsersInfo(int pageNum, int pageSize);
	
	//
	public SysUsers selectUsersAndRoleAndUsersInfoOne(BigDecimal userId);
	
	//添加一条用户记录
	public void addUser(SysUsers u);
	
	//修改用户状态
	public void updateUserStatus(BigDecimal userId);
	
	//修改制定ID的用户
	public SysUsers goUpdateUserOne(BigDecimal userId);
	
}
