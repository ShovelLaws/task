<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/28
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF8">
    <title>UPDATE!!</title>
</head>
<body>
<form action="/a/studentupdate/${usertoput.id}" method="post">
    姓名: <input type="text" name="name" value="${usertoput.name}"> <br>
    年龄: <input type="text" name="age" value="${usertoput.age}"> <br>
    <input type="submit" value="修改">
</form>
</body>
</html>
