package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowerinfo;
import com.sc.service.SysPowerinfoService;

@Controller
@RequestMapping("/power")
public class SysPowerinfoController {

	@Autowired
	SysPowerinfoService sysPowerinfoService;
	
	@RequestMapping("/selectAllPower.do")
	public ModelAndView selectAllPower(ModelAndView mav, @RequestParam(defaultValue="1")int pageNum, @RequestParam(defaultValue="5")int pageSize) {
		PageInfo<SysPowerinfo> list = sysPowerinfoService.selectAllPowerAndCol(pageNum, pageSize);
		mav.addObject("PC", list);
		mav.setViewName("sys/PowerList");
		return mav;
	}
	
	
	@RequestMapping("/goUpdatePower.do")
	public ModelAndView goUpdatePower(ModelAndView mav, SysPowerinfo sysPowerinfo) {
		SysPowerinfo goUpdatePower = sysPowerinfoService.goUpdatePower(sysPowerinfo.getPid());
		mav.addObject("gp", goUpdatePower);
		mav.setViewName("sys/updatePower");
		return mav;
	}
}
