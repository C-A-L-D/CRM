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

  </head>
  
  <body >
  <center>
  <h1>办公短消息列表</h1>

  <table border="1" width="80%" cellpadding="0" cellspacing="0" style="text-align:center">
	  <tr>
		  <th>编号</th>
		  <th>标题</th>
		  <th>内容</th>
		  <th>发送人</th>
		  <th>公司编号</th>
		  <th>操作</th>
		  
	  </tr>
	  
	  <c:forEach items="${list }" var="u">
	  <tr>
		  <td>
		     ${u.messid}
		  </td>
		  <td>
		     ${u.title }
		  </td>
		  <td>
		     ${u.content }
		  </td>
	      <td>
	         ${u.sender }
	      </td>
	      <td>
	       ${u.companyid }
	      </td>
	      <td>
	        <fmt:formatDate value="${u.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/>
	      </td>
	      <td>
	          <a href="usersctrl/goupdate.do?uid=${u.messid }">修改</a>
	           /
	          <a href="usersctrl/delete.do?uid=${u.messid }" onclick="return confirm('是否确定删除？')">删除</a>
	      </td>
	  </tr>
  </c:forEach>
  </table>
  
  </center>
 
  </body>
</html>
