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
    <title>权限管理</title>
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
    <div class="x-nav">
		      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">权限管理</a>
        <a>
          <cite>权限信息列表</cite></a>
      </span>
      <a class="layui-btn layui-btn-primary layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:38px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so layui-form-pane">
          <div class="layui-input-inline">
            <select name="cateid">
              <option>规则分类</option>
              <option>文章</option>
              <option>会员</option>
              <option>权限</option>
            </select>
          </div>
          <div class="layui-input-inline">
            <select name="contrller">
              <option>请控制器</option>
              <option>Index</option>
              <option>Goods</option>
              <option>Cate</option>
            </select>
          </div>
          <div class="layui-input-inline">
            <select name="action">
              <option>请方法</option>
              <option>add</option>
              <option>login</option>
              <option>checklogin</option>
            </select>
          </div>
          <input class="layui-input" placeholder="权限名" name="cate_name" >
          <a title="添加角色" class="layui-btn"  onclick="x_admin_show('编辑','goAddRole.do')" href="javascript:;">
                <i class="layui-icon"></i>增加角色
              </a>
        </form>
      </div>
      <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <span class="x-right" style="line-height:40px">总共 ${PC.total } 条数据</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>权限名称</th>
            <th>权限所在分栏</th>
            <th>权限</th>
            <th>备注信息</th>
            <th>最后修改时间</th>
            <th>操作</th>
        </thead>
        <tbody>
<c:forEach items="${PC.list }" var="pc">
          <tr>
            <td>
              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='${pc.pid }'><i class="layui-icon">&#xe605;</i></div>
            </td>
            <td>${pc.pname }</td>
            <td>${pc.sysPowercolumn.cname }</td>
            <td>${pc.ppower }</td>
            <td>${pc.pdescribe }</td>
            <td><fmt:formatDate value="${pc.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            <td class="td-manage">
              <a title="编辑"  onclick="x_admin_show('编辑','goUpdatePower.do?pid='+${pc.pid })" href="javascript:;">
                <i class="layui-icon">&#xe642;</i>
              </a>
              <a title="删除" onclick="member_del(this,'${pc.pid }')" href="javascript:;">
                <i class="layui-icon">&#xe640;</i>
              </a>
            </td>
          </tr>
</c:forEach>
        </tbody>
      </table>
      <div class="page">
        <div>
			<a class="num" href="selectAllRoleAndPower.do?pageNum=${RP.firstPage }">首页</a>
			<a href="selectAllRoleAndPower.do?pageNum=${RP.prePage }">上一页</a>
			<a href="selectAllRoleAndPower.do?pageNum=${RP.pageNum }" style="background-color: RGB(21,193,66)">${RP.pageNum }</a>
			<a class="next" href="selectAllRoleAndPower.do?pageNum=${RP.nextPage }">下一页</a>
			<a class="num" href="selectAllRoleAndPower.do?pageNum=${RP.lastPage }">尾页</a>
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

      /*删除角色*/
      function member_del(obj,id){
          layer.confirm('确认要删除吗？',function(data){
          		$.ajax({
		        type: 'get',
		        url: "delRole.do?rid="+id,
		        data: data.field,
		        success: function (res) {
		            if (res.status == 200) {
		               //发异步删除数据
		              $(obj).parents("tr").remove();
		              layer.msg(res.msg,{icon:1,time:1000});
		               
		            } else {
		                layer.alert(res.msg, {icon: 5}, function () {
		                    
		                });
		            }
		        }
		    });
          });
      }



      function delAll (argument) {

        var dataID = tableCheck.getData();
  
        layer.confirm('确认要删除吗？',function(index){
        	layer.msg('删除成功', {icon: 1});
      		$.ajax({
		        type: 'get',
		        url: "delAllRole.do",
		        data: "aa="+dataID,
		        success: function (res) {
		           //$(obj).parents("tr").remove();
		           layer.msg('已删除!',{icon:1,time:1000},function () {
		              //刷新页面
		              location.reload();
		           });
		        }
		    });
        	 
            //捉到所有被选中的，发异步进行删除
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
      }
    </script>
  </body>

</html>
