<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/29
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="titles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta content="width=device-width,initial-scale=1.0" name="viewport" charset="UTF-8">
    <title>任务四</title>
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.js"></script>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/js/bootstrap.js"></script>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/view/reset.css"/>
    <link type=" text/css" rel="stylesheet" href="${pageContext.request.contextPath}/view/style.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/view/style-1.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/view/style-2.css"/>
</head>
<body class= "sticky-header">
<header id="header">
    <titles:insertAttribute name="header"/>
</header>
<main>
    <titles:insertAttribute name="main"/>
</main>
<footer>
    <titles:insertAttribute name="footer"/>
</footer>
</body>
</html>
