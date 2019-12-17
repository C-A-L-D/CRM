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
        <form class="layui-form">
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>公司名称
              </label>
              <div class="layui-input-inline">
                  <input type="hidden" name="id" value="${u.id }">
                  <input type="text" id="gname" name="gname" required lay-verify="required"
                  autocomplete="off" class="layui-input" value="${u.gname }">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>公司代码
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gcode" name="gcode" required lay-verify="required"
                  autocomplete="off" class="layui-input" value="${u.gcode }">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>邮箱
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gemail" name="gemail" required lay-verify="email"
                  autocomplete="off" class="layui-input" value="${u.gemail }">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>联系人
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="glinkman" name="glinkman" required lay-verify="required"
                  autocomplete="off" class="layui-input" value="${u.glinkman }">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>公司地址
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gaddress" name="gaddress" required lay-verify="required"
                  autocomplete="off" class="layui-input" value="${u.gaddress }">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          
           <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>移动电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gphone" name="gphone" required lay-verify="phone"
                  autocomplete="off" class="layui-input" value="${u.gphone }">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   		固定电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gtel" name="gtel"
                  autocomplete="off" class="layui-input" value="${u.gtel }">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   		传真
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gchuanzhen" name="gchuanzhen"
                  autocomplete="off" class="layui-input" value="${u.gchuanzhen }">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   		开户银行
              </label>
              <div class="layui-input-inline">
        <%--           <input type="text" id="gopenyinghang" name="gopenyinghang"
                  autocomplete="off" class="layui-input" value="${u.gopenyinghang }" > --%>
                <select name="gopenyinghang" class="layui-input">    
                  <option value="建设银行" ${u.gopenyinghang eq "建设银行" ? "selected":""} >建设银行</option>
                  <option value="农业银行" ${u.gopenyinghang eq "农业银行" ? "selected":""}>农业银行</option>
                  <option value="交通银行" ${u.gopenyinghang eq "交通银行" ? "selected":""}>交通银行</option>
                  <option value="中国银行" ${u.gopenyinghang eq "中国银行" ? "selected":""}>中国银行</option>
                  </select>
              
              
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   		银行账户
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gyinghangaccount" name="gyinghangaccount"
                  autocomplete="off" class="layui-input" value="${u.gyinghangaccount }" >
              
              
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   		是否有效
              </label>
              <div class="layui-input-inline">
                  <%-- <input type="text" id="gtf" name="gtf"
                  autocomplete="off" class="layui-input" value="${u.gtf }"> --%>
                   <select id="gtf" name="gtf" autocomplete="off" class="layui-input" value="${u.gtf }">
                  <option value="是" ${u.gtf eq "是" ? "selected":""} >是</option>
                  <option value="否" ${u.gtf eq "否" ? "selected":""}>否</option>
                  </select>
             
              </div>
          </div>
       
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" lay-filter="add" lay-submit="">
                  修改
              </button>
          </div>
      </form>
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
		        url: "gsupdate.do",
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
