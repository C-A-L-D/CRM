<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>欢迎页面-L-admin1.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
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
    <div class="x-body" style="position: relative;">
        <form class="layui-form">
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  	联系人编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="lid" name="lid"
                  autocomplete="off" class="layui-input" value="${lxr.lid }" disabled="disabled">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  	客户编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kid" name="kid"
                  autocomplete="off" class="layui-input" value="${lxr.kid }" required lay-verify="required">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  	联系人姓名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="lianxirenxingming" name="lianxirenxingming"
                  autocomplete="off" class="layui-input" value="${lxr.lianxirenxingming }" required lay-verify="required">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  	英文名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yingwenming" name="yingwenming"
                  autocomplete="off" class="layui-input" value="${lxr.yingwenming }">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  	职务
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="zhiwu" name="zhiwu"
                  autocomplete="off" class="layui-input" value="${lxr.zhiwu }">
              </div>
          </div>
          
           <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  	部门
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="bumen" name="bumen"
                  autocomplete="off" class="layui-input" value="${lxr.bumen }">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	手机
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="shouji" name="shouji"
                  autocomplete="off" class="layui-input" value="${lxr.shouji }" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	办公电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="bangongdianhua" name="bangongdianhua"
                  autocomplete="off" class="layui-input" value="${lxr.bangongdianhua }">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	电子邮件
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="dianziyoujian" name="dianziyoujian"
                  autocomplete="off" class="layui-input" value="${lxr.dianziyoujian }" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	地址
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="dizhi" name="dizhi"
                  autocomplete="off" class="layui-input" value="${lxr.dizhi }" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	备注信息
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="beizhuxinxi" name="beizhuxinxi"
                  autocomplete="off" class="layui-input" value="${lxr.beizhuxinxi }" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	公司编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gid" name="gid"
                  autocomplete="off" class="layui-input" value="${gid }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" lay-filter="add" lay-submit="" style="background-color: red;width: 190px;">
                  提交
              </button>
          </div>
          
       <script type="text/javascript">
  			layui.use(['form','layer'], function(){
            $ = layui.jquery;
	        var form = layui.form
	        ,layer = layui.layer;
          
	          //监听提交
	          form.on('submit(add)', function(data){
	            console.log(data);
	            $.ajax({
			        type: 'post',
			        url: "updateKehulianxiren.do",
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
      </form>
    </div>
  </body>
</html>
