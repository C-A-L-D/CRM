package com.sc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Result;
import com.sc.entity.SysRole;
import com.sc.service.impl.SysRoleServiceImpl;

@Controller
@RequestMapping("/rap")
public class SysRoleController {

	@Autowired
	SysRoleServiceImpl sysRoleServiceImpl;
	
	@RequestMapping("/selectAllRoleAndPower.do") 
	public ModelAndView selectAllRoleAndPower(ModelAndView mav, @RequestParam(defaultValue="1")Integer pageNum, @RequestParam(defaultValue="2")Integer pageSize) {
		PageInfo<SysRole> list = sysRoleServiceImpl.selectAllRoleAndPower(pageNum, pageSize);
		System.out.println("角色和权限信息" + list.toString());
		mav.addObject("RP", list);
		mav.setViewName("sys/RoleAndPower");
		return mav;
	}
}
