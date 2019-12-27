package com.sc.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysDepartment;
import com.sc.entity.SysDepartmentExample;
import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysJobinfo;
import com.sc.entity.SysJobinfoExample;
import com.sc.entity.SysUsersInfo;
import com.sc.entity.SysUsersInfoExample;
import com.sc.entity.SysUsersInfoExample.Criteria;
import com.sc.mapper.SysGongsiinfoMapper;
import com.sc.mapper.SysJobinfoMapper;
import com.sc.mapper.SysUsersInfoMapper;

import com.sc.service.SysUsersInfoService;

@Service
public class SysUsersInfoServiceImpl implements SysUsersInfoService {
@Autowired
SysUsersInfoMapper sysUsersInfoMapper;
@Autowired
SysGongsiinfoMapper sysGongsiinfoMapper;
@Autowired
SysJobinfoMapper sysJobinfoMapper;
	
	//办公
	@Override
	public List<SysUsersInfo> selectuser(BigDecimal sid) {
		return this.sysUsersInfoMapper.selectuser(sid);
	}
	
	//办公
	@Override
	public List<SysUsersInfo> selectusergc(SysUsersInfo info) {
		return this.sysUsersInfoMapper.selectusergc(info);
	}


	@Override
	public void add(SysUsersInfo u) {
		if(u!=null){
			this.sysUsersInfoMapper.insert(u);
		}
        
	}

	@Override
	public void update(SysUsersInfo u) {
		if(u!=null){
			this.sysUsersInfoMapper.updateByPrimaryKey(u);
		}

	}

	@Override
	public void delete(SysUsersInfo u) {
		if(u!=null){
			this.sysUsersInfoMapper.deleteByPrimaryKey(u.getSid());
		}

	}

	@Override
	public SysUsersInfo get(BigDecimal sid) {
		return	this.sysUsersInfoMapper.selectByPrimaryKey(sid);		
	}

	@Override
	public List<SysUsersInfo> select() {
		
	return	this.sysUsersInfoMapper.selectByExample(null);
	}
	
	@Override
	public List<SysGongsiinfo> select1() {
		// TODO Auto-generated method stub
	
		return	this.sysGongsiinfoMapper.selectByExample(null);
	}
	
	@Override
	public List<SysJobinfo> select3(SysUsersInfo info) {
		// TODO Auto-generated method stub
		SysJobinfoExample example=new SysJobinfoExample();
		com.sc.entity.SysJobinfoExample.Criteria  c= example.createCriteria();
		BigDecimal gongsiid = info.getGongsiid();
		c.andGongsiidEqualTo(gongsiid);
		return	this.sysJobinfoMapper.selectByExample(example);
	}

	@Override
	public SysUsersInfo login(SysUsersInfo u) {
		
		return null;
	}
	
	 //在员工表根据公司id查询职务对象集合
	@Override
	public List<SysJobinfo> gszw(SysUsersInfo info1){
		SysJobinfoExample example=new SysJobinfoExample();
		com.sc.entity.SysJobinfoExample.Criteria  c= example.createCriteria();
		BigDecimal gongsiid = info1.getGongsiid();
		 c.andGongsiidEqualTo(gongsiid);
		 List<SysJobinfo> list=this.sysJobinfoMapper.selectByExample(example);
		 System.out.println(list);
		 return list;
   }

	
	@Override
	public PageInfo<SysUsersInfo> selectpage(Integer pageNum, Integer pageSize,SysUsersInfo info1) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
		SysUsersInfoExample example=new SysUsersInfoExample();
		  example.setOrderByClause(" sid desc ");//通过id编号降序排列，注意名称一定是列名
		 if(info1!=null){
			  Criteria c = example.createCriteria();
			  if(info1.getSname()!=null&&!info1.getSname().equals("")){
			     c.andSnameLike("%"+info1.getSname() +"%");
			  }
		 }
		//查询当前页的集合数据
			List<SysUsersInfo> list = this.sysUsersInfoMapper.selectByExample(example);
		//封装成pageinfo对象
		PageInfo<SysUsersInfo> page=new PageInfo<SysUsersInfo>(list);
		
