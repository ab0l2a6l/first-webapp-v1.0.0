<%--
  Created by IntelliJ IDEA.
  User: abolfazl.m
  Date: 7/4/2023
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="controller.PersonController" %>
<%@ page import="model.entity.Person" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>delete</title>
</head>
<body>
    <%
        PersonController personController = new PersonController();
        personController.delete(request.getParameter("id"));

    %>
    done
</body>
</html>
