package com.sc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.Result;
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
		System.out.println("跳往修改"+xk.getKname()+"详细信息");
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
}
