package com.sc.controller;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
import com.sc.entity.OffAssesstask;
import com.sc.entity.OffTaskdetail;
import com.sc.entity.Result;
import com.sc.entity.SysUsers;
import com.sc.entity.SysUsersInfo;
import com.sc.service.OffAssessTargetService;
import com.sc.service.OffAssessTaskService;
import com.sc.service.OffTaskDetailService;
import com.sc.service.SysUsersInfoService;

@Controller
@RequestMapping("/offtaskctrl")
public class OffTaskController {
	@Autowired
	OffAssessTaskService offAssessTaskService;
	@Autowired
	OffAssessTargetService offAssessTargetService;
	@Autowired
	SysUsersInfoService sysUsersInfoService;
	@Autowired
	OffTaskDetailService offTaskDetailService;
	
		//分页显示任务
		@RequestMapping("/tasklist.do")
		public ModelAndView listpage(ModelAndView mav,
				@RequestParam(defaultValue="1")Integer pageNum,
				@RequestParam(defaultValue="5")Integer pageSize,HttpSession session){
			System.out.println("查看当前公司所有任务！");
			//---需要获取公司id
			SysUsers s=(SysUsers)session.getAttribute("nowuser");
			Long cid=s.getGongsiid().longValue();
			//查询list集合-分页    ${page.list}
			 PageInfo<OffAssesstask> page=offAssessTaskService.selectpage(pageNum,pageSize,cid);
			 for (OffAssesstask task : page.getList()) {
				 List<OffTaskdetail> l=this.offTaskDetailService.taskdetail(task.getTaskid());
				 task.setState(l.get(0).getState());			
			}
			mav.addObject("stat","1");
			mav.addObject("tasklist", page);
			mav.setViewName("off/tasklist");//路径是：/WEB-INF/off/tasklist.jsp
			return mav;
	     }
		
		//删除任务
		@RequestMapping("/delete.do")
		public ModelAndView delete(ModelAndView mav,Long taskid){
			System.out.println("删除任务ID"+taskid);
			this.offAssessTaskService.delete(taskid);
			mav.setViewName("redirect:tasklist.do");//重定向到tasklist方法
			return mav;
	     }
		
		//显示任务详情  
		@RequestMapping("/taskdetail.do")
		public ModelAndView showdetail(ModelAndView mav,Long taskid){
			System.out.println("查看任务详情！"+taskid);
			//查询任务详情
			OffAssesstask task=this.offAssessTaskService.selectbyid(taskid);
			
			List<OffTaskdetail> list=this.offTaskDetailService.taskdetail(taskid);
			for (OffTaskdetail offTaskdetail : list) {
				BigDecimal b=new BigDecimal(offTaskdetail.getAcceptuserid());
			   SysUsersInfo s=this.offAssessTaskService.selectbyidu(b);
			   System.out.println("用户"+s);
				offTaskdetail.setUname(s.getSname());
			}
			System.out.println("任务详情"+list);	
			System.out.println("任务对象"+task);	
			mav.addObject("taskdetail",list);
			mav.addObject("task",task);
			mav.setViewName("off/taskdetail");//路径是：/WEB-INF/off/taskdetail.jsp
			return mav;
		  }
		
		 //新建任务-同公司
		@RequestMapping("/goadd.do")
		public ModelAndView goadd(ModelAndView mav,HttpSession session){
			 System.out.println("新建任务");
			//---需要获取用户id和公司id---start
			SysUsers s=(SysUsers)session.getAttribute("nowuser");
             SysUsersInfo info=new SysUsersInfo();
             info.setSid(s.getSid());
             info.setGongsiid(s.getGongsiid());
			List<OffAssesstarget> list=this.offAssessTargetService.select(s.getGongsiid().longValue());
			//查询员工信息-用于发送短信 
			List<SysUsersInfo> listuser=this.sysUsersInfoService.selectusergc(info);
			System.out.println("被考核人"+listuser);
			mav.addObject("sysusers", listuser);
			mav.addObject("targetlist", list);
			mav.setViewName("off/taskadd");
			return mav;
		}
		

		//发布任务
		@RequestMapping("/add.do")
		 @ResponseBody
			public Result add(ModelAndView mav,String uids,OffAssesstask task,HttpSession session){
			System.out.println("发布任务");
			System.out.println("获取的任务信息"+task);
			System.out.println("获取的用户ID"+uids);
			//---需要获取用户id和公司id---start
			SysUsers s=(SysUsers)session.getAttribute("nowuser");
			SysUsersInfo userinfo=this.sysUsersInfoService.get(s.getSid());
			task.setTaskpublisher(userinfo.getSname());
			task.setCompanyid(userinfo.getGongsiid().longValue());
			task.setLasttime(new Date());
			task.setState("1");
			this.offAssessTaskService.insert(task);
			
			if(uids!=null){
				uids+=",";
				String[] split = uids.split(",");
			    for (String u : split) {
				  OffTaskdetail detail=new OffTaskdetail();
				  detail.setTaskid(task.getTaskid());
				  BigDecimal b=new BigDecimal(u);
					SysUsersInfo userinfo2=this.sysUsersInfoService.get(b);
				  detail.setAcceptuserid(userinfo2.getSid().longValue());
				  detail.setIsfinish("1");
				  detail.setCompanyid(userinfo2.getGongsiid().longValue());
			      detail.setLasttime(new Date());
			      detail.setState("1");
					this.offTaskDetailService.insert(detail);
			    }
			}
			return new Result(200,"发布成功！");
		}
		
