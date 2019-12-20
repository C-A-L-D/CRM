<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>后台登录-L-admin2.0</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="css/font.css">
	<link rel="stylesheet" href="css/xadmin.css">
	<link rel="stylesheet" href="css/main.css">
	
    <script src="js/jquery.min.js"></script>
    <script src="lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="js/xadmin.js"></script>
    

</head>
<body>
    <!-- 顶部开始 -->
    <div class="container">
        <div class="logo"><a href="index.html">L-admin v2.0</a></div>
        <div class="left_open">
            <i title="展开左侧栏" class="iconfont">&#xe699;</i>
        </div>
        <ul class="layui-nav left fast-add" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">+新增</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a onClick="x_admin_show('资讯','http://www.baidu.com')"><i class="iconfont">&#xe6a2;</i>资讯</a></dd>
              <dd><a onClick="x_admin_show('图片','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>图片</a></dd>
               <dd><a onClick="x_admin_show('用户','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>用户</a></dd>
            </dl>
          </li>
        </ul>
        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">admin</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a onClick="x_admin_show('个人信息','http://www.baidu.com')">个人信息</a></dd>
              <dd><a onClick="x_admin_show('切换帐号','http://www.baidu.com')">切换帐号</a></dd>
              <dd><a href="login.html">退出</a></dd>
            </dl>
          </li>
          <li class="layui-nav-item to-index"><a href="#">前台首页</a></li>
        </ul>
        
    </div>
    <!-- 顶部结束 -->
    <!-- 中部开始 -->
     <!-- 左侧菜单开始 -->
    <div class="left-nav">
      <div id="side-nav" class="layui-side-scroll">
        <ul id="nav">
             <li >
                <a href="javascript:;">
                    <i class="iconfont">&#xe6eb;</i>
                    <cite>主页</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li><a _href="html/welcome.html"><i class="iconfont">&#xe6a7;</i><cite>控制台</cite></a></li >
                </ul>
            </li>
             <li >
                <a href="javascript:;">
                    <i class="iconfont">&#xe6e4;</i>
                    <cite>进货管理</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li><a _href="gysxxctrl/gyslistpage.do"><i class="iconfont">&#xe6a7;</i><cite>供应商管理</cite></a></li>
                    <li><a _href="cgdctrl/cgdlistpage.do"><i class="iconfont">&#xe6a7;</i><cite>采购单管理</cite></a></li>
                    <li> <a _href="xbhctrl/xbhlistpage.do"><i class="iconfont">&#xe6a7;</i><cite>需补货管理</cite></a></li>
                </ul>
            </li>
            
            
            <li>
                <a href="javascript:;"><i class="iconfont">&#xe6f6;</i><cite>库存-陈卓越</cite><i class="iconfont nav_right">&#xe6a7;</i></a>
                <ul class="sub-menu">
                    <li><a _href="html/upload.html"><i class="iconfont">&#xe6a7;</i><cite>文件上传</cite></a></li>
                    <li><a _href="html/page.html"><i class="iconfont">&#xe6a7;</i><cite>分页</cite></a></li>
                    <li><a _href="html/cate.html"><i class="iconfont">&#xe6a7;</i><cite>多级分类</cite></a></li>
                    <li><a _href="html/carousel.html"><i class="iconfont">&#xe6a7;</i><cite>轮播图</cite></a></li>
                    <li><a _href="html/city.html"><i class="iconfont">&#xe6a7;</i><cite>城市三级联动</cite></a></li>
                </ul>
            </li>
             <li >
                <a href="javascript:;">
                    <i class="iconfont">&#xe726;</i>
                    <cite>客户管理-金鸣</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li><a _href="KehuJsp/Kehuxinxi.html"><i class="iconfont">&#xe6a7;</i><cite>客户信息</cite></a></li>
                    <li><a _href="Kehuxinxictrl/KehuxinxiListPage.do"><i class="iconfont">&#xe6a7;</i><cite>客户信息</cite></a></li>
                    <li><a _href="KehuJsp/Kehuliushi.html"><i class="iconfont">&#xe6a7;</i><cite>客户流失</cite></a></li>
                </ul>
            </li>
                   
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6f5;</i>
                    <i class="iconfont">&#xe69e;</i>
                    <cite>办公管理-黄静怡</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="offmessctrl/offmesslist.do">                 
                             <i class="iconfont">&#xe69b;</i>
                            <cite>办公短消息</cite>
                        </a>
                    </li >
                </ul>
                 <ul class="sub-menu">
                    <li>
                        <a _href="html/admin-list.html">
                            <i class="iconfont">&#xe6bf;</i>
                            <cite>个人日程表</cite>
                        </a>
                    </li >
                </ul>
                 <ul class="sub-menu">
                    <li>
                        <a _href="html/order-list.html">
                            <i class="iconfont">&#xe6b3;</i>
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>办公短消息</cite>
                        </a>
                    </li >
                </ul>
                 <ul class="sub-menu">
                    <li>
                        <a _href="html/order-list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>个人日程表</cite>
                        </a>
                    </li >
                </ul>
                 <ul class="sub-menu">
                    <li>
                        <a _href="html/order-list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>考核任务</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe726;</i>
                    <cite>管理员管理</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="html/admin-list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>管理员列表</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="html/admin-role.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>角色管理</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="html/admin-cate.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>权限分类</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="html/admin-rule.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>权限管理</cite>
                        </a>
                    </li >
                </ul>
            </li>            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b8;</i>
                    <cite>公司管理-朱志远</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="sysgsctrl/gspage.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>公司信息列表</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="sysbmctrl/bmpage.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>部门信息表</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="sysjobctrl/jobpage.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>职务信息表</cite>
                        </a>
                    </li>
                    <li>
                         <a _href="sysygctrl/ygpage.do">
                             <i class="iconfont">&#xe6a7;</i>
                             <cite>员工信息表</cite>
                         </a>
                    </li>
                </ul>
            </li>             
<li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ae;</i>
                    <cite>系统管理</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="loginController/person.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>个人信息</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="loginController/allUsersInfo.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>账户管理</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="rap/selectAllRoleAndPower.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>角色管理</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="power/selectAllPower.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>权限管理</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="html/echarts5.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>系统日志</cite>
                        </a>
                    </li>
                </ul>
            </li>            
         </ul>
      </div>
    </div>
    <!-- <div class="x-slide_left"></div> -->
    <!-- 左侧菜单结束 -->
    <!-- 右侧主体开始 -->
    <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
          </ul>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='html/welcome.html' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
          </div>
        </div>
    </div>
    <div class="page-content-bg"></div>
    <!-- 右侧主体结束 -->
    <!-- 中部结束 -->
    <!-- 底部开始 -->
    <!--<div class="footer">
        <div class="copyright">Copyright ©2019 L-admin v2.3 All Rights Reserved</div>  
    </div>-->
    <!-- 底部结束 -->
</body>
</html>