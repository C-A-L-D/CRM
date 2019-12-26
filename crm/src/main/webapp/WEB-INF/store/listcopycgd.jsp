<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link rel="stylesheet" href="../css/font.css">
    <link rel="stylesheet" type="text/css" href="lib/layui/css/modules/layer/default/layer.css">
    <link rel="stylesheet" type="text/css" href="lib/layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="css/xadmin.css">
    <script src="js/jquery.min.js"></script>
	<script src="lib/layui/layui.js"></script>
	<script src="lib/layui/lay/modules/layer.js"></script>
	<script type="text/javascript" src="store/js/listcopycgdPre.js"></script>
  </head>

  
<body>
<div class="layui-card">

<div class="x-nav">
      <span class="layui-breadcrumb" style="visibility: visible;">
        <a href="javascript:location.replace(location.href);">主页</a><span lay-separator="">/</span>
        <a href="javascript:location.replace(location.href);">库存</a><span lay-separator="">/</span>
        <a href="javascript:location.replace(location.href);"><cite>仓库商品信息</cite></a>
       </span>
       <a class="layui-btn layui-btn-primary layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
      		<i class="layui-icon" style="line-height:38px">ဂ</i>
      	</a>
</div>

<div class="x-body">
       <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" action="storeSinfo/cgdlistpage.do">
        <input type="text" style="width:950px;" name="cgTheme"  placeholder="请输入采购单主题" autocomplete="off" class="layui-input">
        <button class="layui-btn" style="float: right;"  lay-submit="" lay-filter="submit"><i class="layui-icon">&#xe615;</i></button>
        </form>
        </div>

       <table class="layui-table"> 
       <colgroup>
      	<col width="200">
      	<col width="200">
      	<col width="200">
      	<col width="200">
      	<col width="200">
      	<col width="200">
      	<col width="200">
      	<col width="200">
      	<col width="200">
      	<col width="200">
      	<col width="200">
      	<col width="200">
      	<col width="200">
      	<col width="150">
      	<col width="150">
      	<col width="300">
      	<col>
    	</colgroup> 
    	<thead>  
          <tr>
            <th><center>采购单编号</center></th>
            <th><center>采购主题</center></th>
            <th><center>采购日期</center></th>
            <th><center>供应商编号</center></th>
            <th><center>货款金额</center></th>
            <th><center>发票号码</center></th>
            <th><center>付款情况</center></th>
            <th><center>采购进展</center></th>
            <th><center>交货时间</center></th>
            <th><center>交货地点</center></th>
            <th><center>交货方式</center></th>
            <th><center>操作人员</center></th>
            <th><center>备注信息</center></th>
            <th><center>公司编号</center></th>
            <th><center>最后修改时间</center></th>
            <th><center>查看</center></th>
          </tr>
          </thead>
          
          <tbody>
          <c:forEach items="${p.list }" var="u">
            <tr>
               <td><center>
                 ${u.cgdId }
               </center></td>
               <td><center>
                ${u.cgTheme }
               </center></td>
               <td><center>
               <fmt:formatDate value="${u.cgTime}" pattern="yyyy-MM-dd"/>
               </center></td>
               <td><center>
                 ${u.gysId}
               </center></td>
               <td id="mk"><center>
                 ${u.hkMoney }
               </center></td>
                <td><center>
                 ${u.fphm }
               </center></td>  
               <td><center>
                 ${u.fkqk }
               </center></td>
                <td><center>
                 ${u.cgJz }
               </center></td>
                <td><center>
             <fmt:formatDate value="${u.jhtime}" pattern="yyyy-MM-dd"/>
               </center></td>
                 <td><center>
                 ${u.jhplace }
               </center></td>
                  <td><center>
                 ${u.jhway }
               </center></td>
                  <td><center>
                 ${u.operator }
               </center></td>
                  <td><center>
                 ${u.remark }
               </center></td>
                   <td><center>
                 ${u.gsId }
               </center></td>
                   <td><center>
               <fmt:formatDate value="${u.ltime}" pattern="yyyy-MM-dd"/>   
               </center></td>
               

                
                <td class="td-status"><center>
                <a type="button" href="storeSinfo/cgdxq.do?cgdId=${u.cgdId  }" >
                <span class="layui-btn layui-btn-normal layui-btn-mini">查看详情</span>
                </a>
               </center></td>
                     
            </tr>
         </c:forEach>
         </tbody>
         </table>  
            
      <center>
      <div class="layui-elem-field layui-field-title" id="page">
      	 <a class="layui-btn layui-btn-primary" href="storeSinfo/cgdlistpage.do?pageNum=${p.firstPage }">首页</a>
          <a class="layui-btn layui-btn-primary" href="storeSinfo/cgdlistpage.do?pageNum=${p.prePage }">&lt;&lt;上一页</a>
          <span class="layui-btn"> 当前${p.pageNum }/${p.pages }页</span>
          <span class="layui-btn layui-btn-primary">共${p.total}条数据</span>
          <a class="layui-btn layui-btn-primary" href="storeSinfo/cgdlistpage.do?pageNum=${p.nextPage }">下一页&gt;&gt;</a>
          <a class="layui-btn layui-btn-primary" href="storeSinfo/cgdlistpage.do?pageNum=${p.lastPage }">尾页</a>       
      </div>
      </center> 
 </div>
</div>
     </body>
</html>  