		//模糊查询
		@RequestMapping("/search.do")
		public ModelAndView search(ModelAndView mav,HttpServletRequest req,
				@RequestParam(defaultValue="1")Integer pageNum,
				@RequestParam(defaultValue="5")Integer pageSize,String tiaojian,String search,HttpSession session){
			System.out.println("模糊查询-分页！");
			SysUsers s=(SysUsers)session.getAttribute("nowuser");
			System.out.println("查询条件"+tiaojian);
			//关键字
			System.out.println("关键字"+search);
			PageInfo<OffAssesstask> list=null;
			//任务标题
			if(tiaojian.equals("1")){
				list=this.offAssessTaskService.selectpagetitle(pageNum, pageSize, search,s.getGongsiid().longValue());
				 for (OffAssesstask task : list.getList()) {
					 List<OffTaskdetail> l=this.offTaskDetailService.taskdetail(task.getTaskid());
					 task.setState(l.get(0).getState());			
				}
				System.out.println("模糊查询"+list);
			}
			//任务内容
			if(tiaojian.equals("2")){
				list=this.offAssessTaskService.selectpagecontent(pageNum, pageSize, search,s.getGongsiid().longValue());
				for (OffAssesstask task : list.getList()) {
					 List<OffTaskdetail> l=this.offTaskDetailService.taskdetail(task.getTaskid());
					 task.setState(l.get(0).getState());			
				}
				System.out.println("模糊查询"+list);
			}
			//任务发布人
			if(tiaojian.equals("3")){
				list=this.offAssessTaskService.selectpageu(pageNum, pageSize, search,s.getGongsiid().longValue());
				for (OffAssesstask task : list.getList()) {
					 List<OffTaskdetail> l=this.offTaskDetailService.taskdetail(task.getTaskid());
					 task.setState(l.get(0).getState());			
				}
				System.out.println("模糊查询"+list);
			}
			//考核指标
			if(tiaojian.equals("4")){
				list=this.offAssessTaskService.selectpagetarget(pageNum, pageSize, search,s.getGongsiid().longValue());
				for (OffAssesstask task : list.getList()) {
					 List<OffTaskdetail> l=this.offTaskDetailService.taskdetail(task.getTaskid());
					 task.setState(l.get(0).getState());			
				}
				System.out.println("模糊查询"+list);
			}
			mav.addObject("stat","2");
			mav.addObject("tiaojian", tiaojian);
			mav.addObject("search", search);
			mav.addObject("tasklist", list);
			mav.setViewName("off/tasklist");//路径是：/WEB-INF/off/tasklist.jsp
			return mav;
		}
		
		//分页显示已接收任务
		@RequestMapping("/taskacceptlist.do")
		public ModelAndView listpageaccept(ModelAndView mav,
				@RequestParam(defaultValue="1")Integer pageNum,
				@RequestParam(defaultValue="5")Integer pageSize, HttpSession session){
			System.out.println("查看已接收任务！");
			SysUsers s=(SysUsers)session.getAttribute("nowuser");
			//查询list集合-分页    ${page.list}
			PageInfo<OffTaskdetail> page=this.offTaskDetailService.selectpageaccept(pageNum, pageSize,s.getSid().longValue());
			mav.addObject("stat","3");
			mav.addObject("taskacceptlist", page);
			mav.setViewName("off/taskacceptlist");//路径是：/WEB-INF/off/taskacceptlist.jsp
			return mav;
	 }
		
		//提交任务
		@RequestMapping("/tijiao.do")
		public ModelAndView tijiao(ModelAndView mav,Long id){
			System.out.println("提交任务ID"+id);
			OffTaskdetail detail=this.offTaskDetailService.select(id);
			detail.setIsfinish("2");
			this.offTaskDetailService.update(detail);
			mav.setViewName("redirect:taskacceptlist.do");//重定向到tasklist方法
			return mav;
    }
		
		//模糊查询-接收任务  
		@RequestMapping("/searchaccept.do")
		public ModelAndView searchaccept(ModelAndView mav,HttpServletRequest req,
				@RequestParam(defaultValue="1")Integer pageNum,
				@RequestParam(defaultValue="5")Integer pageSize,String tiaojian,String search,HttpSession session){
				System.out.println("模糊查询-分页！");
				SysUsers s=(SysUsers)session.getAttribute("nowuser");
				System.out.println("查询条件"+tiaojian);
				//关键字
				System.out.println("关键字"+search);
				PageInfo<OffTaskdetail> list=null;
				//任务标题
				if(tiaojian.equals("1")){
					list=this.offTaskDetailService.selectpagetitle(pageNum, pageSize, search,s.getSid().longValue());
					System.out.println("模糊查询"+list);
				}
				//任务内容
				if(tiaojian.equals("2")){
					list=this.offTaskDetailService.selectpagecontent(pageNum, pageSize, search,s.getSid().longValue());
					System.out.println("模糊查询"+list);
					}
				//任务发布人
				if(tiaojian.equals("3")){
					list=this.offTaskDetailService.selectpageu(pageNum, pageSize, search,s.getSid().longValue());
					System.out.println("模糊查询"+list);
				}
				//考核指标
				if(tiaojian.equals("4")){
					list=this.offTaskDetailService.selectpagetarget(pageNum, pageSize, search,s.getSid().longValue());
					System.out.println("模糊查询"+list);
				}
				mav.addObject("stat","4");
				mav.addObject("tiaojian", tiaojian);
				mav.addObject("search", search);
				mav.addObject("taskacceptlist", list);
				mav.setViewName("off/taskacceptlist");//路径是：/WEB-INF/off/taskacceptlist.jsp
				return mav;
			}
}
