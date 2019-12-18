<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8">
    <title>修改用户信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="<%=basePath %>css/font.css">
    <link rel="stylesheet" href="<%=basePath %>css/xadmin.css">
    <script src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="<%=basePath %>js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body class="form-wrap" >

  <div class="layui-fluid">
    <div class="layui-card">
      <div class="layui-card-header">您所使用的角色编号：${user.uid }</div>
      <div class="layui-card-body" style="padding: 15px;">
        <form class="layui-form" action="" method="post" lay-filter="component-form-group">        
          <div class="layui-form-item">
            <div class="layui-inline">
              <label class="layui-form-label">操作员</label>
              <div class="layui-input-inline">
                <input type="text" name="phone" value="${nowuser.uname }" lay-verify="" class="layui-input" readonly="readonly" disabled="disabled">
              </div>
            </div>
            <div class="layui-inline">
              <label class="layui-form-label">操作员编号</label>
              <div class="layui-input-inline">
                <input type="text" name="opertorid" value="${nowuser.uid }" autocomplete="on" class="layui-input" disabled="disabled">
              </div>
            </div>
          </div>
          
          <div class="layui-form-item">
          	<div class="layui-inline">
              <label class="layui-form-label">角色名称</label>
              <div class="layui-input-inline">
                <input type="text" name="rname" value="${RPOne.rname }" autocomplete="on" class="layui-input">
              </div>
            </div>
          </div>
          
          
           <div class="layui-form-item">
            <label class="layui-form-label">角色描述</label>
            <div class="layui-input-block">
              <input type="text" name="rdescribe" value="${RPOne.rdescribe }" autocomplete="on" placeholder="请输入角色描述信息" class="layui-input">
            </div>
          </div>
         
          
          <div class="layui-form-item">
            <label class="layui-form-label">上级角色</label>
            <div class="layui-input-block">
              <select name="headrid" lay-filter="aihao">
                <option value=""></option>
                <c:forEach items="${allR }" var="all">
                    <option value="${all.rid }" ${all.rid==RPOne.headrid ? "selected":""}>${all.rname }</option>
                </c:forEach>
               </select>
            </div>
          </div>
          
            <div class="layui-form-item layui-layout-admin">
            <div class="layui-input-block">
              <div class="layui-footer" style="left: 0;">
                <button class="layui-btn" lay-submit="" lay-filter="add">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
              </div>
            </div>
          </div>
          
          
        </form>
      </div>
    </div>
  </div>

    
  <script>
layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
          //监听提交
          form.on('submit(add)', function(data){
            console.log(data);
            $.ajax({
		        type: 'post',
		        url: "updateRle.do?rid="+${RPOne.rid },
		        data: data.field,
		        success: function (res) {
		            if (res.status == 200) {
		                layer.alert(res.msg, {icon: 6}, function () {
		                    // 获得frame索引
		                    var index = parent.layer.getFrameIndex(window.name);
		                    //关闭当前frame
		                    parent.layer.close(index);
		                   //刷新页面
		                    parent.location.reload();
		                });
		               
		            } else {
		                layer.alert(res.msg, {icon: 5}, function () {
		                    // 获得frame索引
		                    var index = parent.layer.getFrameIndex(window.name);
		                    //关闭当前frame
		                    parent.layer.close(index);
		                    //刷新页面
		                    parent.location.reload();
		                });
		            }
		        }
		    });
		    return false;
          });
          
        });
  </script>


<style id="LAY_layadmin_theme">.layui-side-menu,.layadmin-pagetabs .layui-tab-title li:after,.layadmin-pagetabs .layui-tab-title li.layui-this:after,.layui-layer-admin .layui-layer-title,.layadmin-side-shrink .layui-side-menu .layui-nav>.layui-nav-item>.layui-nav-child{background-color:#20222A !important;}.layui-nav-tree .layui-this,.layui-nav-tree .layui-this>a,.layui-nav-tree .layui-nav-child dd.layui-this,.layui-nav-tree .layui-nav-child dd.layui-this a{background-color:#009688 !important;}.layui-layout-admin .layui-logo{background-color:#20222A !important;}</style>
</body>


</html>