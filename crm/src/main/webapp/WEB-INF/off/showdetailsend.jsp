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
    
    <title>My JSP 'showdetailsend.jsp' starting page</title>
    
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
                        <input type="text" id="n"  readonly="readonly"
                        autocomplete="off" class="layui-input" >
                        
                        <div id="name" style="margin-top:-30px;margin-left:10px">
                        <c:forEach items="${offmess.offMessdetail}" var="d" varStatus="index">
                     ${d.uname}
                    <c:if test="${index.last==false}">
						、
						</c:if>
                </c:forEach> 
                </div>
                        
              </div>
                </div>
                
                 <div class="layui-form-item">
                    <label for="name" class="layui-form-label">
                                             接收时间
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="name" name="name" required lay-verify="required" readonly="readonly"
                        autocomplete="off" class="layui-input" readonly="readonly" value="<fmt:formatDate value="${offmess.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/>">
                        
                    </div>
                </div>
                
                 <div class="layui-form-item">
                    <label for="name" class="layui-form-label" >
                                          短信标题
                    </label>
                    <div class="layui-input-inline">
                        <input type="text"  id="name" name="name" required lay-verify="required" readonly="readonly"
                        autocomplete="off" class="layui-input" value="${offmess.title }" style="width:450px">
                    </div>
                </div>
                
                <div class="layui-form-item layui-form-text" >
                    <label for="desc" class="layui-form-label">
                    短信内容
                    </label>
                    <div class="layui-input-block">
                        <textarea placeholder="暂无" id="desc"   name="desc" readonly="readonly" class="layui-textarea" >${offmess.content }</textarea>
                    </div>
                </div>
           
                
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
      
            layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
        
             //监听提交
          form.on('submit(add)', function(data){
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
		                    window.parent.location.href='offmessctrl/offmesslist.do';
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