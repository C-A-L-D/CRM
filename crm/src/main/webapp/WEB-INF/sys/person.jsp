<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
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
    <link rel="shortcut icon" href="<%=basePath %>/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="<%=basePath %>/css/font.css">
    <link rel="stylesheet" href="<%=basePath %>/css/xadmin.css">
</head>
<body>

	<fieldset class="layui-elem-field">
            <legend>个人信息</legend>
            <div class="layui-field-box">
                <table class="layui-table" style="text-align: center;">
                    <tbody>
                        <tr>
                            <th>用户名</th>
                            <td>${nowuser.uname }</td></tr>
                        <tr>
                            <th>密码</th>
                            <td id="pass" style="padding-left: 15%">
                            	<input type="password" value="${nowuser.upassword }" style="width: 50%;border: none;"readonly="readonly">
                            </td>
                        <tr>
                            <th>角色</th>
                            <td></td></tr>
                        <tr>
                            <th>状态</th>
                            <td>${nowuser.ustate }</td></tr>
                        
                    </tbody>
                </table>
            </div>
        </fieldset>
</body>
</html>