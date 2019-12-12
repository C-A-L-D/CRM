package com.sc.service;

import com.sc.entity.SysUsers;

public interface SysUsersService {

	public SysUsers login(String u);
	
	public void addUser(SysUsers u);
}
