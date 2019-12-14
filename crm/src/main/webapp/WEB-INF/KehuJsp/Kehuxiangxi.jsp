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
    <div class="x-body" style="position: relative;">
        <form class="layui-form">
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  	客户编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kid" name="kid"
                  autocomplete="off" class="layui-input" value="${khxx.kid }" disabled="disabled">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  	客户名称
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kname" name="kname"
                  autocomplete="off" class="layui-input" value="${khxx.kname }" disabled="disabled">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  	客户属性
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kshuxin" name="kshuxin"
                  autocomplete="off" class="layui-input" value="${khxx.kshuxin }" disabled="disabled">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  	网站
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="wangzhan" name="wangzhan"
                  autocomplete="off" class="layui-input" value="${khxx.wangzhan }" disabled="disabled">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  	股票代码
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gupiaodaima" name="gupiaodaima"
                  autocomplete="off" class="layui-input" value="${khxx.gupiaodaima }" disabled="disabled">
              </div>
          </div>
          
           <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  	上级单位
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="shangjidanwei" name="shangjidanwei"
                  autocomplete="off" class="layui-input" value="${khxx.shangjidanwei }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	所有者
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="suoyouzhe" name="suoyouzhe"
                  autocomplete="off" class="layui-input" value="${khxx.suoyouzhe }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	员工数
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.yuangongshu }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	行业编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.hangyebianhao }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	客户类型
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.kehuleixing }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	客户状态
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.kehuzhuangtai }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:19px;">
              <label for="L_pass" class="layui-form-label">
                   	客户来源
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.kehulaiyuan }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:72px;">
              <label for="L_pass" class="layui-form-label">
                   	负责人编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.fuzerenbianhao }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:125px;">
              <label for="L_pass" class="layui-form-label">
                   	固定电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.gudingdianhua }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:178px;">
              <label for="L_pass" class="layui-form-label">
                   	移动电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.yidongdianhua }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:231px;">
              <label for="L_pass" class="layui-form-label">
                   	客户传真
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.kehuchuangzhen }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:284px;">
              <label for="L_pass" class="layui-form-label">
                   	开户银行
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.kaihuyinhang }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:337px;">
              <label for="L_pass" class="layui-form-label">
                   	银行账户
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.yinhangzhanghu }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:389px;">
              <label for="L_pass" class="layui-form-label">
                   	下次联系时间
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.xiacilianxishijian }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:442px;">
              <label for="L_pass" class="layui-form-label">
                   	电子邮件
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.dianziyoujian }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:495px;">
              <label for="L_pass" class="layui-form-label">
                   	SIC编码
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.sicbianma }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:548px;">
              <label for="L_pass" class="layui-form-label">
                   	支付方式
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.zhifufangshi }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:800px;top:19px;">
              <label for="L_pass" class="layui-form-label">
                   	是否有效
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.shifouyouxiao }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:800px;top:72px;">
              <label for="L_pass" class="layui-form-label">
                   	详细地址
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.xiangxidizhi }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:800px;top:125px;">
              <label for="L_pass" class="layui-form-label">
                   	备注信息
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.beizhuxinxi }" disabled="disabled">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:800px;top:178px;">
              <label for="L_pass" class="layui-form-label">
                   	公司编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="${khxx.gid }" disabled="disabled">
              </div>
          </div>
      </form>
    </div>
  </body>
</html>
