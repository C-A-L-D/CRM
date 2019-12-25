package com.sc.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.Result;
import com.sc.entity.XiaoshouKehulianxiren;
import com.sc.entity.XiaoshouKehuxinxi;
import com.sc.service.KehuxinxiService;

@Controller
@RequestMapping("/Kehuxinxictrl")
public class KehuxinxiController {
	
	@Autowired
	KehuxinxiService kehuxinxiService;
	
	@RequestMapping("/KehuxinxiListPage.do")
	public ModelAndView KehuxinxiListPage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize
			){
		System.out.println("查询客户信息列表！");
		mav.addObject("klp", kehuxinxiService.selectKehuxinxiPage(pageNum, pageSize));
		mav.setViewName("KehuJsp/Kehuxinxi");
		return mav;
	};
	
	@RequestMapping("/KehuxiangxiPage.do")
	public ModelAndView getKehuxiangxi(ModelAndView mav,XiaoshouKehuxinxi xx){
		System.out.println("查询"+xx.getKname()+"详细信息");
		XiaoshouKehuxinxi xxx=kehuxinxiService.getKehuxiangxi(xx.getKid());
		System.out.println(xxx);
		mav.addObject("khxx", xxx);
		mav.setViewName("KehuJsp/Kehuxiangxi");
		return mav;
	}
	
	@RequestMapping("/KehuxiangxiGoUpdatePage.do")
	public ModelAndView goUpdateKehuxinxi(ModelAndView mav,XiaoshouKehuxinxi xk){
		System.out.println("跳往修改"+xk.getKid()+"详细信息");
		XiaoshouKehuxinxi xk1=this.kehuxinxiService.getKehuxiangxi(xk.getKid());
		mav.addObject("khuk", xk1);
		mav.setViewName("KehuJsp/UpdateKehuxinxi");
		return mav;
	}
	
	@RequestMapping("/updateKehuxinxi.do")
	@ResponseBody
	public Result updateKehuxinxi(ModelAndView mav,XiaoshouKehuxinxi xsk){
		System.out.println("提交修改"+xsk.getKname()+"详细信息");
		//设置修改时间
		xsk.setLasttime(new Date());
		kehuxinxiService.updateKehuxinxi(xsk);
		return new Result(200,"修改成功！");
	}
	
	@RequestMapping("/KehuxinxiGoAdd.do")
	public ModelAndView goAddKehuxinxi(ModelAndView mav){
		System.out.println("添加新客户");
		mav.setViewName("KehuJsp/AddKehuxinxi");
		return mav;
	}
	
	@RequestMapping("/addKehuxinxi.do")
	@ResponseBody
	public Result addKehuxinxi(ModelAndView mav,HttpServletRequest req,XiaoshouKehuxinxi xk){
		System.out.println("添加客户："+xk);
		xk.setLasttime(new Date());
		kehuxinxiService.addKehuxinxi(xk);
		return new Result(200,"添加成功！");
	}
	
	@RequestMapping("/MohuchaxunKehuxinxi.do")
	public ModelAndView mohuchaxunKehuxinxi(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			String kname){
		System.out.println("模糊查询客户信息列表");
		mav.addObject("klp", kehuxinxiService.mohuchaxunKehuxinxi(pageNum, pageSize, kname));
		mav.setViewName("KehuJsp/Kehuxinxi");
		return mav;
	}
	
	@RequestMapping("/KehuliushiPage.do")
	public ModelAndView KehuliushiPage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize
			){
		System.out.println("查询客户流失列表！");
		mav.addObject("klp", kehuxinxiService.selectKehuliushiPage(pageNum, pageSize));
		mav.setViewName("KehuJsp/Kehuliushi");
		return mav;
	};
	
	@RequestMapping("/KehuxinxiHuifu.do")
	public ModelAndView KehuxinxiHuifu(ModelAndView mav,XiaoshouKehuxinxi xsk){
		System.out.println("恢复"+xsk.getKname()+"信息");
		XiaoshouKehuxinxi xsk1=this.kehuxinxiService.getKehuxiangxi(xsk.getKid());
		xsk1.setKehuzhuangtai("正在合作");
		xsk1.setLasttime(new Date());
		kehuxinxiService.updateKehuxinxi(xsk1);
		mav.setViewName("redirect:KehuliushiPage.do");
		return mav;
	}
	
	@RequestMapping("/deleteKehuxinxi.do")
	@ResponseBody
	public void deleteKehuxinxi(ModelAndView mav,XiaoshouKehuxinxi xsk){
		System.out.println("删除联系人:"+xsk.getKname());
		XiaoshouKehuxinxi xsk1=this.kehuxinxiService.getKehuxiangxi(xsk.getKid());
		this.kehuxinxiService.deleteKehuxinxi(xsk1);
	}
}
