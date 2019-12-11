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
    
    <title>My JSP 'offmesslist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" type="text/css" href="../../lib/layui/css/layui.css">
    <script src="../../js/jquery.min.js"></script>
	<script src="../../lib/layui/layui.js"></script>
  </head>
<body>
<div class="layui-form">
  <table class="layui-table">
    <colgroup>
      <col width="150">
      <col width="150">
      <col width="200">
      <col>
    </colgroup>
    <thead>
      <tr>
        <th>商品编号</th>
        <th>商品名称</th>
        <th>商品类别</th>
        <th>规格说明</th>
        <th>单位</th>
        <th>仓库编号</th>
        <th>库存数量</th>
        <th>成本价</th>
        <th>零售价</th>
        <th>经销价</th>
        <th>备注信息</th>
        <th>公司编号</th>
        <th>最后修改时间</th>
        <th>操作</th>
      </tr> 
    </thead>
    <tbody>
		 <c:forEach items="${sgilist }" var="storeginfo">
	  		<tr>
		  		<td>${storeginfo.gid}</td>
		  		<td>${storeginfo.gname}</td>
		  		<td>${storeginfo.gcategopy}</td>
		  		<td>${storeginfo.gdesp}</td>
		  		<td>${storeginfo.gunit}</td>
		  		<td>${storeginfo.whid}</td>
		  		<td>${storeginfo.storenum}</td>
		  		<td>${storeginfo.pricebuy}</td>
		  		<td>${storeginfo.pricesold}</td>
		  		<td>${storeginfo.priceact}</td>
		  		<td>${storeginfo.remark}</td>
		  		<td>${storeginfo.cid}</td>
		  		<td><fmt:formatDate value="${storeginfo.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	      		<td>
	          		<a href="#" class="layui-btn layui-btn-sm">&#xe642;</a>
	          		<a href="#" class="layui-btn layui-btn-sm layui-btn-danger" onclick="layer.confirm(
	          		'您确定要删除该记录？', 
	          		{icon: 3, title:'提示'}, 
	          		function(index){
	          			layer.close(index);
	          		}
					);">&#xe640;</a>
	      		</td>
			</tr>
  		</c:forEach>
	</tbody>
  </table>
</div>
</body>
</html>