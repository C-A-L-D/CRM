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
import com.sc.entity.XiaoshouKehulianxiren;
import com.sc.service.KehulianxirenService;

@Controller
@RequestMapping("/Kehulianxirenctrl")
public class KehulianxirenController {
	
	@Autowired
	KehulianxirenService kehulianxirenService;
	
	@RequestMapping("/KehulianxirenListPage.do")
	public ModelAndView KehulianxirenList(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			HttpSession sess,Long kid,String kname,Long gid){
		System.out.println("查询客户联系人列表");
		if(kid!=null){
			sess.setAttribute("kid", kid);
		}
		if(kname!=null){
			sess.setAttribute("kname", kname);
		}
		if(gid!=null){
			sess.setAttribute("gid", gid);
		}
		mav.addObject("lxr", kehulianxirenService.selectKehulianxiren(pageNum, pageSize, kid));
		mav.setViewName("KehuJsp/Kehulianxiren");
		return mav;
	}
	
	@RequestMapping("/goUpdateKehulianxiren.do")
	public ModelAndView goUpdateKehulianxiren(ModelAndView mav,XiaoshouKehulianxiren lxr){
		System.out.println("跳转到客户联系人修改页面:"+lxr.getLianxirenxingming());
		XiaoshouKehulianxiren lxr1=this.kehulianxirenService.getKehulianxiren(lxr.getLid());
		mav.addObject("lxr", lxr1);
		mav.setViewName("KehuJsp/UpdateKehulianxiren");
		return mav;
	}
	
	@RequestMapping("/updateKehulianxiren.do")
	@ResponseBody
	public Result updateKehulianxiren(ModelAndView mav,
			XiaoshouKehulianxiren lxr){
		System.out.println("修改客户联系人："+lxr.getLid());
		lxr.setLasttime(new Date());
		kehulianxirenService.updateKehulianxiren(lxr);
		return new Result(200,"修改成功！");
	}
	
	@RequestMapping("/goAddKehulianxiren.do")
	public ModelAndView goAddKehulianxiren(ModelAndView mav){
		System.out.println("跳转到添加页面");
		mav.setViewName("KehuJsp/AddKehulianxiren");
		return mav;
	}
	
	@RequestMapping("/addKehulianxiren.do")
	@ResponseBody
	public Result addKehulianxiren(ModelAndView mav,
			HttpServletRequest req,XiaoshouKehulianxiren lxr){
		System.out.println("添加联系人："+lxr.getLianxirenxingming());
		lxr.setLasttime(new Date());
		kehulianxirenService.addKehulianxiren(lxr);
		return new Result(200,"添加成功！");
	}
	
	@RequestMapping("/deleteKehulianxiren.do")
	@ResponseBody
	public void deleteKehulianxiren(ModelAndView mav,XiaoshouKehulianxiren lxr){
		System.out.println("删除联系人:"+lxr.getLianxirenxingming());
		XiaoshouKehulianxiren lxr1=this.kehulianxirenService.getKehulianxiren(lxr.getLid());
		this.kehulianxirenService.deleteKehulianxiren(lxr1);
	}
	
	/*@RequestMapping("/deleteAllKehulianxiren.do")
	public ModelAndView deleteAllKehulianxiren(ModelAndView mav,Long []lid,
			HttpSession sess,
			Long kid,String kname){
		System.out.println("批量删除所有联系人");
		if(kid!=null){
			sess.setAttribute("kid", kid);
		}
		if(kname!=null){
			sess.setAttribute("kname", kname);
		}
		int i;
		for(i=0;i<lid.length;i++){
			XiaoshouKehulianxiren lxr=this.kehulianxirenService.getKehulianxiren(lid[i]);
			this.kehulianxirenService.deleteKehulianxiren(lxr);
		}
		mav.setViewName("redirect:KehulianxirenListPage.do");
		return mav;
	}*/
	
		@RequestMapping("/deleteAllKehulianxiren.do")
		@ResponseBody
		public void deleteAllKehulianxiren(ModelAndView mav,String msg){
			System.out.println("联系人删除！"+msg);
			String[] ss = msg.split(",");
			//删除字符串的 “,”  比如aa={a,b,c}  之后 ["a","b","c"]
			//如果是split("")  比如aa={abc de}  之后["a","b","c" ,"d","e"]
			for (String xx : ss) {
				XiaoshouKehulianxiren lxr = this.kehulianxirenService.getKehulianxiren(new Long(xx));
				this.kehulianxirenService.deleteKehulianxiren(lxr);
			}
		}
	
	@RequestMapping("/mohuKehulianxiren.do")
	public ModelAndView mohuKehulianxiren(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			HttpSession sess,String lianxirenxingming){
			System.out.println("客户联系人模糊查询");
			mav.addObject("lxr", kehulianxirenService.mohuKehulianxiren(pageNum, pageSize,(Long)sess.getAttribute("kid"), lianxirenxingming));
			mav.setViewName("KehuJsp/Kehulianxiren");
			return mav;
	}
}
