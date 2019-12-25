package com.sc.service;


import java.math.BigDecimal;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OffMess;
import com.sc.entity.OffMessdetail;
import com.sc.entity.SysUsersInfo;

public interface OffMessService {
   
  //修改短信状态
  public void updatestate(OffMessdetail detail);
  
  //查询发送人信息
  public SysUsersInfo selectByuid(BigDecimal sid);
  
  //查询接收人信息
  public SysUsersInfo selectu(String uname);
  
   //分页查询办公短消息表-已接收
	public PageInfo<OffMessdetail> selectpage(Integer pageNum,Integer pageSize,OffMessdetail detail); 

	//删除短信
	public void deleteMess(OffMessdetail mess);
		
	//查询短消息详情
	public OffMessdetail showdetail(OffMessdetail mess);

	//回复短信
	public void huifu(OffMess mess);
		
   //回复短信-详情表
	public void huifuone(OffMessdetail detail);
	
	
	  //分页查询-发送
    public PageInfo<OffMess> selectpagesend(Integer pageNum,Integer pageSize,String name); 
		
    public List<OffMessdetail>  selectpagesend1(Long messid); 
    
    public OffMess select(Long messid);
    
	//查询接收人信息
    public SysUsersInfo receuser(BigDecimal receiverid);
    
    //模糊查询-标题
    public List<OffMessdetail> selectbytitle(String title);
    
    //分页查询-模糊查询-标题
   	public PageInfo<OffMessdetail> selectpagetitle(Integer pageNum,Integer pageSize,String title);
   	
    //模糊查询-内容
    public List<OffMessdetail> selectbycontent(String content);
    
    //分页查询-模糊查询-内容
   	public PageInfo<OffMessdetail> selectpagecontent(Integer pageNum,Integer pageSize,String content);
   	
   	
}
