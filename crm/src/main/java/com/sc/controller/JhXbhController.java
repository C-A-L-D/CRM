package com.sc.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.JhXbh;
import com.sc.entity.StoreGinfo;
import com.sc.service.JhXbhService;
import com.sc.service.StoreGinfoService;

@RequestMapping("/xbhctrl")
@Controller
public class JhXbhController {

	@Autowired
	JhXbhService jhXbhService;
	@Autowired
	StoreGinfoService storeGinfoService;

	@RequestMapping("/xbhlistpage.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize){
		System.out.println("查询用户列表-分页！");					
		mav.addObject("p", jhXbhService.selectpage(pageNum, pageSize));		
		//查询list集合-分页     ${page.list}	
		ArrayList<StoreGinfo> list2 = storeGinfoService.selectAll();
		if(list2!=null){
			
			for (StoreGinfo storeGinfo : list2) {
				BigDecimal kcnumber=storeGinfo.getStorenum();
				int a=Integer.parseInt(kcnumber.toString());
				if(a>=0&&a<=300){
					BigDecimal cpid=storeGinfo.getGid();
					BigDecimal gsid=storeGinfo.getCid();
					System.out.println(gsid);
					List<JhXbh> list = jhXbhService.getall(storeGinfo);
					System.out.println(list+"aaaaaaaaaa");
				
						if(list.size()==0){						
							 JhXbh jx=new JhXbh();
							 if(cpid!=null){
								 jx.setCpId(cpid.longValue());
							 }						
						     if(gsid!=null){
							 jx.setGsId(gsid.longValue());
							 }
						     jx.setJhTime(new Date());
							 jx.setLtime(new Date());
							 jx.setState("缺货");
							 jx.setRemark("加急采购");
							 jx.setOperator("啦啦啦");
							 jhXbhService.add(jx);			
					
						
					}
				
				}
			}
		}

	
		mav.setViewName("jh/xbhlistpage");// 路径是：/WEB-INF/jh/xbhlistpage.jsp
		return mav;
	}
	

		
		
	
}
