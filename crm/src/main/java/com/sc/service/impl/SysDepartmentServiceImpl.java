package com.sc.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysDepartment;
import com.sc.entity.SysDepartmentExample;
import com.sc.entity.SysDepartmentExample.Criteria;
import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysUsersInfo;
import com.sc.mapper.SysDepartmentMapper;
import com.sc.mapper.SysGongsiinfoMapper;
import com.sc.service.SysDepartmentService;

@Service
public class SysDepartmentServiceImpl implements SysDepartmentService {
@Autowired
SysDepartmentMapper sysDepartmentMapper;
@Autowired
SysGongsiinfoMapper sysGongsiinfoMapper;

	@Override
	public void add(SysDepartment d) {
		if(d!=null){
			this.sysDepartmentMapper.insert(d);
		}

	}

	@Override
	public void update(SysDepartment d) {
		if(d!=null){
			this.sysDepartmentMapper.updateByPrimaryKey(d);
		}

	}

	@Override
	public void delete(SysDepartment d) {
		if(d!=null){
			this.sysDepartmentMapper.deleteByPrimaryKey(d.getDid());
		}

	}

	@Override
	public SysDepartment get(BigDecimal did) {
		if(did!=null){
			
			return this.sysDepartmentMapper.selectByPrimaryKey(did);
		}
		return null;
	}

	@Override
	public List<SysDepartment> select() {
		// TODO Auto-generated method stub
	
		return	this.sysDepartmentMapper.selectByExample(null);
	}
	
	@Override
	public List<SysGongsiinfo> select1() {
		// TODO Auto-generated method stub
	
		return	this.sysGongsiinfoMapper.selectByExample(null);
	}

	@Override
	public PageInfo<SysDepartment> selectpage(Integer pageNum, Integer pageSize,SysDepartment info1) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
		SysDepartmentExample example=new SysDepartmentExample();
	     example.setOrderByClause(" did desc ");//通过id编号降序排列，注意名称一定是列名
	     
	     if(info1!=null){
	        Criteria c = example.createCriteria();
	        if(info1.getDname()!=null&&!info1.getDname().equals("")){
	           c.andDnameLike("%"+info1.getDname() +"%");
	        }
	     }
		//查询当前页的集合数据
	 	List<SysDepartment> list = this.sysDepartmentMapper.selectByExample(example);
		//封装成pageinfo对象
        PageInfo<SysDepartment> page=new PageInfo<SysDepartment>(list);
		
		return page;
	}
	//导出excel
	@Override
    public XSSFWorkbook show() {
        List<SysDepartment> list = sysDepartmentMapper.selectByExample(null);//查出数据库数据
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet =  wb.createSheet("bm");//创建一张表
        Row titleRow =  sheet.createRow(0);//创建第一行，起始为0
        titleRow.createCell(0).setCellValue("部门编号");//第一列
        titleRow.createCell(1).setCellValue("部门名");
        titleRow.createCell(2).setCellValue("备注说明");
        titleRow.createCell(3).setCellValue("公司编号");
        titleRow.createCell(4).setCellValue("最后修改时间");
       
        int cell = 1;
        for (SysDepartment sysDepartment : list) {
			
		
            Row row =  sheet.createRow(cell);//从第二行开始保存数据
            
            //转时间格式
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");         
            String date= formatter.format(sysDepartment.getLasttime());
            System.out.println(date);
            
            row.createCell(0).setCellValue(String.valueOf(sysDepartment.getDid()));//将数据库的数据遍历出来
            row.createCell(1).setCellValue(sysDepartment.getDname());
            row.createCell(2).setCellValue(sysDepartment.getDdescribe());
            row.createCell(3).setCellValue(String.valueOf(sysDepartment.getGongsiid()));
            row.createCell(4).setCellValue(date);
           
            cell++;
        }
        
        return wb;
    }
	
}
