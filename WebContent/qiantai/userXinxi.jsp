<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 

<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	    <base target="_self"/>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
		<link href="<%=path %>/css/Common.css" rel="stylesheet" type="text/css" />
    <link href="<%=path %>/css/sitegeneric08.css" rel="stylesheet" type="text/css" />
		<script language="javascript">
            function closeOpen()
		    {
		       window.returnValue=false;
		       window.close();
		    }
		    function check1()
		    {
		        if(document.form1.uname.value=="")
		        {
		            alert("请输入账号");
		            return false;
		        }
		        if(document.form1.upass.value=="")
		        {
		            alert("请输入密码");
		            return false;
		        }
		        if(document.form1.name.value=="")
		        {
		            alert("请输入姓名");
		            return false;
		        }
		        document.form1.submit();
		    }
        </script>
	</head>
	
<body>
<!-- head如果图片高度不合适。请修改Common.ces里面的".Header .HeaderTop"的高度。和".Header"的高度-->
<jsp:include flush="true" page="/qiantai/inc/incTop.jsp"></jsp:include>    
<!-- head-->	
	
	
		
	
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
	
			<form action="<%=path %>/userEdit.action" name="form1" method="post">
				<table width="98%" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#CCCCCC">
					<tr>
						<td width="20%" height="30" align="right" bgcolor="#F9F9F9" style="font-size: 11px;">
							账号：
						</td>
						<td width="80%" bgcolor="#FFFFFF">
							&nbsp;
							<input type="text" name="userName" id="userName" value="${sessionScope.user.uname}" readonly="readonly"/>
						    (账号只读)
						</td>
					</tr>
					<tr>
						<td height="30" align="right" bgcolor="#F9F9F9" style="font-size: 11px;">
							密码：
						</td>
						<td bgcolor="#FFFFFF">
							&nbsp;
							<input type="password" name="upass" value="${sessionScope.user.upass}"/>
						</td>
					</tr>
					<tr>
						<td height="30" align="right" bgcolor="#F9F9F9" style="font-size: 11px;">
							姓名：
						</td>
						<td bgcolor="#FFFFFF">
							&nbsp;
							<input type="text" name="name" value="${sessionScope.user.name}"/>
						</td>
					</tr>


					<tr>
						<td height="30" align="right" bgcolor="#F9F9F9" style="font-size: 11px;">
							爱好：
						</td>
						<td bgcolor="#FFFFFF">
							&nbsp;
							<input type="text" name="love" value="${sessionScope.user.love}"/>
						</td>
					</tr>
					<tr>
						<td height="30" align="right" bgcolor="#F9F9F9" style="font-size: 11px;">
							手机：
						</td>
						<td bgcolor="#FFFFFF">
							&nbsp;
							<input type="text" name="phone" value="${sessionScope.user.phone}"/>
						</td>
					</tr>
					
					<tr>
						<td height="30" align="right" bgcolor="#F9F9F9">
							&nbsp;
						</td>
						<td bgcolor="#FFFFFF">
							&nbsp;
							
							<input type="button" value="确定" onclick="check1();"/>
							<input type="button" value="取消" onclick="closeOpen()"/>
						</td>
					</tr>
				</table>
			</form>
			
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
