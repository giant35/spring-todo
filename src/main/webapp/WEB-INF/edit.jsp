<%-- 
    Document   : edit
    Created on : 2017-9-21, 11:14:10
    Author     : sihai
--%>

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
        <h1>edit</h1>
        <st:url value="/update" var="updateUrl" />
        <sf:form modelAttribute="todo" method="POST" action="${updateUrl}" >
            <sf:hidden path="id" />
            title:<sf:input path="title" /><br />
            finish:<sf:checkbox path="isFinish" /><br />
            <sf:button>保存</sf:button>
        </sf:form>
    </body>
</html>
