package com.sc.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysDepartment;
import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysJobinfo;
import com.sc.entity.SysUsersInfo;


public interface SysUsersInfoService {
	

	//查询除了同公司其他所有用户信息-办公
	public List<SysUsersInfo> selectusergc(SysUsersInfo u);


	
	//查询除了当前用户的其他所有用户信息-办公
	public List<SysUsersInfo> selectuser(BigDecimal sid);

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
    public List<SysJobinfo > select3(SysUsersInfo info);
    //登录
    public SysUsersInfo  login(SysUsersInfo u);
    //导出excel
    public XSSFWorkbook show();
    //在员工表根据公司id查询职务对象集合
    public List<SysJobinfo> gszw(SysUsersInfo info1);

    public PageInfo<SysUsersInfo> selectpage(Integer pageNum,Integer pageSize,SysUsersInfo info1);
    
    public ArrayList<SysUsersInfo> selectAllUsersInfoByGsid(BigDecimal gongsiid);
}

	

