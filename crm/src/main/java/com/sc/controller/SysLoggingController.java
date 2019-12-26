package com.sc.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Result;
import com.sc.entity.SysLoggong;
import com.sc.service.SysLoggongService;

@Controller
@RequestMapping("/log")
public class SysLoggingController {

	@Autowired
	SysLoggongService sysLoggongService;
	
	/**
	 * 显示全部日志
	 * @return
	 */
	@RequestMapping("/listAll.do")
	public ModelAndView listAll(ModelAndView mav, @RequestParam(defaultValue="1")int pageNum, @RequestParam(defaultValue="15")int pageSize) {
		PageInfo<SysLoggong> allLog = sysLoggongService.SelectAllLog(pageNum, pageSize);
		mav.addObject("allLog", allLog);
		mav.setViewName("sys/log");
		return mav;
	}
	
	/**
	 * 删除单个日志记录
	 * @param sysLoggong
	 * @return
	 */
	@RequestMapping("/delLog.do")
	@ResponseBody
	public Result delLog(SysLoggong sysLoggong) {
		System.out.println("-----------------------"+sysLoggong.getLid());
		sysLoggongService.delLog(sysLoggong.getLid());
		return new Result(200, "");
	}
	
	/**
	 * 多选删除
	 * @param mav
	 * @param aa
	 */
	@RequestMapping("/delAllLog.do")
	@ResponseBody
	public void delAllLog(ModelAndView mav,String aa){//aa	字符串格式：1,3,2,4...
		System.out.println("日志删除！"+aa);
		
		String[] LIDArr = aa.split(",");

		for (String lid : LIDArr) {
			sysLoggongService.delLog(new BigDecimal(lid));
		}
	}
}
