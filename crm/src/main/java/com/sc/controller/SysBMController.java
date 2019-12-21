package com.sc.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.Result;
import com.sc.entity.SysDepartment;

import com.sc.service.SysDepartmentService;


@Controller
@RequestMapping("/sysbmctrl")
public class SysBMController {
	@Autowired
	SysDepartmentService sysDepartmentService;
	
	//公司分页list
	@RequestMapping("/bmpage.do")
	public ModelAndView gspage(ModelAndView mav,SysDepartment info1,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize) throws IOException{
		System.out.println("公司列表-分页！");
		//查询list集合-分页     ${p.list}
		mav.addObject("p", sysDepartmentService.selectpage(pageNum, pageSize, info1));
		mav.addObject("info1", info1);
		mav.setViewName("gs/bmlistpage");// 路径是：/WEB-INF/gs/gslistpage.jsp
		return mav;
	}
	
	
	
	

	//添加公司
	@RequestMapping("/bmgotj.do")
	public ModelAndView gsgotj(ModelAndView mav){
		System.out.println("部门去添加！");
		mav.addObject("p", sysDepartmentService.select1());
		mav.setViewName("gs/bmtj");
		return mav;
	}
	
	//添加公司后
	@RequestMapping("/bmtj.do")
	@ResponseBody
	public Result gsadd(ModelAndView mav,
			HttpServletRequest req,
			SysDepartment info)throws IllegalStateException, IOException {
		System.out.println("开始添加公司"+info);
		//设置添加时间
		info.setLasttime(new Date());
		sysDepartmentService.add(info);
		return new Result(200,"添加成功！");
	}
	
	//公司修改信息
	@RequestMapping("/bmgoupdate.do")
	public ModelAndView goupdate(ModelAndView mav,SysDepartment info1){
		System.out.println("跳转到修改页面！"+info1);
		SysDepartment info = this.sysDepartmentService.get(info1.getDid());
		System.out.println("修改页面！"+info);
		mav.addObject("p", sysDepartmentService.select1());
		mav.addObject("u", info);
		mav.setViewName("gs/bmupdate");
		return mav;
	}
	
	//公司修改
	@RequestMapping("/bmupdate.do")
	@ResponseBody
	public Result update(ModelAndView mav,
			SysDepartment info) throws IllegalStateException, IOException{
		System.out.println("修改"+info);
		//设置修改时间
		info.setLasttime(new Date());
		sysDepartmentService.update(info);
		return new Result(200,"修改成功！");
	}
	
	//删除公司
	@RequestMapping("/bmdelete.do")
	@ResponseBody
	public void gsdelete(ModelAndView mav,SysDepartment info1){
		System.out.println("公司删除！"+info1);
		SysDepartment info = this.sysDepartmentService.get(info1.getDid());
		
		this.sysDepartmentService.delete(info);
	}
	
	//删除所有公司
	@RequestMapping("/bmdeletesy.do")
	@ResponseBody
	public void gsdelete(ModelAndView mav,String aa){
		System.out.println("公司删除！"+aa);
		
		String[] ss = aa.split(",");
		//删除字符串的 “,”  比如aa={a,b,c}  之后 ["a","b","c"]
		//如果是split("")  比如aa={abc de}  之后["a","b","c" ,"d","e"]
		for (String xx : ss) {
			SysDepartment info = this.sysDepartmentService.get(new BigDecimal(xx));
			this.sysDepartmentService.delete(info);
		}
		
		
	}
	
	//导出excel
	@RequestMapping("/bmexcel.do")
	@ResponseBody
	public void bmexcel1(HttpServletResponse response){
		System.out.println("111");	
		XSSFWorkbook wb =sysDepartmentService.show();
	    String fileName = "部门详情报表.xlsx";
	    
	    OutputStream outputStream =null;
	    try {
	        fileName = URLEncoder.encode(fileName,"UTF-8");
	        //设置ContentType请求信息格式
	        response.setContentType("application/vnd.ms-excel");
	        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
	        outputStream = response.getOutputStream();
	        wb.write(outputStream);
	        outputStream.flush();
	        outputStream.close();
	    } catch (UnsupportedEncodingException e) {
	    	
	        e.printStackTrace();
	    } catch (IOException e) {
	    	
	        e.printStackTrace();
	    }
		
	}
	
}
