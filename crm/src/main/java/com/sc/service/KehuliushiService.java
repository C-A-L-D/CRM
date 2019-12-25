package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouKehuliusgi;

public interface KehuliushiService {
	//客户流失列表——分页
	public PageInfo<XiaoshouKehuliusgi> selectKehuliushi(Integer pageNum,Integer pageSize);
	//获取客户流失对象
	public XiaoshouKehuliusgi getKehuliushi(Long ksid);
	//客户流失编辑
	public void updateKehuliushi(XiaoshouKehuliusgi lskh);
	//删除流失客户
	public void deleteKehuliushi(XiaoshouKehuliusgi lskh);
	//客户流失处理
	public void addKehuliushi(XiaoshouKehuliusgi lskh);
}
