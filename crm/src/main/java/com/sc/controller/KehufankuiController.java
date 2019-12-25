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
import com.sc.entity.XiaoshouKehfankui;
import com.sc.service.KehufankuiService;

@Controller
@RequestMapping("/Kehufankuictrl")
public class KehufankuiController {
	
	@Autowired
	KehufankuiService kehufankuiService;
	
	@RequestMapping("/KehufankuiListPage.do")
	public ModelAndView KehufankuiList(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			HttpSession sess,Long kid,String kname,Long gid){
		System.out.println("查询客户反馈列表");
		if(kid!=null){
			sess.setAttribute("kid", kid);
		}
		if(kname!=null){
			sess.setAttribute("kname", kname);
		}
		if(gid!=null){
			sess.setAttribute("gid", gid);
		}
		mav.addObject("fkjl", kehufankuiService.selectKehufankui(pageNum, pageSize, kid));
		mav.setViewName("KehuJsp/Kehufankui");
		return mav;
	}
	
	@RequestMapping("/goUpdateKehufankui.do")
	public ModelAndView goUpdateKehufankui(ModelAndView mav,XiaoshouKehfankui fkjl){
		System.out.println("跳转到客户反馈修改页面:"+fkjl.getFid());
		XiaoshouKehfankui fkjl1=this.kehufankuiService.getKehufankui(fkjl.getFid());
		mav.addObject("fkjl", fkjl1);
		mav.setViewName("KehuJsp/UpdateKehufankui");
		return mav;
	}
	
	@RequestMapping("/updateKehufankui.do")
	@ResponseBody
	public Result updateKehufankui(ModelAndView mav,
			XiaoshouKehfankui fkjl){
		System.out.println("修改客户反馈："+fkjl.getFid());
		fkjl.setLasttime(new Date());
		kehufankuiService.updateKehufankui(fkjl);
		return new Result(200,"修改成功！");
	}
	
	@RequestMapping("/goAddKehufankui.do")
	public ModelAndView goAddKehufankui(ModelAndView mav){
		System.out.println("跳转到添加页面");
		mav.setViewName("KehuJsp/AddKehufankui");
		return mav;
	}
	
	@RequestMapping("/addKehufankui.do")
	@ResponseBody
	public Result addKehufankui(ModelAndView mav,
			HttpServletRequest req,XiaoshouKehfankui fkjl){
		System.out.println("添加反馈："+fkjl.getFid());
		fkjl.setLasttime(new Date());
		kehufankuiService.addKehufankui(fkjl);
		return new Result(200,"添加成功！");
	}
	
	@RequestMapping("/deleteKehufankui.do")
	@ResponseBody
	public void deleteKehufankui(ModelAndView mav,XiaoshouKehfankui fkjl){
		System.out.println("删除反馈:"+fkjl.getFid());
		XiaoshouKehfankui fkjl1=this.kehufankuiService.getKehufankui(fkjl.getFid());
		this.kehufankuiService.deleteKehufankui(fkjl1);
	}
	
	@RequestMapping("/deleteAllKehufankui.do")
	@ResponseBody
	public void deleteAllKehufankui(ModelAndView mav,String msg){
		System.out.println("反馈删除！"+msg);
		String[] ss = msg.split(",");
		//删除字符串的 “,”  比如aa={a,b,c}  之后 ["a","b","c"]
		//如果是split("")  比如aa={abc de}  之后["a","b","c" ,"d","e"]
		for (String xx : ss) {
			XiaoshouKehfankui fkjl = this.kehufankuiService.getKehufankui(new Long(xx));
			this.kehufankuiService.deleteKehufankui(fkjl);
		}
	}
	
	@RequestMapping("/mohuKehufankui.do")
	public ModelAndView mohuKehufankui(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			HttpSession sess,String jiluyouxianji){
			System.out.println("客户反馈模糊查询");
			mav.addObject("fkjl", kehufankuiService.mohuKehufankui(pageNum, pageSize,(Long)sess.getAttribute("kid"), jiluyouxianji));
			mav.setViewName("KehuJsp/Kehufankui");
			return mav;
	}
}
