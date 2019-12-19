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
	<script type="text/javascript" src="store/js/listSwiPre.js"></script>
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
<div class="layui-form">
<form>
<input type="text" name="whinfo" placeholder="请输入要查询的仓库信息......" autocomplete="off" class="layui-input" style="display:inline; width:1000px;">
<button type="submit" class="layui-btn layui-btn-normal"><i class="layui-icon">&#xe615;</i>查找</button>  
<button type="reset" class="layui-btn"><i class="layui-icon">&#xe669;</i>清空</button> 
<a display="inline-block" style="float:right;" class="layui-btn layui-btn-danger" href="../CRM/store/jsp/addSwi.jsp"><i class="layui-icon">&#xe654;</i></a> 
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
      <col width="200">
      <col width="200">
      <col width="200">
      <col width="200">
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
	          			<a type="button" class="layui-btn layui-btn-sm" href="storeWhinfo/selectSwi.do?whid=${swi.whid }">
	          				<i class="layui-icon">&#xe642;</i>
	          			</a>
	          			<button type="button" class="btn layui-btn layui-btn-sm layui-btn-danger" onclick="delCheck(${swi.whid})">
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
<input type="hidden" readonly="readonly" id="total" value='${listpage.total}'>
<input type="hidden" readonly="readonly" id="size" value='${listpage.pageSize}'>
<input type="hidden" readonly="readonly" id="paging" value='${listpage.pageNum}'>
<center><div id="swipage"></div></center>

</div>
</body>


</html>