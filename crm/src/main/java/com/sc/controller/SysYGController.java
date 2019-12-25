package com.sc.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.Result;
import com.sc.entity.SysDepartment;
import com.sc.entity.SysJobinfo;
import com.sc.entity.SysUsersInfo;
import com.sc.entity.Ygexcel;
import com.sc.service.SysUsersInfoService;

@Service
@RequestMapping("/sysygctrl")
public class SysYGController {
@Autowired
SysUsersInfoService sysUsersInfoService;


//公司分页list
@RequestMapping("/ygpage.do")
public ModelAndView gspage(ModelAndView mav,
		SysUsersInfo info1,
		@RequestParam(defaultValue="1")Integer pageNum,
		@RequestParam(defaultValue="5")Integer pageSize) throws IOException{
	System.out.println("公司列表-分页！");
	//查询list集合-分页     ${p.list}
	mav.addObject("p", sysUsersInfoService.selectpage(pageNum, pageSize,info1));
	mav.addObject("info1", info1);
	mav.setViewName("gs/yglistpage");// 路径是：/WEB-INF/gs/gslistpage.jsp
	
	return mav;
}

//公司详情
@RequestMapping("/ygxxlist.do")
public ModelAndView gsxx(ModelAndView mav,SysUsersInfo info1){
	System.out.println("查询公司详情"+info1.getSid());
	//查询list集合
	SysUsersInfo info =sysUsersInfoService.get(info1.getSid());
	System.out.println(info);
	mav.addObject("u", info);//list集合存入模型
	mav.setViewName("gs/ygxxlist");// 路径是：/WEB-INF/gs/gsxxlist.jsp
	return mav;
}



//添加公司
@RequestMapping("/yggotj.do")
public ModelAndView gsgotj(ModelAndView mav){
	System.out.println("公司去添加！");
	mav.addObject("p1", sysUsersInfoService.select1());
	/*mav.addObject("p3", sysUsersInfoService.select3());*/
	mav.setViewName("gs/ygtj");
	return mav;
}

//添加公司后
@RequestMapping("/ygtj.do")
@ResponseBody
public Result gsadd(ModelAndView mav,
		HttpServletRequest req,
		MultipartFile upload,
		SysUsersInfo info,String province,String city,String area)throws IllegalStateException, IOException {
	System.out.println("开始添加公司"+info);
	
	System.out.println("开始上传文件111:"+upload);
	String ssq=province+"-"+city+"-"+area;
	System.out.println(ssq);
	info.setSaddressHome(ssq);
	//如果用户选择文件，那么执行上传代码
	if(upload!=null){
		String filename=upload.getOriginalFilename();//文件名
		if(filename!=null&&!filename.equals("")){
			//获取upload文件夹所在路径
			String path=req.getSession().
					getServletContext().getRealPath("upload");
			//形如：26456456435.jpg
			filename=System.currentTimeMillis()
					+filename.substring(filename.lastIndexOf("."));
			//目的地文件对象
			File file=new File(path+"/"+filename);
			upload.transferTo(file);//转换存储文件
			System.out.println(path+"/"+filename);
			//设置图片名称
			
			info.setSphoto(filename);
		}
	}	
	
	//设置添加时间
	info.setLasttime(new Date());
	sysUsersInfoService.add(info);
	return new Result(200,"添加成功！");
}

//公司修改信息
@RequestMapping("/yggoupdate.do")
public ModelAndView goupdate(ModelAndView mav,SysUsersInfo info1,MultipartFile upload,HttpServletRequest req) throws IllegalStateException, IOException{
	System.out.println("跳转到修改页面！"+info1);
	SysUsersInfo info = this.sysUsersInfoService.get(info1.getSid());
	System.out.println("原有的数据"+info);
	String ssq1=info.getSaddressHome();
	System.out.println(ssq1);
	String[] ssq=ssq1.split("-");
	List list=new ArrayList();
	for (String ss : ssq) {
		list.add(ss);
	}
	System.out.println("list"+list);
	System.out.println(Arrays.toString(ssq));
	mav.addObject("p1", sysUsersInfoService.select1());
	mav.addObject("p3", sysUsersInfoService.select3(info));
	mav.addObject("u", info);
	mav.addObject("ssq", list);
	mav.setViewName("gs/ygupdate");
	return mav;
}

//公司修改
@RequestMapping("/ygupdate.do")
@ResponseBody
public Result update(ModelAndView mav,
		SysUsersInfo info,
		MultipartFile upload,
		HttpServletRequest req) throws IllegalStateException, IOException{
	System.out.println("修改"+info);
	System.out.println("开始上传文件"+info);
	System.out.println("开始上传文件111:"+upload);
	//如果用户选择文件，那么执行上传代码
	if(upload!=null){
		String filename=upload.getOriginalFilename();//文件名
		if(filename!=null&&!filename.equals("")){
			//获取upload文件夹所在路径
			String path=req.getSession().
					getServletContext().getRealPath("upload");
			//形如：26456456435.jpg
			filename=System.currentTimeMillis()
					+filename.substring(filename.lastIndexOf("."));
			//目的地文件对象
			File file=new File(path+"/"+filename);
			upload.transferTo(file);//转换存储文件
			System.out.println(path+"/"+filename);
			//设置图片名称
			
			info.setSphoto(filename);
		}
	}	
	//设置修改时间
	info.setLasttime(new Date());
	sysUsersInfoService.update(info);
	return new Result(200,"修改成功！");
}

//删除公司
@RequestMapping("/ygdelete.do")
@ResponseBody
public void gsdelete(ModelAndView mav,SysUsersInfo info1){
	System.out.println("公司删除！"+info1);
	SysUsersInfo info = this.sysUsersInfoService.get(info1.getSid());
	
	this.sysUsersInfoService.delete(info);
}

//删除所有公司
@RequestMapping("/ygdeletesy.do")
@ResponseBody
public void gsdelete(ModelAndView mav,String aa){
	System.out.println("公司删除所有！"+aa);
	
	String[] ss = aa.split(",");
	//删除字符串的 “,”  比如aa={a,b,c}  之后 ["a","b","c"]
	//如果是split("")  比如aa={abc de}  之后["a","b","c" ,"d","e"]
	for (String xx : ss) {
		SysUsersInfo info = this.sysUsersInfoService.get(new BigDecimal(xx));
		this.sysUsersInfoService.delete(info);
	}	
}

//导出excel
@RequestMapping("/ygexcel.do")
@ResponseBody
public void ygexcel1(HttpServletResponse response){
	System.out.println("111");	
	XSSFWorkbook wb =sysUsersInfoService.show();
    String fileName = "员工报表.xlsx";
    
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

//关联其他表
@RequestMapping("/yggl.do")
@ResponseBody
public List<SysJobinfo> yggl(SysUsersInfo info1){
	System.out.println("关联其他表");	
	List<SysJobinfo> list = this.sysUsersInfoService.gszw(info1);
	System.out.println(list);
	return  list;
}

}
