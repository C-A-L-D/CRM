<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>欢迎页面-L-admin1.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../css/font.css">
    <link rel="stylesheet" href="../css/xadmin.css">
    <script src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body>
  
   <div class="x-body">
        <form class="layui-form">
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  	公司名称
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gname" name="gname"
                  autocomplete="off" class="layui-input" value="${u.gname }" disabled="disabled">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  	公司代码
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gcode" name="gcode"
                  autocomplete="off" class="layui-input" value="${u.gcode }" disabled="disabled">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  	邮箱
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gemail" name="gemail"
                  autocomplete="off" class="layui-input" value="${u.gemail }" disabled="disabled">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  	联系人
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="glinkman" name="glinkman"
                  autocomplete="off" class="layui-input" value="${u.glinkman }" disabled="disabled">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  	公司地址
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gaddress" name="gaddress"
                  autocomplete="off" class="layui-input" value="${u.gaddress }" disabled="disabled">
              </div>
          </div>
          
           <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  	移动电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gphone" name="gphone"
                  autocomplete="off" class="layui-input" value="${u.gphone }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   		固定电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gtel" name="gtel"
                  autocomplete="off" class="layui-input" value="${u.gtel }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   		传真
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gchuanzhen" name="gchuanzhen"
                  autocomplete="off" class="layui-input" value="${u.gchuanzhen }" disabled="disabled">
              </div>
          </div>
      </form>
    </div>
    

  </body>
</html>
