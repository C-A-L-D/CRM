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

    
    <title>My JSP 'gsinfo.jsp' starting page</title>
    
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
  
  
    <body class="layui-anim layui-anim-up">
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">公司管理</a>
        <a>
          <cite>公司信息列表</cite></a>
      </span>
      <a class="layui-btn layui-btn-primary layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:38px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" action="gspage.do">
        <!--   <input class="layui-input" placeholder="开始日" name="start" id="start">
          <input class="layui-input" placeholder="截止日" name="end" id="end"> -->
          <input type="text" name="gname" id="gname" value="${info1.gname }" placeholder="请输入公司名称" autocomplete="off" class="layui-input">
          <button type="submit" class="layui-btn"  lay-submit="" lay-filter="sreach" ><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <button class="layui-btn" onclick="x_admin_show('添加用户','gsgotj.do',500,670)"><i class="layui-icon"></i>添加</button>
        <span class="x-right" style="line-height:40px">共有数据：${p.total } 条</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
           <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>主键</th>
            <th>公司名称</th>
            <th>公司代码</th>
            <th>邮箱</th>
            <th>联系人</th>
            <th>公司地址</th>
            <th>固定电话</th>
            <th>移动电话</th>
            <th>最后修改时间</th>
            <th>操作</th>
          
    </tr>
        </thead>
        <c:forEach items="${p.list }" var="u">
        
           <tr>
                 <td>
              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='${u.id }'><i class="layui-icon">&#xe605;</i></div>
            </td>
           <td>
           ${u.id }
           </td>
            <td>
             
             <a title="查看详情"  class="layui-btn layui-btn-sm layui-btn-normal"  onclick="x_admin_show('详情信息','gsxxlist.do?id=${u.id }',500,670)" href="javascript:;">
                ${u.gname }
            </a>
            </td>
            <td>
             ${u.gcode }
            </td>
           <td>
             ${u.gemail }
            </td>
            <td>
             ${u.glinkman }
            </td>
            <td>
             ${u.gaddress }
            </td>
             <td>
             ${u.gtel }
            </td>
             <td>
             ${u.gphone }
            </td>
            <td>
           
           <fmt:formatDate value="${u.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/>
            </td>
            
         
            <td class="td-manage">
  
    <a title="修改"  class="layui-btn layui-btn-sm layui-btn-normal"  onclick="x_admin_show('修改','gsgoupdate.do?id=${u.id }',500,670)" href="javascript:;">
                修改
    </a>
  
   
  <a title="删除" style="margin-left: 7px;top:5px;" class="layui-btn layui-btn-sm layui-btn-danger" onclick="member_del(this,${u.id })" href="javascript:;">
         <%-- <a title="删除" style="margin-left: 7px;top:5px;" class="layui-btn layui-btn-sm layui-btn-danger" onclick="return gsdel()" href="gsdelete.do?id=${u.id }"> --%>      
                删除
  </a>
  
            </td>
          </tr>
          
        </c:forEach>
       
              <tr>
             <td style="text-align: center;" colspan="11">
             
          <%--       <a href="../sysgsctrl/gspage.do?pageNum=${p.firstPage }">首页</a>
                
                <a href="../sysgsctrl/gspage.do?pageNum=${p.prePage }">上一页</a>
                 <a href="../sysgsctrl/gspage.do?pageNum=${p.nextPage }">下一页</a> 
                <a href="../sysgsctrl/gspage.do?pageNum=${p.lastPage }">尾页</a> --%>
                <a onclick="aa('${p.firstPage }')" href="javascript:;">首页</a>
                <a onclick="aa('${p.prePage }')" href="javascript:;">上一页</a>
                <a onclick="aa('${p.nextPage }')" href="javascript:;">下一页</a>
                <a onclick="aa('${p.lastPage }')" href="javascript:;">尾页</a>
                
                                       当前${p.pageNum }/${p.pages }页，共${p.total }条
             </td>
          </tr>  
          <div id="demo2"></div> 
  </body>
     <script>
     function aa(pageNum){
     /* var gname=document.getElementById("gname").value; */
    /*  console.log(gname); */

var url="../sysgsctrl/gspage.do?pageNum="+pageNum+"&gname="+$("#gname").val();
   console.log(url);
     window.location.href=url;
 
     }
     
     
     
     //自定义样式
  laypage.render({
    elem: 'demo2'
    ,count: 100
    ,theme: '#1E9FFF'
  });
     
     
     
   
     
      layui.use('laydate', function(){
        var laydate = layui.laydate;
        
        //执行一个laydate实例
        laydate.render({
          elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
          elem: '#end' //指定元素
        });
      });

       /*用户-停用*/
      function member_stop(obj,id){
          layer.confirm('确认要停用吗？',function(index){

              if($(obj).attr('title')=='启用'){

                //发异步把用户状态进行更改
                $(obj).attr('title','停用')
                $(obj).find('i').html('&#xe62f;');

                $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                layer.msg('已停用!',{icon: 5,time:1000});

              }else{
                $(obj).attr('title','启用')
                $(obj).find('i').html('&#xe601;');

                $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                layer.msg('已启用!',{icon: 5,time:1000});
              }
              
          });
      }

      /*用户-删除*/
      function member_del(obj,id){
      
          layer.confirm('确认要删除吗？',function(index){
              //发异步删除数据
              $.ajax({
		        type: 'post',
		        url: "gsdelete.do",
		        data: "id="+id,
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
		        url: "gsdeletesy.do",
		        data: "aa="+data,
		        success: function (res) {
		           location.reload();
		        }
		    });
             $(".layui-form-checked").not('.header').parents('tr').remove(); 
        }); 
        
        
       } 
    
    </script>
</html>
