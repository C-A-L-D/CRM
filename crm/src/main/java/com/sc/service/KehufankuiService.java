package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouKehfankui;

public interface KehufankuiService {
	//客户联系人——分页(根据客户ID查找)
	public PageInfo<XiaoshouKehfankui> selectKehufankui(Integer pageNum,Integer pageSize,Long kid);
	//获取联系人对象
	public XiaoshouKehfankui getKehufankui(Long fid);
	//联系人信息编辑——弹层
	public void updateKehufankui(XiaoshouKehfankui fkjl);
	//联系人信息添加——弹层
	public void addKehufankui(XiaoshouKehfankui fkjl);
	//联系人信息模糊查询
	public PageInfo<XiaoshouKehfankui> mohuKehufankui(Integer pageNum,Integer pageSize,Long kid,String jiluyouxianji);
	//删除联系人
	public void deleteKehufankui(XiaoshouKehfankui fkjl);
}
