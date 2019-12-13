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
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">演示</a>
        <a>
          <cite>导航元素</cite></a>
      </span>
      <a class="layui-btn layui-btn-primary layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:38px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so">
          <input class="layui-input" placeholder="开始日" name="start" id="start">
          <input class="layui-input" placeholder="截止日" name="end" id="end">
          <input type="text" name="username"  placeholder="请输入用户名" autocomplete="off" class="layui-input">
          <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <button class="layui-btn" onclick="addmess('发送短信','./admin-add.html')"><i class="layui-icon"></i>发送信息</button>
         <button class="layui-btn" onclick="send()"><i class="layui-icon">&#xe615;</i>查看已发送信息</button>
        <span class="x-right" style="line-height:40px">共有数据：${p.total }条</span>
      </xblock>
      <div id="jieshou">
      
      <!-- 显示已接收短信 -->
      <table class="layui-table">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>ID</th>
            <th>消息标题</th>
            <th>发送人</th>        
            <th>接收时间</th>
            <th>消息状态</th>
            <th>操作</th>
        </thead>
        <tbody>
          <c:forEach items="${p.list }" var="u">
          <tr>
            <td>
              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
            </td>
            <td>${u.messid}</td>
            <td>${u.offMess.title }</td>
            <td>${u.offMess.sender}</td>
             <td>
	         <fmt:formatDate value="${u.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/>
	        </td>
            <td class="td-status">
            <c:if test="${u.messstate=='1'}"><span id="weidu" class="layui-btn layui-btn-normal layui-btn-mini">未读</span></c:if>
            <c:if test="${u.messstate=='2'}"><span id="yidu" class="layui-btn layui-btn-normal layui-btn-mini">已读</span></c:if>
            
              </td>
            <td class="td-manage">
              <a title="查看详情"  href="offmessctrl/showdetail.do?detailid=${u.detailid }">
                <i class="layui-icon">&#xe642;</i>查看详情
              </a>
              <a title="删除" onclick="return confirm('是否确定删除？')" href="offmessctrl/delete.do?detailid=${u.detailid }">
                <i class="layui-icon">&#xe640;</i>删除
              </a>
            </td>
          </tr>
           </c:forEach>
        </tbody>
      </table>
           
      <div class="page">
          <a class="prev" href="offmessctrl/offmesslist.do?pageNum=${p.firstPage}">首页</a>
          <a class="num" href="offmessctrl/offmesslist.do?pageNum=${p.prePage}">&lt;&lt;上一页</a>
          <span class="current"> 当前${p.pageNum }/${p.pages }页</span>
          <a class="next" href="offmessctrl/offmesslist.do?pageNum=${p.nextPage}">下一页&gt;&gt;</a>
          <a class="prev" href="offmessctrl/offmesslist.do?pageNum=${p.lastPage }">尾页</a>       
      </div>
     
 </div>
 
 <!-- 显示已发送短信 -->
  <div id="send" style="display:none">
      <table class="layui-table">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>ID</th>
            <th>消息标题</th>
            <th>接收人</th>        
            <th>发送时间</th>
            <th>消息状态</th>
            <th>操作</th>
        </thead>
        <tbody>
          <c:forEach items="${list }" var="u">
          <tr>
            <td>
              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
            </td>
            <td>${u.messid}</td>
            <td>${u.offMess.title }</td>
            <td>${u.offMess.sender}</td>
             <td>
	         <fmt:formatDate value="${u.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/>
	        </td>
            <td class="td-status">
              <span class="layui-btn layui-btn-normal layui-btn-mini">已读</span></td>
            <td class="td-manage">
              <a title="查看详情"  onclick="x_admin_show('查看详情','admin-edit.html')" href="javascript:;">
                <i class="layui-icon">&#xe642;</i>
              </a>
              <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                <i class="layui-icon">&#xe640;</i>
              </a>
            </td>
          </tr>
           </c:forEach>
   
     
        </tbody>
      </table>
      <div class="page">
          <a class="prev" href="offmessctrl/offmesslist.do?pageNum=${p.firstPage}">首页</a>
          <a class="num" href="offmessctrl/offmesslist.do?pageNum=${p.prePage}">&lt;&lt;上一页</a>
          <span class="current"> 当前${p.pageNum }/${p.pages }页</span>
          <a class="next" href="offmessctrl/offmesslist.do?pageNum=${p.nextPage}">下一页&gt;&gt;</a>
          <a class="prev" href="offmessctrl/offmesslist.do?pageNum=${p.lastPage }">尾页</a>       
      </div>
 </div>
    </div>
            
     
    <script>
    function send(){
     document.getElementById("jieshou").style.display="none";
       document.getElementById("send").style.display="block"; 
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