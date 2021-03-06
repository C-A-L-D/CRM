package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysDepartment;
import com.sc.entity.SysGongsiinfo;

public interface SysGongsiinfoService {
	//添加
	public void add(SysGongsiinfo g);
	
	//修改
    public void update(SysGongsiinfo g);
    
    //删除
    public void delete(SysGongsiinfo g);
    
    //获取对象
    public SysGongsiinfo get(BigDecimal id);
    
    //查询
    public List<SysGongsiinfo > select();
    //导出excel
    public XSSFWorkbook show();
    
    //分页、条件查询等
    public PageInfo<SysGongsiinfo> selectpage(Integer pageNum,Integer pageSize,SysGongsiinfo info1);
}
