package com.sc.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.Result;
import com.sc.entity.XiaoshouEhuluiamxijilu;
import com.sc.service.KehulianxijiluService;

@Controller
@RequestMapping("/Kehulianxijiluctrl")
public class KehulianxijiluController {
	
	@Autowired
	KehulianxijiluService kehulianxijiluService;
	
	@RequestMapping("/KehulianxijiluListPage.do")
	public ModelAndView KehulianxijiluList(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			HttpSession sess,Long kid,String kname,Long gid){
		System.out.println("查询客户联系记录列表");
		if(kid!=null){
			sess.setAttribute("kid", kid);
		}
		if(kname!=null){
			sess.setAttribute("kname", kname);
		}
		if(gid!=null){
			sess.setAttribute("gid", gid);
		}
		mav.addObject("lxjl", kehulianxijiluService.selectKehulianxijilu(pageNum, pageSize, kid));
		mav.setViewName("KehuJsp/Kehulianxijilu");
		return mav;
	}
	
	@RequestMapping("/goUpdateKehulianxijilu.do")
	public ModelAndView goUpdateKehulianxijilu(ModelAndView mav,XiaoshouEhuluiamxijilu lxjl){
		System.out.println("跳转到客户联系记录修改页面:"+lxjl.getLjid());
		XiaoshouEhuluiamxijilu lxjl1=this.kehulianxijiluService.getKehulianxijilu(lxjl.getLjid());
		mav.addObject("lxjl", lxjl1);
		mav.setViewName("KehuJsp/UpdateKehulianxijilu");
		return mav;
	}
	
	@RequestMapping("/updateKehulianxijilu.do")
	@ResponseBody
	public Result updateKehulianxijilu(ModelAndView mav,
			XiaoshouEhuluiamxijilu lxjl){
		System.out.println("修改客户联系记录："+lxjl.getLjid());
		lxjl.setLasttime(new Date());
		kehulianxijiluService.updateKehulianxijilu(lxjl);
		return new Result(200,"修改成功！");
	}
	
	@RequestMapping("/goAddKehulianxijilu.do")
	public ModelAndView goAddKehulianxijilu(ModelAndView mav){
		System.out.println("跳转到添加页面");
		mav.setViewName("KehuJsp/AddKehulianxijilu");
		return mav;
	}
	
	@RequestMapping("/addKehulianxijilu.do")
	@ResponseBody
	public Result addKehulianxiren(ModelAndView mav,
			HttpServletRequest req,XiaoshouEhuluiamxijilu lxjl){
		System.out.println("添加联系记录："+lxjl.getLjid());
		lxjl.setLasttime(new Date());
		kehulianxijiluService.addKehulianxijilu(lxjl);
		return new Result(200,"添加成功！");
	}
	
	@RequestMapping("/deleteKehulianxijilu.do")
	@ResponseBody
	public void deleteKehulianxiren(ModelAndView mav,XiaoshouEhuluiamxijilu lxjl){
		System.out.println("删除联系记录:"+lxjl.getLjid());
		XiaoshouEhuluiamxijilu lxjl1=this.kehulianxijiluService.getKehulianxijilu(lxjl.getLjid());
		this.kehulianxijiluService.deleteKehulianxijilu(lxjl1);
	}
	
	@RequestMapping("/deleteAllKehulianxijilu.do")
	@ResponseBody
	public void deleteAllKehulianxijilu(ModelAndView mav,String msg){
		System.out.println("联系记录删除！"+msg);
		String[] ss = msg.split(",");
		for (String xx : ss) {
			XiaoshouEhuluiamxijilu lxjl = this.kehulianxijiluService.getKehulianxijilu(new Long(xx));
			this.kehulianxijiluService.deleteKehulianxijilu(lxjl);
		}
	}
	
	@RequestMapping("/mohuKehulianxijilu.do")
	public ModelAndView mohuKehulianxiren(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			HttpSession sess,String lianxibiaoti){ 
			System.out.println("客户联系记录模糊查询");
			mav.addObject("lxjl", kehulianxijiluService.mohuKehulianxijilu(pageNum, pageSize,(Long)sess.getAttribute("kid"), lianxibiaoti));
			mav.setViewName("KehuJsp/Kehulianxijilu");
			return mav;
	}
}
