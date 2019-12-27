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

    
    <title>My JSP 'gsinfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
   
    <script src="<%=basePath %>/js/jquery.min.js"></script>
 
  </head>
  <body>
  <center>
  <input type="button" id="deleteall" value="删除所有1">
  
  
  <table>
  
 <tr> 
 <td>
 <input type="checkbox" id="aaa">
 </td>
 <td>1</td>
 <td>2</td>
 </tr>
 
 <tr>
 <td>
 <input type="checkbox" name="bbb"  value="1">
 </td>
 <td>哈哈</td>
 <td>花花</td>
 </tr> 
 
 
 <tr>
 <td>
 <input type="checkbox" name="bbb" value="2">
 </td>
 <td>啦啦</td>
 <td>积极</td>
 </tr>
 
 <tr>
 <td>
 <input type="checkbox" name="bbb" value="3">
 </td>
 <td>米奇</td>
 <td>阿斯达</td>
 </tr>
 
 
  </table>
 </center>
  
  </body>
     <script>
  $("#deleteall").click(function() {
  
     /*  $("input[name='bbb']").each(function(i, element) {
      	    if($(this).prop("checked")){
               console.log($(this).parents('tr'));
               $(this).parents('tr').remove();
           } 
      }) */
       var ids="";
    $("input[name='bbb']").each(function(i, element) {
      	    if($(this).prop("checked")){              
               ids+=$(this).val()+",";  
             }       
    })
     
     ids=ids.substr(0,ids.length-1)
     console.log(ids);
      var list=ids.split(",");
       console.log(list);
    
   /*  var list=$(':checkbox:checked');
   
            var ids="";
            list.each(function(){
                ids += $(this).val()+',';
                
            });
            if(ids.length==0){
                alert('请选择要删除的商品');
            }else{
                //截取最后一个
                ids=ids.substr(0,ids.length-1);
                if(confirm('确定要删除吗?')){
                    location.href="dels/goods_id/"+ids;
                }else{
                    return false;
                }  
            }
       */
   
      /*  for(j=0;j<$("input[name='bbb']").length;j++){
            
             var aaa=$("input[name='bbb']").get(j);
            if($(aaa).prop("checked")){
               alert(j);
               console.log($(aaa).parents('tr'));
               $(aaa).parents('tr').remove();
           } 
     }  */
      
     
   
        
  });
  
  $("#aaa").click(function() {
  	  alert($(this).prop("checked")); 
  	/* alert($("#aaa").attr("checked")); */
       $("input[name='bbb']").prop("checked", $(this).prop("checked") ); 
     if($(this).prop("checked")){
        a=3;
     }else{
     a=0;
     }
  });
   var a=0,i=1;
  $("input[name='bbb']").click(function() {
  
   if($(this).prop("checked")){
      a+=i;
   }
    if($(this).prop("checked")==false){
      a-=i;
   }
   
  
    /*  alert(a);  */
  	   $(a==3 ? $("#aaa").prop("checked",true):"");
  });
    
    </script>
</html>
