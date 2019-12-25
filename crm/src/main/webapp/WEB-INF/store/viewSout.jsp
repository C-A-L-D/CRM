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
    <link rel="stylesheet" href="css/font.css">
    <link rel="stylesheet" type="text/css" href="lib/layui/css/modules/layer/default/layer.css">
    <link rel="stylesheet" type="text/css" href="lib/layui/css/layui.css">
    <script src="js/jquery.min.js"></script>
	<script src="lib/layui/layui.js"></script>
	<script src="lib/layui/lay/modules/layer.js"></script>
	<script type="text/javascript" src="store/js/listSoutPre.js"></script>
  </head>
<body>
<div class="layui-card">

<br/>

    <form class="layui-form" action="http://localhost:8080/CRM/storeSout/updateSout.do" method="post">
                <div class="layui-form-item">
                    <label class="layui-form-label" >销售单编号</label>
                    <div class="layui-input-block">
                        <input type="text" id="sid" readonly="readonly" value="${selected.sid }"  autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">制单日期</label>
                    <div class="layui-input-block">
                        <input type="text" id="maketime" placeholder="请选择时间......" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">发票编号</label>
                    <div class="layui-input-block">
                        <input type="text" id="tid" placeholder="${selected.tid}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">用户编号</label>
                    <div class="layui-input-block">
                        <input type="text" id="guid" placeholder="${selected.guid}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">销售金额</label>
                    <div class="layui-input-block">
                        <input type="text" id="sprice" placeholder="${selected.sprice}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">出库状态</label>
                    <div class="layui-input-block">
                        <input type="text" id="sstatus" placeholder="${selected.sstatus}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">是否返利</label>
                    <div class="layui-input-block">
                        <input type="text" id="isanti" placeholder="${selected.isanti}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">订单状态</label>
                    <div class="layui-input-block">
                        <input type="text" id="lstatus" placeholder="${selected.lstatus}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">备注信息</label>
                    <div class="layui-input-block">
                        <textarea id="remark" placeholder="请输入备注信息......." class="layui-textarea"></textarea>
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">公司编号</label>
                    <div class="layui-input-block">
                        <input type="text" id="cid" required readonly="readonly"  value="${selected.cid}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">修改时间</label>
                    <div class="layui-input-block">
                        <input type="text" id="lastdate" readonly="readonly" value="<fmt:formatDate value="${selected.lastdate }" pattern="yyyy-MM-dd HH:mm:ss"/>" autocomplete="off" class="layui-input">
                    		
                    </div>
                </div>
                <div class="layui-form-item">
                     <div class="layui-input-block">
                         <button class="layui-btn" lay-submit lay-filter="formDemo">入库</button>
                         <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                     </div>
                </div>
        </form>
  
</div>
</body>
<script type="text/javascript">
layui.use('laydate', function(){
  var laydate = layui.laydate;
  laydate.render({ 
  elem: '#maketime'
  ,type: 'datetime'
});
});
</script>

</html>