<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/9
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="${pageContext.request.contextPath}/register" method="post">
    <div class="input-form">
        <input type=" text" name="nickname" placeholder="设置昵称">
    </div>
    <div class="input-form">
        <input type="text" name="username" placeholder="设置帐号">
    </div>
    <div class="input-form">
        <input type = "text" name = "password" placeholder="设置密码">
    </div>
    <div class="center">
        <input class = "login" type="submit"  value="注册">
    </div>
</form>
