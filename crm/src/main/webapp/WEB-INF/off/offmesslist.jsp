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
    
    <title>My JSP 'offmesslist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
   <link rel="shortcut icon" href="<%=basePath %>/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="<%=basePath %>/css/font.css">
    <link rel="stylesheet" href="<%=basePath %>/css/xadmin.css">
    <script src="<%=basePath %>/js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="<%=basePath %>/js/xadmin.js"></script>
   <!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div class="x-nav">
              <span style="font-weight: bold;">办公短消息</span>
      <a class="layui-btn layui-btn-primary layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:38px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
          <form   class="layui-form layui-col-md12 x-so" method="post" action="offmessctrl/search.do">
          <div class="layui-input-inline">
              <select  name="select">           
                    <option value="">选择查询条件</option>  
                     <option value="1">标题</option> 
                     <option value="2">内容</option>             
                </select>
              </div>
          <input type="text" name="search"  placeholder="请输入关键字" autocomplete="off" class="layui-input">
          <button class="layui-btn"  type="submit"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <xblock>
        <button class="layui-btn layui-btn-dlAll()"><i class="layui-icon"></i>批量删除</button>
        <button class="layui-btn" onclick="x_admin_show('发送短信','offmessctrl/goadd.do',530,400)" href="javascript:;"><i class="layui-icon"></i>发送信息</button>
         <c:if test="${stat=='2'}">
         <button id="change" class="layui-btn" onclick="send()"><i class="layui-icon">&#xe615;</i>查看已发送信息</button>
          </c:if>
          <c:if test="${stat=='1'}">
           <button id="change" class="layui-btn" onclick="send1()"><i class="layui-icon">&#xe615;</i>查看已接收信息</button>
        </c:if>
        <span class="x-right" style="line-height:40px">共有数据：${p.total } ${send.total }条</span>
      </xblock>
      
      <div id="jieshou">
      
      <!-- 显示已接收短信 -->
      <center>
      <table class="layui-table">    
        <thead>
          <tr>
            <th>短信编号</th>
            <th>消息标题</th>
            <th>发送人</th>        
            <th>接收时间</th>
            <th>消息状态</th>
            <th>操作</th>
        </thead>
        <tbody>
          <c:forEach items="${p.list }" var="u">
          <tr>
            <td>${u.detailid}</td>
            <td>${u.offMess.title }</td>
            <td>${u.offMess.sender}</td>
             <td>
	         <fmt:formatDate value="${u.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/>
	        </td>
            <td class="td-status">
            <c:if test="${u.messstate=='1'}"><span id="weidu" class="layui-btn layui-btn-normal layui-btn-mini" style="background-color:#FF0000">未读</span></c:if>
            <c:if test="${u.messstate=='2'}"><span id="yidu" class="layui-btn layui-btn-normal layui-btn-mini" style="background-color:rgb(13,195,22) ">已读</span></c:if>
            
              </td>
            <td class="td-manage"> 
            <a title="查看详情"  onclick="x_admin_show1('查看详情','offmessctrl/showdetail.do?detailid=${u.detailid}',600,600)" href="javascript:;">
                <i class="layui-icon">&#xe642;</i>查看详情
              </a>
              <a title="删除" onclick="mess_del(this,'${u.detailid}')" href="javascript:;">
                <i class="layui-icon">&#xe640;</i>删除
              </a>
            </td>
          </tr>
           </c:forEach>
         
        </tbody>
         </center>
      </table>
         
      <div class="page">
          <a class="prev" href="offmessctrl/offmesslist.do?pageNum=${p.firstPage}">首页</a>
          <a class="num" href="offmessctrl/offmesslist.do?pageNum=${p.prePage}">&lt;&lt;</a>
          <span class="current"> 当前${p.pageNum }/${p.pages }页</span>
          <a class="next" href="offmessctrl/offmesslist.do?pageNum=${p.nextPage}">&gt;&gt;</a>
          <a class="prev" href="offmessctrl/offmesslist.do?pageNum=${p.lastPage }">尾页</a>       
      </div>
     
 </div>
 
 <!-- 显示已发送短信 -->
  <div id="send" style="display:none;" >
      <table class="layui-table">
        <thead>
          <tr>
            <th>短信编号</th>
            <th>消息标题</th>
            <th>接收人</th>        
            <th>发送时间</th>
            <th>操作</th>
        </thead>
        <tbody>
          <c:forEach items="${send.list }" var="s">
          <tr>
            <td>${s.messid}</td>
            <td>${s.title }</td>
            <td> 
               <c:forEach items="${s.offMessdetail}" var="d" varStatus="index">
                     ${d.uname}
                    <c:if test="${index.last==false}">
						、
						</c:if>
                </c:forEach>    
           </td>
             <td>
	         <fmt:formatDate value="${s.lasttime }" pattern="yyyy-MM-dd HH:mm:ss"/>
	        </td>
        
            <td class="td-manage">
              <a title="查看详情"  onclick="x_admin_show('查看详情','offmessctrl/showdetailsend.do?messid=${s.messid}',600,400)"  href="javascript:;">
                <i class="icon iconfont">&#xe6f7;</i>查看详情
              </a>
             
            </td>
          </tr>
           </c:forEach>
   
        </tbody>
      </table>
      <div class="page">
          <a class="prev" href="offmessctrl/offsendlist.do?pageNum=${send.firstPage}">首页</a>
          <a class="num" href="offmessctrl/offsendlist.do?pageNum=${send.prePage}">&lt;&lt;</a>
          <span class="current"> 当前${send.pageNum }/${send.pages }页</span>
          <a class="next" href="offmessctrl/offsendlist.do?pageNum=${send.nextPage}">&gt;&gt;</a>
          <a class="prev" href="offmessctrl/offsendlist.do?pageNum=${send.lastPage }">尾页</a>       
      </div>
      
 </div>
    </div>

    <script>
    
     function x_admin_show1(title,url,w,h){
	    if (title == null || title == '') {
	        title=false;
	    };
	    if (url == null || url == '') {
	        url="404.html";
	    };
	    if (w == null || w == '') {
	        w=($(window).width()*0.9);
	    };
	    if (h == null || h == '') {
	        h=($(window).height() - 50);
	    };
	    layer.open({
	        type: 2,
	        area: [w+'px', h +'px'],
	        fix: false, //不固定
	        maxmin: true,
	        shadeClose: true,
	        closeBtn: 0,
	        shade:0.4,
	        title: title,
	        content: url
	    });
	}
     
    
    /*用户-删除*/
      function mess_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){
              //发异步删除数据
              location.href="offmessctrl/delete.do?detailid="+id;
              $(obj).parents("tr").remove();
              layer.msg('已删除!',{icon:1,time:1000});
             
          });
      }
      
    function send(){
		    document.getElementById("send").style.display="block"; 
		    document.getElementById("jieshou").style.display="none";
		    window.location.href="offmessctrl/offsendlist.do"; 
    }
    
     function send1(){
		    document.getElementById("send").style.display="block"; 
		    document.getElementById("jieshou").style.display="none";
		    window.location.href="offmessctrl/offmesslist.do"; 
    }
    
    var isshowsend="${isshowsend}";
    $(function(){
        if(isshowsend=="yes"){
              document.getElementById("send").style.display="block"; 
              document.getElementById("jieshou").style.display="none";
        }
    });
    
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

      



      function delAll (argument) {

        var data = tableCheck.getData();
  
        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
      }
    </script>
  </body>

</html>