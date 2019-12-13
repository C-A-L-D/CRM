package com.sc.service;


import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OffMess;
import com.sc.entity.OffMessdetail;

public interface OffMessService {
	//查询办公短消息表-已接收
  public List<OffMessdetail> select();

   //分页查询
	public PageInfo<OffMessdetail> selectpage(Integer pageNum,Integer pageSize); 

	//删除短信
	public void deleteMess(OffMessdetail mess);
		
	//查询短消息详情
	public List<OffMessdetail> showdetail(OffMessdetail mess);

	//回复短信
		public void huifu(OffMess mess);
}
