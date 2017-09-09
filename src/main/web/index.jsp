<%--
  Created by IntelliJ IDEA.
  User: isyou
  Date: 2017/8/30
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form method="post" action="test/getuser.do">
    id：<input type="text" name="userId" id="uid"/>
    用户名：<input type="text" name="userName" id="uname"/><br/>
    密码：<input type="text" name="userPassword" id="password"/><br/>
    性别：<input type="text" name="userSex" id="sex"/><br>
    <input type="submit" val="查询">
</form>
</body>
</html>