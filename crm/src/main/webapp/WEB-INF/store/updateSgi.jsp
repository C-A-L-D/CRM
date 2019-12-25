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
	<script src="store/js/storeginfopre.js"></script>
  </head>
  
<body>
    <div class="layui-card">
        <div class="layui-card-header"><h2>修改库存商品信息</h2></div>
        <form class="layui-form" action="storeGinfo/updateSgi.do">
                <div class="layui-form-item">
                    <label class="layui-form-label">商品编号</label>
                    <div class="layui-input-block">
                        <input type="text" name="gid" readonly="readonly" value="${selected.gid }" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">商品名称</label>
                    <div class="layui-input-block">
                        <input type="text" name="gname"placeholder="${selected.gname}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">商品类别</label>
                    <div class="layui-input-block">
                        <input type="text" name="gcategopy" placeholder="${selected.gcategopy}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">规格说明</label>
                    <div class="layui-input-block">
                        <input type="text" name="gdesp" placeholder="${selected.gdesp}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">单位</label>
                    <div class="layui-input-block">
                        <input type="text" name="gunit" placeholder="${selected.gunit}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">仓库编号</label>
                    <div class="layui-input-block">
                        <input type="text" name="whid" placeholder="${selected.whid}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">库存数量</label>
                    <div class="layui-input-block">
                        <input type="number" name="storenum" placeholder="${selected.storenum}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">成本价</label>
                    <div class="layui-input-block">
                        <input type="text" name="pricebuy" placeholder="${selected.pricebuy}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">零售价</label>
                    <div class="layui-input-block">
                        <input type="text" name="pricesold" placeholder="${selected.pricesold}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">经销价</label>
                    <div class="layui-input-block">
                        <input type="text" name="priceact" placeholder="${selected.priceact}" autocomplete="off" class="layui-input">
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
                        <input type="text" name="cid" readonly="readonly" value="${selected.cid}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">最后修改时间</label>
                    <div class="layui-input-block">
                        <input type="text" name="lattime" placeholder="${selected.lasttime}" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                     <div class="layui-input-block">
                         <button type="submit" class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                         <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                     </div>
                </div>
            </form>
    </div>

</body>
</html>



