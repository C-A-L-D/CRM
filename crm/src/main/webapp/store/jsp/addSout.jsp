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
	<script type="text/javascript" src="../../CRM/store/js/addSoutAndInfo.js"></script>
  </head>
  
<body>
    <div class="layui-card">
        <div class="layui-card-header"><h2>添加销售单</h2></div>
       	<form class="layui-form">
       	
 				<div class="layui-form-item">
                    <label class="layui-form-label" >销售单编号</label>
                    <div class="layui-input-block">
                        <input type="text" lay-verify="required" name="sid" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">制单日期</label>
                    <div class="layui-input-block">
                        <input type="text" name="maketime" id="maketime" class="layui-input">
                        <input type="hidden" name="lastdate" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">发票编号</label>
                    <div class="layui-input-block">
                        <input type="text" name="tid" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">用户编号</label>
                    <div class="layui-input-block">
                        <input type="text" name="guid" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">销售金额</label>
                    <div class="layui-input-block">
                        <input type="text" name="sprice" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">出库状态</label>
                    <div class="layui-input-block">
                        <input type="text" name="sstatus" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">是否返利</label>
                    <div class="layui-input-block">
                        <input type="text" name="isanti" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">订单状态</label>
                    <div class="layui-input-block">
                        <input type="text" name="lstatus" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">备注信息</label>
                    <div class="layui-input-block">
                        <textarea id="remark" name="remark" class="layui-textarea"></textarea>
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">公司编号</label>
                    <div class="layui-input-block">
                        <input type="text" name="cid" autocomplete="off" class="layui-input">
                    </div>
                </div>
                
                
                <div class="layui-form-item">
                    <div class="layui-input-block">
                     <div class="layui-btn-container">
                     	<button button  class="layui-btn" lay-filter="addsout" lay-submit>提交</button>
                     	<button type="reset" class="layui-btn layui-btn-primary">重置</button>
                     </div>
                    </div>
                </div>
     
                
        </form>
    </div>

</body>
</html>



