<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
    <link rel="shortcut icon" href="<%=basePath %>/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="<%=basePath %>/css/font.css">
    <link rel="stylesheet" href="<%=basePath %>/css/xadmin.css">
    <script src="<%=basePath %>/js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="<%=basePath %>/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body>
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a>
          <cite style="color: red;"><h2>客户流失管理</h2></cite></a>
      </span>
      <a class="layui-btn layui-btn-primary layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:38px">ဂ</i></a>
    </div>
    <div class="x-body">
      <xblock>
        <span class="x-right" style="line-height:40px;font-size:20px;">共有数据：${klp.total } 条</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
            <th>客户编号</th>
            <th>客户名称</th>
            <th>客户属性</th>
            <th>客户状态</th>
            <th>支付方式</th>
            <th>是否有效</th>
            <th>固定电话</th>
            <th>移动电话</th>
            <th>公司编号</th>
            <th>下次联系时间</th>
            <th>操作</th>
            </tr>
        </thead>
        <tbody>
        	<c:forEach items="${klp.list}" var="k">
		          <tr>
		            <td>${k.kid }</td>
		            <td>${k.kname }</td>
		            <td>${k.kshuxin }</td>
		            <td>${k.kehuzhuangtai }</td>
		            <td>${k.zhifufangshi }</td>
		            <td>${k.shifouyouxiao }</td>
		            <td>${k.gudingdianhua }</td>
		            <td>${k.yidongdianhua }</td>
		            <td>${k.gid }</td>
		            <td>${k.xiacilianxishijian }</td>
		            <td class="td-manage">
		              <a title="详细信息"  onclick="x_admin_show('详细信息','KehuxiangxiPage.do?kid=${k.kid}')" href="javascript:;">
		                <i class="layui-icon">&#xe63c;</i>
		              </a>
		              &nbsp;
		              <a title="流失处理"  onclick="x_admin_show('流失处理','../Kehuliushictrl/goAddKehuliushi.do?kid=${kid}&gid=${gid}',500,670)" href="javascript:;">
		                <i class="layui-icon">&#xe63c;</i>
		              </a>
		              &nbsp;
		              <a title="客户恢复"  href="KehuxinxiHuifu.do?kid=${k.kid}">
		                <i class="layui-icon">&#xe63c;</i>
		              </a>
		              &nbsp;
		              <a title="客户删除"  onclick="member_del(this,${k.kid })" href="javascript:;">
		                <i class="layui-icon">&#xe63c;</i>
		              </a>
		            </td>
		          </tr>
        	</c:forEach>
        </tbody>
      </table>
      <div class="page">
        <div>
          <a class="num" href="KehuliushiPage.do?pageNum=${klp.firstPage }">首页</a>
          <a class="prev" href="KehuliushiPage.do?pageNum=${klp.prePage }" title="上一页">&lt;&lt;</a>
          <span class="current"> 当前${klp.pageNum }/${klp.pages }页</span>
          <a class="next" href="KehuliushiPage.do?pageNum=${klp.nextPage }" title="下一页">&gt;&gt;</a>
          <a class="num" href="KehuliushiPage.do?pageNum=${klp.lastPage }">尾页</a>
        </div>
      </div>

    </div>
    <script>
      layui.use('laydate', function(){
        var laydate = layui.laydate;
        
        //执行一个laydate实例
        laydate.render({
          elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
          elem: '#end' //指定元素
        });
      });

       /*用户-停用*/
      function member_stop(obj,id){
          layer.confirm('确认要停用吗？',function(index){

              if($(obj).attr('title')=='启用'){

                //发异步把用户状态进行更改
                $(obj).attr('title','停用')
                $(obj).find('i').html('&#xe62f;');

                $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                layer.msg('已停用!',{icon: 5,time:1000});

              }else{
                $(obj).attr('title','启用')
                $(obj).find('i').html('&#xe601;');

                $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                layer.msg('已启用!',{icon: 5,time:1000});
              }
              
          });
      }

      /*用户-删除*/
      function member_del(obj,kid){
      
          layer.confirm('确认要删除吗？',function(index){
              //发异步删除数据
              $.ajax({
		        type: 'post',
		        url: "deleteKehuxinxi.do",
		        data: "kid="+kid,
		        success: function (res) {
		           //$(obj).parents("tr").remove();
		           layer.msg('已删除!',{icon:1,time:1000},function () {
		              //刷新页面
		              location.reload();
		           });
		        }
		    });
          });
      }
    </script>
  </body>

</html>