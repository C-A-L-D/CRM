package com.sc.controller;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Result;
import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysRole;
import com.sc.entity.SysUsers;
import com.sc.entity.SysUsersInfo;
import com.sc.entity.SysUsersRole;
import com.sc.service.SysUsersInfoService;
import com.sc.service.impl.SysRoleServiceImpl;
import com.sc.service.impl.SysUsersServiceImpl;

@Controller
@RequestMapping("/loginController")
public class SysUsersController {

	@Autowired
	SysUsersServiceImpl sysUsersServiceImpl;
	@Autowired
	SysRoleServiceImpl sysRoleServiceImpl;
	@Autowired
	SysUsersInfoService sysUsersInfoService;
	
	/**
	 * 登录失败
	 * @param mav	模板视图
	 * @param req	servlet请求对象
	 * @return
	 */
	@RequestMapping("/login.do")
	public ModelAndView Login(ModelAndView mav,HttpServletRequest req, SysUsers u, SysGongsiinfo sysGongsiinfo){
		System.out.println("您认证失败，将跳转到登录页面，完成认证..."+ u + "----" + sysGongsiinfo);
		
		String msg=(String)req.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		System.out.println("认证失败异常信息："+msg);
		
		String fail="";
		if(msg!=null){
			if(msg.equals(UnknownAccountException.class.getName())) {
				fail="unknown";//用户名不存在
			}else if(msg.equals(IncorrectCredentialsException.class.getName())){
				fail="error";//密码不正确
			}else if(msg.equals("randomCodeError")){
				fail="code";//验证码错误
			}else if(msg.equals("GsAndUserError")){
				fail="gs";//公司错误
			}else if(msg.equals("uStateError")){
				fail="state";//账户异常状态(被冻结)
			}else {
				fail="other";//未知错误
			}
		}
		
		mav.setViewName("redirect:../login.jsp?isfail="+fail);
		return mav;
	}
	
	/**
	 * 登录成功
	 * @param mav	模板视图
	 * @param session	session对象
	 * @return
	 */
	@RequestMapping("/index.do")
	public ModelAndView index(ModelAndView mav, HttpSession session) {
		System.out.println("登录认证成功，将跳到主页...");
		
		Subject subject = SecurityUtils.getSubject();
		SysUsers sysUser=(SysUsers)subject.getPrincipal();
		
		
		System.out.println("-----认证后的对象值："+sysUser);
		session.setAttribute("nowuser", sysUser);
		
		mav.setViewName("redirect:../index.jsp");
		return mav;
	}

	//========================个人信息页==================================
	
	/**
	 * 个人信息
	 * @param u	用户信息
	 * @param mav	模板视图
	 * @return
	 */
	@RequestMapping("/person.do")
	public ModelAndView person(HttpServletRequest req,ModelAndView mav){
		HttpSession session = req.getSession();
		SysUsers user = (SysUsers) session.getAttribute("nowuser");
		System.out.println("---------------"+user);
		if (user != null) {
			if (user.getGongsiid() != null) {
				SysGongsiinfo selectGSOne = sysUsersServiceImpl.selectGSOne(user.getGongsiid());
				mav.addObject("selectGSOne", selectGSOne);
				System.out.println("---------------"+selectGSOne);
			}
			if (user.getUserId() != null) {
				SysUsers role = sysUsersServiceImpl.selectUsersAndRoleAndUsersInfoOne(user.getUserId());
				mav.addObject("role", role);
				System.out.println("---------------"+role);
			}
			if (user.getUserId() != null) {
				SysUsers one2 = sysUsersServiceImpl.selectUsersAndRoleAndUsersInfoOne2(user.getUserId());
				mav.addObject("one", one2);
				System.out.println("---------------"+one2);
			}
		}
		
		mav.setViewName("sys/person");
		return mav;
	}
	
	/**
	 * 弹出修改密码框
	 * @param mav
	 * @return
	 */
	@RequestMapping("/goUpdatePassword.do")
	public ModelAndView goUpdatePassword(ModelAndView mav, HttpSession session) {
		mav.setViewName("sys/updatePassword");
		return mav;	
	}
	
