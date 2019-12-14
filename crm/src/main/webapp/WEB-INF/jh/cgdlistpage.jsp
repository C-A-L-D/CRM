<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
       <div class="layui-row">
       
        <form class="layui-form layui-col-md12 x-so">
        <input type="text" name="gysName"  placeholder="请输入采购单主题" autocomplete="off" class="layui-input">
          <a class="layui-btn" onclick=""><i class="layui-icon">&#xe615;</i></a>
        
       <a  class="layui-btn" title="添加" onclick="x_admin_show('添加','cgdgoadd.do')" >
       <i class="layui-icon"></i>	添加采购单</a>
          
        </form>
      </div>
  

      <table class="layui-table">    
          <tr>
            <th>采购单编号</th>
            <th>采购主题</th>
            <th>采购日期</th>
            <th>供应商编号</th>
            <th>货款金额</th>
            <th>发票号码</th>
            <th>付款情况</th>
            <th>采购进展</th>
            <th>交货时间</th>
            <th>交货地点</th>
            <th>交货方式</th>
            <th>操作人员</th>
            <th>备注信息</th>
            <th>公司编号</th>
            <th>最后修改时间</th>
            <th>查看</th>
            
            </tr>
          <c:forEach items="${p.list }" var="u">
            <tr>
           
               <td>
                 ${u.cgdId }
               </td>
               <td>
                ${u.cgTheme }
               </td>
               <td>
                ${u.cgTime }
               </td>
               <td>
                 ${u.gysId}
               </td>
               <td>
                 ${u.hkMoney }
               </td>
               <td>
                 ${u.fkqk }
               </td>
                <td>
                 ${u.cgJz }
               </td>
                <td>
                 ${u.jhtime }
               </td>
                 <td>
                 ${u.jhplace }
               </td>
                  <td>
                 ${u.jhway }
               </td>
                  <td>
                 ${u.operator }
               </td>
                  <td>
                 ${u.remark }
               </td>
                   <td>
                 ${u.gsId }
               </td>
                   <td>
                 ${u.ltime }
               </td>
                    <td>
                                              查看详单
               </td>
                    
              <td class="td-manage">
              <a title="删除" href="../cgdxxctrl/cgddelete.do?cgdId=${u.cgdId }" onclick="return confirm('是否确定删除？') " >
              <input type="image" src="<%=basePath %>images/dl.jpg" height="30px" width="30px" >
                
              </a>
              </td>  
            </tr>
         </c:forEach>
            <tr>
             <td style="text-align: center;" colspan="10">
                <a href="../cgdctrl/cgdlistpage.do?pageNum=${p.firstPage }">首页</a>
                <a href="../cgdxxctrl/cgdlistpage.do?pageNum=${p.prePage }">上一页</a>
                <a href="../cgdxxctrl/cgdlistpage.do?pageNum=${p.nextPage }">下一页</a>
                <a href="../cgdxxctrl/cgdlistpage.do?pageNum=${p.lastPage }">尾页</a>
                                       当前${p.pageNum }/${p.pages }页，共${p.total }条
             </td>
          </tr> 
          

      </table>   
 


     </body>
     
   </html>  
    
