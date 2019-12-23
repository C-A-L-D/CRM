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
    <title>用户管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="<%=basePath %>favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="<%=basePath %>css/font.css">
    <link rel="stylesheet" href="<%=basePath %>css/xadmin.css">
    <script src="<%=basePath %>js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="<%=basePath %>js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body>
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">账户管理</a>
        <a>
          <cite>账户列表</cite></a>
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
        <button class="layui-btn" onclick="x_admin_show('添加账户','addUser.do')"><i class="layui-icon"></i>添加</button>
        <span class="x-right" style="line-height:40px">总共 ${allUsersInfo.total } 条数据</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>用户账号</th>
            <th>用户姓名</th>
            <th>联系电话</th>
            <th>身份</th>
            <th>任职公司</th>
            <th>用户状态</th>
            <th>简介</th>
            <th>上次操作时间</th>
            <th>操作</th>
        </thead>
        <tbody>
  <c:forEach items="${allUsersInfo.list }" var="all">
          <tr>
            <td>
              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
            </td>
            <td>${all.uname }</td>
            <td>${all.sysUsersInfo.sname }</td>
            <td>${all.sysUsersInfo.sphone }</td>
            <td>${all.sysRole.rname }</td>
            <td>${all.sysGongsiinfo.gname }</td>
            <td class="td-status">
              <span class="layui-btn layui-btn-normal layui-btn-mini ${all.ustate=='on' ? '1' : 'layui-btn-disabled' }">${all.ustate=="on" ? "已启用":"已停用" }</span></td>
            <td>${all.sysUsersInfo.sdescribe }</td>
            <td><fmt:formatDate value="${all.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            <td class="td-manage">
              <a onclick="member_stop(this,'${all.userId }')" href="javascript:;"  title="${all.ustate=='on' ? '停用':'启用' }">
                <i class="layui-icon">${all.ustate=='on' ? '&#xe601;' : '&#xe62f;' }</i>
              </a>
              <a title="编辑"  onclick="x_admin_show('修改账户','goUpdateUser.do?userId='+${all.userId })" href="javascript:;">
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
        <div>
			<a class="num" href="allUsersInfo.do?pageNum=${allUsersInfo.firstPage }">首页</a>
			<a href="allUsersInfo.do?pageNum=${allUsersInfo.prePage }">上一页</a>
			<a href="allUsersInfo.do?pageNum=${allUsersInfo.pageNum }" style="background-color: RGB(21,193,66)">${allUsersInfo.pageNum }</a>
			<a class="next" href="allUsersInfo.do?pageNum=${allUsersInfo.nextPage }">下一页</a>
			<a class="num" href="allUsersInfo.do?pageNum=${allUsersInfo.lastPage }">尾页</a>
        </div>
      </div>

    </div>
    <script>
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
          layer.confirm('确认修改用户状态吗？',function(data){

				if($(obj).attr('title')=='启用'){
					//发异步把用户状态进行更改
	                $(obj).attr('title','停用')
	                $(obj).find('i').html('&#xe601;');
	
	                $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
	                layer.msg('已启用!',{icon: 5,time:1000});
	              }
	              else {
	                $(obj).attr('title','启用')
	                $(obj).find('i').html('&#xe62f;');
	
	                $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
	                layer.msg('已停用!',{icon: 5,time:1000});
	               
              	  }

			$.ajax({
		        type: 'get',
		        url: "updateUserStatus.do?userId="+id,
		        data: data.field,
		        success: function (res) {

		           
		        }
		    });    
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