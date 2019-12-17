package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import com.github.pagehelper.PageInfo;

import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysJobinfo;
import com.sc.entity.SysUsersInfo;


public interface SysUsersInfoService {

	
	
	//添加
	public void add(SysUsersInfo u);
	
	//修改
    public void update(SysUsersInfo u);
    
    //删除
    public void delete(SysUsersInfo u);
    
    //获取对象
    public SysUsersInfo get(BigDecimal sid);
    
    //查询
    public List<SysUsersInfo > select();
    //查询公司
    public List<SysGongsiinfo > select1();
    //查询职务
    public List<SysJobinfo > select3();
    //登录
    public SysUsersInfo  login(SysUsersInfo u);

    public PageInfo<SysUsersInfo> selectpage(Integer pageNum,Integer pageSize,SysUsersInfo info1);
}

	

