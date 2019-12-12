<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'gsxxinfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
   <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../css/font.css">
    <link rel="stylesheet" href="../css/xadmin.css">
    <script src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../js/xadmin.js"></script>
  </head>
  
  <body>
      <table class="layui-table" style="text-align: center">
        
      <tr>
      <td style="background-color:#f2f2f2"> 
              公司名称
      </td>
       <td> 
      ${u.gname }
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     公司代码
      </td>
       <td> 
       ${u.gcode }
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     邮箱
      </td>
       <td> 
       ${u.gemail }
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     联系人
      </td>
       <td> 
      ${u.glinkman }
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     公司地址
      </td>
       <td> 
       ${u.gaddress }
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     固定电话
      </td>
       <td> 
       ${u.gtel }
      </td>
     </tr>
     
              <tr>
      <td style="background-color:#f2f2f2"> 
     移动电话
      </td>
       <td> 
       ${u.gphone }
      </td>
     </tr>
     
     
    
     <tr>
      <td style="background-color:#f2f2f2"> 
       传真
       
      </td>
       <td> 
        ${u.gchuanzhen }
       
      </td>
     </tr>
     
     
    <tr >
      <td style="background-color:#f2f2f2"> 
       开户银行
       
      </td>
       <td> 
       ${u.gopenyinghang }
       
      </td>
     </tr>
  
    <tr >
      <td style="background-color:#f2f2f2"> 
    银行账户
       
      </td>
       <td> 
       ${u.gyinghangaccount }
       
      </td>
     </tr>
     
       <tr >
      <td style="background-color:#f2f2f2"> 
            是否有效
       
      </td>
       <td> 
       ${u.gtf }
       
      </td>
        <td style="background-color:#f2f2f2"> 
            最后修改时间
       
      </td>
       <td> 
       ${u.lasttime }
       
      </td>
     </tr>

 
</table>
  </body>
</html>
