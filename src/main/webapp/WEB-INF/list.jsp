<%-- 
    Document   : list
    Created on : 2017-9-21, 11:14:03
    Author     : sihai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="st" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! list</h1>
        <st:url value="/edit" var="editUrl" />
        <st:url value="/delete" var="deleteUrl" />
        <nav><a href="${editUrl}" >添加</a></nav>
        <table border="1px">
            <c:forEach items="${todoList}" var="todo">
                <tr><td>${todo.title}</td><td><a href="${editUrl}?id=${todo.id}">编辑</a>|<a href="${deleteUrl}?id=${todo.id}">删除</a></td></tr>
            </c:forEach>
        </table>
    </body>
</html>
