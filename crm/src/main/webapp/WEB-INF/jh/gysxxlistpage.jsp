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
   
       <div class="layui-row">
       
      
        <form class="layui-form layui-col-md12 x-so" action="../gysxxctrl/gyslistpage.do">
       
        <input type="text" id="gysName" name="gysName" value="${a.gysName }" placeholder="请输入供应商名称" autocomplete="off" class="layui-input">
        <button class="layui-btn"  lay-submit="" lay-filter="submit"><i class="layui-icon">&#xe615;</i></button>
        &emsp;&emsp;
       
          
        </form>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
       <a  class="layui-btn" title="添加" onclick="x_admin_show('添加','gysgoadd.do',650,650)" >
       <i class="layui-icon"></i>	添加供应商</a>
      </div>
  

      <table class="layui-table">    
          <tr>
            <th> <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div></th>
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
          <c:forEach items="${p.list }" var="u">
            <tr>
          <td>
           <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='${u.gysId  }'><i class="layui-icon">&#xe605;</i></div>
             </td>
               <td>
                 ${u.gysId }
               </td>
               <td>
               
                ${u.gysName }
               </td>
               <td>
                ${u.lxr }
               </td>
               <td>
                 ${u.ydPhone}
               </td>
               <td>
                 ${u.khbank }
               </td>
               <td>
                 ${u.yhzh }
               </td>
                <td>
                 ${u.remark }
               </td>
                <td class="td-status">
                 <a  onclick="x_admin_show('','../gysxxctrl/gysxq.do?gysId=${u.gysId }',650,650)" >
                
                 <span class="layui-btn layui-btn-normal layui-btn-mini">查看详情</span></a>
               </td>
              <td class="td-manage">
              <a title="修改" onclick="x_admin_show('编辑','../gysxxctrl/gysgoupdate.do?gysId=${u.gysId }',650,650)" >
               <i class="layui-icon">&#xe642;</i>
				</a>
              <a title="删除" onclick="member_del(this,${u.gysId })" >
              <i class="layui-icon">&#xe640;</i>
               </a>
              </td>  
            </tr>
         </c:forEach>
            <tr>
             <td style="text-align: center;" colspan="10">
               <%--  <a href="../gysxxctrl/gyslistpage.do?pageNum=${p.firstPage }">首页</a>
                <a href="../gysxxctrl/gyslistpage.do?pageNum=${p.prePage }">上一页</a>
                <a href="../gysxxctrl/gyslistpage.do?pageNum=${p.nextPage }">下一页</a>
                <a href="../gysxxctrl/gyslistpage.do?pageNum=${p.lastPage }">尾页</a> --%>
                <a onclick="aa('${p.firstPage }')" href="javascript:;">首页</a>
                <a onclick="aa('${p.prePage }')" href="javascript:;">上一页</a>
                <a onclick="aa('${p.nextPage }')" href="javascript:;">下一页</a>
                <a onclick="aa('${p.lastPage }')" href="javascript:;">尾页</a>                         
                                       
                                       当前${p.pageNum }/${p.pages }页，共${p.total }条
             </td>
          </tr> 
          

      </table>   
 


     </body>

   </html>  
    <script>
      function aa(pageNum){
     /* var gname=document.getElementById("gname").value; */
    /*  console.log(gname); */

   var url="../gysxxctrl/gyslistpage.do?pageNum="+pageNum+"&gysName="+$("#gysName").val();
   console.log(url);
     window.location.href=url;
 
     }
    
    
    
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
      
        function delAll (argument) {

        var data = tableCheck.getData();
      console.log(data);
         layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            
            layer.msg('删除成功', {icon: 1});
            $.ajax({
		        type: 'post',
		        url: "gysdeleteall.do",
		        data: "aa="+data,
		        success: function (res) {
		           location.reload();
		        }
		    });
             $(".layui-form-checked").not('.header').parents('tr').remove(); 
        }); 
        
        
       } 
    
    
    </script>
     
     
     
     

    
