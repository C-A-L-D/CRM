 <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
            <span class="x-red">*</span>  采购主题：
              </label>
              <div class="layui-input-inline">
              <input type="text"   name="cgTheme" 
                  autocomplete="off" class="layui-input" lay-verify="required">
              <input type="hidden"   name="cgdId" 
                  autocomplete="off" class="layui-input" lay-verify="">
               </div>
          </div> 
           
                  
          <div class="layui-form-item">
              <label  class="layui-form-label">
            <span class="x-red">*</span>  供应商编号：
              </label>
              <div class="layui-input-inline">
                 
              <select name="gysId" id="gysId" lay-filter="gysId" lay-select="">
              <option value=""></option>          
              <c:forEach items="${gs }" var="u">
               <option value="${u.gysId }">${u.gysId }</option>
              </c:forEach>             
              </select>                         
               </div>              
          </div>
          
                  
           <div class="layui-form-item">
              <label  class="layui-form-label">
          <span class="x-red">*</span> 发票号码：
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="fphm" required 
                  autocomplete="off" class="layui-input" lay-verify="required">
              </div>
          </div>
        
           <div class="layui-form-item">
              <label  class="layui-form-label">
           <span class="x-red">*</span>交货地点：
              </label>
              <div class="layui-input-inline">
                  <input type="text" name="jhplace" required 
                  autocomplete="off" class="layui-input" lay-verify="required">
              </div>
          </div>
          
          
          
          
            <div class="layui-form-item">
              <label  class="layui-form-label">
           <span class="x-red">*</span>交货方式：
              </label>
              <div class="layui-input-inline">
                  <input type="text"  required name="jhway"
                  autocomplete="off" class="layui-input">                                                                
                  <input type="hidden"  name="operator" required value="${bh.operator }"
                  autocomplete="off" class="layui-input">
                                                                          
                  <input type="hidden"  name="remark"  required value="${bh.remark }"
                  autocomplete="off" class="layui-input" >
                  
                  <input type="hidden"  name="gsId"  required value="${bh.gsId }"
                  autocomplete="off" class="layui-input" >
                  
                  <input type="hidden"  name="fkqk"  required value="未付款"
                  autocomplete="off" class="layui-input" >
       
                  <input type="hidden"  name="cgJz"  required value="待采购"
                  autocomplete="off" class="layui-input" >
                 
                 
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
		        url: "cgdadd.do?id="+${bh.id},
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
          
   

   form.on('select(gysId)', function(data){
            
            var id=$("#gysId").val();
            console.log(id);
             console.log("123");
            $.ajax({
		        type: 'post',
		        url: "getGysxx.do",
		        data: "gysId="+id,
		        success: function (info) {
		            console.log(info);
		            $("#gsId").val(info.gsId);
		        
		        }
		    });
         });
          });
 
</script>
  
  
  </body>

</html>


