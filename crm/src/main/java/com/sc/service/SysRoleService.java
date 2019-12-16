package com.sc.service;

import java.util.ArrayList;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysRole;

public interface SysRoleService {

	public PageInfo<SysRole> selectAllRoleAndPower(int pageNum, int pageSize);
	
}
