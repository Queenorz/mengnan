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
  </head>
  
  <body>

	 <div class="SquarelyGreenContainer">
		<div class="top">
			<div class="bgbtop-center">
				<span><a href="">甜品查询</a></span>
				<div class="WinRight"></div>
			</div>
		</div>
		<div class="Slot" style="height: 40px;">
		    <form action="<%=path %>/getAllMemuInfoServlet" name="from1" method="post">
		        <table>
		            <tr>
		                <td>
		                    <input type="text" name="name" size="13"/>
		                </td>
		                <td>
		                    <input type="submit" value="查询" style="border:#ccc 1px solid; background-color:#FFFFFF; font-size:12px; padding-top:3px;"/>
		                </td>
		            </tr>
		        </table>
		    </form>
		</div>
	 </div>


  </body>
</html>
