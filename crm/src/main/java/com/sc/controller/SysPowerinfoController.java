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
import com.sc.mapper.SysPowercolumnMapper;
import com.sc.service.SysPowerRoleService;
import com.sc.service.SysPowercolumnService;
import com.sc.service.SysPowerinfoService;
import com.sc.service.impl.SysRoleServiceImpl;

@Controller
@RequestMapping("/power")
public class SysPowerinfoController {

	@Autowired
	SysPowerinfoService sysPowerinfoService;
	@Autowired
	SysRoleServiceImpl sysRoleServiceImpl;
	@Autowired
	SysPowerRoleService sysPowerRoleService;
	@Autowired
	SysPowercolumnService sysPowercolumnService;
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
	 * 删除权限分栏弹窗
	 * @param mav
	 * @return
	 */
	@RequestMapping("/goDelPColumn.do")
	public ModelAndView goDelPColumn(ModelAndView mav) {
		ArrayList<SysPowercolumn> column = sysRoleServiceImpl.selectAllColumn();
		mav.addObject("column", column);
		mav.setViewName("sys/delPColumn");
		return mav;
	}
	
	/**
	 * 删除分栏
	 * @param sysPowerinfo
	 * @return
	 */
	@RequestMapping("/delColumn.do")
	@ResponseBody
	public Result delColumn(SysPowercolumn sysPowercolumn) {
		ArrayList<SysPowerinfo> allPowers = sysPowerinfoService.selectPowerBycolumnId(sysPowercolumn.getCid());
		sysPowercolumnService.delColumn(sysPowercolumn.getCid());
		sysPowerinfoService.delPowerAndPR(sysPowercolumn.getCid());
		for (SysPowerinfo p : allPowers) {
			sysPowerRoleService.delPR(p.getPid());
		}
		return new Result(200, "删除成功");
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
	
	/**
	 *添加分栏
	 * @param mav
	 * @param sysPowerinfo
	 * @return
	 */
	@RequestMapping("/addPowCol.do")
	@ResponseBody
	public Result addPowCol(SysPowercolumn sysPowercolumn) {
		sysPowercolumn.setLasttime(new Date());
		sysPowerinfoService.addPowCol(sysPowercolumn);
		return new Result(200, "添加成功");
	}
	
	/**
	 * 添加权限分栏下的权限弹框
	 * @param mav
	 * @param sysPowerinfo
	 * @return
	 */
	@RequestMapping("/goAddPower.do")
	public ModelAndView goAddPower(ModelAndView mav) {
		ArrayList<SysPowercolumn> column = sysRoleServiceImpl.selectAllColumn();
		mav.addObject("column", column);
		mav.setViewName("sys/addPower");
		return mav;
	}
	
	
	@RequestMapping("/addNewPower.do")
	@ResponseBody
	public Result addNewPower(SysPowerinfo sysPowerinfo) {
		System.out.println(sysPowerinfo);
		sysPowerinfoService.addNewPower(sysPowerinfo);
		return new Result(200, "成功添加权限");
	}
	
}
