<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page isELIgnored="false" %> 
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title></title>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	<link href="css/Common.css" rel="stylesheet" type="text/css" />
    <link href="css/sitegeneric08.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
    <script language="JavaScript" type="text/javascript">
    </script>
  </head>
  
<body>
<!-- head如果图片高度不合适。请修改Common.ces里面的".Header .HeaderTop"的高度。和".Header"的高度-->
<jsp:include flush="true" page="/qiantai/inc/incTop.jsp"></jsp:include>    
<!-- head-->	
	
	
	
	
<!--body-->
<div align="center" class="Wrapper">
<div id="MainCenter" align="center" class="MainCenter">
     <div id="navigation" class="naivgation">
			<jsp:include flush="true" page="/qiantai/inc/incLeft.jsp"></jsp:include>
	 </div>
	 <div id="content" class="Sub">
		 <div class="NewContainer770">
		<div class="BoxHeader">
				    <div class="BoxHeader-center MarginTop10">
						<%-- <span style="float:left">最新甜品</span>
						<span style="float:right"><a href="<%=path %>/goodsAllNoTejia.action">更多>></a>&nbsp;&nbsp;&nbsp;&nbsp;</span> --%>
			        </div> 
				</div>
					<div class="Slot" style="height: 100%">
						<table width="99%" border="0" cellpadding="2" cellspacing="1" bgcolor="#FFFFFF" align="center" style="margin-top:8px">
				              <tr align="center" bgcolor="#FAFAF1" height="22">
					                  <td>甜品名称</td>
					                  <td>市场价</td>
					                  <td>类型</td>
					                  <td>数量</td>
					                  <td>地址</td>
					                  <td>描述</td>
					                  <td>操作</td>
					              </tr>
						
						<c:forEach var="item" items="${allFood}" varStatus="status">
								  <tr align='center' bgcolor="#FFFFFF" height="22">
									  <td>${item.name}</td>
									  <td>￥${item.price}</td>
									  <td>${item.type}</td>
									  <td>${item.num}</td>
									  <td>${item.address}</td>
									  <td>${item.info}</td>
									  <td><a href="<%=path %>/getMenuInfo?id=${item.id}"/><img alt="" src="<%=path %>/img/goumai.jpg" border=0/></a></td>
								  </tr>
								</c:forEach>
								
	        			</table>
                    </div>
	     </div>
     </div>
</div>
</div>
	
	
	
<div align="center" class="Wrapper">
	<div id="footer" align="center" class="Footer">
		 <jsp:include flush="true" page="/qiantai/inc/incFoot.jsp"></jsp:include>
	</div>
</div>
</body>
</html>
