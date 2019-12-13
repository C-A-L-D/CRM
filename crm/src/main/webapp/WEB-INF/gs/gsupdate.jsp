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
    
    
    <title>My JSP 'gsxxinfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
   <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../css/font.css">
    <link rel="stylesheet" href="../css/xadmin.css">
    <script src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../js/xadmin.js"></script>
  </head>
  
  <body>
   <form>
      <table class="layui-table" style="text-align: center">
       
      <tr>
      <td style="background-color:#f2f2f2"> 
              公司名称
      </td>
       <td> 
       <input type="hidden" name="id" value="${u.id }">
        <input type="text" name="gname" value="${u.gname }" >
      
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     公司代码
      </td>
       <td> 
       <input type="text" name="gcode" value="${u.gcode }">
       
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     邮箱
      </td>
       <td> 
       <input type="text" name="gemail" value="${u.gemail }">
       
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     联系人
      </td>
       <td> 
       <input type="text" name="glinkman" value=" ${u.glinkman }">
     
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     公司地址
      </td>
       <td> 
       <input type="text" name="gaddress" value="${u.gaddress }" style="boder=0">
       
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     固定电话
      </td>
       <td> 
       <input type="text" name="gtel" value="${u.gtel }">
       
      </td>
     </tr>
     
              <tr>
      <td style="background-color:#f2f2f2"> 
     移动电话
      </td>
       <td> 
       <input type="text" name="gphone" value=" ${u.gphone }">
      
      </td>
     </tr>
     
     
    
     <tr>
      <td style="background-color:#f2f2f2"> 
       传真
       
      </td>
       <td> 
       <input type="text" name="gchuanzhen" value="${u.gchuanzhen }">
        
       
      </td>
     </tr>
     
     
    <tr >
      <td style="background-color:#f2f2f2"> 
       开户银行
       
      </td>
       <td> 
       <input type="text" name="gopenyinghang" value="${u.gopenyinghang }">
       ${u.gopenyinghang }
       
      </td>
     </tr>
  
    <tr >
      <td style="background-color:#f2f2f2"> 
    银行账户
       
      </td>
       <td>
       <input type="text" name="gyinghangaccount" value="${u.gyinghangaccount }"> 
       ${u.gyinghangaccount }
       
      </td>
     </tr>
     
       <tr >
      <td style="background-color:#f2f2f2"> 
            是否有效
       
      </td>
       <td>
       <input type="text" name="gtf" value=" ${u.gtf }"> 
       ${u.gtf }
       
      </td>
        </tr>
        <tr>
        <td style="background-color:#f2f2f2"> 
            最后修改时间
       
      </td>
       <td> 
       <input type="text" name="lasttime" value="<fmt:formatDate value="${u.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/>">
       
       
      </td>
   </tr>
     <tr>
                    <td colspan="2" style="text-align: center;">
                      <input type="submit" value="提交">
                      <button  class="layui-btn" lay-filter="add" lay-submit="">
                  增加
              </button>
                   </td>
                </tr>
 
</table>
</form>
<script type="text/javascript">
  //监听提交
       layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
        
          //自定义验证规则
        

          //监听提交
          form.on('submit(gsupdate.do)', function(data){
            console.log(data);
            //发异步，把数据提交给php
            layer.alert("增加成功", {icon: 6},function () {
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            return false;
          });
          
          
        });
</script>
  </body>
</html>
