<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'gs.jsp' starting page</title>
    
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
        <a href="">演示</a>
        <a>
          <cite>导航元素</cite></a>
      </span>
      <a class="layui-btn layui-btn-primary layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:38px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form class="layui-form layui-col-md12  layui-form-pane">
           <div class="layui-form-item" id="x-city">
            <label class="layui-form-label">公司联动</label>
            <div class="layui-input-inline">
              <select name="province" lay-filter="gs">
                <option value="">请选择公司</option>
              </select>
            </div>
            <div class="layui-input-inline">
              <select name="city" lay-filter="bm">
                <option value="">请选择部门</option>
              </select>
            </div>
            <div class="layui-input-inline">
              <select name="area" lay-filter="zw">
                <option value="">请选择职务</option>
              </select>
            </div>
          </div>
        </form>
      </div>
      <blockquote class="layui-elem-quote"> </blockquote>
      <pre class="layui-code" lay-title="JavaScript" lay-skin="notepad">
          //xcity城市插件 基于于jquery与layui form 模块，使用之前先确认这两者是否引入 
          //插件文件为 xcity.js,引入 
          select lay-filter 属性值 为必须 "province/city/area"
          //初始化
          $('#x-city').xcity();
          //传默认值 
          $('#x-city').xcity('广东','广州市','东山区');
      </pre>
    </div>
    <script type="text/javascript" src="../js/xcity.js"></script>
    <script>
      layui.use(['form','code'], function(){
        form = layui.form;

        layui.code();

        $('#x-city').xcity('广东','广州市','东山区');

      });
    </script>
  </body>
</html>
