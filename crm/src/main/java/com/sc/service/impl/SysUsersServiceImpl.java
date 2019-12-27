package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysUsers;
import com.sc.entity.SysUsersExample;
import com.sc.entity.SysUsersExample.Criteria;
import com.sc.entity.SysUsersInfo;
import com.sc.entity.SysUsersInfoExample;
import com.sc.entity.SysUsersRole;
import com.sc.mapper.SysGongsiinfoMapper;
import com.sc.mapper.SysUsersInfoMapper;
import com.sc.mapper.SysUsersMapper;
import com.sc.mapper.SysUsersRoleMapper;
import com.sc.service.SysUsersService;

@Service
public class SysUsersServiceImpl implements SysUsersService{

	@Autowired
	SysUsersMapper sysUsersMapper;
	@Autowired
	SysGongsiinfoMapper sysGongsiinfoMapper;
	@Autowired
	SysUsersInfoMapper sysUsersInfoMapper;
	@Autowired
	SysUsersRoleMapper sysUsersRoleMapper;
	
	//办公
	@Override
	public List<SysUsers> selectuser(BigDecimal uid) {
		return this.sysUsersMapper.selectuser(uid);
	}

	@Override
	public SysUsers login(String uname) {
		// TODO Auto-generated method stub
		SysUsersExample example = new SysUsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUnameEqualTo(uname);
		List<SysUsers> list = this.sysUsersMapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0) ;
		}
		return null ;
	}
	
	
	@Override
	public SysUsers login(String uname, BigDecimal id) {
		// TODO Auto-generated method stub
		SysUsersExample example = new SysUsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUnameEqualTo(uname);
		criteria.andGongsiidEqualTo(id);
		List<SysUsers> selectByExample = this.sysUsersMapper.selectByExample(example);
		System.out.println(selectByExample);
		if (selectByExample!=null&&selectByExample.size()>0) {
			return selectByExample.get(0);
		}
		return null;
	}

	@Override
	public void addUser(SysUsers u) {
		// TODO Auto-generated method stub
		sysUsersMapper.insertSelective(u);
	}

	@Override
	public PageInfo<SysUsers> selectAllUsersAndRoleAndUsersInfo(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<SysUsers> list = sysUsersMapper.selectAllUsersAndRoleAndUsersInfo();
		return new PageInfo<SysUsers>(list);
	}
	
	@Override
	public void updateUserStatus(BigDecimal userId) {
		// TODO Auto-generated method stub
		SysUsers user = sysUsersMapper.selectByPrimaryKey(userId);
		if (user.getUstate().equals("on")) {
			user.setUstate("off");
		}
		else {
			user.setUstate("on");
		}
		sysUsersMapper.updateByPrimaryKeySelective(user);
	}
	
	@Override
	public SysUsers goUpdateUserOne(BigDecimal userId) {
		// TODO Auto-generated method stub
		return sysUsersMapper.selectByPrimaryKey(userId);
	}


	@Override
	public SysUsers selectUsersAndRoleAndUsersInfoOne(BigDecimal userId) {
		// TODO Auto-generated method stub
		return sysUsersMapper.selectUsersAndRoleAndUsersInfoOne(userId);
	}

	@Override
	public SysGongsiinfo selectGSOne(BigDecimal gongsiId) {
		// TODO Auto-generated method stub
		return sysGongsiinfoMapper.selectByPrimaryKey(gongsiId);
	}

	@Override
	public SysUsers selectUsersinfoJobDepartment(BigDecimal userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysUsers selectUsersAndRoleAndUsersInfoOne2(BigDecimal userId) {
		// TODO Auto-generated method stub
		return sysUsersMapper.selectUsersAndRoleAndUsersInfoOne2(userId);
	}

	@Override
	public void updatePassword(SysUsers sysUsers) {
		// TODO Auto-generated method stub
		sysUsersMapper.updateByPrimaryKey(sysUsers);
	}

	@Override
	public SysUsersInfo selectu(String sname) {
		// TODO Auto-generated method stub
		return sysUsersInfoMapper.selectu(sname);
	}

	@Override
	public void updateUsers(SysUsers sysUsers) {
		// TODO Auto-generated method stub
		sysUsersMapper.updateByPrimaryKeySelective(sysUsers);
	}

	@Override
	public void updateUsersRole(SysUsersRole sysUsersRole) {
		// TODO Auto-generated method stub
		sysUsersRoleMapper.updateByPrimaryKeySelective(sysUsersRole);
	}

	@Override
	public void insertUsersRole(SysUsersRole sysUsersRole) {
		// TODO Auto-generated method stub
		sysUsersRoleMapper.insertSelective(sysUsersRole);
	}

	@Override
	public SysGongsiinfo selectSysGongsiinfoOne(BigDecimal id) {
		// TODO Auto-generated method stub
		return sysGongsiinfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public void createUser(SysUsers sysUsers) {
		// TODO Auto-generated method stub
		sysUsersMapper.insertSelective(sysUsers);
	}

	@Override
	public void delUser(BigDecimal userId) {
		// TODO Auto-generated method stub
		sysUsersMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public void delUserRole(SysUsers sysUsers) {
		// TODO Auto-generated method stub
		SysUsersExample example = new SysUsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(sysUsers.getUserId());
		sysUsersMapper.deleteByExample(example);
	}

	@Override
	public ArrayList<SysUsers> selectAllUsers(BigDecimal gongsiid) {
		// TODO Auto-generated method stub
		return (ArrayList<SysUsers>) sysUsersMapper.selectAllUsers(gongsiid);
	}

}
