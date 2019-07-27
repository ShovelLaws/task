<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/15
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="message" >
        <spring:message code="${code}"/>
    </json:property>
    <json:array name="data" var="item" items="${titles}">
        <json:object>
            <json:property name="id" value="${item.id}"/>
            <json:property name="theme_name" value="${item.name}"/>
            <json:property name="level" value="${item.level}"/>
            <json:property name="status" value="${item.status}"/>
            <json:property name="editor_id" value="${item.editor_id}"/>
            <json:property name="create_at" value="${item.create_at}"/>
            <json:property name="update_at" value="${item.update_at}"/>
        </json:object>
    </json:array>

    <json:object name="editor">
        <c:forEach items="${accounts}" var="items" >
            <json:object name="${items.id}">
                <json:property name="nickname" value="${items.nickname}"/>
                <json:property name="username" value="${items.username}"/>
            </json:object>
        </c:forEach>
    </json:object>
</json:object>