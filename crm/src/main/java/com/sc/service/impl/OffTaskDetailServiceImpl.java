package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.OffTaskdetail;
import com.sc.entity.OffTaskdetailExample;
import com.sc.entity.OffTaskdetailExample.Criteria;
import com.sc.mapper.OffAssesstaskMapper;
import com.sc.mapper.OffTaskdetailMapper;
import com.sc.service.OffTaskDetailService;

@Service
public class OffTaskDetailServiceImpl implements OffTaskDetailService {
     @Autowired
	OffTaskdetailMapper offTaskdetailMapper;
     @Autowired
     OffAssesstaskMapper offAssesstaskMapper;
	//查询任务详情列表-ID
	@Override
	public List<OffTaskdetail> taskdetail(Long taskid) {
		OffTaskdetailExample e=new OffTaskdetailExample();
		Criteria c=e.createCriteria();
		c.andTaskidEqualTo(taskid);
		List<OffTaskdetail> list=this.offTaskdetailMapper.selectByExample(e);
		System.out.println("查询到的任务详情："+list);
		return list;
	}
	
	//添加任务详情
	@Override
	public void insert(OffTaskdetail detail) {
		this.offTaskdetailMapper.insert(detail);	
	}

	//查询已接收任务
	@Override
	public PageInfo<OffTaskdetail> selectpageaccept(Integer pageNum, Integer pageSize) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
	    //查询当前页的集合数据	
		this.offAssesstaskMapper.updatestate();
		List<OffTaskdetail> list=this.offTaskdetailMapper.selectaccept();
		//封装成pageinfo对象
		   PageInfo<OffTaskdetail> page=new PageInfo<OffTaskdetail>(list);				
			return page;
	}
   
	//修改任务详情对象
	@Override
	 public void update(OffTaskdetail record){
		this.offTaskdetailMapper.updateByPrimaryKey(record);
	}
	
	//查询任务详情对象
	@Override
	public OffTaskdetail select(Long id) {
		return this.offTaskdetailMapper.selectByPrimaryKey(id);
	}
	
	//分页查询-标题
		@Override
		public PageInfo<OffTaskdetail> selectpagetitle(Integer pageNum, Integer pageSize, String tasktitle) {
			//设置分页数据，开始分页
			PageHelper.startPage(pageNum, pageSize);
		    //查询当前页的集合数据	
				List<OffTaskdetail> list=this.offTaskdetailMapper.selectbytitle(tasktitle);		
			//封装成pageinfo对象
			   PageInfo<OffTaskdetail> page=new PageInfo<OffTaskdetail>(list);				
				return page;		
		}

		
		//分页查询-内容
		@Override
		public PageInfo<OffTaskdetail> selectpagecontent(Integer pageNum, Integer pageSize, String taskdetail) {
			//设置分页数据，开始分页
			PageHelper.startPage(pageNum, pageSize);
		    //查询当前页的集合数据	
			List<OffTaskdetail> list=this.offTaskdetailMapper.selectbycontent(taskdetail);
		    //封装成pageinfo对象
			PageInfo<OffTaskdetail> page=new PageInfo<OffTaskdetail>(list);				
			return page;
		}
		
		//分查询-任务发布人
		@Override
		public PageInfo<OffTaskdetail> selectpageu(Integer pageNum, Integer pageSize, String taskpublisher) {
			//设置分页数据，开始分页
			PageHelper.startPage(pageNum, pageSize);
		    //查询当前页的集合数据	
			List<OffTaskdetail> list=this.offTaskdetailMapper.selectbyuser(taskpublisher);
			//封装成pageinfo对象
			PageInfo<OffTaskdetail> page=new PageInfo<OffTaskdetail>(list);				
			return page;
		}
		
		//分页查询-考核指标
		@Override
		public PageInfo<OffTaskdetail> selectpagetarget(Integer pageNum, Integer pageSize, String assesstarget) {
			//设置分页数据，开始分页
			PageHelper.startPage(pageNum, pageSize);
			//查询当前页的集合数据	
			List<OffTaskdetail> list=this.offTaskdetailMapper.selectbytarget(assesstarget);
			//封装成pageinfo对象
			PageInfo<OffTaskdetail> page=new PageInfo<OffTaskdetail>(list);				
			return page;
		}
		
}
