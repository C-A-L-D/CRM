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
    
    <title>My JSP 'assesstarget.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="<%=basePath %>/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="<%=basePath %>/css/font.css">
    <link rel="stylesheet" href="<%=basePath %>/css/xadmin.css">
    <script src="<%=basePath %>/js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="<%=basePath %>/js/xadmin.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
<body>
    <div class="x-nav">
      <span style="font-weight: bold;">考核指标管理</span>
      <a class="layui-btn layui-btn-primary layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:38px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" method="post" action="offtargetctrl/search.do">
        
          <input type="text" id="assesstarget" name="assesstarget"  placeholder="请输入考核指标集名称" autocomplete="off" class="layui-input" style="width:200px">
          <button class="layui-btn" type="submit"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <xblock>
         <button class="layui-btn" onclick="x_admin_show('新建考核指标','offtargetctrl/goadd.do',500,350)"  href="javascript:;"><i class="layui-icon"></i>添加考核指标</button>
        <span class="x-right" style="line-height:40px">共有数据：${assesstarget.total } 条</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
          
            <th>ID</th>
            <th>考核指标集名称</th>
            <th>考核指标集描述</th>
            <th>最后修改时间</th>
            <th>操作</th>
        </thead>
        <tbody>
        <c:forEach items="${assesstarget.list}" var="u">
          <tr>
      
            <td>${u.targetid}</td>
            <td>${u.assesstarget}</td>
            <td>${u.remarks}</td>
            <td> <fmt:formatDate value="${u.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/></td> 
            <td class="td-manage">    
              <a title="编辑"  onclick="x_admin_show('编辑考核指标','offtargetctrl/goupdate.do?targetid=${u.targetid}',500,400)" href="javascript:;">
                <i class="layui-icon">&#xe642;</i>编辑
              </a>
              <a title="删除" onclick="target_del(this,'${u.targetid}')" href="javascript:;">
                <i class="layui-icon">&#xe640;</i>删除
              </a>
            </td>
          </tr>
          </c:forEach>
        </tbody>
      </table>
        
      <div class="page">
          <a class="prev" href="offtargetctrl/targetlist.do?pageNum=${assesstarget.firstPage}">首页</a>
          <a class="num" href="offtargetctrl/targetlist.do?pageNum=${assesstarget.prePage}">&lt;&lt;</a>
          <span class="current"> 当前${assesstarget.pageNum }/${assesstarget.pages }页</span>
          <a class="next" href="offtargetctrl/targetlist.do?pageNum=${assesstarget.nextPage}">&gt;&gt;</a>
          <a class="prev" href="offtargetctrl/targetlist.do?pageNum=${assesstarget.lastPage }">尾页</a>       
      </div>

    </div>
    <script>
    /*用户-删除*/
      function target_del(obj,id){
          layer.confirm('确认删除吗？',function(index){
              //发异步删除数据
              location.href="offtargetctrl/delete.do?targetid="+id;
              $(obj).parents("tr").remove();
              layer.msg('已删除!',{icon:1,time:1000});
             
          });
      }
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
              $(obj).parents("tr").remove();
              layer.msg('已删除!',{icon:1,time:1000});
          });
      }



      function delAll (argument) {

        var data = tableCheck.getData();
  
        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
      }
    </script>
  </body>

</html>
