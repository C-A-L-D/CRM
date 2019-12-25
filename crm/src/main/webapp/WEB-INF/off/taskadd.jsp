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
    
    <title>My JSP 'taskadd.jsp' starting page</title>
    
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
       
<script src="<%=basePath %>/js/My97DatePicker/WdatePicker.js" type="text/javascript" defer="defer"  charset="UTF-8"></script>
  </head>
  
  <body class="form-wrap" >

  <div class="layui-fluid">
      <div class="layui-card-body" style="padding: 15px;">
      
        <form class="layui-form layui-form-pane">
          <div class="layui-form-item" >
           <label for="title" class="layui-form-label">
            <span class="x-red">*</span>任务标题
            </label>
            <div class="layui-input-inline">
              <input type="text" name="tasktitle" id="tasktitle"   required lay-verify="required" autocomplete="off" placeholder="请输入标题" class="layui-input" style="width:400px" >
            </div>
          </div>
          <input type="hidden" name="taskpublisher" >
            <div class="layui-form-item" style="width:600px" >
           <label for="title" class="layui-form-label">
            <span class="x-red">*</span>被考核人
            </label>
           <div  class="layui-input-inline" style="width:400px">
            <select name="uids" xm-select="select1"  required lay-verify="required" >
            <c:forEach items="${sysusers }" var="u">
                <option value="${u.sid}" >${u.sname }</option>
                </c:forEach>
            </select>
        </div>
         </div>
         
         <div class="layui-form-item">
           <label for="content" class="layui-form-label">
            <span class="x-red">*</span>考核指标集
            </label>
              <div  class="layui-input-inline" style="width:400px">
            <select  name="assesstarget" required lay-verify="required">           
                <option value="" disabled="disabled" selected="selected">请选择</option>
                <c:forEach items="${targetlist }" var="t">
                <option value="${t.assesstarget}">${t.assesstarget}</option>
                </c:forEach>
            </select>            
          </div>
           </div>
          
            <div class="layui-form-item">
           <label for="content" class="layui-form-label" style="height: 50px">
            <span class="x-red">*</span>有效期
            </label>
              <div  class="layui-input-inline" style="width:400px;border:1px solid rgb(230,230,230);background-color: white" >
		             开始时间:<input name="taskstarttime"  required lay-verify="required" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" /><br>
		             结束时间:<input name="taskendtime"  required lay-verify="required" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
          </div>
          </div>


          <div class="layui-form-item layui-form-text" style="width:510px">
           <label for="content" class="layui-form-label">
            <span class="x-red">*</span>任务内容
            </label>
            <div class="layui-input-inline">
              <textarea id="taskdetail"  name="taskdetail"  required lay-verify="required" placeholder="请输入内容" class="layui-textarea" style="width:510px"></textarea>
            </div>
          </div>
           
            <div class="layui-input-block" style="margin-left:200px">
               <div class="layui-footer" style="left: 0;">
              
                <button class="layui-btn" lay-filter="add" lay-submit="">发布</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
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
		        url: "offtaskctrl/add.do",
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