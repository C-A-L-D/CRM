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
    
    <title>My JSP starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link rel="stylesheet" href="css/font.css">
    <link rel="stylesheet" type="text/css" href="lib/layui/css/modules/layer/default/layer.css">
    <link rel="stylesheet" type="text/css" href="lib/layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="css/xadmin.css">
    <link rel="stylesheet" type="text/css" href="css/font.css">
    <script src="js/jquery.min.js"></script>
	<script src="lib/layui/layui.js"></script>
	<script src="lib/layui/lay/modules/layer.js"></script>
	<script type="text/javascript" src="store/js/storeginfopre.js"></script>
  </head>
<body>
<div class="layui-card">
<div class="x-body">
<!-- 表格 -->
  <table class="layui-table">
    <colgroup>
      <col width="200">
      <col width="200">
      <col width="200">
      <col width="200">
      <col width="150">
      <col width="150">
	  <col width="150">
      <col width="300">
      <col>
    </colgroup>
    <thead>
      <tr>
        <th><center>商品编号</center></th>
        <th><center>商品名称</center></th>
        <th><center>商品类别</center></th>
        <th><center>规格说明</center></th>
        <th><center>单位</center></th>
        <th><center>成本价</center></th>
       <th><center>零售价</center></th>
        <th><center>操作</center></th>
      </tr> 
    </thead>
    <tbody>
		 <c:forEach items="${page.list}" var="sgi">
	  		<tr>
		  		<td><center>${sgi.gid}</center></td>
		  		<td><center>${sgi.gname}</center></td>
		  		<td><center>${sgi.gcategopy}</center></td>
		  		<td><center>${sgi.gdesp}</center></td>
		  		<td><center>${sgi.gunit}</center></td>
		  		<td><center>${sgi.pricebuy}</center></td>
		  		<td><center>${sgi.pricesold}</center></td>
	      		<td>
	      		<center>
	      			<div class="layui-btn-group">
	      				<button type="button" onclick="postinfo(${sgi.gid},'${sgi.gname}')" class="layui-btn layui-btn-sm layui-btn-normal">
	          				<i class="layui-icon">&#xe65f;</i>
	          			</button>
	          			<a type="button" class="layui-btn layui-btn-sm" href="storeGinfo/selectSgi.do?gid=${sgi.gid}"><i class="layui-icon">&#xe642;</i></a>
	          			<button type="button" class="btn layui-btn layui-btn-sm layui-btn-danger" onclick="delCheck(${sgi.gid})">
	          				<i class="layui-icon">&#xe640;</i>
	          			</button>
	          		</div>
	          	</center>
	      		</td>
			</tr>
  		</c:forEach>
	</tbody>
  </table>
  
<!-- 分页 -->
	  <center>
      <div class="layui-elem-field layui-field-title" id="page">
          <a class="layui-btn layui-btn-primary" href="storeWhinfo/listpageSgi.do?pageNum=${page.firstPage}&whid=${id}">首页</a>
          <a class="layui-btn layui-btn-primary" href="storeWhinfo/listpageSgi.do?pageNum=${page.prePage}&whid=${id}">&lt;&lt;上一页</a>
          <span class="layui-btn"> 当前${page.pageNum }/${page.pages }页</span>
          <span class="layui-btn layui-btn-primary">共${page.total}条数据</span>
          <a class="layui-btn layui-btn-primary" href="storeWhinfo/listpageSgi.do?pageNum=${page.nextPage}&whid=${id}">下一页&gt;&gt;</a>
          <a class="layui-btn layui-btn-primary" href="storeWhinfo/listpageSgi.do?pageNum=${page.lastPage }&whid=${id}">尾页</a>       
      </div>
      </center>
</div>
</div>
</body>


</html>