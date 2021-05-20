<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="entity.*,dao.*"%>
<%
  response.setCharacterEncoding("UTF-8");
%>

<html>
<head>
  <title>登录界面</title>
  <link rel="stylesheet" type="text/css" href="csslogin/login.css?id=7671">
  <link rel="stylesheet" type="text/css" href="csslogin/base.css?id=76157">
  <style>
  </style>
 
</head>
<body>
<div id="whole">
  <div id="login">
    <div class="form1">
      <h1>甜品销售系统</h1>
      <form name="reg" action="login" method="post">
        <div class="form-text">
          <p>用户名：</p>
          <input type="text" name="uname" required="required" />
        </div>

        <div class="form-text">
          <p>密 码：</p>
          <input type="password" name="upass" required="required" />
        </div>

        <p>选择身份：</p><br>
        <label><input name="status" type="radio" value="diner" required="required" />用户</label>
       
        <label><input name="status" type="radio" value="staff" required="required"/>管理员</label>

        <input class="btn" type="submit" value="登录"/>
        <p>如果您是新用户，请联系管理员注册：123456；</p>

      </form>
    </div>
  </div>
</div>

</body>
</html>