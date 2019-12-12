<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

      <xblock> 
        <button class="layui-btn" onclick=""><i class="layui-icon"></i>添加供应商</button>
         <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
      </xblock>
      <table class="layui-table">    
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>供应商编号</th>
            <th>供应商名称</th>
            <th>联系人</th>
            <th>联系电话</th>
            <th>开户银行</th>
            <th>银行账号</th>
            <th>备注信息</th>
            <th>详细信息</th>
            <th >操作</th>
            </tr>
          <c:forEach items="${p.list }" var="u">
            <tr>
            <td>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </td>
               <td>
                 ${u.gysId }
               </td>
               <td>
                ${u.gysName }
               </td>
               <td>
                ${u.lxr }
               </td>
               <td>
                 ${u.ydPhone}
               </td>
               <td>
                 ${u.khbank }
               </td>
               <td>
                 ${u.yhzh }
               </td>
                <td>
                 ${u.remark }
               </td>
                <td>
                 <a href="#">查看详情</a>
               </td>
              <td class="td-manage">
              <a title="修改" href="gysxxctrl/goupdate.do?gysId=${u.gysId }"><input type="image" src="<%=basePath %>images/jt.jpg" height="45px" width="45px" >
				</a>
              <a title="删除" href="gysxxctrl/delete.do?gysId=${u.gysId }" onclick="return confirm('是否确定删除？')" >
              <input type="image" src="<%=basePath %>images/dl.jpg" height="45px" width="45px" >
                
              </a>
              </td>  
            </tr>
         </c:forEach>
            <tr>
             <td style="text-align: center;" colspan="10">
                <a href="gysxxctrl/listpage.do?pageNum=${p.firstPage }">首页</a>
                <a href="gysxxctrl/listpage.do?pageNum=${p.prePage }">上一页</a>
                <a href="gysxxctrl/listpage.do?pageNum=${p.nextPage }">下一页</a>
                <a href="gysxxctrl/listpage.do?pageNum=${p.lastPage }">尾页</a>
                                       当前${p.pageNum }/${p.pages }页，共${p.total }条
             </td>
          </tr> 
          

      </table>
    

 
   
     </body>
     </html>
    
