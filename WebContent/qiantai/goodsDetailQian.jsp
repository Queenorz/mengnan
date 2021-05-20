<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	<link href="<%=path %>/css/Common.css" rel="stylesheet" type="text/css" />
    <link href="<%=path %>/css/sitegeneric08.css" rel="stylesheet" type="text/css" />
    <script language="javascript">
        function buy1()
        {
                 document.buy.submit();
        }
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
				<div class="NewContainer771">
					<div class="BoxHeader">
						<div class="BoxHeader-center MarginTop10">甜品详细信息</div>
					</div>
					<div class="Slot" style="height: 100%">
						<form action="<%=path %>/bookOrder" method="post" name="buy">
						
									    <table width="100%" border="0" cellpadding="9" cellspacing="9">
									
										    <tr>
										       <td align="left">甜品名称：${food.name} </td>
										    </tr>
										    <tr>
										       <td align="left">甜品介绍：${food.info}</td>
										    </tr>
										    <tr>
										       <td align="left">甜品价格：${food.price}</td>
										    </tr>
										    <tr>
										       <td align="left">甜品类型：${food.type}</td>
										    </tr>
										    <tr>
										       <td align="left">地址：${food.address}</td>
										    </tr>
										    <tr>
										       <td align="left">预订数量：<input type="text" name="num" value="1" size="8" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"/></td>
										    </tr>
										    <tr>
										       <td align="left">备注：<input type="text" name="remarks" /></td>
										    </tr>
										    <tr>
										       <td><input type="hidden" name="food" value="${food.name} "/>
										       <input type="hidden" name="price" value="${food.price} "/>
										       
										       <img onclick="buy1()" src="<%=path %>/img/goumai.jpg"/></td>
										    </tr>
										</table>
									
						</form>
                    </div>
				</div>
		 </div>
</div>
</div>
<!--body-->
	
	
	
<!--foot -->	
<div align="center" class="Wrapper">
	<div id="footer" align="center" class="Footer">
		 <jsp:include flush="true" page="/qiantai/inc/incFoot.jsp"></jsp:include>
	</div>
</div>
<!--foot -->	
</body>
</html>