	/**
	 * 修改密码
	 * @param pass
	 * @param session
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/updatePassword.do")
	public Result updatePassword(String pass, String upassword, HttpSession session) {
		SysUsers user = (SysUsers) session.getAttribute("nowuser");
		Md5Hash oldmd5Hash = new Md5Hash(upassword, "qwerty", 3);
		Md5Hash md5Hash = new Md5Hash(pass, "qwerty", 3);
		System.out.println(oldmd5Hash+"------"+user.getUpassword());
		if (String.valueOf(oldmd5Hash).equals(user.getUpassword())) {
			user.setUpassword(String.valueOf(md5Hash));
			user.setLasttime(new Date());
			sysUsersServiceImpl.updatePassword(user);
			return new Result(200, "密码修改成功");
		}
		else {
			return new Result(400, "初始密码错误");
		}
		
	}
	
	/**
	 * 文件上传
	 * @param upload
	 * @param req
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@ResponseBody
	@RequestMapping("/uploadFile.do")
	public Result uploadFile(MultipartFile file, HttpServletRequest req) throws IllegalStateException, IOException {
		System.out.println("选中文件对象："+file);
		if(file!=null){
			//获取文件名
			String filename=file.getOriginalFilename();
			if(filename!=null&&!filename.equals("")){
				//获取项目upload文件夹在Tomcat容器（磁盘）的真实路径
				String path=req.getSession().getServletContext().getRealPath("upload");
				System.out.println("upload的路径："+path);
				
				filename=System.currentTimeMillis() + filename.substring(filename.lastIndexOf("."));
				
				File f=new File(path+"/"+filename);
				System.out.println("文件存储路径："+path+"/"+filename);
				//转换存储文件
				file.transferTo(f);
				
				SysUsers user = (SysUsers) req.getSession().getAttribute("nowuser");
				SysUsersInfo sysUsersInfo = sysUsersInfoService.get(user.getSid());
				System.out.println("员工信息表："+sysUsersInfo);
				sysUsersInfo.setSphoto(filename);
				
				sysUsersInfoService.update(sysUsersInfo);
				return new Result(200, "照片上传成功");
			}
			
		}
		
		return new Result(400, "照片上传失败");
	}
	
	//========================账户管理页==================================
	
	/**
	 * 全部用户信息
	 * @param mav	模板视图
	 * @param pageNum	当前页码
	 * @param pageSize	页长
	 * @return
	 */
	@RequestMapping("/allUsersInfo.do")
	public ModelAndView allUsersInfo(ModelAndView mav, @RequestParam(defaultValue="1")int pageNum, @RequestParam(defaultValue="5")int pageSize) {
		PageInfo<SysUsers> info = sysUsersServiceImpl.selectAllUsersAndRoleAndUsersInfo(pageNum, pageSize);
		mav.addObject("allUsersInfo", info);
		mav.setViewName("sys/admin-list");
		return mav;
	}
	
	/**
	 * 修改用户状态
	 * @param sysUsers
	 * @return
	 */
	@RequestMapping("/updateUserStatus.do")
	@ResponseBody
	public Result updateUserStatus(SysUsers sysUsers) {
		sysUsersServiceImpl.updateUserStatus(sysUsers.getUserId());
		return new Result(200, "");
	}
	
	/**
	 * 弹出用户修改窗口
	 * @param mav
	 * @param sysUsers
	 * @return
	 */
	@RequestMapping("/goUpdateUser.do")
	public ModelAndView goUpdateUserOne(ModelAndView mav, SysUsers sysUsers){
		SysUsers userOne = sysUsersServiceImpl.selectUsersAndRoleAndUsersInfoOne(sysUsers.getUserId());
		List<SysRole> selectAllRole = sysRoleServiceImpl.selectAllRole();
		ArrayList<SysUsersInfo> list = sysUsersInfoService.selectAllUsersInfoByGsid(userOne.getGongsiid());
		ArrayList<SysUsers> allUsers = sysUsersServiceImpl.selectAllUsers(userOne.getGongsiid());
		ArrayList<SysUsersInfo> al = new ArrayList<SysUsersInfo>();
		for (SysUsersInfo s : list) {
			System.out.println("list----->"+s);
			boolean b = false;
			for (SysUsers aus : allUsers) {
				System.out.println("all---"+aus);
				if (s.getSid() != aus.getSid()) {
					b = false;
				}
				else {
					b = true;
					break;
				}
			}
			if (b == false) {
				al.add(s);
				System.out.println("添加："+s);
			}
		}
		for (int i = 0; i < al.size(); i++) {
			System.out.println("========----"+al.get(i));
		}
		mav.addObject("list", list);
		mav.addObject("user", userOne);
		mav.addObject("allRole", selectAllRole);
		mav.setViewName("sys/updateUser");
		return mav;
	}
	
