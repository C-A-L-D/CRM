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
                            任务标题
            </label>
            <div class="layui-input-inline">
              <input type="text" value="${task.tasktitle }" readonly="readonly"   autocomplete="off"  class="layui-input" style="width:400px" >
            </div>
          </div>
          
           <div class="layui-form-item" >
           <label for="title" class="layui-form-label">
                            任务发布人
            </label>
            <div class="layui-input-inline">
              <input type="text" value="${task.taskpublisher }" readonly="readonly"   autocomplete="off"  class="layui-input" style="width:400px" >
            </div>
          </div>
          
            <div class="layui-form-item" style="width:600px" >
           <label for="title" class="layui-form-label">
                      被考核人
            </label>
            <div class="layui-input-inline">
                        <input type="text" id="n"  readonly="readonly" autocomplete="off" class="layui-input"style="width:400px"  >
                        <div id="name" style="width:350px;margin-top:-30px;margin-left:10px">
                        <c:forEach items="${taskdetail}" var="d" varStatus="index">
                     ${d.uname}
                    <c:if test="${index.last==false}">
						、
						</c:if>
                </c:forEach> 
                </div>
         </div>
</div>
         
         <div class="layui-form-item">
           <label for="content" class="layui-form-label">
                             考核指标集
            </label>
              <div  class="layui-input-inline" style="width:400px">
              <input type="text" value="${task.assesstarget }" readonly="readonly"   autocomplete="off"  class="layui-input" style="width:400px" >
                
          </div>
           </div>
          
            <div class="layui-form-item">
            <label for="content" class="layui-form-label" style="height: 40px;">
                      开始时间：
            </label>
            <label for="content" class="layui-form-label" style="height: 40px;margin-left:-110px;margin-top:38px">
                      结束时间：
            </label>
              <div  class="layui-input-inline" style="border:1px solid rgb(230,230,230);background-color: white" >
		             <input  type="text"  readonly="readonly"
                        autocomplete="off" class="layui-input" readonly="readonly" value="<fmt:formatDate value="${task.taskstarttime }" pattern="yyyy-MM-dd HH:mm:ss"/>">
  <input type="text"  readonly="readonly"
                        autocomplete="off" class="layui-input" readonly="readonly" value="<fmt:formatDate value="${task.taskendtime }" pattern="yyyy-MM-dd HH:mm:ss"/>">
                        </div>
          </div>


          <div class="layui-form-item layui-form-text" style="width:510px">
           <label for="content" class="layui-form-label">
           任务内容
            </label>
            <div class="layui-input-inline">
              <textarea  readonly="readonly" class="layui-textarea" style="width:510px">${task.taskdetail}</textarea>
            </div>
          </div>
           
         
        </form>
      </div>
  
  <script src="https://unpkg.com/jquery@3.4.1/dist/jquery.js" type="text/javascript" charset="utf-8"></script>
        <script src="https://raw.githack.com/hnzzmsf/layui-formSelects/master/dist/formSelects-v4.min.js" type="text/javascript"
         charset="utf-8"></script>
         <script>
  
   
          
  </script>


<style id="LAY_layadmin_theme">.layui-side-menu,.layadmin-pagetabs .layui-tab-title li:after,.layadmin-pagetabs .layui-tab-title li.layui-this:after,.layui-layer-admin .layui-layer-title,.layadmin-side-shrink .layui-side-menu .layui-nav>.layui-nav-item>.layui-nav-child{background-color:#20222A !important;}.layui-nav-tree .layui-this,.layui-nav-tree .layui-this>a,.layui-nav-tree .layui-nav-child dd.layui-this,.layui-nav-tree .layui-nav-child dd.layui-this a{background-color:#009688 !important;}.layui-layout-admin .layui-logo{background-color:#20222A !important;}</style>
</body>


</html>