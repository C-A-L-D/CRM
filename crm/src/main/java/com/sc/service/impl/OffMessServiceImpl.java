package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.OffMess;
import com.sc.entity.OffMessExample;
import com.sc.entity.OffMessExample.Criteria;
import com.sc.entity.OffMessdetail;
import com.sc.entity.OffMessdetailExample;
import com.sc.entity.SysUsersInfo;
import com.sc.mapper.OffMessMapper;
import com.sc.mapper.OffMessdetailMapper;
import com.sc.mapper.SysUsersInfoMapper;

import com.sc.service.OffMessService;

@Service
public class OffMessServiceImpl implements OffMessService {
	@Autowired
    OffMessdetailMapper offMessdetailMapper;
	
	@Autowired
    OffMessMapper offMessMapper;
	
	@Autowired
	SysUsersInfoMapper sysUsersInfoMapper;
	
	//分页查询-短消息-已接收  1
	@Override
	public PageInfo<OffMessdetail> selectpage(Integer pageNum, Integer pageSize,OffMessdetail detail) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
	    //查询当前页的集合数据	
		List<OffMessdetail> list = this.offMessdetailMapper.select(detail);
		System.out.println("查询到的list"+list);
		//封装成pageinfo对象
		PageInfo<OffMessdetail> page=new PageInfo<OffMessdetail>(list);
				
		return page;
	}

	//删除短信   1
	@Override
	public void deleteMess(OffMessdetail mess) {
		if(mess!=null){
			this.offMessdetailMapper.deleteByPrimaryKey(mess.getDetailid());
		}	
	}

    //查看短消息详情  1
	@Override 
	public OffMessdetail showdetail(OffMessdetail mess) {
		return this.offMessdetailMapper.showdetail(mess.getDetailid());
	}

    //回复短信   1
	@Override
	public void huifu(OffMess mess) {
		if(mess!=null){
			  this.offMessMapper.huifu(mess);
			}	
	}

    //回复短消息-详情  1
	@Override
	public void huifuone(OffMessdetail detail) {
		if(detail!=null){
			  this.offMessdetailMapper.huifuone(detail);
			}	
	}

    //更改短消息状态   1
	@Override
	public void  updatestate(OffMessdetail detail) {
		if(detail!=null){
			  this.offMessdetailMapper.updateByPrimaryKey(detail);
		}
	}

    //查看发送人信息   1
	@Override
	public SysUsersInfo selectByuid(BigDecimal sid) {
		
		return this.sysUsersInfoMapper.selectByPrimaryKey(sid);
	}

	
    //查看接收人信息  1
	@Override
	public SysUsersInfo selectu(String uname){
		SysUsersInfo user = this.sysUsersInfoMapper.selectu(uname);
		
				
		return user;
	}

	//分页查询-发送的短信   1
		@Override
		public PageInfo<OffMess> selectpagesend(Integer pageNum, Integer pageSize,String name) {
			//设置分页数据，开始分页
			PageHelper.startPage(pageNum, pageSize);
		    //查询当前页的集合数据	
			OffMessExample e=new OffMessExample();
			e.setOrderByClause("LASTTIME desc");
	        Criteria c=e.createCriteria();
	        if(name!=null){
	        	c.andSenderEqualTo(name);
	        }
	        List<OffMess> list =  this.offMessMapper.selectByExample(e);
	  
			//封装成pageinfo对象
			PageInfo<OffMess> page=new PageInfo<OffMess>(list);
			System.out.println("11"+page);
			return page;
		}
		
		//  1
		public List<OffMessdetail>  selectpagesend1(Long messid){
			OffMessdetailExample e=new OffMessdetailExample();
             com.sc.entity.OffMessdetailExample.Criteria c=e.createCriteria();
             c.andMessidEqualTo(messid);
             List<OffMessdetail> list=this.offMessdetailMapper.selectByExample(e);
             for (OffMessdetail d : list) {
            	 BigDecimal b=new BigDecimal(d.getReceiverid());
				SysUsersInfo s=this.sysUsersInfoMapper.selectByPrimaryKey(b);
				d.setUname(s.getSname());
			}
			return list;
		}
		
		@Override
		public OffMess select(Long messid) {
			return offMessMapper.selectByPrimaryKey(messid);
		}

	@Override
	public SysUsersInfo receuser(BigDecimal receiverid) {
		return sysUsersInfoMapper.selectByPrimaryKey(receiverid);		
	}

	
	//分页-模糊查询-标题  1
	@Override
	public PageInfo<OffMessdetail> selectpagetitle(Integer pageNum, Integer pageSize,String title,Long uid) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
		//查询当前页的集合数据	
		List<OffMessdetail> list = this.offMessdetailMapper.selectbytitle(title,uid);
				//封装成pageinfo对象
				PageInfo<OffMessdetail> page=new PageInfo<OffMessdetail>(list);
				System.out.println("11"+page);
				return page;
	}
	

		//分页-模糊查询-内容    1
		@Override
		public PageInfo<OffMessdetail> selectpagecontent(Integer pageNum, Integer pageSize,String content,Long uid) {
			//设置分页数据，开始分页
			PageHelper.startPage(pageNum, pageSize);
			//查询当前页的集合数据	
			List<OffMessdetail> list = this.offMessdetailMapper.selectbycontent(content,uid);
					//封装成pageinfo对象
					PageInfo<OffMessdetail> page=new PageInfo<OffMessdetail>(list);
					System.out.println("11"+page);
					return page;
		}
		
		
}
