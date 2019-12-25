package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouEhuluiamxijilu;

public interface KehulianxijiluService {
	//客户联系人——分页(根据客户ID查找)
	public PageInfo<XiaoshouEhuluiamxijilu> selectKehulianxijilu(Integer pageNum,Integer pageSize,Long kid);
	//获取联系人对象
	public XiaoshouEhuluiamxijilu getKehulianxijilu(Long ljid);
	//联系人信息编辑——弹层
	public void updateKehulianxijilu(XiaoshouEhuluiamxijilu lxjl);
	//联系人信息添加——弹层
	public void addKehulianxijilu(XiaoshouEhuluiamxijilu lxjl);
	//联系人信息模糊查询
	public PageInfo<XiaoshouEhuluiamxijilu> mohuKehulianxijilu(Integer pageNum,Integer pageSize,Long kid,String lianxibiaoti);
	//删除联系人
	public void deleteKehulianxijilu(XiaoshouEhuluiamxijilu lxjl);
}
