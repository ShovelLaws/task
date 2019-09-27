<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/9
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="${pageContext.request.contextPath}/phoneRegister" method="post">

    <div class="input-form">
        <input type=" text" name="photo" placeholder="设置头像">
    </div>
    <div class="input-form">
        <input type="text" name="username" placeholder="设置帐号">
    </div>
    <div class="input-form">
        <input type = "text" name = "password" placeholder="设置密码">
    </div>
    <div class="input-form">
        <input type = "text" name = "phone" placeholder="请输入手机号">
    </div>
    <a href="${pageContext.request.contextPath}/sendVerifyCode"><button>获取验证码</button></a>
    <div class ="col-md-3 head-icon">
        <input type = "text" name = "verifyCode" placeholder="请输入验证码">
    </div>
    <div class="center">
        <input class = "login" type="submit"  value="注册">
    </div>
</form>
