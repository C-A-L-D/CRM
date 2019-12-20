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
          
                <div class="layui-form-item">
                    <label for="name" class="layui-form-label">
                                              接收人
                    </label>
                    <div class="layui-input-inline">
                        <input type="text"  name="name" required lay-verify="required"
                        autocomplete="off" class="layui-input" value="${shoedetail.offMess.sender }">
                        <input type="hidden" id="receiver" value="${shoedetail.receiverid }">
                         
                    </div>
                </div>
                
                 <div class="layui-form-item">
                    <label for="name" class="layui-form-label">
                                             接收时间
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="name" name="name" required lay-verify="required"
                        autocomplete="off" class="layui-input" readonly="readonly" value="<fmt:formatDate value="${shoedetail.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/>">
                        
                    </div>
                </div>
                
                 <div class="layui-form-item">
                    <label for="name" class="layui-form-label" >
                                          短信标题
                    </label>
                    <div class="layui-input-inline">
                        <input type="text"  id="name" name="name" required lay-verify="required"
                        autocomplete="off" class="layui-input" value="${shoedetail.offMess.title }" style="width:450px">
                    </div>
                </div>
                
                <div class="layui-form-item layui-form-text" >
                    <label for="desc" class="layui-form-label">
                    短信内容
                    </label>
                    <div class="layui-input-block">
                        <textarea placeholder="暂无" id="desc"   name="desc" class="layui-textarea" >${shoedetail.offMess.content }</textarea>
                    </div>
                </div>
           
               
                
                 <button class="layui-btn" >
                 <a title="删除" style="color:white" onclick="mess_del(this,'${u.detailid}')" href="javascript:;">删除</a>
                   </button>
                
                </form>
              
              </div>
              <div style="margin-left: 100px;margin-top: -58px;">
                    <button  class="layui-btn"  onclick="huifu()">回复</button>
                    </div>
               
        <div style="display:none" id="huifu">
        <hr style="height:5px">
                <form    class="layui-form layui-form-pane">
		              <!-- 发送者：--> 
		              <input type="hidden" id="senderid" name="senderid" value="${shoedetail.receiverid }">
		               <!-- 接收人：--> 
		              <input type="hidden" id="receiver" name="receiver" value="${shoedetail.offMess.sender }" >
                  
                
                 <div class="layui-form-item">
                    <label for="title" class="layui-form-label" >
                                          短信标题
                    </label>
                    <div class="layui-input-inline">
                        <input type="text"  id="title" name="title" required lay-verify="required"
                        autocomplete="off" class="layui-input"  style="width:450px">
                    </div>
                </div>
                
                <div class="layui-form-item layui-form-text" >
                    <label for="content" class="layui-form-label">
                       短信内容
                    </label>
                    <div class="layui-input-block">
                        <textarea  id="content"   name="content" class="layui-textarea" ></textarea>
                    </div>
                </div>
                
                <center>
                
                  <div class="layui-form-item">
                  <button  class="layui-btn"  lay-filter="add" lay-submit="">发送</button>
                  
	                <button class="layui-btn" type="reset">清空 </button>     
	                   
		              </div>
		               </center>
               
                 </form>
             
               </div>
               
          
  
    <script>
     /*用户-删除*/
      function mess_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){
              //发异步删除数据
              location.href="offmessctrl/delete.do?detailid="+id;
              $(obj).parents("tr").remove();
              layer.msg('已删除!',{icon:1,time:1000});
             
          });
      }
      
    function huifu(){
     document.getElementById("huifu").style.display="block"; 
    }
    
     function check() {
              if($("#title").val()=='') {
                    alert("短信标题不能为空!");
                   $("#title").focus();
                    return false;
               }
                if($("#content").val()=='') {
                    alert("短信内容不能为空!");
                   $("#content").focus();
                    return false;
               }
                return true;
                  
            }
            
            layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
        
             //监听提交
          form.on('submit(add)', function(data){
            console.log(data);
            $.ajax({
		        type: 'post',
		        url: "offmessctrl/huifu.do?detailid"+${shoedetail.detailid},
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