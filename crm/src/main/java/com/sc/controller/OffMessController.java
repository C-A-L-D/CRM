package com.sc.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.OffMess;
import com.sc.entity.OffMessdetail;
import com.sc.entity.Result;
import com.sc.entity.SysUsers;
import com.sc.service.OffMessService;
import com.sc.service.SysUsersService;

@Controller
@RequestMapping("/offmessctrl")
public class OffMessController {
	@Autowired
	OffMessService offMessService;
	
	@Autowired
	SysUsersService sysUsersService;
	
	//分页显示短信息
	@RequestMapping("/offmesslist.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize){
		System.out.println("查看短信列表-分页！");
		
		//查询list集合-分页    ${page.list}
		mav.addObject("p", offMessService.selectpage(pageNum,pageSize));
		mav.setViewName("off/offmesslist");//路径是：/WEB-INF/off/offmesslist.jsp
		return mav;
     }
	
	//删除短信息
	@RequestMapping("/delete.do")
	public ModelAndView delete(ModelAndView mav,OffMessdetail mess){
		System.out.println("删除短信息"+mess);
		this.offMessService.deleteMess(mess);
		mav.setViewName("redirect:offmesslist.do");//重定向到offmesslist方法
		return mav;
     }
	
	//显示短消息详情
	@RequestMapping("/showdetail.do")
	public ModelAndView showdetail(ModelAndView mav,OffMessdetail mess){
		System.out.println("查看短消息详情！"+mess);
		//更改短消息状态
		 Long l = new Long(mess.getDetailid());
		this.offMessService.updatestate(l);
		//查询短消息详情
		OffMessdetail detail=this.offMessService.showdetail(mess);
	System.out.println(detail+"111");
		
		mav.addObject("shoedetail",detail);
	
		mav.setViewName("off/showdetail");//路径是：/WEB-INF/off/showdetail.jsp
		return mav;
     }
	
	//回复短消息
	  @RequestMapping("/huifu.do")
	  @ResponseBody                                                //发送人编号              //接收人用户名
		public Result huifumess(ModelAndView mav,OffMess mess,Long senderid,String receiver){
		System.out.println("回复短消息！"+mess);
		System.out.println("发送人编号"+senderid);
		System.out.println("接收人用户名"+receiver);
		BigDecimal c = new BigDecimal(senderid);
		System.out.println("11"+c);
		SysUsers u=this.offMessService.selectByuid(c);
		System.out.println(u+"用户");
		mess.setSender(u.getUname());
		
		mess.setLasttime(new Date());
		
		this.offMessService.huifu(mess);
		
		//将回复的短消息添加到短消息详情表
		OffMessdetail detail=new OffMessdetail();
		System.out.println("222");
		detail.setMessid(mess.getMessid());
		System.out.println("333");
		SysUsers user=this.offMessService.selectu(receiver);
		System.out.println("接收人信息"+user);
	
	    Long rece = user.getUserId().longValue();
		detail.setReceiverid(rece);
		detail.setMessstate("1");
		
        detail.setLasttime(new Date());
        System.out.println("详情"+detail);
		this.offMessService.huifuone(detail);
		return new Result(200,"发送成功！");
		
     }
	  
      //发送消息
		@RequestMapping("/goadd.do")
		public ModelAndView goadd(ModelAndView mav){
			
			 System.out.println("4444");
			//查询员工信息-用于发送短信 
			BigDecimal c = new BigDecimal(1);
			
			
			List<SysUsers> listuser=this.sysUsersService.selectuser(c);
			System.out.println("666"+listuser);
			mav.addObject("sysusers", listuser);
			mav.setViewName("off/messadd");
			return mav;
		}
		
		//发送消息-多
		@RequestMapping("/add.do")
		 @ResponseBody
			public Result add(ModelAndView mav,String uids,OffMess mess){
			System.out.println("111");
			//查询员工信息-用于发送短信 
			System.out.println(mess+"111");
			System.out.println(uids+"222");
			
			mess.setLasttime(new Date());
			mess.setSender("1");
			this.offMessService.huifu(mess);
			
			if(uids!=null){
				uids+=",";
				String[] split = uids.split(",");
			    for (String string : split) {
				   Long receiverid = new Long(string);
				   OffMessdetail detail=new OffMessdetail();
					detail.setMessid(mess.getMessid());
					detail.setReceiverid(receiverid);
					detail.setMessstate("1");
			        detail.setLasttime(new Date());
					this.offMessService.huifuone(detail);
			    }
			}
			return new Result(200,"发送成功！");
		}
}
