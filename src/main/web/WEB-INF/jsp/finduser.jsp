<%--
  Created by IntelliJ IDEA.
  User: isyou
  Date: 2017/9/2
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="getuser/user.do">
    id：<input type="text" name="userId" id="uid"/>
    用户名：<input type="text" name="userName" id="uname"/><br/>
    密码：<input type="text" name="userPassword" id="password"/><br/>
    性别：<input type="text" name="userSex" id="sex"/><br>
    <input type="submit" val="查询">
</form>
</body>
</html>
