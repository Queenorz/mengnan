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
           function foodDel(id)
           {
               if(confirm('您确定删除吗？'))
               {
                   window.location.href="<%=path %>/menuInfoServlet?type=delete&id="+id;
               }
           }
           
           
           function foodMana(id)
           {
                   window.location.href="<%=path %>/menuInfoServlet?type=getbyid&id="+id;
           }

           
       </script>
	</head>

	<body leftmargin="8" topmargin="8" background='<%=path %>/images/allbg.gif'>
			<table width="99%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="8" background="<%=path %>/images/tbg.gif">&nbsp;&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
				<td>序号</td>
					<td>甜品名称</td>
					                  <td>市场价</td>
					                  <td>类型</td>
					                  <td>数量</td>
					                  <td>地址</td>
					                  <td>描述</td>
					<td width="40%">操作</td>
		        </tr>	

				<c:forEach var="item" items="${allFood}" varStatus="ss">
				
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						${ss.index+1}
					</td>
					<td bgcolor="#FFFFFF">${item.name}</td>
									  <td bgcolor="#FFFFFF">￥${item.price}</td>
									  <td bgcolor="#FFFFFF">${item.type}</td>
									  <td bgcolor="#FFFFFF">${item.num}</td>
									  <td bgcolor="#FFFFFF">${item.address}</td>
									  <td bgcolor="#FFFFFF">${item.info}</td>
					<td bgcolor="#FFFFFF" align="center">
						<input type="button" value="修改" Onclick="foodMana('${item.id}')"/>
						
						<input type="button" value="删除" Onclick="foodDel('${item.id}')"/>
					</td>
				</tr>
				</c:forEach>
			</table>
	</body>
</html>
