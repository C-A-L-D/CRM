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
import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysGongsiinfoExample;
import com.sc.entity.SysGongsiinfoExample.Criteria;
import com.sc.mapper.SysGongsiinfoMapper;
import com.sc.mapper.SysGongsiinfoMapper;
import com.sc.service.SysGongsiinfoService;

@Service
public class SysGongsiinfoServiceImpl implements SysGongsiinfoService {

	@Autowired
	SysGongsiinfoMapper sysGongsiinfoMapper;
		
		@Override
		public void add(SysGongsiinfo g) {
			if(g!=null){
				this.sysGongsiinfoMapper.insert(g);
			}

		}

		@Override
		public void update(SysGongsiinfo g) {
			if(g!=null){
				this.sysGongsiinfoMapper.updateByPrimaryKey(g);
			}

		}

		@Override
		public void delete(SysGongsiinfo g) {
			
			if(g!=null){
				this.sysGongsiinfoMapper.deleteByPrimaryKey(g.getId());
			}

		}

		@Override
		public SysGongsiinfo get(BigDecimal id) {
			if(id!=null){
				return	this.sysGongsiinfoMapper.selectByPrimaryKey(id);
			}
			return null;
		}

		@Override
		public List<SysGongsiinfo> select() {
			// TODO Auto-generated method stub
			return	this.sysGongsiinfoMapper.selectByExample(null);
		}
		
		@Override
		public PageInfo<SysGongsiinfo> selectpage(Integer pageNum, Integer pageSize,SysGongsiinfo info1) {
			//设置分页数据，开始分页
			PageHelper.startPage(pageNum, pageSize);
		    SysGongsiinfoExample example=new SysGongsiinfoExample();
		     example.setOrderByClause(" id desc ");//通过id编号降序排列，注意名称一定是列名
		     
		     if(info1!=null){
			     Criteria c = example.createCriteria();
			     if(info1.getGname()!=null&&!info1.getGname().equals("")){
			        c.andGnameLike("%"+info1.getGname() +"%");
			     }
		     }
			//查询当前页的集合数据
			List<SysGongsiinfo> list = this.sysGongsiinfoMapper.selectByExample(example);
			//封装成pageinfo对象
			PageInfo<SysGongsiinfo> page=new PageInfo<SysGongsiinfo>(list);
			System.out.println(page);
			return page;
		}
		
//导出excel
@Override
public XSSFWorkbook show() {
    List<SysGongsiinfo> list = sysGongsiinfoMapper.selectByExample(null);//查出数据库数据
XSSFWorkbook wb = new XSSFWorkbook();
XSSFSheet sheet =  wb.createSheet("bm");//创建一张表
Row titleRow =  sheet.createRow(0);//创建第一行，起始为0
titleRow.createCell(0).setCellValue("主键");//第一列
titleRow.createCell(1).setCellValue("公司名称");
titleRow.createCell(2).setCellValue("公司代码");
titleRow.createCell(3).setCellValue("邮箱");
titleRow.createCell(4).setCellValue("联系人");
titleRow.createCell(5).setCellValue("公司地址");//第一列
titleRow.createCell(6).setCellValue("固定电话");
titleRow.createCell(7).setCellValue("移动电话");
titleRow.createCell(8).setCellValue("传真");
titleRow.createCell(9).setCellValue("开户银行");
titleRow.createCell(10).setCellValue("银行账号");
titleRow.createCell(11).setCellValue("是否有效");
titleRow.createCell(12).setCellValue("最后修改时间");

   
    int cell = 1;
    for (SysGongsiinfo SysGongsiinfo : list) {
		
	
        Row row =  sheet.createRow(cell);//从第二行开始保存数据
    
    //转时间格式
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");         
    String date= formatter.format(SysGongsiinfo.getLasttime());
    System.out.println(date);
    
    row.createCell(0).setCellValue(String.valueOf(SysGongsiinfo.getId()));//将数据库的数据遍历出来
        row.createCell(1).setCellValue(SysGongsiinfo.getGname());
        row.createCell(2).setCellValue(SysGongsiinfo.getGcode());
        row.createCell(3).setCellValue(SysGongsiinfo.getGemail());
        
        row.createCell(4).setCellValue(SysGongsiinfo.getGlinkman());
        row.createCell(5).setCellValue(SysGongsiinfo.getGaddress());
        row.createCell(6).setCellValue(SysGongsiinfo.getGtel());
    
        row.createCell(7).setCellValue(SysGongsiinfo.getGphone());
        row.createCell(8).setCellValue(SysGongsiinfo.getGchuanzhen());
        row.createCell(9).setCellValue(SysGongsiinfo.getGopenyinghang());
      
        row.createCell(10).setCellValue(SysGongsiinfo.getGyinghangaccount());
        row.createCell(11).setCellValue(SysGongsiinfo.getGtf());
    
        row.createCell(12).setCellValue(date);
        cell++;
    }
    
    return wb;
}

}
