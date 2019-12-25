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
import com.sc.entity.XiaoshouKehuliusgi;
import com.sc.service.KehuliushiService;

@Controller
@RequestMapping("/Kehuliushictrl")
public class KehuliushiController {
	
	@Autowired
	KehuliushiService kehuliushiService;
	
	@RequestMapping("/KehuliushiPage.do")
	public ModelAndView selectKehuliushi(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize
			){
		System.out.println("查询客户流失列表！");
		mav.addObject("lskh", this.kehuliushiService.selectKehuliushi(pageNum, pageSize));
		mav.setViewName("KehuJsp/Kehuliushi");
		return mav;
	}
	
	@RequestMapping("/goUpdateKehuliushi.do")
	public ModelAndView goUpdateKehuliushi(ModelAndView mav,XiaoshouKehuliusgi lskh){
		System.out.println("跳转到客户流失修改页面："+lskh.getKsid());
		XiaoshouKehuliusgi lskh1=this.kehuliushiService.getKehuliushi(lskh.getKsid());
		mav.addObject("lskh", lskh1);
		mav.setViewName("KehuJsp/UpdateKehuliushi");
		return mav;
	}
	
	@RequestMapping("/updateKehuliushi.do")
	@ResponseBody
	public Result updateKehuliushi(ModelAndView mav,XiaoshouKehuliusgi lskh){
		System.out.println("修改客户流失"+lskh.getKsid());
		lskh.setLasttime(new Date());
		kehuliushiService.updateKehuliushi(lskh);
		return new Result(200, "修改成功！");
	}
	
	@RequestMapping("/deleteKehuliushi.do")
	@ResponseBody
	public void deleteKehuliushi(ModelAndView mav,XiaoshouKehuliusgi lskh){
		System.out.println("客户流失删除："+lskh.getKsid());
		XiaoshouKehuliusgi lskh1=this.kehuliushiService.getKehuliushi(lskh.getKsid());
		this.kehuliushiService.deleteKehuliushi(lskh1);
	}
	
	@RequestMapping("/deleteAllKehuliushi.do")
	@ResponseBody
	public void deleteAllKehuliushi(ModelAndView mav,String msg){
		System.out.println("客户流失删除！"+msg);
		String[] ss = msg.split(",");
		for (String xx : ss) {
			XiaoshouKehuliusgi lskh = this.kehuliushiService.getKehuliushi(new Long(xx));
			this.kehuliushiService.deleteKehuliushi(lskh);
		}
	}
	
	@RequestMapping("/goAddKehuliushi.do")
	public ModelAndView goAddKehuliushi(ModelAndView mav,
			HttpSession sess,Long kid,Long gid){
		System.out.println("跳转到客户流失处理页面");
		if(kid!=null){
			sess.setAttribute("kid", kid);
		}
		if(gid!=null){
			sess.setAttribute("gid", gid);
		}
		mav.setViewName("KehuJsp/ChuliKehuliushi");
		return mav;
	}
	
	@RequestMapping("/addKehuliushi.do")
	@ResponseBody
	public Result addKehuliushi(ModelAndView mav,
			HttpServletRequest req,XiaoshouKehuliusgi lskh){
		System.out.println("添加联系人："+lskh.getKsid());
		lskh.setLasttime(new Date());
		kehuliushiService.addKehuliushi(lskh);
		return new Result(200,"添加成功！");
	}
}
