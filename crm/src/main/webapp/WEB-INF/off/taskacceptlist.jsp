<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="java.text.SimpleDateFormat"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tasklist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
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
      <span style="font-weight: bold;">任务接收管理</span>
      <a class="layui-btn layui-btn-primary layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:38px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
         <form   class="layui-form layui-col-md12 x-so" method="post" action="offtaskctrl/searchaccept.do">
          <div class="layui-input-inline">
              <select  name="select1">           
                    <option value="">选择查询条件</option>  
                     <option value="1">任务标题</option> 
                     <option value="2">任务内容</option>
                     <option value="3">任务发布人</option>
                     <option value="4">考核指标</option>
                </select>
              </div>
          <input type="text" name="search1"  placeholder="请输入关键字" autocomplete="off" class="layui-input">
          <button class="layui-btn"  type="submit"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <xblock>
         <span class="x-right" style="line-height:40px">共有数据：${taskacceptlist.total }条</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
           
            <th>任务编号</th>
            <th>任务标题</th>
            <th>任务具体内容</th>
            <th>任务发布人</th>
            <th>考核指标</th>
            <th>开始时间</th>
            <th>结束时间</th>
            <th>状态</th>
            <th>是否完成</th>
            <th>提交审核</th>
        </thead>
        <tbody>
          <c:forEach items="${taskacceptlist.list }" var="u">
          <tr>
          
            <td>${u.id }</td>
            <td>${u.offAssesstask.tasktitle }</td>
            <td>
            <a href="javascript:;" onclick="x_admin_show('考核任务详情','offtaskctrl/taskdetail.do?taskid=${u.taskid}',620,570)" style="text-decoration: underline">获取详情</a>
          </td>
            <td>${u.offAssesstask.taskpublisher }</td>
            <td>${u.offAssesstask.assesstarget }</td>
            <td>
              <fmt:formatDate value="${u.offAssesstask.taskstarttime}" pattern="yyyy-MM-dd HH:mm:ss"/>
           </td>
            <td>
             <fmt:formatDate value="${u.offAssesstask.taskendtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
          </td>
            <td class="td-status">
				  <c:if test="${u.state=='1'}">
           <span class="layui-btn layui-btn-normal layui-btn-mini">已生效</span>
           </c:if>
             <c:if test="${u.state=='2'}">
           <span class="layui-btn layui-btn-normal layui-btn-mini" style="background-color: gray;">已失效</span>
           </c:if>
           </td>
            <td class="td-status">
		   <c:if test="${u.isfinish=='1' }">
           <span class="layui-btn layui-btn-normal layui-btn-mini" style="background-color:#FF0000">未完成</span>
           </c:if>
           <c:if test="${u.isfinish=='2' }">
           <span class="layui-btn layui-btn-normal layui-btn-mini"  style="background-color:rgb(13,195,22) ">已完成</span>
           </c:if>
           </td>        
            <td class="td-manage">
             <c:if test="${u.isfinish=='1'&&u.state=='1'}">
              <a title="提交" onclick="member_del(this,'${u.id }')" href="javascript:;">
                <i class="icon iconfont">&#xe71d;</i>
              </a>
               </c:if>
                <c:if test="${u.state=='2' }">
                                               任务已超时
                </c:if>
                  <c:if test="${u.isfinish=='2' }">
                                               任务已完成
                </c:if>
            </td>
          </tr>
            </c:forEach>
        </tbody>
      </table>
      
        <div class="page">
          <a class="prev" href="offtaskctrl/taskacceptlist.do?pageNum=${taskacceptlist.firstPage}">首页</a>
          <a class="num" href="offtaskctrl/taskacceptlist.do?pageNum=${taskacceptlist.prePage}">&lt;&lt;</a>
          <span class="current"> 当前${taskacceptlist.pageNum }/${taskacceptlist.pages }页</span>
          <a class="next" href="offtaskctrl/taskacceptlist.do?pageNum=${taskacceptlist.nextPage}">&gt;&gt;</a>
          <a class="prev" href="offtaskctrl/taskacceptlist.do?pageNum=${taskacceptlist.lastPage }">尾页</a>       
         </div>

    <script>
     /*用户-提交*/
      function member_del(obj,id){
          layer.confirm('确认提交？',function(index){
              //发异步删除数据
              location.href="offtaskctrl/tijiao.do?id="+id;
             
              layer.msg('已提交，等待审核...',{icon:1,time:1000});
             
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
