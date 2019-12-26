<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                                       采购单编号：
              </label>
              <div class="layui-input-inline">
                  <input type="hidden"  name="cgXqId" required lay-verify="required"
                  autocomplete="off" value="${u.cgXqId }" class="layui-input">
                  <input type="text"  name="cgdId" required lay-verify="required"
                  autocomplete="off" value="${u.cgdId }" class="layui-input" readonly="readonly">
              </div>     
          </div>
          
         
             <div class="layui-form-item">
              <label  class="layui-form-label">
                                       产品编号：
              </label>
              <div class="layui-input-inline">
              <select id="cpId" name="cpId" lay-filter="cpId" lay-select="" class="layui-input" > 
              <option value=""></option>
              <c:forEach items="${st }" var="s">
               <option ${u.cpId==s.gid ? "selected":"" }>${s.gid }</option>
               
              </c:forEach>             
              </select>
               </div>
          </div>
           <div class="layui-form-item">
              <label  class="layui-form-label">
                                       产品数量：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.cpNumber }" id="cpNumber" name="cpNumber" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
        
           <div class="layui-form-item">
              <label  class="layui-form-label">
                                        产品价格：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.cpPrice }" name="cpPrice" id="cpPrice" required 
                  readonly="readonly" autocomplete="off" class="layui-input">
              </div>
          </div>
          
             <div class="layui-form-item">
              <label  class="layui-form-label">
                                        总价：
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="zj" required readonly="readonly"
                  autocomplete="off" class="layui-input">
                 
              </div>
          </div>
          
          
              <div class="layui-form-item">
              <label  class="layui-form-label">
                                        是否入库：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.isrk }" name="isrk" required 
                  autocomplete="off" class="layui-input" readonly="readonly">
              </div>
          </div>
          
     
         <div class="layui-form-item">
              <label  class="layui-form-label">
                                       操作员：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.operator }" name="operator" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label  class="layui-form-label">
                                        备注信息：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.remark }" name="remark" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
            <div class="layui-form-item">
              <label  class="layui-form-label">
                                        公司编号：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.gsId }" name="gsId" required readonly="readonly"
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
   $(document).ready(function() {
   	$("#cpNumber").keyup(function() {
   		$("#zj").val($("#cpPrice").val()*$("#cpNumber").val())
   	})
   })
 
 
 
layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
 form.on('submit(update)', function(data){
            console.log(data);
            $.ajax({
		        type: 'post',
		        url: "cgdxqupdate.do",
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
          form.on('select(cpId)', function(data){
            console.log(data.value);
            var id=data.value;
            $.ajax({
		        type: 'post',
		        url: "getStoreInfo.do",
		        data: "gid="+id,
		        success: function (info) {
		            console.log(info);
		            $("#cpname").val(info.gname);
		            $("#cpPrice").val(info.pricesold);
		            
		           
		        }
		    });
         });
    });
   

</script>
  
  
  </body>

</html>
