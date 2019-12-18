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
    <script src="js/jquery.min.js"></script>
	<script src="lib/layui/layui.js"></script>
	<script src="lib/layui/lay/modules/layer.js"></script>
	<script type="text/javascript" src="storegoodsinfo/js/storeginfopre.js"></script>
  </head>
<body>
<div class="layui-card">

<!-- 导航 -->
<div class="x-nav">
      <span class="layui-breadcrumb" style="visibility: visible;">
        <a href="">库存</a><span lay-separator="">/</span>
        <a href="">库存商品表</a><span lay-separator="">/</span>
        <a>
          <cite>导航元素</cite></a>
      </span>
</div>


<!-- 查询 -->
<form class="layui-form">
<input type="text" name="gid" placeholder="请输入要查询的商品编号......" autocomplete="off" class="layui-input" style="display:inline; width:500px;">
<input type="text" name="gname" placeholder="请输入要查询的商品名称......" autocomplete="off" class="layui-input" style="display:inline; width:500px;">
<button type="submit" class="layui-btn layui-btn-normal"><i class="layui-icon">&#xe615;</i>查找</button>  
<button type="reset" class="layui-btn"><i class="layui-icon">&#xe669;</i>清空</button>  
<a type="reset" class="layui-btn layui-btn-danger" href="../CRM/storegoodsinfo/jsp/addsginfo.jsp"><i class="layui-icon">&#xe654;</i></a>
</form>


<!-- 表格 -->
  <table class="layui-table">
    <colgroup>
      <col width="200">
      <col width="200">
      <col width="200">
      <col width="200">
      <col width="200">
      <col width="200">
	  <col width="200">
      <col width="250">
      <col>
    </colgroup>
    <thead>
      <tr>
        <th><center>商品编号</center></th>
        <th><center>商品名称</center></th>
        <th><center>商品类别</center></th>
        <th><center>规格说明</center></th>
        <th><center>单位</center></th>
      <!--   <th><center>仓库编号</center></th>   
        <th><center>库存数量</center></th>  -->
        <th><center>成本价</center></th>
       <th><center>零售价</center></th>
      <!--   <th><center>经销价</center></th>
        <th><center>备注信息</center></th>
        <th><center>公司编号</center></th>
        <th><center>最后修改时间</center></th>   --> 
        <th><center>操作</center></th>
      </tr> 
    </thead>
    <tbody>
		 <c:forEach items="${sgilistPage.list}" var="storeginfo">
	  		<tr>
		  		<td><center>${storeginfo.gid}</center></td>
		  		<td><center>${storeginfo.gname}</center></td>
		  		<td><center>${storeginfo.gcategopy}</center></td>
		  		<td><center>${storeginfo.gdesp}</center></td>
		  		<td><center>${storeginfo.gunit}</center></td>
		  	<!-- 	<td><center>${storeginfo.whid}</center></td>   
		  		<td><center>${storeginfo.storenum}</center></td>  -->
		  		<td><center>${storeginfo.pricebuy}</center></td>
		  		<td><center>${storeginfo.pricesold}</center></td>
		  	 <!--	<td><center>${storeginfo.priceact}</center></td>
		  		<td><center>${storeginfo.remark}</center></td>
		  		<td><center>${storeginfo.cid}</center></td>
		  		<td><center><fmt:formatDate value="${storeginfo.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/></center></td>
		  	-->	
	      		<td>
	      		<center>
	      			<div class="layui-btn-group">
	      				<button type="button" class="layui-btn layui-btn-sm layui-btn-normal">
	          				<i class="layui-icon">&#xe65f;</i>
	          			</button>
	          			<button type="button" class="layui-btn layui-btn-sm"><i class="layui-icon">&#xe642;</i></button>
	          			<button type="button" class="btn layui-btn layui-btn-sm layui-btn-danger" onclick="delCheck(${storeginfo.gid})">
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
<input type="hidden" readonly="readonly" id="total" value='${sgilistPage.total}'>
<input type="hidden" readonly="readonly" id="size" value='${sgilistPage.pageSize}'>
<input type="hidden" readonly="readonly" id="paging" value='${sgilistPage.pageNum}'>
<center><div id="demo7"></div></center>

</div>
</body>


</html>