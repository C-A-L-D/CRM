<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<title>登录注册</title>
<link rel="stylesheet" type="text/css" href="css/login.css">
<link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="css/font.css">
<link rel="stylesheet" href="css/xadmin.css">


<script type="text/javascript">
  function refreshcode(img){
     img.src='validatecode.jsp?t='+new Date().getTime();
  }
 </script>

</head>
<body>
<div id="wrapper" class="login-page">
<div id="login_form" class="form">

<form  action="loginController/login.do" method="post">
 <h2>管理登录</h2>
<input type="text" placeholder="用户名" name="uname" value="" id="user_name">
<input type="password" placeholder="密码" name="upassword" value="" id="password" />
<input type="text" placeholder="验证码" name="randomcode" id="randomcode" size="8">
<img src="validatecode.jsp" id="imgcode" width="56" height="20"
     onclick="refreshcode(this)" title="点击刷新">
<button type="submit" id="login">登　录</button>
<p class="message">还没有账户? <a href="#">立刻创建</a></p>
</form>

<form action="loginController/ZHUCE.do" method="post" class="register-form">
<input type="text" placeholder="用户名" name="uname" value="" id="r_user_name" autocomplete="new-password" onblur="member_del(this);"/>
<input type="password" placeholder="密码" name="upassword" id="r_password" autocomplete="new-password"/>
<button id="create" onsubmit="submitTest(this);">创建账户</button>
<p class="message">已经有了一个账户? <a href="#">立刻登录</a></p>
</form>
<script type="text/javascript">

</script>
</div>
</div>

<script src="js/jquery.min.js"></script>
<script type="text/javascript" src="lib/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="js/xadmin.js"></script>
<script type="text/javascript">
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
  	
  	 /*用户-删除*/
      function member_del(obj){
     	//发异步删除数据
	      $.ajax({
	        type: 'post',
	        url: "loginController/zhuce.do",
	        data: "uname="+obj.value,
	        success: function (res) {
	          if(res.status == 400){
	           		layui.layer.alert(res.msg, {icon: 5});
	           }
	        }
	    });
      }
      
</script>
</body>
</html>