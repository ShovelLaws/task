<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/28
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isErrorPage="true"%>
<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
<%--pageEncoding="UTF-8" %>--%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>
<json:object>
    <json:property name="code" value="${code}"/>
    <json:property name="message" >
        <spring:message code="${code}"/>
    </json:property>
</json:object>
