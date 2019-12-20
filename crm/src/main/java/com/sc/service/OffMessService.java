package com.sc.service;


import java.math.BigDecimal;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OffMess;
import com.sc.entity.OffMessdetail;
import com.sc.entity.SysUsers;
import com.sc.entity.SysUsersExample;

public interface OffMessService {
	//查询办公短消息表-已接收
  public List<OffMessdetail> select();
   
  //修改短信状态
  public void updatestate(Long detailid);
  
  //查询发送人信息
  public SysUsers selectByuid(BigDecimal uid);
  
  //查询接收人信息
  public SysUsers selectu(String uname);
  
   //分页查询
	public PageInfo<OffMessdetail> selectpage(Integer pageNum,Integer pageSize); 

	//删除短信
	public void deleteMess(OffMessdetail mess);
		
	//查询短消息详情
	public OffMessdetail showdetail(OffMessdetail mess);

	//回复短信
	public void huifu(OffMess mess);
		
   //回复短信-详情表
	public void huifuone(OffMessdetail detail);
}
