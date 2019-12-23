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
  <div class="x-body">
        <form class="layui-form ">
      <div class="layui-container">  
       <!-- 1 -->
        <div class="layui-row ">
          <div class="layui-form-item layui-col-xs6" style="clear: none;">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>员工姓名
              </label>
              <div class="layui-input-inline">
                  <input type="hidden" name="sid" value="${u.sid }">
                  <input type="text" id="sname" name="sname" required lay-verify="required"
                  autocomplete="off" class="layui-input" value="${u.sname }" disabled="disabled">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          
          
          <div class="layui-form-item layui-col-xs6"  style="clear: none;">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>员工性别
              </label>
              <div class="layui-input-inline">
                <%--   <input type="text" id="ssex" name="ssex" required lay-verify="required"
                  autocomplete="off" class="layui-input" value="${u.ssex }"> --%>
              <select name="ssex" class="layui-input" disabled="disabled">    
                  <option value="男" ${u.ssex  eq "男" ? "selected":""} >男</option>
                  <option value="女" ${u.ssex  eq "女" ? "selected":""}>女</option>
                  <option value="人妖" ${u.ssex  eq "人妖" ? "selected":""}>人妖</option>
                 
                  </select>
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          </div>
          
          <!-- 2 -->
          <div class="layui-row ">
          <div class="layui-form-item layui-col-xs6"  style="clear: none;">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>员工照片
              </label>
              <div class="layui-input-inline">
                  <%-- <input type="text" id="sphoto" name="sphoto" required lay-verify="required"
                  autocomplete="off" class="layui-input" value="${u.sphoto }" disabled="disabled"> --%>
              <img alt="暂无图片" src="<%=basePath %>upload/${u.sphoto }" 
                    width="40px" height="40px" disabled="disabled">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          
          <div class="layui-form-item layui-col-xs6"  style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>身份证件
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="sidcard" name="sidcard" required lay-verify="required"
                  autocomplete="off" class="layui-input" value="${u.sidcard }" disabled="disabled">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          </div>
          
          <!-- 3 -->
           <div class="layui-row ">
          <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>家庭地址
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="saddressHome" name="saddressHome" required lay-verify="required"
                  autocomplete="off" class="layui-input" value="${u.saddressHome }" disabled="disabled">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          
           <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>现在地址
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="saddressNow" name="saddressNow" required lay-verify="required"
                  autocomplete="off" class="layui-input" value="${u.saddressNow }" disabled="disabled">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          </div>
          
          <!-- 4 -->
          <div class="layui-row ">
                      <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                   	 <span class="x-red">*</span>	公司编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gongsiid" name="gongsiid"
                  autocomplete="off" class="layui-input" value="${u.gongsiid }" lay-verify="required" disabled="disabled">
              </div>
               <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div> 
          
          <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                   		政治面貌
              </label>
              <div class="layui-input-inline">
                 <%--  <input type="text" id="szzmm" name="szzmm"
                  autocomplete="off" class="layui-input" value="${u.szzmm }"> --%>
              <select name="szzmm" class="layui-input" disabled="disabled">    
                  <option value="群众" ${u.szzmm  eq "群众" ? "selected":""} >群众</option>
                  <option value="团员" ${u.szzmm  eq "团员" ? "selected":""}>团员</option>
                  <option value="党员" ${u.szzmm  eq "党员" ? "selected":""}>党员</option>
                 
                  </select>
              </div>
          </div>
          </div>
          
          <div class="layui-row ">
          <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                   		<span class="x-red">*</span>毕业学校
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="sschool" name="sschool"
                  autocomplete="off" class="layui-input" value="${u.sschool }" lay-verify="required" disabled="disabled">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          
          <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                   		 <span class="x-red">*</span>联系电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="sphone" name="sphone" lay-verify="phone"
                  autocomplete="off" class="layui-input" value="${u.sphone }" disabled="disabled">
                  
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          </div>
          
         <div class="layui-row ">
        <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                   		 网上联系方式
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="sphoneLine" name="sphoneLine"
                  autocomplete="off" class="layui-input" value="${u.sphoneLine }" disabled="disabled">
              </div>
          </div>
          
             <div class="layui-form-item layui-col-sm6" style="clear: none;">
            <label for="L_pass" class="layui-form-label">
                 		 网上联系详情
            </label>
            <div class="layui-input-inline">
                <input type="text" id="schatLine" name="schatLine"
                autocomplete="off" class="layui-input" value="${u.schatLine }" disabled="disabled">
            </div>
        </div>
        </div>
      
             <div class="layui-row ">
             <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                   		 审核状态
              </label>
              <div class="layui-input-inline">
                  <%-- <input type="text" id="sshStatus" name="sshStatus"
                  autocomplete="off" class="layui-input" value="${u.sshStatus }"> --%>
            <select name="sshStatus" class="layui-input" disabled="disabled">    
                  <option value="正在审核" ${u.sshStatus  eq "正在审核" ? "selected":""} >正在审核</option>
                  <option value="未通过" ${u.sshStatus  eq "未通过" ? "selected":""}>未通过</option>
                  <option value="已通过" ${u.sshStatus  eq "已通过" ? "selected":""}>已通过</option>
                 
                  </select>
              </div>
          </div> 
          
                       <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                   		<span class="x-red">*</span> 职务编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="sjobid" name="sjobid"
                  autocomplete="off" class="layui-input" value="${u.sjobid }" lay-verify="required" disabled="disabled">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div> 
          </div>
          
          <div class="layui-row ">
                       <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                   		员工状态
              </label>
              <div class="layui-input-inline">
                <%--   <input type="text" id="sstatus" name="sstatus"
                  autocomplete="off" class="layui-input" value="${u.sstatus }"> --%>
                     <select name="sstatus" class="layui-input" disabled="disabled">    
                  <option value="在职" ${u.sstatus eq "在职" ? "selected":""} >在职</option>
                  <option value="休假" ${u.sstatus eq "休假" ? "selected":""}>休假</option>
                  <option value="出差" ${u.sstatus eq "出差" ? "selected":""}>出差</option>
                 
                  </select>
              </div>
          </div> 
          
                       <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                   		备注
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="sdescribe" name="sdescribe"
                  autocomplete="off" class="layui-input" value="${u.sdescribe }" disabled="disabled">
              </div>
          </div>
          </div>
           
         
           
          
       
       <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                   		员工简历
              </label>
              <div class="layui-input-inline">
                 <%--  <input type="text" id="sxl" name="sxl"
                  autocomplete="off" class="layui-input" value="${u.sxl }"> --%>
                  <textarea rows="5" cols="50" disabled="disabled"></textarea>
              </div>
          </div>
       
        
          
       </div>   
      </form>
    </div>
    

  </body>
</html>
