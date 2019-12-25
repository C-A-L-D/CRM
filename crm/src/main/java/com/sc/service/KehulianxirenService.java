package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouKehulianxiren;

public interface KehulianxirenService {
	//客户联系人——分页(根据客户ID查找)
	public PageInfo<XiaoshouKehulianxiren> selectKehulianxiren(Integer pageNum,Integer pageSize,Long kid);
	//获取联系人对象
	public XiaoshouKehulianxiren getKehulianxiren(Long lid);
	//联系人信息编辑——弹层
	public void updateKehulianxiren(XiaoshouKehulianxiren lxr);
	//联系人信息添加——弹层
	public void addKehulianxiren(XiaoshouKehulianxiren lxr);
	//联系人信息模糊查询
	public PageInfo<XiaoshouKehulianxiren> mohuKehulianxiren(Integer pageNum,Integer pageSize,Long kid,String lianxirenxingming);
	//删除联系人
	public void deleteKehulianxiren(XiaoshouKehulianxiren lxr);
}
