<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../../CRM/css/font.css">
    <script src="../../CRM/js/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../../CRM/lib/layui/css/layui.css">
	<script src="../../CRM/lib/layui/layui.js"></script>
	<script type="text/javascript" src="../../CRM/store/js/addSwi.js"></script>
  </head>
  
<body>
    <div class="layui-card">
        <div class="layui-card-header"><h2>添加仓库信息</h2></div>
       	<form class="layui-form">
       	
                <div class="layui-form-item">
                    <label class="layui-form-label" style="color: grey;">仓库编号</label>
                    <div class="layui-input-block">
                        <input type="text" name="whid" placeholder="在此输入仓库编号......" autocomplete="off" class="layui-input">
                    </div>
                </div>
                
                <div class="layui-form-item">
                    <label class="layui-form-label">仓库名称</label>
                    <div class="layui-input-block">
                        <input type="text" name="whname" placeholder="在此输入仓库名称......" autocomplete="off" class="layui-input">
                    </div>
                </div>
                
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">备注信息</label>
                    <div class="layui-input-block">
                        <textarea name="remark" placeholder="请输入备注信息......." class="layui-textarea"></textarea>
                    </div>
                </div>
                
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">公司编号</label>
                    <div class="layui-input-block">
                        <input type="text" name="cid" required  placeholder="在此输入公司编号......" autocomplete="off" class="layui-input">
                    </div>
                </div>
                
                
                <div class="layui-form-item">
                    <div class="layui-input-block">
                     <div class="layui-btn-container">
                     	<button button  class="layui-btn" lay-filter="add" lay-submit="">提交</button>
                     	<button type="reset" class="layui-btn layui-btn-primary">重置</button>
                     </div>
                    </div>
                </div>
     
                
        </form>
    </div>

</body>
</html>



