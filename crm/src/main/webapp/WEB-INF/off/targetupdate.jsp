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
    
    <title>My JSP 'targetupdate.jsp' starting page</title>
    
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
    <div class="x-body">
        <form action="" method="post" class="layui-form layui-form-pane">
          
                <div class="layui-form-item layui-form-text" >
                    <label for="desc" class="layui-form-label">
                                        考核指标集名称
                    </label>
                    <div class="layui-input-block">
                      <input type="text"  id="assesstarget" name="assesstarget" required lay-verify="required"
                        autocomplete="off" class="layui-input" value="${t.assesstarget }" >
                        </div>
                </div>
                <input type="hidden" id="targetid" name="targetid" value="${t.targetid }">
                <div class="layui-form-item layui-form-text" >
                    <label for="desc" class="layui-form-label">
                                       考核指标集描述
                    </label>
                    <div class="layui-input-block">
                        <textarea  id="remarks"  required lay-verify="required"  name="remarks" class="layui-textarea" >${t.remarks }</textarea>
                    </div>
                </div>
           
               <center>        
                  <div class="layui-form-item">
                  <button  class="layui-btn"  lay-filter="add" lay-submit="">修改</button>
	                
		           </div>
		       </center>
               
      </form>
  
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
		        url: "offtargetctrl/update.do",
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
  </body>

</html>