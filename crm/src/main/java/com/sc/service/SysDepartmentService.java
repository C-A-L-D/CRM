package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysDepartment;
import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysUsersInfo;

public interface SysDepartmentService {
	//添加
	public void add(SysDepartment d);
	
	//修改
    public void update(SysDepartment d);
    
    //删除
    public void delete(SysDepartment d);
    
    //获取对象
    public SysDepartment get(BigDecimal did);
    
    //查询
    public List<SysDepartment > select();

    public List<SysGongsiinfo > select1();
    
  //导出excel
    public XSSFWorkbook show();
    
    public PageInfo<SysDepartment> selectpage(Integer pageNum,Integer pageSize,SysDepartment info1);
}
