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
        <form class="layui-form" method="post">
          <div class="layui-form-item">
              <label  class="layui-form-label">
             <span class="x-red">*</span>供应商名称：
              </label>
              <div class="layui-input-inline">
                
                  <input type="text"  name="gysName" required lay-verify="required"
                  autocomplete="off" class="layui-input">
              </div>     
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
              <span class="x-red">*</span>供应商简称：
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="gysJc" lay-verify="required"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
           <div class="layui-form-item">
              <label  class="layui-form-label">
            <span class="x-red">*</span> 联系人：
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="lxr" lay-verify="required"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
        
           <div class="layui-form-item">
              <label  class="layui-form-label">
                                        固定电话：
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="gdPhone"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
            <div class="layui-form-item">
              <label  class="layui-form-label">
              <span class="x-red">*</span>移动电话：
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mbphone"  name="ydPhone" lay-verify="required" 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
      
          
         <div class="layui-form-item">
              <label  class="layui-form-label">
                                        联系传真：
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="lxcz" 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label  class="layui-form-label">
                                        联系地址：
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="lxdz" 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
            <div class="layui-form-item">
              <label  class="layui-form-label">
             <span class="x-red">*</span> 联系邮编：
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="lxyb" lay-verify="required" 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
              <div class="layui-form-item">
              <label  class="layui-form-label">
            <span class="x-red">*</span>  邮箱：
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mail" name="mail" lay-verify="required" 
                  autocomplete="off" class="layui-input" placeholder="格式：xxx@qq.com">
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
           <span class="x-red">*</span>  银行账号：
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="yhzh" lay-verify="required" 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
               <div class="layui-form-item">
              <label  class="layui-form-label">
           <span class="x-red">*</span>  公司账号：
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="gszy"lay-verify="required" 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
        
             <div class="layui-form-item">
              <label  class="layui-form-label">
           <span class="x-red">*</span>   是否有效：
              </label>
                <div class="layui-input-inline">
              <select id="isYx" name="isYx" class="layui-input" > 
              <option>是</option>             
              <option>否</option>                      
              </select>
               </div>            
          </div>
        
           <div class="layui-form-item">
              <label  class="layui-form-label">
                                        备注：
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="remark"  
                  autocomplete="off" class="layui-input">
              </div>
          </div>
        
           <div class="layui-form-item">
              <label  class="layui-form-label">
                                        公司编号：
              </label>
              <div class="layui-input-inline">
                  <input type="text"  name="gsId"  
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
         <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" lay-filter="add" lay-submit="">
                  添加
              </button>
          </div>
      </form>
    </div>
  
 <script>
layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
 form.on('submit(add)', function(data){
            console.log(data);
            $.ajax({
		        type: 'post',
		        url: "gysadd.do",
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

   function check(){
       var a=document.getElementById("mail");
       var b=document.getElementById("mbphone");
       var f=/^\d{10}@qq.com$/;
       if(a.test(f)){
       
       }else{
         alert("邮箱格式错误，请重新输入！")    
       }
       
   }

</script>
  
  
  </body>

</html>

