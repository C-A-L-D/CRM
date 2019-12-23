package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysDepartment;
import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysJobinfo;

public interface SysJobinfoService {
	//添加
	public void add(SysJobinfo j);
	
	//修改
    public void update(SysJobinfo j);
    
    //删除
    public void delete(SysJobinfo j);
    
    //获取对象
    public SysJobinfo get(BigDecimal jid);
    
    //查询
    public List<SysJobinfo > select();
    //查询公司
    public List<SysGongsiinfo > select1();
    //查询部门
    public List<SysDepartment > select2(SysJobinfo info);
    //导出excel
    public XSSFWorkbook show();
    //在职务表根据公司id查询部门对象集合
    public List<SysDepartment> gsbm(SysJobinfo info1);
    

    public PageInfo<SysJobinfo> selectpage(Integer pageNum,Integer pageSize,SysJobinfo info1);
}
