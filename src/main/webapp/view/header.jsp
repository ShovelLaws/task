<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/29
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%--<%@include file="layout.jsp" %>--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="false" %>
<header>
<%--联系电话、登录方式--%>
    <div class="container ">
        <div class="row">
            <div class="col-md-9 head-text">
                客服热线电话：010-594-78634
            </div>
            <div class="col-md-3 head-icon">
                <img src="${pageContext.request.contextPath}/view/images/wechat.jpg">
                <img src="${pageContext.request.contextPath}/view/images/qq.jpg">
                <img src="${pageContext.request.contextPath}/view/images/weibo.jpg">
            </div>
        </div>
    </div>

    <!-- 折叠导航条 -->
    <!-- 折叠导航条展开状态 -->
    <div class="navigation-menu">
        <div class="container">
            <nav class="navbar navbar-expand-md bg-dark navbar-dark">
                <a class="navbar-brand" href="#">
                    <img src="${pageContext.request.contextPath}/view/images/brand-1.png">
                    <img src="${pageContext.request.contextPath}/view/images/brand-2.png">
                </a>
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a href="task8.jsp" class="nav-link">首页</a>
                    </li>
                    <li class="nav-item">
                        <a href="/springmvc_war_exploded/profession" class="nav-link">职业</a>
                    </li>
                    <li class="nav-item">
                        <a href="task8-1.jsp" class="nav-link">推荐</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">关于</a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
    <!-- 折叠导航条收缩状态 -->
    <div class="navigation-menu1">
        <div class="container">
            <nav class="navbar navbar-expand-md bg-dark navbar-dark">
                <a class="navbar-brand" href="#">
                    <img src="${pageContext.request.contextPath}/view/images/brand-1.png">
                    <img src="${pageContext.request.contextPath}/view/images/brand-2.png">
                </a>
                <button class="navber-toggler" type="button" data-toggle="collapse" data-target="#bdjy" data-parent="#bdjy" >
                    <span class="navbar-toggler-icon"></span>
                </button>
            </nav>
        </div>
        <div class="collapse navbar-collapse" id="bdjy">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a href="task8.jsp" class="nav-link">首页</a>
                </li>
                <li class="nav-item">
                    <a href="task8-2.jsp" class="nav-link">职业</a>
                </li>
                <li class="nav-item">
                    <a href="task8-1.jsp" class="nav-link">推荐</a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">关于</a>
                </li>
            </ul>
        </div>
    </div>
<%--<div class="container">--%>
<%--    <div class="row">--%>
<%--        <div class="col-md-9 head-text">--%>
<%--            客服电话：010-594-78634--%>
<%--        </div>--%>
<%--        <div class="col-md-3 head-icon">--%>
<%--            <img src="images/wechat.jpg">--%>
<%--            <img src="images/qq.jpg">--%>
<%--            <img src="images/weibo.jpg">--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<%--&lt;%&ndash;折叠导航条&ndash;%&gt;--%>
<%--&lt;%&ndash;折叠导航条张开状态&ndash;%&gt;--%>
<%--<div class="navigation-menu">--%>
<%--    <div class="container">--%>
<%--        <nav class="navbar navbar-expand-md bg-bark navbar-dark">--%>
<%--            <a class="navbar-brand" href="#">--%>
<%--                <img src="images/brand-1.png">--%>
<%--                <img src="images/brand-2.png">--%>
<%--            </a>--%>
<%--            <ul class="navbar-nav">--%>
<%--                <li class="nav-item active">--%>
<%--                    <a href="task8.jsp" class="nav-link">首页</a>--%>
<%--                </li>--%>
<%--                <li class="nav-item">--%>
<%--                    <a href="task8-2.jsp" class="nav-link">职业</a>--%>
<%--                </li>--%>
<%--                <li class="nav-item">--%>
<%--                    <a href="task8-1.jsp" class="nav-link">推荐</a>--%>
<%--                </li>--%>
<%--                <li class="nav-item">--%>
<%--                    <a href="#" class="nav-link">关于</a>--%>
<%--                </li>--%>
<%--            </ul>--%>
<%--        </nav>--%>
<%--    </div>--%>
<%--</div>--%>
<%--&lt;%&ndash;折叠导航栏收缩状态&ndash;%&gt;--%>
<%--<div class="navigation-menu1">--%>
<%--    <div class="container">--%>
<%--        <nav class="navbar navbar-expand-md bg-dark navbar-dark">--%>
<%--            <a class="navbar-brand" href="#">--%>
<%--                <img src="images/brand-1.png">--%>
<%--                <img src="images/brand-2.png">--%>
<%--            </a>--%>
<%--            <button class="navber-toggler" type="button" data-toggle="collapse" data-target="#bdjy" data-parent="#bdjy">--%>
<%--                <span class="navbar-toggler-icon"></span>--%>
<%--            </button>--%>
<%--        </nav>--%>
<%--    </div>--%>
<%--    <div class="collapse navbar-collapse" id="bdjy">--%>
<%--        <ul class="navbar-nav">--%>
<%--            <li class="nav-item active">--%>
<%--                <a href="task8.jsp" class="nav-link">首页</a>--%>
<%--            </li>--%>
<%--            <li class="nav-item">--%>
<%--                <a href="task8-2.jsp" class="nav-link">职业</a>--%>
<%--            </li>--%>
<%--            <li class="nav-item">--%>
<%--                <a href="task8-1.jsp" class="nav-link">推荐</a>--%>
<%--            </li>--%>
<%--            <li class="nav-item">--%>
<%--                <a href="#" class="nav-link">关于</a>--%>
<%--            </li>--%>
<%--        </ul>--%>
<%--    </div>--%>
<%--</div>--%>
</header>