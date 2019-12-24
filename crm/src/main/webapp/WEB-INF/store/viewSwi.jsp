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
	<script type="text/javascript" src="store/js/listSwiPre.js"></script>
  </head>
  
<body>
    <div class="layui-card-header">
    <div class="layui-form-item">
    <label class="layui-form-label" style="width:220px"><h2>仓库号为${selected.whid }的仓库信息</h2> </label>
    <button type="button" style="float:right" class="layui-btn layui-btn-sm" onclick="postUpdate(${selected.whid })" ><i class="layui-icon">&#xe642;</i></button>
    </div>
    </div>
   
    <div class="layui-card">
    	<div class="layui-form">
                <div class="layui-form-item">
                    <label class="layui-form-label" >仓库编号</label>
                    <div class="layui-input-block">
                        <input type="text" name="whid" readonly="readonly" value="${selected.whid }" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">仓库名称</label>
                    <div class="layui-input-block">
                        <input type="text" name="whname" readonly="readonly" value="${selected.whname}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">备注信息</label>
                    <div class="layui-input-block">
                        <textarea name="remark" readonly="readonly" class="layui-textarea">${selected.remark}</textarea>
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">公司编号</label>
                    <div class="layui-input-block">
                        <input type="text" name="cid" readonly="readonly"  value="${selected.cid}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">修改时间</label>
                    <div class="layui-input-block">
                        <input type="text" name="lastdate" readonly="readonly" value="<fmt:formatDate value="${selected.lastdate }" pattern="yyyy-MM-dd HH:mm:ss"/>" autocomplete="off" class="layui-input">
                    		
                    </div>
                </div>
           </div>
    </div>

</body>
</html>



