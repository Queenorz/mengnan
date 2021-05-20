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
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
        
        <link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
        
        <script language="javascript">
            function check()
		    {
		        if(document.formAdd.name.value=="")
		        {
		            alert("请输入名称");
		            return false;
		        }
		        document.formAdd.submit();
		    } 
        </script>
	</head>

	<body leftmargin="2" topmargin="9" background='<%=path %>/images/allbg.gif'>
			<form action="<%=path %>/menuInfoServlet?type=add" name="formAdd" method="post">
				     <table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
						<tr bgcolor="#EEF4EA">
					        <td colspan="3" background="<%=path %>/images/wbg.gif" class='title'><span>&nbsp;</span></td>
					    </tr>
						<tr align='center' bgcolor="#FFFFFF" height="33">
						    <td width="10%" bgcolor="#FFFFFF" align="right">
						         名称：
						    </td>
						    <td width="90%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="name" size="60"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" height="33">
						    <td width="10%" bgcolor="#FFFFFF" align="right">
						        价格：
						    </td>
						    <td width="90%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="price" size="60"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" height="33">
						    <td width="10%" bgcolor="#FFFFFF" align="right">
						         甜品种类：
						    </td>
						    <td width="90%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="typename" size="60"/>
						    </td>
						</tr>
		
						
						<tr align='center' bgcolor="#FFFFFF" height="33"><td width="10%" bgcolor="#FFFFFF" align="right">
						         描述：</td>
						    <td width="90%" bgcolor="#FFFFFF" align="left">
						        <textarea rows="4" cols="88" name="info"></textarea>
						    </td>
						</tr>
						
						<tr align='center' bgcolor="#FFFFFF" height="33"><td width="10%" bgcolor="#FFFFFF" align="right">
						         地址：</td>
						    <td width="90%" bgcolor="#FFFFFF" align="left">
						       <input type="text" name="address" size="60"/>
						    </td>
						</tr>

						<tr align='center' bgcolor="#FFFFFF" height="33"><td width="10%" bgcolor="#FFFFFF" align="right">
						         数量：</td>
						    <td width="90%" bgcolor="#FFFFFF" align="left">
						       <input type="text" name="num" size="60"/>
						    </td>
						</tr>
						
						
						<tr align='center' bgcolor="#FFFFFF" height="33">
						    <td width="10%" bgcolor="#FFFFFF" align="right">
						        &nbsp;
						    </td>
						    <td width="90%" bgcolor="#FFFFFF" align="left">
						       <input type="button" value="提交" onclick="check()"/>&nbsp; 
						       <input type="reset" value="重置"/>&nbsp;
						    </td>
						</tr>
					 </table>
			</form>
   </body>
</html>
