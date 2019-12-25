package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouKehuxinxi;

public interface KehuxinxiService {
	//客户信息列表——分页
	public PageInfo<XiaoshouKehuxinxi> selectKehuxinxiPage(Integer pageNum,Integer pageSize);
	//客户流失列表——分页
	public PageInfo<XiaoshouKehuxinxi> selectKehuliushiPage(Integer pageNum,Integer pageSize);
	//获取客户对象
	public XiaoshouKehuxinxi getKehuxiangxi(Long kid);
	//客户信息编辑——弹层
	public void updateKehuxinxi(XiaoshouKehuxinxi xk);
	//客户流失恢复
	public void kehuxinxiHuifu(XiaoshouKehuxinxi xk); 
	//客户信息添加——弹层
	public void addKehuxinxi(XiaoshouKehuxinxi xk);
	//客户信息模糊查询
	public PageInfo<XiaoshouKehuxinxi> mohuchaxunKehuxinxi(Integer pageNum,Integer pageSize,String kname);
	//客户信息删除
	public void deleteKehuxinxi(XiaoshouKehuxinxi xk);
}
