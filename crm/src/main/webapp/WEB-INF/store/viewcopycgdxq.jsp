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
    <link rel="stylesheet" href="../css/font.css">
    <link rel="stylesheet" type="text/css" href="lib/layui/css/modules/layer/default/layer.css">
    <link rel="stylesheet" type="text/css" href="lib/layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="css/xadmin.css">
    <script src="js/jquery.min.js"></script>
	<script src="lib/layui/layui.js"></script>
	<script src="lib/layui/lay/modules/layer.js"></script>
	<script type="text/javascript" src="store/js/listcopycgdPre.js"></script>
  </head>

  
<body>
<div class="layui-card">

<div class="x-body">


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
	</colgroup>
    <thead>
      <tr>
          	<th><center>采购单详情编号</center></th>
            <th><center>采购单编号</center></th>
            <th><center>产品编号</center></th>
            <th><center>产品数量</center></th>
            <th><center>产品价格</center></th>
            <th><center>是否入库</center></th>
            <th><center>操作员</center></th>
            <th><center>备注信息</center></th>
            <th><center>公司编号</center></th>
            <th><center>最后修改时间</center></th>
            <th><center>操作</center></th>
      </tr> 
    </thead>
    <tbody>
    
    	<c:forEach items="${p.list }" var="u">
        <tr>
        	<td><center>${u.cgXqId}</center></td>
           	<td><center>${u.cgdId }</center></td>
            <td><center>${u.cpId }</center></td>
            <td><center>${u.cpNumber}</center></td>
            <td><center>${u.cpPrice }</center></td>
            <td><center>${u.isrk}</center></td>  
            <td><center>${u.operator}</center></td>
            <td><center>${u.remark}</center></td>
            <td><center>${u.gsId }</center></td>
            <td><center><fmt:formatDate value="${u.ltime}" pattern="yyyy-MM-dd"/></center></td>
            <td><center>
            	<c:if test="${u.isrk=='已入库' }">
            		<button type="button" class="layui-btn layui-btn-sm layui-btn-disabled"><i class="layui-icon">&#xe657;</i></button>
				</c:if>
				<c:if test="${u.isrk=='未入库' }">
					<button type="button" class="layui-btn layui-btn-sm layui-btn-normal" onclick="postinfo(${u.cgXqId},${u.cgdId },${u.cpId },${u.cpNumber},${u.cpPrice })" ><i class="layui-icon">&#xe657;</i></button>
				</c:if>
            </center>
        </tr>
  	   </c:forEach>
  	   
	</tbody>
  </table>
  
  <center>
      <div class="layui-elem-field layui-field-title" id="page">
                <a href="../gysxxctrl/gyslistpage.do?pageNum=${p.firstPage }">首页</a>
                <a href="../gysxxctrl/gyslistpage.do?pageNum=${p.prePage }">上一页</a>
                <a href="../gysxxctrl/gyslistpage.do?pageNum=${p.nextPage }">下一页</a>
                <a href="../gysxxctrl/gyslistpage.do?pageNum=${p.lastPage }">尾页</a>
                                       当前${p.pageNum }/${p.pages }页，共${p.total }条
     </div>
   </center>
 </div>
 </div>
 
  <script>
      function member_del(obj,gysId){
      
          layer.confirm('确认要删除吗？',function(index){
              //发异步删除数据
              $.ajax({
		        type: 'post',
		        url: "gysdelete.do",
		        data: "gysId="+gysId,
		        success: function (res) {
		           //$(obj).parents("tr").remove();
		           layer.msg('已删除!',{icon:1,time:1000},function () {
		              //刷新页面
		              location.reload();
		           });
		        }
		    });
          });
      }
    </script>
     </body>
</html>  
