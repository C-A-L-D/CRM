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
    
    <title>My JSP 'showdetail.jsp' starting page</title>
    
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
           <c:forEach items="${shoedetail }" var="u">
                <div class="layui-form-item">
                    <label for="name" class="layui-form-label">
                                              发送人
                    </label>
                    <div class="layui-input-inline">
                        <input type="text"  id="sender1" name="name" required lay-verify="required"
                        autocomplete="off" class="layui-input" value="${u.offMess.sender }">
                        
                    </div>
                </div>
                
                 <div class="layui-form-item">
                    <label for="name" class="layui-form-label">
                                             接收时间
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="name" name="name" required lay-verify="required"
                        autocomplete="off" class="layui-input" value="${u.lasttime }">
                         <fmt:formatDate value="${u.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/>
                    </div>
                </div>
                
                 <div class="layui-form-item">
                    <label for="name" class="layui-form-label">
                                          短信标题
                    </label>
                    <div class="layui-input-inline">
                        <input type="text"  id="name" name="name" required lay-verify="required"
                        autocomplete="off" class="layui-input" value="${u.offMess.title }" style="width:1100px">
                    </div>
                </div>
                
                <div class="layui-form-item layui-form-text" style="width:1209px">
                    <label for="desc" class="layui-form-label">
                    短信内容
                    </label>
                    <div class="layui-input-block">
                        <textarea placeholder="暂无" id="desc" name="desc" class="layui-textarea" >${u.offMess.content }</textarea>
                    </div>
                </div>
           
                <div class="layui-form-item">
                <button class="layui-btn" lay-submit="" lay-filter="" onclick="huifu(${u.detailid})">回复</button>
                 <button class="layui-btn" lay-submit="" lay-filter="">
                 <a style="color:white" title="删除" onclick="return confirm('是否确定删除？')" href="offmessctrl/delete.do?detailid=${u.detailid }">删除</a>
                   </button>
                   
                    <button class="layui-btn" >
                 <a style="color:white" title="返回" href="offmessctrl/offmesslist.do">返回</a>
                   </button>
                   </c:forEach>
                </form>
              </div>
               
              
               <hr style="height:5px">
               
        <div style="display:block">
                <form action="offmessctrl/huifu.do"  οnsubmit="return check(this)"  method="post">
                
               接收人： <input type="text" id="sender" >
                
                <div class="layui-form-item">
                    <label for="title" class="layui-form-label">
                                                    邮件标题
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="title" name="title" style="width:1100px"
                        autocomplete="off" class="layui-input" value="">   
                    </div>
                </div>
               
                 <div class="layui-form-item layui-form-text" style="width:1209px">
                    <label for="content" class="layui-form-label">
                                         短信内容
                    </label>
                    <div class="layui-input-block">
                        <textarea  placeholder="暂无" id="content" name="content" class="layui-textarea" ></textarea>
                    </div>
                </div>
                <center>
                
                  <div class="layui-form-item">
                  <input  class="layui-btn" type=submit name="submit1" value="发送"> 
	                <button class="layui-btn" type="reset">清空 </button>     
	                    <button class="layui-btn">
	                 <a style="color:white" title="返回" href="offmessctrl/offmesslist.do">返回</a>
	                   </button>
                  
		              </div>
		               </center>
               
                 </form>
             
               </div>
               
          
  
    <script>
      var s=document.getElementById('sender1').value;
      document.getElementById('sender').value=s;
      
      
    function huifu(detailid){
     document.getElementById("huifu").style.display="block"; 
    }
    
     function check(form) {
     alert("111");
              if(form.title.value=='') {
                    alert("短信标题不能为空!");
                    form.title.focus();
                    return false;
               }
               if(form.content.value==''){
                    alert("短信内容不能为空!");
                    form.content.focus();
                    return false;
                }
                  document.myform.submit();
            }
    
    </script>
  </body>

</html>