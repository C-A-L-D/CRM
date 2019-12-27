<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>person</title>
    <link rel="shortcut icon" href="<%=basePath %>favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="<%=basePath %>css/font.css">
    <link rel="stylesheet" href="<%=basePath %>css/xadmin.css">
    <script src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../js/xadmin.js"></script>
    
    <link rel="stylesheet" href="<%=basePath %>bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="<%=basePath %>bootstrap-3.3.7-dist/jquery.min.js"></script>
    <script src="<%=basePath %>bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

	<fieldset class="layui-elem-field">
            <legend>个人信息</legend>
            <div class="layui-field-box">
            	<div align="center">
            		<c:if test="${not empty one.sysUsersInfo.sphoto }">
            			<img src="../upload/${one.sysUsersInfo.sphoto }" alt="照片尚未加载出来..." id="test1" title="修改照片..." class="img-circle" style="width: 17%;">
            		</c:if>
           			<c:if test="${empty one.sysUsersInfo.sphoto }">
            			<img src="../images/陈意涵1.jpg" alt="照片尚未加载出来..." id="test1" title="修改照片..." class="img-circle" style="width: 17%;">
            		</c:if>
           			<span style="vertical-align: bottom;opacity: 0.4;margin-left: -40px;">(上传照片...)</span>
           			<a onclick="x_admin_show('修改','goUpdatePassword.do')" href="javascript:;">
           				<button class="layui-btn layui-btn-warm" style="float: right;">修改密码</button>
           			</a>
                </div>
				
                <table class="layui-table" style="text-align: center;">

                    <tbody>		
	                       <tr>
	                           <th>昵称</th>
	                           <td>${nowuser.uname }</td></tr>
	                       <tr>
	                           <th>实名</th>
	                           <td>${one.sysUsersInfo.sname }</td></tr>
	                       <tr>
	                           <th>所在公司</th>
	                           <td>${selectGSOne.gname }</td></tr>
	                       <tr>
	                           <th>所在部门</th>
	                           <td>${one.sysDepartment.dname }</td></tr>
	                       <tr>
	                           <th>职务</th>
	                           <td>${one.sysJobinfo.jname }</td></tr>
	                       <tr>
	                           <th>角色</th>
	                           <td>${role.sysRole.rname }</td></tr>   
	                       <tr>
	                           <th>联系电话</th>
	                           <td>${one.sysUsersInfo.sphone }</td></tr>
	                       <tr>
	                           <th>账户状态</th>
	                           <td>${nowuser.ustate=="on" ? "正常":"异常" }</td></tr>
	                       <tr>
	                           <th>最后修改时间</th>
	                           <td>
	                           	<fmt:formatDate value="${nowuser.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/>
	                           </td></tr>
                    </tbody>
                </table>
            </div>
        </fieldset>
        
<script type="text/javascript" src="../lib/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
layui.use('upload', function(){
  var $ = layui.jquery
  ,upload = layui.upload;
  
  //普通图片上传
  var uploadInst = upload.render({
  	type: 'get',
    elem: '#test1',
    url: 'uploadFile.do',
    before: function(obj){
      //预读本地文件示例，不支持ie8
      obj.preview(function(index, file, result){
        $('#test1').attr('src', result); //图片链接（base64）
      });
    },
    done: function(res){
      //如果上传失败
      if (res.status == 200) {
      	 return layer.msg(res.msg);   
      }  
      if (res.status == 400){
        return layer.msg(res.msg);   
      }
    }
    ,error: function(){
      //演示失败状态，并实现重传
      var demoText = $('#demoText');
      demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
      demoText.find('.demo-reload').on('click', function(){
        uploadInst.upload(); 
      });
    }

   
    
  });
  });
  </script>        
</body>
</html>