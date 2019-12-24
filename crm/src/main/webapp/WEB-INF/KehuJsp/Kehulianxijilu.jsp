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
          <cite style="color: red;"><h2>客户联系记录</h2></cite></a>
      </span>
      <a class="layui-btn layui-btn-primary layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:38px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" action="mohuKehulianxijilu.do">
          <input type="text" name="lianxibiaoti"  placeholder="请输入联系标题" autocomplete="off" class="layui-input">
          <button type="submit" class="layui-btn"  lay-submit="" lay-filter="sreach" value=""><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <xblock>
      	<button class="layui-btn" style="background-color: purple;" onsubmit="false">客户：${kname }</button>
        <button class="layui-btn" onclick="x_admin_show('添加联系记录','goAddKehulianxijilu.do',500,670)" href="javascript:;"><i class="layui-icon"></i>添加联系记录</button>
        <button class="layui-btn" style="background-color: black;" onclick="fh()">返回客户信息页面</button>
        <!-- <button class="layui-btn" style="background-color: red;" onclick="tj()">批量删除</button> -->
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <span class="x-right" style="line-height:40px;font-size:20px;">共有数据：${lxr.total } 条</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
          	<!-- <th>
         		<input type="checkbox" id="checkall" onclick="cf()" 
              	style="width: 18px;height: 18px;background-color: white;">
      		</th> -->
      		<th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>联系记录编号</th>
            <th>联系标题</th>
            <th>联系时间</th>
            <th>客户编号</th>
            <th>联系内容</th>
            <th>公司编号</th>
            <th>操作</th>
            </tr>
        </thead>
        <tbody>
        	<c:forEach items="${lxjl.list}" var="j">
		          <tr>
		          	<%-- <td>
              			<input type="checkbox" value="${r.lid }"  name="checkone" 
              			style="width: 18px;height: 18px;background-color: white;">
           		 	</td> --%>
           		 	<td>
              			<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='${j.ljid }'><i class="layui-icon">&#xe605;</i></div>
            		</td>
		            <td>${j.ljid }</td>
		            <td>${j.lianxibiaoti }</td>
		            <td>${j.lianxishijian }</td>
		            <td>${j.kid }</td>
		            <td>${j.lianxineirong }</td>
		            <td>${j.gid }</td>
		            <td>
		              <a title="联系记录编辑"  onclick="x_admin_show('联系记录编辑','goUpdateKehulianxijilu.do?ljid=${j.ljid}',500,670)" href="javascript:;">
		                <i class="layui-icon">&#xe63c;</i>
		              </a>
		              &nbsp;
		              <a title="删除联系记录"  onclick="member_del(this,${j.ljid })" href="javascript:;">
		                <i class="layui-icon">&#xe63c;</i>
		              </a>
		            </td>
		          </tr>
        	</c:forEach>
        	
        	
        </tbody>
      </table>
      <script type="text/javascript">
	      /* function cf(){
		      var checkall =document.getElementById("checkall");
		      var checkone =document.getElementsByName("checkone");
		      var flag=checkall.checked;
		      for(var i =0;i<checkone.length;i++){     
		         checkone[i].checked=flag;
		      }
	      }
	      
	      function tj(){
		      var lid="";
		      var checkone =document.getElementsByName("checkone");
		      for(var i =0;i<checkone.length;i++){     
		         if(checkone[i].checked==true){
		         lid+="lid="+checkone[i].value+"&";
		         alert(checkone[i].value);
		         }
		      }
		      location.href="deleteAllKehulianxiren.do?"+lid;
		      alert(location.href="deleteAllKehulianxiren.do?"+lid);
	      } */
	      
	      function fh(){
	      	location.href="<%=basePath %>/Kehuxinxictrl/KehuxinxiListPage.do";
	      }
      </script>
      <div class="page">
        <div>
          <a class="num" href="KehulianxijiluListPage.do?pageNum=${lxjl.firstPage }&kid=${kid}&kname=${kname}">首页</a>
          <a class="prev" href="KehulianxijiluListPage.do?pageNum=${lxjl.prePage }&kid=${kid}&kname=${kname}" title="上一页">&lt;&lt;</a>
          <span class="current"> 当前${lxjl.pageNum }/${lxjl.pages }页</span>
          <a class="next" href="KehulianxijiluListPage.do?pageNum=${lxjl.nextPage }&kid=${kid}&kname=${kname}" title="下一页">&gt;&gt;</a>
          <a class="num" href="KehulianxijiluListPage.do?pageNum=${lxjl.lastPage }&kid=${kid}&kname=${kname}">尾页</a>
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
	
		/* function aa(pageNum){
		var url="../Kehulianxirenctrl/KehulianxirenListPage.do?pageNum="+pageNum+"&lianxirenxingming="+$("#lianxirenxingming").val();
	   		console.log(url);
	     	window.location.href=url;
	 	} */
	
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
      function member_del(obj,ljid){
      
          layer.confirm('确认要删除吗？',function(index){
              //发异步删除数据
              $.ajax({
		        type: 'post',
		        url: "deleteKehulianxijilu.do",
		        data: "ljid="+ljid,
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
    
      function delAll(argument){
        var data = tableCheck.getData();
      	console.log(data);
      	//捉到所有被选中的，发异步进行删除
        layer.confirm('确认要删除已选择的吗？'+data,function(index){
            layer.msg('删除成功', {icon: 1});
            $.ajax({
		        type: 'post',
		        url: "deleteAllKehulianxijilu.do",
		        data: "msg="+data,
		        success: function (res) {
		           location.reload();
		        }
		    });
            $(".layui-form-checked").not('.header').parents('tr').remove(); 
        }); 
       } 
    </script>
  </body>

</html>