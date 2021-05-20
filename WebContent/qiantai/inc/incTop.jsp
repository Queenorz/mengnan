<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <style type="text/css">
        .Header {CLEAR: both; DISPLAY: block; FLOAT: left; BACKGROUND-IMAGE: url(<%=path %>/img/back111.jpg); WIDTH: 972px; POSITION: relative;}
        .Header .HeaderTop {HEIGHT: 93px}
    </style>

  </head>
  
  <body>
	 <div align="center" class="Wrapper">
		 <div class="Header">
			    <div class="HeaderTop">
				    <br/>
				    <font size="22px;"></font>
				</div>
				<div id="Menu" class="Menu">
					<div id="fstMenu" class="fstMenu"></div>
					<div class="secMenu">
						<span id="secMenu0" class="secMenu-center">
						     <a href="getAllMemuInfoServlet">系统首页</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
						     <A href="toMyCartServlet" >我的购物车</A>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp
						     <A href="toMyOrderServlet" >我的订单</A>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp
						     <A href="<%=path %>/qiantai/userXinxi.jsp" >修改我的信息</A>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp
						     
						</span>
					</div>
				</div>	
		 </div>
     </div>	
  </body>
</html>
