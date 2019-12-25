package com.sc.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.ListArr;
import com.sc.entity.Result;
import com.sc.entity.SysPowerRole;
import com.sc.entity.SysPowercolumn;
import com.sc.entity.SysPowerinfo;
import com.sc.entity.SysRole;
import com.sc.entity.SysUsers;
import com.sc.mapper.SysPowerinfoMapper;
import com.sc.service.impl.SysRoleServiceImpl;

@Controller
@RequestMapping("/rap")
public class SysRoleController {

	@Autowired
	SysRoleServiceImpl sysRoleServiceImpl;
	
	//====================角色信息列表========================
	/**
	 * 角色和权限列表
	 * @param mav
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/selectAllRoleAndPower.do") 
	public ModelAndView selectAllRoleAndPower(ModelAndView mav, @RequestParam(defaultValue="1")Integer pageNum, @RequestParam(defaultValue="100")Integer pageSize) {
		PageInfo<SysRole> list = sysRoleServiceImpl.selectAllRoleAndPower(pageNum, pageSize);
		mav.addObject("RP", list);
		mav.setViewName("sys/RoleAndPower");
		return mav;
	}
	
	/**
	 * 修改角色信息弹框
	 * @param mav
	 * @param sysRole
	 * @return
	 */
	@RequestMapping("/goUpdateRle.do")
	public ModelAndView updateRoleList(ModelAndView mav, SysRole sysRole) {
		List<SysRole> selectAllRole = sysRoleServiceImpl.selectAllRole();
		SysRole selectOne = sysRoleServiceImpl.selectOne(sysRole.getRid());
		ArrayList<SysPowercolumn> column = sysRoleServiceImpl.selectAllColumn();
		mav.addObject("column", column);
		mav.addObject("allR", selectAllRole);
		mav.addObject("RPOne", selectOne);
		mav.setViewName("sys/updateRole");
		return mav;
	}
	
	/**
	 * 选中权限分栏，得到对应的权限，并把该角色已有的权限显示为选中状态
	 * @param sysPowercolumn
	 * @return
	 */
	@RequestMapping("/getColumnPower.do")
	@ResponseBody
	public ListArr getColumnPower(SysPowercolumn sysPowercolumn, SysRole sysRole){
		System.out.println("遍历显示全部权限方法....."+sysPowercolumn+"\n-----"+sysRole);
		if (sysPowercolumn != null && sysPowercolumn.getCid() != null) {
			ArrayList<SysPowerinfo> list1 = sysRoleServiceImpl.selectAllPower(sysPowercolumn.getCid());
			System.out.println("遍历结果"+list1);
			ArrayList<SysPowerinfo> list2 = sysRoleServiceImpl.selectPowerChecked(sysRole.getRid());
			System.out.println("遍历结果"+list2);
			return new ListArr(list1, list2);
		}
		return null;
	}
	
