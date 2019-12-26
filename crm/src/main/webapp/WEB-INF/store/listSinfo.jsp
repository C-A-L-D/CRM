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
	<script type="text/javascript" src="store/js/listSinfoPre.js"></script>
  </head>
<body>
<div class="layui-card">



<div class="x-body">
	<!-- 查询 -->
	<div class="layui-row">
<form class="layui-form layui-col-md12 x-so">
<input type="text" name="whinfo" placeholder="请输入要查询的仓库信息......" autocomplete="off" class="layui-input" style="width:700px;">
<button type="submit" class="layui-btn"><i class="layui-icon">&#xe615;</i>查找</button>  
<button type="reset" class="layui-btn"><i class="layui-icon">&#xe669;</i>清空</button> 
<a display="inline-block" style="float:right;" class="layui-btn" href="../CRM/store/jsp/addSwi.jsp"><i class="layui-icon">&#xe654;</i></a> 
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
      <col width="300">
    </colgroup>
    <thead>
      <tr>
        <th><center>销售单详情编号</center></th>
        <th><center>销售单编号</center></th>
        <th><center>商品编号</center></th>
        <th><center>商品价格</center></th>
        <th><center>商品数量</center></th>
        <th><center>出库详情</center></th>
        <th><center>操作人员</center></th>
        <th><center>备注信息</center></th>
        <th><center>公司编号</center></th>
        <th><center>最后修改时间</center></th>
        <th><center>操作</center></th>
      </tr> 
    </thead>
    <tbody>
		 <c:forEach items="${listpage.list}" var="sinfo">
		 
		 <c:set var="flag" scope="session" value="false"/>
		 <c:forEach items="${sessionScope.outofwh}" var="id" end="${exitId}">
		 	<c:if test="${id==sinfo.ssid}">
	  			<c:set var="flag" scope="session" value="true"/>
	          	<c:set var="exitId" value="0"></c:set>
	        </c:if>
	    </c:forEach>
	        
	  		<tr>
		  		<td><center>${sinfo.ssid}</center></td>
		  		<td><center>${sinfo.sid}</center></td>
		  		<td><center>${sinfo.gid}</center></td>
		  		<td><center>${sinfo.gprice}</center></td>
		  		<td><center>${sinfo.gnum}</center></td>
		  		<td><center>
		  			<c:if test="${sessionScope.flag eq 'true'}">
	          			<c:out value="已出库"></c:out>
	          		</c:if>
	          		<c:if test="${sessionScope.flag eq 'false'}">
	          			<c:out value="未出库"></c:out>
	          		</c:if>
				</center></td>
		  		<td><center>${sinfo.gnum}</center></td><!-- 操作人员 -->
		  		<td><center>${sinfo.remark}</center></td>
		  		<td><center>${sinfo.cid}</center></td>
		  		<td><center><fmt:formatDate value="${sinfo.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/></center></td>
	      		<td>
	      		<center>
	      		<div class="layui-btn-container">
	      			<button type="button" class="layui-btn layui-btn-normal layui-btn-sm" onclick="turnto(${sinfo.ssid })"><i class="layui-icon">&#xe642;</i></button>
	          		
	          		<c:if test="${sessionScope.flag eq 'true'}">
	          			<button type="button" class="layui-btn layui-btn-sm layui-btn-disabled"><i class="layui-icon">&#xe609;</i></button>
	          		</c:if>
	          		<c:if test="${sessionScope.flag eq 'false'}">
	          			<button type="button" class="layui-btn layui-btn-normal layui-btn-sm" onclick="postinfo(${sinfo.ssid},${sinfo.sid},${sinfo.gid },${sinfo.gnum})"><i class="layui-icon">&#xe609;</i></button>
	          		</c:if>
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
			<a class="layui-btn layui-btn-primary" href="storeSinfo/listpageSinfo.do?pageNum=${listpage.firstPage}">首页</a>
			<a class="layui-btn layui-btn-primary" href="storeSinfo/listpageSinfo.do?pageNum=${listpage.prePage}">&lt;&lt;上一页</a>
          	<span class="layui-btn"> 当前${listpage.pageNum }/${listpage.pages }页</span>
          	<span class="layui-btn layui-btn-primary">共${listpage.total}条数据</span>
          	<a class="layui-btn layui-btn-primary" href="storeSinfo/listpageSinfo.do?pageNum=${listpage.nextPage}">下一页&gt;&gt;</a>
          	<a class="layui-btn layui-btn-primary" href="storeSinfo/listpageSinfo.do?pageNum=${listpage.lastPage }">尾页</a>       
      	</div>
	</center>
</div>
</body>


</html>