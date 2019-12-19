<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8">
    <title>欢迎页面-L-admin1.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../css/font.css">
    <link rel="stylesheet" href="../css/xadmin.css">
    <script src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body>
   
<div class="layui-btn-container">

      <table class="layui-table">    
          <tr>
            <th>编号</th>
            <th>产品编号</th>
            <th>交货时间</th>
            <th>状态</th>
            <th>操作员</th>
            <th>备注信息</th>
            <th>公司编号</th>
            <th>最后修改时间</th>            
            <th>操作</th>     
            </tr>
          <c:forEach items="${p.list }" var="u">
            <tr>
           
               <td>
                 ${u.id }
               </td>
               <td>
                ${u.cpId }
               </td>
               <td>
               <fmt:formatDate value="${u.jhTime}" pattern="yyyy-MM-dd"/>
               </td>
               <td>
                 ${u.state}
               </td>
               <td>
                 ${u.operator }
               </td>
                <td>
                 ${u.remark }
               </td>  
               <td>
                 ${u.gsId }
               </td>            
                <td>
             <fmt:formatDate value="${u.ltime}" pattern="yyyy-MM-dd"/>
               </td>                         
               <td  class="td-status">                            
                 <a onclick="x_admin_show('','../cgdctrl/cgdgoadd.do',650,650)" >
                 <span class="layui-btn layui-btn-normal layui-btn-mini">生成采购单</span>
                 </a>                 
               </td>
                
             
                     
            </tr>
         </c:forEach>
            <tr>
             <td style="text-align: center;" colspan="17">
                <a href="../xbhctrl/xbhlistpage.do?pageNum=${p.firstPage }">首页</a>
                <a href="../xbhctrl/xbhlistpage.do?pageNum=${p.prePage }">上一页</a>
                <a href="../xbhctrl/xbhlistpage.do?pageNum=${p.nextPage }">下一页</a>
                <a href="../xbhctrl/xbhlistpage.do?pageNum=${p.lastPage }">尾页</a>
                                       当前${p.pageNum }/${p.pages }页，共${p.total }条
             </td>
          </tr> 
          

      </table>   
 
 </div>

     </body>
     
   </html>  
    	 
    
    