<%@ page language="java" import="java.util.*,com.sc.service.impl.SysGongsiinfoServiceImpl,com.sc.entity.SysGongsiinfo" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@page import="org.springframework.web.context.WebApplicationContext" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+": "+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="css/login.css">
<link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="css/font.css">
<link rel="stylesheet" href="css/xadmin.css">
<script src="js/jquery.min.js"></script>
<script type="text/javascript" src="lib/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="js/xadmin.js"></script>

<script type="text/javascript">
	function refreshcode(img){
	   img.src='validatecode.jsp?t='+new Date().getTime();
	}
  
  	layui.use(['layer', 'form'], function() {
  		if("${param.isfail }" == "unknown") {
		layui.layer.msg("用户名不存在", {icon: 5});
		}
		else if("${param.isfail }" == "error") {
			layui.layer.msg("密码不正确", {icon: 5});
		}
		else if("${param.isfail }" == "code") {
			layui.layer.msg("验证码错误", {icon: 5});
		}
		else if("${param.isfail }" == "gs") {
			layui.layer.msg("公司错误", {icon: 5});
		}
		else if("${param.isfail }" == "state") {
			layui.layer.msg("账户状态异常", {icon: 5});
		}
		else if("${param.isfail }" == "other") {
			layui.layer.msg("未知错误", {icon: 5});
		}
  	});
	
 </script>
	<%
		WebApplicationContext context=WebApplicationContextUtils.getWebApplicationContext(application);
 		SysGongsiinfoServiceImpl sysGongsiinfoServiceImpl = (SysGongsiinfoServiceImpl)context.getBean("sysGongsiinfoServiceImpl");
 		List<SysGongsiinfo> gslist = sysGongsiinfoServiceImpl.select();
 		request.setAttribute("list", gslist);
	 %>
</head>
<body>
<div id="wrapper" class="login-page">
<div id="login_form" class="form">

<form  action="loginController/login.do"  method="post" id="myform">
 <h2>管理登录</h2>
<select lay-verify="" name="sysGongsiinfo.gname" lay-filter="sel" id="sel" style="background-color: RGB(232,240,254);border:none;margin-bottom: 15px;font-weight: bold;">
	<option value="">请选择</option>	
	<c:forEach items="${list }" var="l">
		<option style="font-size: 18px;" name="${l.id }" value="${l.gcode }">${l.gname }</option> 
	</c:forEach>
</select>
<textarea id="gsDIV" name="test"  style="display: none;"></textarea>
<input type="text" placeholder="公司代码" name="sysGongsiinfo.gcode" value="" id="gsCode" style="background-color: RGB(232,240,254);" readonly>
<input type="text" placeholder="用户名" name="aaa" value="" id="aaa">
<input type="hidden" name="uname" value="" id="user_name">
<input type="password" placeholder="密码" name="upassword" value="" id="password" />
<input type="text" placeholder="验证码" name="randomcode" id="randomcode" size="8" style="width: 50%;float: left;">
<img src="validatecode.jsp" id="imgcode" width="40%" height="50px"
     onclick="refreshcode(this)" title="点击刷新">
<button type="button" id="login" onclick="submitmyform()">登　录</button>
</form>
</div>
</div>

<script type="text/javascript">
    function submitmyform(){
       $("#user_name").val($("#aaa").val()+"="+$("#gsDIV").html());
       $("#myform").submit();
    }
   
 	/* function check_login()
  	{
  	 var name=$("#user_name").val();
  	 var pass=$("#password").val();
  	 if(name=="admin" && pass=="admin")
  	 {
  	  alert("登录成功");
  	  $("#user_name").val("");
  	  $("#password").val("");
         $(location).attr('href', 'index.html');
  	 }
  	 else
  	 {
  	  $("#login_form").removeClass('shake_effect');  
  	  setTimeout(function()
  	  {
  	   $("#login_form").addClass('shake_effect')
  	  },1);  
  	 }
  	} */
  	/* function check_register(){
  		var name = $("#r_user_name").val();
  		var pass = $("#r_password").val();
  		var email = $("r_email").val();
  		if(name!="" && pass=="" && email != "")
  		 {
  		  alert("注册成功！");
  		  $("#user_name").val("");
  		  $("#password").val("");
  		 }
  		 else
  		 {
  		  $("#login_form").removeClass('shake_effect');  
  		  setTimeout(function()
  		  {
  		   $("#login_form").addClass('shake_effect')
  		  },1);  
  		 }
  	} */
  	$(function(){
  		$("#create").click(function(){
  			check_register();
  			return false;
  		})
  		$("#login").click(function(){
  			check_login();
  			return false;
  		})
  		$('.message a').click(function () {
  		    $('form').animate({
  		        height: 'toggle',
  		        opacity: 'toggle'
  		    }, 'slow');
  		});
  	})
  
  $("#sel").change(function () {
    $("#gsCode").val($("#sel").find("option:selected").val());
    /*把下拉选项选中ID传给div*/
    $("#gsDIV").html($("#sel").find("option:selected").attr("name"));
   });
  
</script>
</html>