	/**
	 * 输入框值改变
	 * @param sysUsersInfo
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getNewValue.do")
	public Result getNewValue(SysUsersInfo sysUsersInfo) {
		System.out.println(sysUsersInfo);
		SysUsersInfo selectUsersInfoOne = sysUsersServiceImpl.selectu(sysUsersInfo.getSname());
		if (selectUsersInfoOne != null) {
			return new Result(200, selectUsersInfoOne.getSid()+"");
		}
		return new Result(400, "");
	}
	
	/**
	 * 修改账户信息
	 * @param sysUsers
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/updateUser.do")
	public Result updateUser(SysUsers sysUsers, SysUsersRole sysUsersRole,HttpSession session) {
		System.out.println("---------"+sysUsers);
		System.out.println(sysUsersRole);
		sysUsers.setLasttime(new Date());
		sysUsersServiceImpl.updateUsers(sysUsers);
		
		sysUsersRole.setUserId(sysUsers.getUserId());
		SysUsers su = (SysUsers) session.getAttribute("nowuser");
		sysUsersRole.setOperatorid(su.getUserId());
		sysUsersRole.setLasttime(new Date());
		if (sysUsersRole.getId() != null) {
			sysUsersServiceImpl.updateUsersRole(sysUsersRole);
		}
		else {
			if (sysUsersRole.getRid() != null) {
				sysUsersServiceImpl.insertUsersRole(sysUsersRole);
			}
		}
		System.out.println(sysUsersServiceImpl.selectUsersAndRoleAndUsersInfoOne(sysUsers.getUserId()));
		return new Result(200, "账户修改成功");
	}
	
	/**
	 * 弹出添加账户窗口
	 * @param mav
	 * @return
	 */
	@RequestMapping("/addUser.do")
	public ModelAndView addUser(ModelAndView mav){
		mav.setViewName("sys/addUser");
		return mav;
	}
	
	
	/**
	 * 输入框值改变
	 * @param sysUsersInfo
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getUsersInfoGSValue.do")
	public Result getUsersInfoGSValue(SysUsersInfo sysUsersInfo) {
		SysUsersInfo ui = null;/*sysUsersServiceImpl.selectUsersInfoOne(sysUsersInfo.getSid());*/
		if (ui != null) {
			SysGongsiinfo gs = sysUsersServiceImpl.selectSysGongsiinfoOne(ui.getGongsiid());
			return new Result(200, ui.getSname()+","+ui.getGongsiid()+","+gs.getGname());
		}
		return new Result(400, "");
	}

	/**
	 * 添加一个新账户
	 * @param sysUsersInfo
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addNewUser.do")
	public Result addNewUser(SysUsers sysUsers) {
		System.out.println(sysUsers);
		Md5Hash md5Hash = new Md5Hash("123456", "qwerty", 3);
		sysUsers.setUpassword(String.valueOf(md5Hash));
		if (sysUsers.getUstate() == null) {
			sysUsers.setUstate("off");
		}
		sysUsers.setLasttime(new Date());
		sysUsersServiceImpl.createUser(sysUsers);
		return new Result(200, "账户创建完成");
	}
	
	/**
	 * 删除ID对应的记录
	 * @param s
	 * @return
	 */
	@RequestMapping("/delUser.do")
	@ResponseBody
	public Result delUser(SysUsers sysUsers){
		System.out.println("开始删除！"+sysUsers.getUserId());
		sysUsersServiceImpl.delUser(sysUsers.getUserId());
		sysUsersServiceImpl.delUserRole(sysUsers);
		return new Result(200, "删除成功！");
	}
	
	/**
	 * 删除选中的账户
	 * @param mav
	 * @param aa
	 */
	@RequestMapping("/delAllUser.do")
	@ResponseBody
	public void delAllUser(String aa){//aa	字符串格式：1,3,2,4...
		System.out.println("账户删除！"+aa);
		
		String[] USERSArr = aa.split(",");

		for (String userId : USERSArr) {
			SysUsers user =  sysUsersServiceImpl.goUpdateUserOne(new BigDecimal(userId));
			sysUsersServiceImpl.delUser(user.getUserId());
			sysUsersServiceImpl.delUserRole(user);
		}
	}
}
