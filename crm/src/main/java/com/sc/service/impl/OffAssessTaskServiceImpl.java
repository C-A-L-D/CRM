package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.OffAssesstask;
import com.sc.entity.OffAssesstaskExample;
import com.sc.entity.OffAssesstaskExample.Criteria;
import com.sc.entity.SysUsersInfo;
import com.sc.mapper.OffAssesstaskMapper;
import com.sc.mapper.SysUsersInfoMapper;
import com.sc.service.OffAssessTaskService;

@Service
public class OffAssessTaskServiceImpl implements OffAssessTaskService {
	@Autowired
    OffAssesstaskMapper offAssesstaskMapper;
	@Autowired
	SysUsersInfoMapper sysUsersInfoMapper;
	//查询任务
	@Override
	public List<OffAssesstask> select(Long cid) {
		return this.offAssesstaskMapper.select(cid);
	}
	
	//分页查询
	@Override
		public PageInfo<OffAssesstask> selectpage(Integer pageNum, Integer pageSize,Long cid) {
			//设置分页数据，开始分页
			PageHelper.startPage(pageNum, pageSize);
		    //查询当前页的集合数据	
			this.offAssesstaskMapper.updatestate();
			List<OffAssesstask> list = this.offAssesstaskMapper.select(cid);
			
		   System.out.println("11"+list);
			//封装成pageinfo对象
		   PageInfo<OffAssesstask> page=new PageInfo<OffAssesstask>(list);				
			return page;
		}
	
	//删除任务
	@Override
	public void delete(Long taskid) {
		this.offAssesstaskMapper.deleteByPrimaryKey(taskid);		
	}
	
	//查询任务-ID
	@Override
	public OffAssesstask selectbyid(Long taskid) {
		return this.offAssesstaskMapper.selectByPrimaryKey(taskid);
	}
	
	//查询接受任务用户信息
	@Override
	public SysUsersInfo selectbyidu(BigDecimal sid) {
		return this.sysUsersInfoMapper.selectByPrimaryKey(sid);
	}
	
	//添加任务
	@Override
	public void insert(OffAssesstask task) {
		this.offAssesstaskMapper.insert(task);
	}
	
	//分页查询-标题
	@Override
	public PageInfo<OffAssesstask> selectpagetitle(Integer pageNum, Integer pageSize, String tasktitle,Long cid) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
	    //查询当前页的集合数据	
		OffAssesstaskExample e=new OffAssesstaskExample();
		Criteria c=e.createCriteria();
		String title=new String();
		if(tasktitle!=null){
			title="%"+tasktitle+"%";
			c.andTasktitleLike(title);
			c.andCompanyidEqualTo(cid);
		}
		List<OffAssesstask> list=this.offAssesstaskMapper.selectByExample(e);
		//封装成pageinfo对象
		   PageInfo<OffAssesstask> page=new PageInfo<OffAssesstask>(list);				
			return page;
	}
	
	//分页查询-内容
	@Override
	public PageInfo<OffAssesstask> selectpagecontent(Integer pageNum, Integer pageSize, String taskdetail,Long cid) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
	    //查询当前页的集合数据	
		OffAssesstaskExample e=new OffAssesstaskExample();
		Criteria c=e.createCriteria();
	    String content=new String();
		if(taskdetail!=null){
			content="%"+taskdetail+"%";
			c.andTaskdetailLike(content);
			c.andCompanyidEqualTo(cid);
		}
		List<OffAssesstask> list=this.offAssesstaskMapper.selectByExample(e);
	    //封装成pageinfo对象
		PageInfo<OffAssesstask> page=new PageInfo<OffAssesstask>(list);				
		return page;
	}
	
	//分查询-任务发布人
	@Override
	public PageInfo<OffAssesstask> selectpageu(Integer pageNum, Integer pageSize, String taskpublisher,Long cid) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
	    //查询当前页的集合数据	
		OffAssesstaskExample e=new OffAssesstaskExample();
		Criteria c=e.createCriteria();
	    String uname=new String();
	    System.out.println("333"+taskpublisher);
		if(taskpublisher!=null){
			uname="%"+taskpublisher+"%";
			c.andTaskpublisherLike(uname);
			c.andCompanyidEqualTo(cid);
		}
		List<OffAssesstask> list=this.offAssesstaskMapper.selectByExample(e);
		//封装成pageinfo对象
		PageInfo<OffAssesstask> page=new PageInfo<OffAssesstask>(list);				
		return page;
	}
	
	//分页查询-考核指标
	@Override
	public PageInfo<OffAssesstask> selectpagetarget(Integer pageNum, Integer pageSize, String assesstarget,Long cid) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
		//查询当前页的集合数据	
		OffAssesstaskExample e=new OffAssesstaskExample();
		Criteria c=e.createCriteria();
		String target=new String();
		if(assesstarget!=null){
			target="%"+assesstarget+"%";
			c.andAssesstargetLike(target);
			c.andCompanyidEqualTo(cid);
		}
		List<OffAssesstask> list=this.offAssesstaskMapper.selectByExample(e);
		//封装成pageinfo对象
		PageInfo<OffAssesstask> page=new PageInfo<OffAssesstask>(list);				
		return page;
	}
	
	//修改任务状态
	@Override
	public void updatestate() {
		this.offAssesstaskMapper.updatestate();
		
	}

}
