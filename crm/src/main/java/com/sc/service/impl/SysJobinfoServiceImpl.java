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
import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysJobinfo;
import com.sc.entity.SysJobinfoExample;
import com.sc.entity.SysJobinfoExample.Criteria;

import com.sc.mapper.SysDepartmentMapper;
import com.sc.mapper.SysGongsiinfoMapper;
import com.sc.mapper.SysJobinfoMapper;
import com.sc.service.SysJobinfoService;
@Service
public class SysJobinfoServiceImpl implements SysJobinfoService {

	@Autowired
	SysJobinfoMapper sysJobinfoMapper;
	@Autowired
	SysGongsiinfoMapper sysGongsiinfoMapper;
	@Autowired
	SysDepartmentMapper sysDepartmentMapper;
		
		@Override
		public void add(SysJobinfo j) {
			if(j!=null){
				this.sysJobinfoMapper.insert(j);
			}

		}

		@Override
		public void update(SysJobinfo j) {
			if(j!=null){
				this.sysJobinfoMapper.updateByPrimaryKey(j);
			}

		}

		@Override
		public void delete(SysJobinfo j) {
			if(j!=null){
				this.sysJobinfoMapper.deleteByPrimaryKey(j.getJid());
			}

		}

		@Override
		public SysJobinfo get(BigDecimal jid) {
			if(jid!=null){
				return	this.sysJobinfoMapper.selectByPrimaryKey(jid);
			}
			return null;
		}

		@Override
		public List<SysJobinfo> select() {
			// TODO Auto-generated method stub
			return	this.sysJobinfoMapper.selectByExample(null);
		}
		
		@Override
		public List<SysGongsiinfo> select1() {
			// TODO Auto-generated method stub
		
			return	this.sysGongsiinfoMapper.selectByExample(null);
		}
		
		@Override
		public List<SysDepartment> select2(SysJobinfo info) {
			// TODO Auto-generated method stub
		    SysDepartmentExample example = new SysDepartmentExample();
		    com.sc.entity.SysDepartmentExample.Criteria c = example.createCriteria();
		    BigDecimal gongsiid = info.getGongsiid();
		    c.andGongsiidEqualTo(gongsiid);
			return	this.sysDepartmentMapper.selectByExample(example);
		}
		
		

		@Override
		public PageInfo<SysJobinfo> selectpage(Integer pageNum, Integer pageSize,SysJobinfo info1) {
			//设置分页数据，开始分页,模糊查询
			PageHelper.startPage(pageNum, pageSize);
			SysJobinfoExample example=new SysJobinfoExample();
			
		     example.setOrderByClause(" jid desc ");//通过id编号降序排列，注意名称一定是列名
			 if(info1!=null){
	
              Criteria c = example.createCriteria();
              if(info1.getJname()!=null&&!info1.getJname().equals("")){
              c.andJnameLike("%"+info1.getJname() +"%"); 
              System.out.println(info1.getJname());
              }
			 }
			//查询当前页的集合数据
			 List<SysJobinfo> list = this.sysJobinfoMapper.selectByExample(example);
			 
			//封装成pageinfo对象
			PageInfo<SysJobinfo> page=new PageInfo<SysJobinfo>(list);
			
			return page;
		}
		
		@Override
		//根据部门查询职务
		 public List<SysJobinfo> bmzw(SysDepartment info1){
			 SysJobinfoExample example=new SysJobinfoExample();
			 Criteria c = example.createCriteria();
			 c.andDidEqualTo(info1.getDid());
			//查询当前页的集合数据
			 List<SysJobinfo> list = this.sysJobinfoMapper.selectByExample(example);
			return list;
			
		 }
		 
		
		 //在职务表根据公司id查询部门对象集合
		@Override
	    public List<SysDepartment> gsbm(SysJobinfo info1){
			SysDepartmentExample example=new SysDepartmentExample();
			com.sc.entity.SysDepartmentExample.Criteria  c= example.createCriteria();
			BigDecimal gongsiid = info1.getGongsiid();	
			 c.andGongsiidEqualTo(gongsiid);
			 List<SysDepartment> list=this.sysDepartmentMapper.selectByExample(example);
			 System.out.println(list);
			 return list;
	    }
		
	//导出excel
	@Override
    public XSSFWorkbook show() {
        List<SysJobinfo> list = sysJobinfoMapper.selectByExample(null);//查出数据库数据
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet =  wb.createSheet("bm");//创建一张表
        Row titleRow =  sheet.createRow(0);//创建第一行，起始为0
        titleRow.createCell(0).setCellValue("职务编号");//第一列
        titleRow.createCell(1).setCellValue("职务名");
        titleRow.createCell(2).setCellValue("部门编号");
        titleRow.createCell(3).setCellValue("备注说明");
        titleRow.createCell(4).setCellValue("公司编号");
        titleRow.createCell(4).setCellValue("最后修改时间");
        int cell = 1;
        for (SysJobinfo SysJobinfo : list) {
			
		
            Row row =  sheet.createRow(cell);//从第二行开始保存数据
            
            //转时间格式
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");         
            String date= formatter.format(SysJobinfo.getLasttime());
            System.out.println(date);
            
            row.createCell(0).setCellValue(String.valueOf(SysJobinfo.getJid()));//将数据库的数据遍历出来
            row.createCell(1).setCellValue(SysJobinfo.getJname());
            row.createCell(2).setCellValue(String.valueOf(SysJobinfo.getDid()));
            row.createCell(2).setCellValue(SysJobinfo.getJdescribe());
            row.createCell(3).setCellValue(String.valueOf(SysJobinfo.getGongsiid()));
            row.createCell(4).setCellValue(date);
           
            cell++;
        }
        
        return wb;
    }
		
	
		
}
