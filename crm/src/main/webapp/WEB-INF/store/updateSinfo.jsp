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
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../../CRM/css/font.css">
    <script src="../../CRM/js/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../../CRM/lib/layui/css/layui.css">
	<script src="../../CRM/lib/layui/layui.js"></script>
	<script src="storegoodsinfo/js/addsgi.js"></script>
  </head>
  
<body>
    <div class="layui-card">
        <div class="layui-card-header"><h2>入库信息</h2></div>
        <form class="layui-form" action="http://localhost:8080/CRM/storeSinfo/updateSinfo.do" method="post">
                <div class="layui-form-item">
                    <label class="layui-form-label">采购详情编号</label>
                    <div class="layui-input-block">
                        <input type="text" name="ssid" required lay-verify="required" placeholder="${selected.ssid }" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">采购编号</label>
                    <div class="layui-input-block">
                        <input type="text" name="sid" required lay-verify="required" placeholder="${selected.sid}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">产品编号</label>
                    <div class="layui-input-block">
                        <input type="text" name="gid" required lay-verify="required" placeholder="${selected.gid}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">产品数量</label>
                    <div class="layui-input-block">
                        <input type="text" name="gnum" required lay-verify="required" placeholder="${selected.gnum}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">产品价格</label>
                    <div class="layui-input-block">
                        <input type="text" name="price" required lay-verify="required" placeholder="${selected.price}" autocomplete="off" class="layui-input">
                    </div>
                </div>
				  <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">备注信息</label>
                    <div class="layui-input-block">
                        <textarea name="remark" placeholder="请输入备注信息......." class="layui-textarea"></textarea>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">公司编号</label>
                    <div class="layui-input-block">
                        <input type="number" name="cid" required lay-verify="required" placeholder="${selected.cid}" autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">是否入库</label>
                    <div class="layui-input-block">
                        <input type="text" name="pricesold" required lay-verify="required" placeholder="${selected.cid}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">操作人员</label>
                    <div class="layui-input-block">
                        <input type="text" name="priceact" required lay-verify="required" placeholder="${selected.cid}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">最后修改时间</label>
                    <div class="layui-input-block">
                        <input type="text" name="lasttime" required lay-verify="required" placeholder="${selected.lasttime}" autocomplete="off" class="layui-input">
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
</html>



