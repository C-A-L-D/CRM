<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
    <link rel="stylesheet" href="../../css/font.css">
    <script src="../../js/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../../lib/layui/css/layui.css">
	<script src="../../lib/layui/layui.js"></script>
	<script type="text/javascript" src="../../store/js/addSwi.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

<div class="layui-row">
<form class="layui-form layui-col-md12 x-so">
<input type="text" name="whinfo" placeholder="请输入供应商名称......" autocomplete="off" class="layui-input" style="width:780px;">
<button type="submit" class="layui-btn layui-btn-normal sm"><i class="layui-icon">&#xe615;</i>查找</button>  
<button type="reset" class="layui-btn sm"><i class="layui-icon">&#xe669;</i>清空</button> 
<a display="inline-block" style="float:right;" class="layui-btn layui-btn-danger sm" href="../CRM/store/jsp/addSwi.jsp"><i class="layui-icon">&#xe654;</i></a> 
</form>
</div>

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
          	<th>供应商编号</th>
            <th>供应商名称</th>
            <th>联系人</th>
            <th>联系电话</th>      
            <th>开户银行</th>
            <th>银行账号</th>
            <th>备注信息</th>
            <th>详细信息</th>
            <th >操作</th>
      </tr> 
    </thead>
    <tbody>
       <c:forEach items="${p.list }" var="u">
            <tr>
               <td><center>${u.gysId }</center></td>
               <td><center>${u.gysName }</center></td>
               <td><center>${u.lxr }</center></td>
               <td><center>${u.ydPhone}</center></td>
               <td><center>${u.khbank }</center></td>
               <td><center>${u.yhzh }</center></td>
               <td><center>${u.remark }</center></td>
               <td><center><buttton type="button" class="layui-btn layui-btn-primary" onclick=""></buttton></center></td>
			</tr>
  	   </c:forEach>
	</tbody>
  </table>
                <a href="../gysxxctrl/gyslistpage.do?pageNum=${p.firstPage }">首页</a>
                <a href="../gysxxctrl/gyslistpage.do?pageNum=${p.prePage }">上一页</a>
                <a href="../gysxxctrl/gyslistpage.do?pageNum=${p.nextPage }">下一页</a>
                <a href="../gysxxctrl/gyslistpage.do?pageNum=${p.lastPage }">尾页</a>
                                       当前${p.pageNum }/${p.pages }页，共${p.total }条
     </body>
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
</html>  

     
     
     
     

    