		return page;
	}

	@Override
    public XSSFWorkbook show() {
        List<SysUsersInfo> list = sysUsersInfoMapper.selectByExample(null);//查出数据库数据
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet =  wb.createSheet("yg");//创建一张表
        Row titleRow = ((XSSFSheet) sheet).createRow(0);//创建第一行，起始为0
        titleRow.createCell(0).setCellValue("员工编号");//第一列
        titleRow.createCell(1).setCellValue("员工姓名");
        titleRow.createCell(2).setCellValue("员工性别");
        titleRow.createCell(3).setCellValue("员工照片");
        titleRow.createCell(4).setCellValue("身份证件");
        titleRow.createCell(5).setCellValue("家庭住址");//第5列
        titleRow.createCell(6).setCellValue("现在地址");
        titleRow.createCell(7).setCellValue("员工学历");
        titleRow.createCell(8).setCellValue("政治面貌");
        titleRow.createCell(9).setCellValue("毕业学校");//第一列
        titleRow.createCell(10).setCellValue("联系电话");
        titleRow.createCell(11).setCellValue("网上联系方式");
        titleRow.createCell(12).setCellValue("网上联系详情");
        titleRow.createCell(13).setCellValue("审核状态");//第一列
        titleRow.createCell(14).setCellValue("职务编号");
        titleRow.createCell(15).setCellValue("员工状态");
        titleRow.createCell(16).setCellValue("公司编号");
        titleRow.createCell(17).setCellValue("最后修改时间");
        int cell = 1;
        for (SysUsersInfo sysUsersInfo : list) {
            Row row =  sheet.createRow(cell);//从第二行开始保存数据
            
            //转时间格式
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");         
            String date= formatter.format(sysUsersInfo.getLasttime());
            System.out.println(date);
            
            row.createCell(0).setCellValue(String.valueOf(sysUsersInfo.getSid()));//将数据库的数据遍历出来
            row.createCell(1).setCellValue(sysUsersInfo.getSname());
            row.createCell(2).setCellValue(sysUsersInfo.getSsex());
            row.createCell(3).setCellValue(sysUsersInfo.getSphoto());
            row.createCell(4).setCellValue(sysUsersInfo.getSidcard());
            row.createCell(5).setCellValue(sysUsersInfo.getSaddressHome());
            row.createCell(6).setCellValue(sysUsersInfo.getSaddressNow());
            row.createCell(7).setCellValue(sysUsersInfo.getSxl());
            row.createCell(8).setCellValue(sysUsersInfo.getSzzmm());
            row.createCell(9).setCellValue(sysUsersInfo.getSschool());
            row.createCell(10).setCellValue(sysUsersInfo.getSphone());
            row.createCell(11).setCellValue(sysUsersInfo.getSphoneLine());
            row.createCell(12).setCellValue(sysUsersInfo.getSchatLine());
            row.createCell(13).setCellValue(sysUsersInfo.getSshStatus());
            row.createCell(14).setCellValue(String.valueOf(sysUsersInfo.getSjobid()));
            row.createCell(15).setCellValue(sysUsersInfo.getSstatus());
            row.createCell(16).setCellValue(String.valueOf(sysUsersInfo.getGongsiid()));
            row.createCell(17).setCellValue(date);
           
            cell++;
        }
        
        return wb;
    }


	@Override
	public ArrayList<SysUsersInfo> selectAllUsersInfoByGsid(BigDecimal gongsiid) {
		// TODO Auto-generated method stub
		SysUsersInfoExample example = new SysUsersInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andGongsiidEqualTo(gongsiid);
		return (ArrayList<SysUsersInfo>) sysUsersInfoMapper.selectByExample(example);
	}
		
	//办公
	@Override
	public List<SysUsersInfo> selectusergc(SysUsersInfo info) {
		return this.sysUsersInfoMapper.selectusergc(info);
	}


}
