package com.sc.controller;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
				@RequestParam(defaultValue="5")Integer pageSize){
			System.out.println("查看任务！");
			//查询list集合-分页    ${page.list}
			 PageInfo<OffAssesstask> page=offAssessTaskService.selectpage(pageNum,pageSize);
			 for (OffAssesstask task : page.getList()) {
				 List<OffTaskdetail> l=this.offTaskDetailService.taskdetail(task.getTaskid());
				 task.setState(l.get(0).getState());			
			}
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
				offTaskdetail.setUname(s.getSname());
			}
			
			System.out.println("任务详情"+list);	
			System.out.println("任务对象"+task);	
			mav.addObject("taskdetail",list);
			mav.addObject("task",task);
			mav.setViewName("off/taskdetail");//路径是：/WEB-INF/off/taskdetail.jsp
			return mav;
		  }
		
		 //新建任务
		@RequestMapping("/goadd.do")
		public ModelAndView goadd(ModelAndView mav){
			 System.out.println("新建任务");
			List<OffAssesstarget> list=this.offAssessTargetService.select();
			//查询员工信息-用于发送短信 
			BigDecimal c = new BigDecimal(37);
			List<SysUsersInfo> listuser=this.sysUsersInfoService.selectuser(c);
			System.out.println("被考核人"+listuser);
			mav.addObject("sysusers", listuser);
			mav.addObject("targetlist", list);
			mav.setViewName("off/taskadd");
			return mav;
		}
		

		//发布任务
		@RequestMapping("/add.do")
		 @ResponseBody
			public Result add(ModelAndView mav,String uids,OffAssesstask task){
			System.out.println("发布任务");
			System.out.println("获取的任务信息"+task);
			System.out.println("获取的用户ID"+uids);
			task.setTaskpublisher("彭俊");
			Long l=new Long("1");
			task.setCompanyid(l);
			task.setLasttime(new Date());
			task.setState("1");
			this.offAssessTaskService.insert(task);
			
			if(uids!=null){
				uids+=",";
				String[] split = uids.split(",");
			    for (String u : split) {
				   Long receiverid = new Long(u);
				  OffTaskdetail detail=new OffTaskdetail();
				  detail.setTaskid(task.getTaskid());
				  detail.setAcceptuserid(receiverid);
				  detail.setIsfinish("1");
				  Long lc=new Long("1");
				  detail.setCompanyid(lc);
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
				@RequestParam(defaultValue="5")Integer pageSize){
			System.out.println("模糊查询-分页！");
			String i=req.getParameter("select");
			System.out.println("查询条件"+i);
			//关键字
			String search=req.getParameter("search");
			System.out.println("关键字"+search);
			PageInfo<OffAssesstask> list=null;
			//任务标题
			if(i.equals("1")){
				list=this.offAssessTaskService.selectpagetitle(pageNum, pageSize, search);
				System.out.println("模糊查询"+list);
			}
			
			//任务内容
			if(i.equals("2")){
				list=this.offAssessTaskService.selectpagecontent(pageNum, pageSize, search);
				System.out.println("模糊查询"+list);
			}
			//任务发布人
			if(i.equals("3")){
				list=this.offAssessTaskService.selectpageu(pageNum, pageSize, search);
				System.out.println("模糊查询"+list);
			}
			//考核指标
			if(i.equals("4")){
				list=this.offAssessTaskService.selectpagetarget(pageNum, pageSize, search);
				System.out.println("模糊查询"+list);
			}
			mav.addObject("tasklist", list);
			mav.setViewName("off/tasklist");//路径是：/WEB-INF/off/offmesslist.jsp
			return mav;
		}
		
		//分页显示已接收任务
		@RequestMapping("/taskacceptlist.do")
		public ModelAndView listpageaccept(ModelAndView mav,
				@RequestParam(defaultValue="1")Integer pageNum,
				@RequestParam(defaultValue="5")Integer pageSize){
			System.out.println("查看已接收任务！");
			//查询list集合-分页    ${page.list}
			PageInfo<OffTaskdetail> page=this.offTaskDetailService.selectpageaccept(pageNum, pageSize);
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
				@RequestParam(defaultValue="5")Integer pageSize){
				System.out.println("模糊查询-分页！");
				String i=req.getParameter("select1");
				System.out.println("查询条件"+i);
				//关键字
				String search=req.getParameter("search1");
				System.out.println("关键字"+search);
				PageInfo<OffTaskdetail> list=null;
				//任务标题
				if(i.equals("1")){
					list=this.offTaskDetailService.selectpagetitle(pageNum, pageSize, search);
					System.out.println("模糊查询"+list);
				}
				//任务内容
				if(i.equals("2")){
					list=this.offTaskDetailService.selectpagecontent(pageNum, pageSize, search);
					System.out.println("模糊查询"+list);
					}
				//任务发布人
				if(i.equals("3")){
					list=this.offTaskDetailService.selectpageu(pageNum, pageSize, search);
					System.out.println("模糊查询"+list);
				}
				//考核指标
				if(i.equals("4")){
					list=this.offTaskDetailService.selectpagetarget(pageNum, pageSize, search);
					System.out.println("模糊查询"+list);
				}
				mav.addObject("taskacceptlist", list);
				mav.setViewName("off/taskacceptlist");//路径是：/WEB-INF/off/taskacceptlist.jsp
				return mav;
			}
}
