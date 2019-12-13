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
   <form  action="gstj.do" method="post"
            enctype="multipart/form-data">
      <table class="layui-table" style="text-align: center">
       
      <tr>
      <td style="background-color:#f2f2f2"> 
              公司名称
      </td>
       <td> 
       <input type="hidden" name="id" >
        <input type="text" name="gname" >
      
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     公司代码
      </td>
       <td> 
       <input type="text" name="gcode" >
       
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     邮箱
      </td>
       <td> 
       <input type="text" name="gemail" >
       
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     联系人
      </td>
       <td> 
       <input type="text" name="glinkman" >
     
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     公司地址
      </td>
       <td> 
       <input type="text" name="gaddress"  >
       
      </td>
     </tr>
     
          <tr>
      <td style="background-color:#f2f2f2"> 
     固定电话
      </td>
       <td> 
       <input type="text" name="gtel" >
       
      </td>
     </tr>
     
              <tr>
      <td style="background-color:#f2f2f2"> 
     移动电话
      </td>
       <td> 
       <input type="text" name="gphone" >
      
      </td>
     </tr>
     
     
    
     <tr>
      <td style="background-color:#f2f2f2"> 
       传真
       
      </td>
       <td> 
       <input type="text" name="gchuanzhen" >
        
       
      </td>
     </tr>
     
     
    <tr >
      <td style="background-color:#f2f2f2"> 
       开户银行
       
      </td>
       <td> 
       <input type="text" name="gopenyinghang">
       
       
      </td>
     </tr>
  
    <tr >
      <td style="background-color:#f2f2f2"> 
    银行账户
       
      </td>
       <td>
       <input type="text" name="gyinghangaccount" > 
      
       
      </td>
     </tr>
     
       <tr >
      <td style="background-color:#f2f2f2"> 
            是否有效
       
      </td>
       <td>
       <input type="text" name="gtf" > 
      
       
      </td>
        </tr>
  
     <tr>
                    <td colspan="2" style="text-align: center;">
                      <input type="submit" value="提交">
                      
                   </td>
                </tr>
 
</table>
</form>
<script type="text/javascript">
  //监听提交
  
     /* function c(){
       alert("添加成功");
       var index = parent.layer.getFrameIndex(window.name);
       parent.layer.close(index);
     } */
          /* form.on('submit(add)', function(data){
            console.log(data);
            //发异步，把数据提交给php
            layer.alert("增加成功", {icon: 6},function () {
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            return false;
          }); */
</script>
  </body>
</html>
