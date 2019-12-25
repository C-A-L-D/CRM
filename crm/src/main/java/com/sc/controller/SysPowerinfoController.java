package com.sc.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Result;
import com.sc.entity.SysPowercolumn;
import com.sc.entity.SysPowerinfo;
import com.sc.entity.SysRole;
import com.sc.service.SysPowerinfoService;
import com.sc.service.impl.SysRoleServiceImpl;

@Controller
@RequestMapping("/power")
public class SysPowerinfoController {

	@Autowired
	SysPowerinfoService sysPowerinfoService;
	@Autowired
	SysRoleServiceImpl sysRoleServiceImpl;
	
	/**
	 * 权限列表
	 * @param mav
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/selectAllPower.do")
	public ModelAndView selectAllPower(ModelAndView mav, @RequestParam(defaultValue="1")int pageNum, @RequestParam(defaultValue="5")int pageSize) {
		PageInfo<SysPowerinfo> list = sysPowerinfoService.selectAllPowerAndCol(pageNum, pageSize);
		mav.addObject("PC", list);
		mav.setViewName("sys/PowerList");
		return mav;
	}
	
	/**
	 * 权限修改弹窗
	 * @param mav
	 * @param sysPowerinfo
	 * @return
	 */
	@RequestMapping("/goUpdatePower.do")
	public ModelAndView goUpdatePower(ModelAndView mav, SysPowerinfo sysPowerinfo) {
		SysPowerinfo goUpdatePower = sysPowerinfoService.goUpdatePower(sysPowerinfo.getPid());
		ArrayList<SysPowercolumn> column = sysRoleServiceImpl.selectAllColumn();
		mav.addObject("column", column);
		mav.addObject("gp", goUpdatePower);
		mav.setViewName("sys/updatePower");
		return mav;
	}
	
	/**
	 * 修改权限
	 * @param sysPowerinfo
	 * @return
	 */
	@RequestMapping("/updatePow.do")
	@ResponseBody
	public Result updatePow(SysPowerinfo sysPowerinfo) {
		sysPowerinfo.setLasttime(new Date());
		sysPowerinfoService.updatePow(sysPowerinfo);
		return new Result(200, "修改成功");
	}
	
	/**
	 * 单个删除
	 * @param sysPowerinfo
	 * @return
	 */
	@RequestMapping("/delPow.do")
	@ResponseBody
	public Result delPow(SysPowerinfo sysPowerinfo) {
		//删除权限，权限表对应的权限角色表也要删
		sysPowerinfoService.delPow(sysPowerinfo);
		sysPowerinfoService.delPow(sysPowerinfo.getPid());
		return new Result(200, "删除成功");
	}
	
	/**
	 * 多选删除
	 * @param mav
	 * @param aa
	 */
	@RequestMapping("/delAllPow.do")
	@ResponseBody
	public void delAllPow(ModelAndView mav,String aa){//aa	字符串格式：1,3,2,4...
		System.out.println("角色删除！"+aa);
		
		String[] PIDArr = aa.split(",");

		for (String pid : PIDArr) {
			sysPowerinfoService.delAllPow(new BigDecimal(pid));
		}
	}
	
	/**
	 * 添加权限分栏弹框
	 * @param mav
	 * @param sysPowerinfo
	 * @return
	 */
	@RequestMapping("/goAddPColumn.do")
	public ModelAndView goAddPColumn(ModelAndView mav) {
		mav.setViewName("sys/addPColumn");
		return mav;
	}
}
