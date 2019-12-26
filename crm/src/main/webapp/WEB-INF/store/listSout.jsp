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
	<script type="text/javascript" src="store/js/listSoutPre.js"></script>
  </head>
<body>
<div class="layui-card">

<!-- 导航 -->
<div class="x-nav">
      <span class="layui-breadcrumb" style="visibility: visible;">
        <a href="javascript:location.replace(location.href);">主页</a><span lay-separator="">/</span>
        <a href="javascript:location.replace(location.href);">库存</a><span lay-separator="">/</span>
        <a href="javascript:location.replace(location.href);"><cite>销售详情</cite></a>
      </span>
      <a class="layui-btn layui-btn-primary layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
      		<i class="layui-icon" style="line-height:38px">ဂ</i>
      	</a>
</div>

<div class="x-body">
<!-- 查询 -->
<div class="layui-row">
<form class="layui-form layui-col-md12 x-so">
<input type="text" id="searchinfo" placeholder="请输入要查询的订单的信息......" autocomplete="off" class="layui-input" style="width:750px;">
<button type="button" class="layui-btn" onclick="postinfo($('#searchinfo').val())"><i class="layui-icon">&#xe615;</i>查找</button>  
<button type="reset" class="layui-btn"><i class="layui-icon">&#xe669;</i>清空</button> 
<a style="float:right;" class="layui-btn" href="../CRM/store/jsp/addSwi.jsp"><i class="layui-icon">&#xe654;</i></a> 
</form>
</div>



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
      <col width="200">
      <col width="200">
      <col width="200">
      <col width="200">
      <col width="400">
      <col>
    </colgroup>
    <thead>
      <tr>
        <th><center>销售单编号</center></th>
        <th><center>制单日期</center></th>
        <th><center>发票编号</center></th>
        <th><center>用户编号</center></th>
        <th><center>销售金额</center></th>
        <th><center>销售出库状态</center></th>
        <th><center>是否返利</center></th>
        <th><center>订单状态</center></th>
        <th><center>备注信息</center></th>
        <th><center>公司编号</center></th>
        <th><center>最后修改时间</center></th>
        <th><center>操作</center></th>
      </tr> 
    </thead>
    <tbody>
    
		 <c:forEach items="${listpage.list}" var="sout">
	  		<tr>
		  		<td><center>${sout.sid}</center></td>
		  		<td><center><fmt:formatDate value="${sout.maketime }" pattern="yyyy-MM-dd HH:mm:ss"/></center></td>
		  		<td><center>${sout.tid}</center></td>
		  		<td><center>${sout.guid}</center></td>
		  		<td><center>${sout.sprice}</center></td>
		  		<td><center>${sout.sstatus}</center></td>
		  		<td><center>${sout.isanti}</center></td>
		  		<td><center>${sout.lstatus}</center></td>
		  		<td><center>${sout.remark}</center></td>
		  		<td><center>${sout.cid}</center></td>
		  		<td><center><fmt:formatDate value="${sout.lastdate }" pattern="yyyy-MM-dd HH:mm:ss"/></center></td>
	      		<td>
	      		<center>
	      			<div class="layui-btn-group">
	      			<div class="layui-btn-container">
	      				<button type="button" class="layui-btn layui-btn-normal layui-btn-sm" onclick="postSinfo(${sout.sid })">
	          				<i class="layui-icon">&#xe65f;</i>
	          			</button>
	          			<a type="button" class="layui-btn layui-btn-normal  layui-btn-sm" href="storeSout/selectSout.do?sid=${sout.sid }">
	          				<i class="layui-icon">&#xe642;</i>
	          			</a>
	          		</div>
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
			<a class="layui-btn layui-btn-primary" href="storeSout/listpageSout.do?pageNum=${listpage.firstPage}">首页</a>
			<a class="layui-btn layui-btn-primary" href="storeSout/listpageSout.do?pageNum=${listpage.prePage}">&lt;&lt;上一页</a>
          	<span class="layui-btn"> 当前${listpage.pageNum }/${listpage.pages }页</span>
          	<span class="layui-btn layui-btn-primary">共${listpage.total}条数据</span>
          	<a class="layui-btn layui-btn-primary" href="storeSout/listpageSout.do?pageNum=${listpage.nextPage}">下一页&gt;&gt;</a>
          	<a class="layui-btn layui-btn-primary" href="storeSout/listpageSout.do?pageNum=${listpage.lastPage }">尾页</a>       
      	</div>
	</center>

</div>
</div>
</body>


</html>