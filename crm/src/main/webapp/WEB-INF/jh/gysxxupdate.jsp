<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  
  <head>
    <meta charset="UTF-8">
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
 
  <div class="x-body" cols>
        <form class="layui-form" action="../gysxxctrl/update.do" method="post"
            enctype="multipart/form-data">
          <div class="layui-form-item">
              <label  class="layui-form-label">
                                       供应商名称：
              </label>
              <div class="layui-input-inline">
                  <input type="hidden"  name="gysId" required lay-verify="required"
                  autocomplete="off" value="${u.gysId }" class="layui-input">
                  <input type="text"  name="gysName" required lay-verify="required"
                  autocomplete="off" value="${u.gysName }" class="layui-input">
              </div>     
          </div>
          <div class="layui-form-item">
              <label  class="layui-form-label">
                                        供应商简称：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.gysJc }" name="gysJc" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
           <div class="layui-form-item">
              <label  class="layui-form-label">
                                       联系人：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.lxr }" name="lxr" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
        
           <div class="layui-form-item">
              <label  class="layui-form-label">
                                        固定电话：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.gdPhone }" name="gdPhone" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
            <div class="layui-form-item">
              <label  class="layui-form-label">
                                        移动电话：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.ydPhone }" name="ydPhone" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
      
          
         <div class="layui-form-item">
              <label  class="layui-form-label">
                                        联系传真：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.lxcz }" name="lxcz" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label  class="layui-form-label">
                                        联系地址：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.lxdz }" name="lxdz" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
            <div class="layui-form-item">
              <label  class="layui-form-label">
                                        联系邮编：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.lxyb }" name="lxyb" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
              <div class="layui-form-item" >
              <label  class="layui-form-label">
                                        邮箱：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.mail }" name="mail" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
          
           <div class="layui-form-item">
              <label  class="layui-form-label">
           <span class="x-red">*</span>     开户银行：
              </label>
              <div class="layui-input-inline">
              <select id="khbank" name="khbank" class="layui-input" > 
              <option>中国人民银行</option>             
              <option>中国工商银行</option>
               <option>中国农业银行</option>
               <option>中国建设银行</option>
               <option>中国邮政储蓄银行</option>
               <option>中国交通银行</option>          
              </select>
               </div>
           
          </div>
          
          
          
          
          
    
              <div class="layui-form-item">
              <label  class="layui-form-label">
                                        银行账号：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.yhzh }" name="yhzh" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
               <div class="layui-form-item">
              <label  class="layui-form-label">
                                        公司账号：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.gszy }" name="gszy" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
        
             <div class="layui-form-item">
              <label  class="layui-form-label">
                                        是否有效：
              </label>
              <div class="layui-input-inline">
                   <input type="text" name="isYx"
                  autocomplete="off" class="layui-input" value="${u.isYx }" >
              </div>
          </div>
        
           <div class="layui-form-item">
              <label  class="layui-form-label">
                                        操作员：
              </label>
              <div class="layui-input-inline">
                   <input type="text" name="isYx"
                  autocomplete="off" class="layui-input" value="${u.operator }" >
              </div>
          </div>
        
           <div class="layui-form-item">
              <label  class="layui-form-label">
                                        备注：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.remark}" name="remark" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
        
           <div class="layui-form-item">
              <label  class="layui-form-label">
                                        公司编号：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.gsId}" name="gsId" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
         <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" lay-filter="update" lay-submit="">
                  修改
              </button>
          </div>
      </form>
    </div>
  
 <script>
layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
 form.on('submit(update)', function(data){
            console.log(data);
            $.ajax({
		        type: 'post',
		        url: "gysupdate.do",
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