	/**
	 * 添加和删除角色的权限
	 * @param sysRole
	 * @param str
	 * @param cid
	 * @param session
	 */
	@RequestMapping("/updatePowers.do")
	@ResponseBody
	public void updatePowers(SysRole sysRole, BigDecimal[] str,BigDecimal cid, HttpSession session){
		System.out.println(sysRole+"\n数组：");
		for (BigDecimal i : str) {
			System.out.println("---"+i);
		}
		System.out.println("分栏编号："+cid);
		ArrayList<SysPowerRole> selectRP = sysRoleServiceImpl.selectRP(sysRole.getRid(), cid);
		System.out.println(selectRP);
		if (selectRP.size() != 0) {
			System.out.println("进4");
			if (str.length == 0) {
				System.out.println("进5");
				//连接角色权限，权限表两表，根据角色ID和权限分栏ID查询出该用户已有的该分栏的权限，然后将查出的权限都删除
				for (int i = 0; i < selectRP.size(); i++) {
					System.out.println("删除"+selectRP.get(i));
					sysRoleServiceImpl.delPowerColumn(selectRP.get(i).getId());
				}
			}
			else {
				System.out.println("进6");
				for (int i = 0; i < selectRP.size(); i++) {
					boolean b = false;
					for (int j = 0; j < str.length; j++) {
						if (selectRP.get(i).getPid() == str[j]) {
							System.out.println("无操作...");
							b = false;
							break;
						}
						else {
							b = true;
						}
					}
					if (b == true) {
						//删除-传过来的数据里没有，数据库有的记录
						sysRoleServiceImpl.delPowerColumn(selectRP.get(i).getId());
					}
				}
				for (int i = 0; i < str.length; i++) {
					boolean b = false;
					for (int j = 0; j < selectRP.size(); j++) {
						if (str[i] == selectRP.get(j).getPid()) {
							System.out.println("无操作...");
							b = false;
							break;
						}
						else {
							b = true;
						}
					}
					if (b == true) {
						SysPowerRole pr = new SysPowerRole();
						pr.setRoleId(sysRole.getRid());
						pr.setPid(str[i]);
						SysUsers user = (SysUsers) session.getAttribute("nowuser");
						pr.setCaozuopersonId(user.getUserId());
						pr.setLasttime(new Date());
						//插入-传过来的数据里有，数据库没有的记录
						sysRoleServiceImpl.insertPowerColumn(pr);
					}
				}
			}
			
		}
		else {
			System.out.println("进1");
			if (str.length != 0) {
				System.out.println("进2");
				for (int i = 0; i < str.length; i++) {
					System.out.println("进3");
					SysPowerRole pr = new SysPowerRole();
					pr.setRoleId(sysRole.getRid());
					pr.setPid(str[i]);
					SysUsers user = (SysUsers) session.getAttribute("nowuser");
					pr.setCaozuopersonId(user.getUserId());
					pr.setLasttime(new Date());
					//插入-数据库（空记录）完全没有传过来的对应的数据数据
					sysRoleServiceImpl.insertPowerColumn(pr);
				}
			}
		}
	}
	
	/**
	 * 修改角色信息
	 * @param s
	 * @return
	 */
	@RequestMapping("/updateRle.do")
	@ResponseBody
	public Result updateRoleOne(SysRole s){
		System.out.println(s);
		System.out.println("进入修改..");
		s.setLasttime(new Date());
		sysRoleServiceImpl.updateRole(s);
		return new Result(200, "修改成功！");
	}
	
	/**
	 * 添加角色弹框
	 * @param mav
	 * @param sysRole
	 * @return
	 */
	@RequestMapping("/goAddRole.do")
	public ModelAndView goAddRole(ModelAndView mav, SysRole sysRole) {
		List<SysRole> selectAllRole = sysRoleServiceImpl.selectAllRole();
		mav.addObject("allR", selectAllRole);
		mav.setViewName("sys/addRole");
		return mav;
	}
	
	/**
	 * 添加角色
	 * @param s
	 * @return
	 */
	@RequestMapping("/addRole.do")
	@ResponseBody
	public Result addRole(SysRole s){
		s.setLasttime(new Date());
		sysRoleServiceImpl.addRole(s);
		return new Result(200, "添加成功！");
	}
	
	/**
	 * 单个删除
	 * @param s
	 * @return
	 */
	@RequestMapping("/delRole.do")
	@ResponseBody
	public Result delRole(SysRole s){
		System.out.println("开始删除！"+s.getRid());
		sysRoleServiceImpl.delRole(s.getRid());
		return new Result(200, "删除成功！");
	}
	
	/**
	 * 多选删除
	 * @param mav
	 * @param aa
	 */
	@RequestMapping("/delAllRole.do")
	@ResponseBody
	public void gsdelete(ModelAndView mav,String aa){//aa	字符串格式：1,3,2,4...
		System.out.println("角色删除！"+aa);
		
		String[] RIDArr = aa.split(",");

		for (String rid : RIDArr) {
			SysRole selectOne = sysRoleServiceImpl.selectOne(new BigDecimal(rid));
			sysRoleServiceImpl.delRole(selectOne.getRid());
		}
	}
}
