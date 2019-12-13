<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
  <div class="x-body" cols>
        <form class="layui-form" action="../gysxxctrl/update.do" method="post"
            enctype="multipart/form-data">
          <div class="layui-form-item">
              <label  class="layui-form-label">
                                       供应商名称：
              </label>
              <div class="layui-input-inline">
                  <input type="hidden"  name="gysId" required lay-verify="required"
                  autocomplete="off" value="${u.gysId }" class="layui-input">
                  <input type="text"  name="gysName" required lay-verify="required"
                  autocomplete="off" value="${u.gysName }" class="layui-input">
              </div>     
          </div>
          <div class="layui-form-item">
              <label  class="layui-form-label">
                                        供应商简称：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.gysJc }" name="gysJc" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
           <div class="layui-form-item">
              <label  class="layui-form-label">
                                       联系人：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.lxr }" name="lxr" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
        
           <div class="layui-form-item">
              <label  class="layui-form-label">
                                        固定电话：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.gdPhone }" name="gdPhone" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
            <div class="layui-form-item">
              <label  class="layui-form-label">
                                        移动电话：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.ydPhone }" name="ydPhone" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
      
          
         <div class="layui-form-item">
              <label  class="layui-form-label">
                                        联系传真：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.lxcz }" name="lxcz" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label  class="layui-form-label">
                                        联系地址：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.lxdz }" name="lxdz" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
            <div class="layui-form-item">
              <label  class="layui-form-label">
                                        联系邮编：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.lxyb }" name="lxyb" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
              <div class="layui-form-item">
              <label  class="layui-form-label">
                                        邮箱：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.mail }" name="mail" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
            <div class="layui-form-item">
              <label  class="layui-form-label">
                                        开户银行：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.khbank }" name="khbank" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
              <div class="layui-form-item">
              <label  class="layui-form-label">
                                        银行账号：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.yhzh }" name="yhzh" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
               <div class="layui-form-item">
              <label  class="layui-form-label">
                                        公司账号：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.gszy }" name="gszy" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
        
             <div class="layui-form-item">
              <label  class="layui-form-label">
                                        是否有效：
              </label>
              <div class="layui-input-inline">
                      <select name="isYx">
                          <option ${u.isYx=="0" ? "selected":"" }>否</option>
                          <option ${u.isYx=="1" ? "selected":"" }>是</option>
                      </select>
              </div>
          </div>
        
           <div class="layui-form-item">
              <label  class="layui-form-label">
                                        备注：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.remark}" name="remark" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
        
           <div class="layui-form-item">
              <label  class="layui-form-label">
                                        公司编号：
              </label>
              <div class="layui-input-inline">
                  <input type="text" value="${u.gsId}" name="gsId" required 
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label  class="layui-form-label">
              </label>
              <input type="submit" value="确定"  class="layui-btn" onclick="return confirm('是否确定修改')"  >
                                          
          </div>
      </form>
    </div>
   
  </body>

</html>
