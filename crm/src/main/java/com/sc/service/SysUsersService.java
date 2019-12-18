package com.sc.service;

import java.math.BigDecimal;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysUsers;

public interface SysUsersService {

	//查询单个用户
	public SysUsers login(String u);
	
	//用户账户表和公司信息表连接查询
	public SysUsers login(String u, BigDecimal id);
	
	//账户表和角色表连接
	
	
	//查询全部用户列表
	public PageInfo<SysUsers> selectAllUsersAndRole(int pageNum, int pageSize);
	
	//添加一条用户记录
	public void addUser(SysUsers u);
}
