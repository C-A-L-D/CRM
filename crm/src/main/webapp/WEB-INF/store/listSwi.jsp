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
	<script type="text/javascript" src="store/js/listSwiPre.js"></script>
  </head>
  
<body>
<!-- 导航 -->
<div class="x-nav" >
      <span class="layui-breadcrumb" style="visibility: visible;">
        <a href="javascript:location.replace(location.href);">主页</a><span lay-separator="">/</span>
        <a href="javascript:location.replace(location.href);">库存</a><span lay-separator="">/</span>
        <a href="javascript:location.replace(location.href);"><cite>仓库信息</cite></a>
  	  </span>
      	<a class="layui-btn layui-btn-primary layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
      		<i class="layui-icon" style="line-height:38px">ဂ</i>
      	</a>
</div>

<div class="x-body">
	<!-- 查询 -->
	<div class="layui-row">
		<form class="layui-form layui-col-md12 x-so">
			<input type="text" id="whinfo" placeholder="请输入要查询的仓库信息......" autocomplete="off" class="layui-input" style="width:750px;">
			<button type="button" class="btn layui-btn layui-btn-normal" onclick="postinfo($('#whinfo').val())"><i class="layui-icon">&#xe615;</i>查找</button>  
			<button type="reset" class="layui-btn layui-btn-normal"><i class="layui-icon">&#xe669;</i>清空</button> 
			<a  class="layui-btn" href="../CRM/store/jsp/addSwi.jsp" style="float:right"><i class="layui-icon">&#xe654;</i></a> 
		</form>
	</div>

<!-- 表格 -->
	<table class="layui-table">
		<colgroup>
			<col width="200">
      		<col width="200">
      		<col width="200">
      		<col width="200">
      		<col width="300">
      		<col width="200">
    	</colgroup>
    	<thead>
      		<tr>
				<th><center>仓库编号</center></th>
        		<th><center>仓库名称</center></th>
        		<th><center>所属公司编号</center></th>
        		<th><center>备注</center></th>
        		<th><center>最后修改时间</center></th>
        		<th><center>操作</center></th>
      		</tr> 
    	</thead>
    	<tbody>
    		<c:forEach items="${listpage.list}" var="swi">
	  			<tr>
		  			<td><center>${swi.whid}</center></td>
		  			<td><center>${swi.whname}</center></td>
		  			<td><center>${swi.cid}</center></td>
		  			<td><center>${swi.remark}</center></td>
		  			<td><center><fmt:formatDate value="${swi.lastdate }" pattern="yyyy-MM-dd HH:mm:ss"/></center></td>
		  			<td>
	      				<center>
	      					<div class="layui-btn-group">
	      						<a type="button" class="layui-btn layui-btn-sm layui-btn-normal" onclick="getGoods(${swi.whid })"><i class="layui-icon">&#xe65f;</i></a>
	          					<a type="button" class="layui-btn layui-btn-sm" href="storeWhinfo/selectSwi.do?whid=${swi.whid }"><i class="layui-icon">&#xe642;</i></a>
	          					<button type="button" class="btn layui-btn layui-btn-sm layui-btn-danger" onclick="delCheck(${swi.whid})"><i class="layui-icon">&#xe640;</i></button>
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
			<a class="layui-btn layui-btn-primary" href="storeWhinfo/listpageSwi.do?pageNum=${listpage.firstPage}">首页</a>
			<a class="layui-btn layui-btn-primary" href="storeWhinfo/listpageSwi.do?pageNum=${listpage.prePage}">&lt;&lt;上一页</a>
          	<span class="layui-btn"> 当前${listpage.pageNum }/${listpage.pages }页</span>
          	<span class="layui-btn layui-btn-primary">共${listpage.total}条数据</span>
          	<a class="layui-btn layui-btn-primary" href="storeWhinfo/listpageSwi.do?pageNum=${listpage.nextPage}">下一页&gt;&gt;</a>
          	<a class="layui-btn layui-btn-primary" href="storeWhinfo/listpageSwi.do?pageNum=${listpage.lastPage }">尾页</a>       
      	</div>
	</center>
</div>
</body>


</html>