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
        <form class="layui-form "  >
      <div class="layui-container">  
       <!-- 1 -->
        <div class="layui-row ">
          <div class="layui-form-item layui-col-xs6" style="clear: none;">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>员工姓名
              </label>
              <div class="layui-input-inline">
                  <input type="hidden" name="sid">
                  <input type="text" id="sname" name="sname" required lay-verify="required"
                  autocomplete="off" class="layui-input" >
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
              <select name="ssex" class="layui-input">    
                  <option value="男"  >男</option>
                  <option value="女" >女</option>
                  <option value="人妖">人妖</option>
                 
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
                <!--   <input type="text" id="sphoto" name="sphoto" required lay-verify="required"
                  autocomplete="off" class="layui-input" > -->
                   <input type="file" name="upload" id="upload" class="layui-input">
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
                  autocomplete="off" class="layui-input" >
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
                  autocomplete="off" class="layui-input" >
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
                  autocomplete="off" class="layui-input" >
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
                   	 <span class="x-red">*</span>	公司名称
              </label>
              <div class="layui-input-inline">
                 <!--  <input type="text" id="gongsiid" name="gongsiid"
                  autocomplete="off" class="layui-input"  lay-verify="required"> -->
                <select id="gongsiid" name="gongsiid" class="layui-input"> 
                   <c:forEach items="${p1 }" var="v1">
                    <option value="${v1.id }">${v1.gname }</option>
                   </c:forEach>
                   
                   </select>
              
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
              <select name="szzmm" class="layui-input">    
                  <option value="群众"  >群众</option>
                  <option value="团员">团员</option>
                  <option value="党员" >党员</option>
                 
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
                  autocomplete="off" class="layui-input"  lay-verify="required">
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
                  autocomplete="off" class="layui-input"  >
                  
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
                  autocomplete="off" class="layui-input" >
              </div>
          </div>
          
             <div class="layui-form-item layui-col-sm6" style="clear: none;">
            <label for="L_pass" class="layui-form-label">
                 		 网上联系详情
            </label>
            <div class="layui-input-inline">
                <input type="text" id="schatLine" name="schatLine"
                autocomplete="off" class="layui-input">
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
            <select name="sshStatus" class="layui-input">    
                  <option value="正在审核" >正在审核</option>
                  <option value="未通过">未通过</option>
                  <option value="已通过" >已通过</option>
                 
                  </select>
              </div>
          </div> 
          
                       <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                   		<span class="x-red">*</span> 职务名称
              </label>
              <div class="layui-input-inline">
                <!--   <input type="text" id="sjobid" name="sjobid"
                  autocomplete="off" class="layui-input" lay-verify="required"> -->
               <select id="sjobid" name="sjobid" class="layui-input"> 
                   <c:forEach items="${p3 }" var="v3">
                    <option value="${v3.jid }"> ${v3.jname }</option>
                   </c:forEach>
                   
                   </select>
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
                     <select name="sstatus" class="layui-input">    
                  <option value="在职"  >在职</option>
                  <option value="休假" >休假</option>
                  <option value="出差" >出差</option>
                 
                  </select>
              </div>
          </div> 
          
                       <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                   		备注
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="sdescribe" name="sdescribe"
                  autocomplete="off" class="layui-input" >
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
                  <textarea rows="5" cols="50"></textarea>
              </div>
          </div>
       
          <div class="layui-form-item ">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" lay-filter="add" lay-submit="">
                  添加
              </button>
          </div>
          
       </div>   
      </form>
    </div>
    
<script type="text/javascript">
  layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
        
          //自定义验证规则
          /* form.verify({
            nikename: function(value){
              if(value.length < 5){
                return '昵称至少得5个字符啊';
              }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            }
          }); */

          //监听提交
          form.on('submit(add)', function(data){
          console.log("123");
           console.log(data.field);
            var fileobj = $("#upload")[0].files[0];
            var formData = new FormData();
            formData.append("upload", fileobj);
            var  params=data.field;
            Object.keys(params).forEach((key) => {
		        formData.append(key, params[key]);
		        
		    });
		    /* var jsonData = {};
            formData.forEach((value, key) => jsonData[key] = value);
            console.log(jsonData); */
             $.ajax({
		        type: 'post',
		        url: "ygtj.do",
		        data: formData,
		        processData: false,//用于对data参数进行序列化处理 这里必须false
                contentType: false, //必须
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
