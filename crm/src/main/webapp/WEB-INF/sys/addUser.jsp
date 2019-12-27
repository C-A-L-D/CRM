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
    <title>添加账户</title>
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
    <div class="layui-card-header"><span style="color: red;">小提示：</span>默认初始密码为 123456，登录后请及时更换密码！</div>
      <div class="layui-card-body" style="padding: 15px;">
        <form class="layui-form" action="" method="post" lay-filter="component-form-group">        

          <div class="layui-form toolbar layui-form-item">
          	<div class="layui-inline">
              <label class="layui-form-label">
              	<span class="x-red">*</span>持有者姓名
              </label>
              <div class="layui-input-inline">
              	<select id="branchCompanyId" name="sname" id="sssid" class="layui-select" lay-filter="pp" lay-search>
     				<option value="${user.sysUsersInfo.sname }">${user.sysUsersInfo.sname }</option>
     				<c:forEach items="${list }" var="l">
     					<option value="${l.sname }">${l.sname }</option>
     				</c:forEach>
				</select>
              </div>
            </div>
            <div class="layui-inline">
              <label class="layui-form-label">
              	<span class="x-red">*</span>持有者编号
              </label>
              <div class="layui-input-inline">
                <input type="text" name="sid" id="ssid" value="${user.sysUsersInfo.sid }" lay-verify="ssname" autocomplete="on" class="layui-input" readonly="readonly" required="required">
              </div>
            </div>
          </div>
    
          <div class="layui-form-item">
          	<div class="layui-inline">
              <label class="layui-form-label">
              	<span class="x-red">*</span>公司编号
              </label>
              <div class="layui-input-inline">
                <input type="text" name="gongsiid" id="gongsiid" value="" autocomplete="on" class="layui-input" readonly="readonly">
              </div>
            </div>
            <div class="layui-inline">
              <label class="layui-form-label">
              	<span class="x-red">*</span>所属公司
              </label>
              <div class="layui-input-inline">
                <input type="text" name="gname" id="gname" value="" autocomplete="on" class="layui-input" readonly="readonly">
              </div>
            </div>
          </div>      
          
          <div class="layui-form-item">
          	<div class="layui-inline">
              <label class="layui-form-label">
              	<span class="x-red">*</span>账户名称
              </label>
              <div class="layui-input-inline">
                <input type="text" name="uname" id="uname" value="" autocomplete="on" class="layui-input">
              </div>
            </div>
            <div class="layui-inline">
              <label class="layui-form-label">
              	<span class="x-red">*</span>账户状态
              </label>
              <div class="layui-input-inline">
	            	<div class="layui-col-md12">
	              		<input type="checkbox" name="ustate" lay-skin="switch" lay-text="启用|禁用" checked>
	            	</div>
            	</div>
          	</div>
          </div>    
          
          
          
            <div class="layui-form-item layui-layout-admin">
            <div class="layui-input-block">
              <div class="layui-footer" style="left: 0;">
                <button class="layui-btn" lay-submit="" lay-filter="add">确认添加</button>
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
            if($("#sssid").val()==""||$("#sname").val()==""||$("#gongsiid").val()==""||$("#gname").val()==""||$("#uname").val()=="") {
            	layer.alert("必填项不能为空！", {icon: 5});
            	return false;
            }
            $.ajax({
		        type: 'post',
		        url: "addNewUser.do",
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
          
          
          //监听值的改变
         form.on('select(pp)', function(data){
            console.log("数据："+data);
            $.ajax({
		        type: 'post',
		        url: "getUsersInfoGSValue.do?sname="+data.value,
		        data: data.field,
		        success: function (res) {
		            if (res.status == 200) {
		            	var msg = res.msg.split(",");
		                $("#ssid").val(msg[0])
		            	$("#gongsiid").val(msg[1])
		            	$("#gname").val(msg[2])
		            }
		            else {
		            	$("#sname").val(res.msg)
		            	$("#gongsiid").val(res.msg)
		            	$("#gname").val(res.msg)
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