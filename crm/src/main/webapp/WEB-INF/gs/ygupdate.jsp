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
    <link rel="stylesheet" type="text/css" href="../lib/layui/css/global.css">

  <link rel="stylesheet" type="text/css" href="../lib/layui/css/layui.css">
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
        <form class="layui-form " >
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
                  autocomplete="off" class="layui-input" value="${u.sname }">
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
                 <%--  <input type="text" id="sphoto" name="sphoto" required lay-verify="required"
                  autocomplete="off" class="layui-input" value="${u.sphoto }"> --%>
               <input type="file" name="upload"  id="upload" >
               <input type="hidden" name="sphoto"  id="sphoto" value="${u.sphoto }">
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
                  <input type="text" id="sidcard" name="sidcard" required lay-verify="sfz"
                  autocomplete="off" class="layui-input" value="${u.sidcard }">
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
                <!--   <input type="text" id="saddressHome" name="saddressHome" required lay-verify="required"
                  autocomplete="off" class="layui-input" > -->
                 <div class="layui-input-inline">
                 <c:forEach items="${ssq}" var="s">
          
                
              <select name="province" id="province" lay-filter="sf" lay-select="">
                <option value="">${s}</option>
              </select>
              </c:forEach>
            </div>
            <div class="layui-input-inline">
              <select name="city" id="city" lay-filter="cs" lay-select="">
                <option value="">请选择城市</option>
              </select>
            </div>
            <div class="layui-input-inline">
              <select name="area" id="area" lay-filter="qu" lay-select="">
                <option value="">请选择区</option>
              </select>
            </div>
                  
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
                  autocomplete="off" class="layui-input" value="${u.saddressNow }">
              </div>
              
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          </div>
          
       <%--     <div class="layui-row ">
          <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>家庭地址
              </label>
              <div class="layui-input-inline">
                   <input type="text" id="saddressHome" name="saddressHome" required lay-verify="required"
                  autocomplete="off" class="layui-input" value="${u.saddressHome }">
                            <div class="layui-input-inline"> 
              
              <select name="province" id="province" lay-filter="sf" lay-select="">
              <c:forEach items="${ssq}" var="s">
                <option value="${s}">${s}</option>
                </c:forEach>
              </select>
            </div>
            <div class="layui-input-inline">
              <select name="city" id="city" lay-filter="cs" lay-select="">
                <option value="">请选择城市</option>
              </select>
            </div>
            <div class="layui-input-inline">
              <select name="area" id="area" lay-filter="qu" lay-select="">
                <option value="">请选择区</option>
              </select>
            </div>   

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
                  autocomplete="off" class="layui-input" value="${u.saddressNow }">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          </div>
           --%>
          <!-- 4 -->
          <div class="layui-row ">
                      <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                   	 <span class="x-red">*</span>	公司名称
              </label>
              <div class="layui-input-inline">
                <%--   <input type="text" id="gongsiid" name="gongsiid"
                  autocomplete="off" class="layui-input" value="${u.gongsiid }" lay-verify="required"> --%>
            <select id="gongsiid" name="gongsiid" class="layui-input" lay-filter="gs" lay-select="">                 
           <c:forEach items="${p1 }" var="v1">
             <option value="${v1.id }" ${v1.id==u.gongsiid ? "selected":"" }>${v1.gname }</option>
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
                  autocomplete="off" class="layui-input" value="${u.sschool }" lay-verify="required">
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
                  autocomplete="off" class="layui-input" value="${u.sphone }" >
                  
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
                  autocomplete="off" class="layui-input" value="${u.sphoneLine }">
              </div>
          </div>
          
             <div class="layui-form-item layui-col-sm6" style="clear: none;">
            <label for="L_pass" class="layui-form-label">
                 		 网上联系详情
            </label>
            <div class="layui-input-inline">
                <input type="text" id="schatLine" name="schatLine"
                autocomplete="off" class="layui-input" value="${u.schatLine }">
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
                  <option value="正在审核" ${u.sshStatus  eq "正在审核" ? "selected":""} >正在审核</option>
                  <option value="未通过" ${u.sshStatus  eq "未通过" ? "selected":""}>未通过</option>
                  <option value="已通过" ${u.sshStatus  eq "已通过" ? "selected":""}>已通过</option>
                 
                  </select>
              </div>
          </div> 
          
                       <div class="layui-form-item layui-col-sm6" style="clear: none;">
              <label for="L_pass" class="layui-form-label">
                   		<span class="x-red">*</span> 职务名称
              </label>
              <div class="layui-input-inline">
           <%--        <input type="text" id="sjobid" name="sjobid"
                  autocomplete="off" class="layui-input" value="${u.sjobid }" lay-verify="required"> --%>
            <select id="sjobid" name="sjobid" class="layui-input">                 
            <c:forEach items="${p3 }" var="v3">
              <option value="${v3.jid }" ${v3.jid==u.sjobid ? "selected":"" }>${v3.jname }</option>
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
                  autocomplete="off" class="layui-input" value="${u.sdescribe }">
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
              <button  class="layui-btn" lay-filter="update" lay-submit="">
                  修改
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
          form.verify({
            sfz: function(value){
              if(value.length!=18){
                return '身份证必须得18个数字啊';
              }
            }
           /*  ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            } */
          }); 
          //监听提交
        form.on('submit(update)', function(data){
              console.log(data.field);
            var fileobj = $("#upload")[0].files[0];
            var formData = new FormData();
            formData.append("upload", fileobj);
            var  params=data.field;
            Object.keys(params).forEach((key) => {
		        formData.append(key, params[key]);
		        
		    }); 
		     console.log("123");
            $.ajax({
		        type: 'post',
		        url: "ygupdate.do",
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
          
          //
         form.on('select(gs)', function(data){
         console.log(data);
       
          layer.msg($("#gongsiid").val()); 
        var   id=$("#gongsiid").val(); 
       /*  alert($("#gongsiid").val()) */
          $.ajax({
	            type: 'post',
			    url: "yggl.do",
			    data: "gongsiid="+id,
	            success: function (list) {
	            console.log(list);
	              
            	  $("#sjobid").empty();
            	   
            	  $("#sjobid").append("<option value=''>-- 请选择 --</option>");
            	  for(var i=0;i<list.length;i++){
            	     $("#sjobid").append("<option value='"+list[i].jid+"'>"+list[i].jname+"</option>")
            	  }
            	  console.log($("#sjobid").html());
                  form.render('select');
                }
           }); 
              
         }); 
          
        });
</script>
  </body>
</html>
