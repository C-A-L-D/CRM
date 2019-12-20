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
    
    <title>My JSP 'messadd.jsp' starting page</title>
    
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
	  <link rel="stylesheet" type="text/css" href="https://raw.githack.com/hnzzmsf/layui-formSelects/master/dist/formSelects-v4.css" />
       

  </head>
  
  <body class="form-wrap" >

  <div class="layui-fluid">
    
     
      <div class="layui-card-body" style="padding: 15px;">
      
        <form class="layui-form">
        
          <div class="layui-form-item" >
           <label for="title" class="layui-form-label">
            <span class="x-red">*</span> 消息标题
            </label>
            <div class="layui-input-inline">
              <input type="text" name="title" id="title" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input" >
            </div>
            
          </div>
           <label for="title" class="layui-form-label">
            <span class="x-red">*</span>接收人
            </label>
           <div  class="layui-input-inline" >
            <select name="uids" xm-select="select1" >
            <c:forEach items="${sysusers }" var="u">
                <option value="${u.userId}" >${u.uname }</option>
                </c:forEach>
            </select>
        </div>


          <div class="layui-form-item layui-form-text">
           <label for="content" class="layui-form-label">
            <span class="x-red">*</span>消息内容
            </label>
            <div class="layui-input-inline">
              <textarea id="content"  name="content" placeholder="请输入内容" class="layui-textarea"></textarea>
            </div>
          </div>        
          <div class="layui-form-item layui-layout-admin">
            <div class="layui-input-block">
              <div class="layui-footer" style="left: 0;">
              
                <button class="layui-btn" lay-filter="add" lay-submit="">发送</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
              </div>
            </div>
          </div>
        </form>
      </div>
  

    
  <script src="https://unpkg.com/jquery@3.4.1/dist/jquery.js" type="text/javascript" charset="utf-8"></script>
        <script src="https://raw.githack.com/hnzzmsf/layui-formSelects/master/dist/formSelects-v4.min.js" type="text/javascript"
         charset="utf-8"></script>
         <script>
  /*
   layui.config({
    base: '../../../layuiadmin/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index', 'form', 'laydate'], function(){
    var $ = layui.$
    ,admin = layui.admin
    ,element = layui.element
    ,layer = layui.layer
    ,laydate = layui.laydate
    ,form = layui.form;
    
    form.render(null, 'component-form-group');

    laydate.render({
      elem: '#LAY-component-form-group-date'
    });
    */
    
   
   layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
        
          //监听提交
          form.on('submit(add)', function(data){
         
            console.log(data);
            $.ajax({
		        type: 'post',
		        url: "offmessctrl/add.do",
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
		                 //parent.layer.reload();
		               
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