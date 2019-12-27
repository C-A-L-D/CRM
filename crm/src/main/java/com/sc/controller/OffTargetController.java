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

import com.github.pagehelper.PageInfo;
import com.sc.entity.OffAssesstarget;
import com.sc.entity.Result;
import com.sc.entity.SysUsers;
import com.sc.service.OffAssessTargetService;


@Controller
@RequestMapping("/offtargetctrl")
public class OffTargetController {
	@Autowired
	OffAssessTargetService offAssessTargetService;
		
		//分页显示指标
		@RequestMapping("/targetlist.do")
		public ModelAndView listpage(ModelAndView mav,
				@RequestParam(defaultValue="1")Integer pageNum,
				@RequestParam(defaultValue="5")Integer pageSize,HttpSession session){
			System.out.println("查看指标！");
			SysUsers s=(SysUsers)session.getAttribute("nowuser");
			Long cid=s.getGongsiid().longValue();
			//查询list集合-分页    ${page.list}
			mav.addObject("stat","1");
			mav.addObject("assesstarget", offAssessTargetService.selectpage(pageNum,pageSize,cid));
			mav.setViewName("off/assesstarget");//路径是：/WEB-INF/off/offmesslist.jsp
			return mav;
	     }
		
		//删除指标
		@RequestMapping("/delete.do")
		public ModelAndView delete(ModelAndView mav,OffAssesstarget assess){
			System.out.println("删除指标"+assess);
			this.offAssessTargetService.deleteTarget(assess);
			mav.setViewName("redirect:targetlist.do");//重定向到targetlist方法
			return mav;
	     }
		
		//修改指标
		@RequestMapping("/goupdate.do")
		public ModelAndView goupdate(ModelAndView mav,OffAssesstarget assess){
			System.out.println("跳转到修改页面！"+assess);
			OffAssesstarget target=this.offAssessTargetService.get(assess.getTargetid());
			mav.addObject("t", target);
			mav.setViewName("off/targetupdate");
			return mav;
	     }
		
		//修改指标
		  @RequestMapping("/update.do")
		  @ResponseBody                                           
			public Result update(ModelAndView mav,OffAssesstarget target){
			  System.out.println("修改后的"+target);
			  target.setLasttime(new Date());
			  this.offAssessTargetService.update(target);
			  return new Result(200,"修改成功！");			
		     }
		  
		//添加考核指标
		@RequestMapping("/goadd.do")
		public ModelAndView goadd(ModelAndView mav){
			System.out.println("添加考核指标");
			mav.setViewName("off/targetadd");
			return mav;
		}
			  
		//添加考核指标
		@RequestMapping("/add.do")
		 @ResponseBody
		public Result add(ModelAndView mav,OffAssesstarget target,HttpSession session){
			SysUsers s=(SysUsers)session.getAttribute("nowuser");
			Long cid=s.getGongsiid().longValue();
			target.setCompanyid(cid);
			target.setLasttime(new Date());
			this.offAssessTargetService.insert(target);
			 return new Result(200,"添加成功！");	
		}
		
		//模糊查询
		@RequestMapping("/search.do")
			public ModelAndView search(ModelAndView mav,HttpServletRequest req,
				@RequestParam(defaultValue="1")Integer pageNum,
				@RequestParam(defaultValue="5")Integer pageSize,String target){
			    System.out.println("模糊查询-分页！");
				System.out.println("关键字"+target);
				PageInfo<OffAssesstarget> list=null;
					list=this.offAssessTargetService.selectpageassesstarget(pageNum, pageSize, target);
					System.out.println("模糊查询"+list);
				mav.addObject("stat","2");
				mav.addObject("target",target);
				mav.addObject("assesstarget",list);
				mav.setViewName("off/assesstarget");//路径是：/WEB-INF/off/assesstarget.jsp
				return mav;
			}
}
