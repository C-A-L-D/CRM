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
              <label for="phone" class="layui-form-label">
                  	客户名称
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kname" name="kname"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  	客户属性
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kshuxin" name="kshuxin"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  	网站
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="wangzhan" name="wangzhan"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  	股票代码
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gupiaodaima" name="gupiaodaima"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          
           <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  	上级单位
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="shangjidanwei" name="shangjidanwei"
                  autocomplete="off" class="layui-input" value="">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	所有者
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="suoyouzhe" name="suoyouzhe"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	员工数
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yuangongshu" name="yuangongshu"
                  autocomplete="off" class="layui-input" value="">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	行业编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="hangyebianhao" name="hangyebianhao"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	客户类型
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kehuleixing" name="kehuleixing"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                   	客户状态
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kehuzhuangtai" name="kehuzhuangtai"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:19px;">
              <label for="L_pass" class="layui-form-label">
                   	客户来源
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kehulaiyuan" name="kehulaiyuan"
                  autocomplete="off" class="layui-input" value="">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:72px;">
              <label for="L_pass" class="layui-form-label">
                   	负责人编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="fuzerenbianhao" name="fuzerenbianhao"
                  autocomplete="off" class="layui-input" value="">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:125px;">
              <label for="L_pass" class="layui-form-label">
                   	固定电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gudingdianhua" name="gudingdianhua"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:178px;">
              <label for="L_pass" class="layui-form-label">
                   	移动电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yidongdianhua" name="yidongdianhua"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:231px;">
              <label for="L_pass" class="layui-form-label">
                   	客户传真
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kehuchuangzhen" name="kehuchuangzhen"
                  autocomplete="off" class="layui-input" value="">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:284px;">
              <label for="L_pass" class="layui-form-label">
                   	开户银行
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="kaihuyinhang" name="kaihuyinhang"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:337px;">
              <label for="L_pass" class="layui-form-label">
                   	银行账户
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="yinhangzhanghu" name="yinhangzhanghu"
                  autocomplete="off" class="layui-input" value="">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:389px;">
              <label for="L_pass" class="layui-form-label">
                   	下次联系时间
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="xiacilianxishijian" name="xiacilianxishijian"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:442px;">
              <label for="L_pass" class="layui-form-label">
                   	电子邮件
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="dianziyoujian" name="dianziyoujian"
                  autocomplete="off" class="layui-input" value="">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:400px;top:495px;">
              <label for="L_pass" class="layui-form-label">
                   	SIC编码
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="sicbianma" name="sicbianma"
                  autocomplete="off" class="layui-input" value="">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:800px;top:19px;">
              <label for="L_pass" class="layui-form-label">
                   	支付方式
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="zhifufangshi" name="zhifufangshi"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:800px;top:72px;">
              <label for="L_pass" class="layui-form-label">
                   	是否有效
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="shifouyouxiao" name="shifouyouxiao"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:800px;top:125px;">
              <label for="L_pass" class="layui-form-label">
                   	详细地址
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="xiangxidizhi" name="xiangxidizhi"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:800px;top:178px;">
              <label for="L_pass" class="layui-form-label">
                   	备注信息
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="beizhuxinxi" name="beizhuxinxi"
                  autocomplete="off" class="layui-input" value="">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:800px;top:231px;">
              <label for="L_pass" class="layui-form-label">
                   	公司编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="gid" name="gid"
                  autocomplete="off" class="layui-input" value="" required lay-verify="required">
              </div>
          </div>
          
          <div class="layui-form-item" style="position: absolute;left:800px;top:284px;">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" lay-filter="add" lay-submit="" style="background-color: red;width: 190px;">
                  提交
              </button>
          </div>
          
          
      <script type="text/javascript">
  			layui.use(['form','layer'], function(){
            $ = layui.jquery;
	        var form = layui.form
	        ,layer = layui.layer;
          
	          //监听提交
	          form.on('submit(add)', function(data){
	            console.log(data);
	            $.ajax({
			        type: 'post',
			        url: "addKehuxinxi.do",
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
	          
	        });
	</script>
      </form>
    </div>
  </body>
</html>
