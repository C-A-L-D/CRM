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
      <col>
    </colgroup>
    <thead>
      <tr>
        <th><center>采购详情编号</center></th>
        <th><center>采购编号</center></th>
        <th><center>产品编号</center></th>
        <th><center>产品价格</center></th>
        <th><center>产品数量</center></th>
        <th><center>入库详情</center></th>
        <th><center>操作人员</center></th>
        <th><center>备注信息</center></th>
        <th><center>公司编号</center></th>
        <th><center>最后修改时间</center></th>
        <th><center>操作</center></th>
      </tr> 
    </thead>
    <tbody>
    
		 <c:forEach items="${listpage.list}" var="sinfo">
	  		<tr>
		  		<td><center>${sinfo.ssid}</center></td>
		  		<td><center>${sinfoi.sid}</center></td>
		  		<td><center>${sinfo.gid}</center></td>
		  		<td><center>${sinfo.gprice}</center></td>
		  		<td><center>${sinfo.gnum}</center></td>
		  		<td><center>${sinfo.gnum}</center></td><!-- 入库详情 -->
		  		<td><center>${sinfo.gnum}</center></td><!-- 操作人员 -->
		  		<td><center>${sinfo.remark}</center></td>
		  		<td><center>${sinfo.cid}</center></td>
		  		<td><center><fmt:formatDate value="${sinfo.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/></center></td>
	      		<td>
	      		<center>
	          		<a type="button" class="layui-btn layui-btn-sm" href="storeSinfo/selectSinfo.do?whid=${sinfo.ssid }">
	          			<i class="layui-icon">+入库</i>
	          		</a>
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