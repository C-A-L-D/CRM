package com.sc.service;

import java.util.ArrayList;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysUsers;

public interface SysUsersService {

	//根据用户名查询单个用户
	public SysUsers login(String u);
	
	//查询全部用户列表
	public PageInfo<SysUsers> selectAllUsers(int pageNum, int pageSize);
	
	//添加一条用户记录
	public void addUser(SysUsers u);
}
