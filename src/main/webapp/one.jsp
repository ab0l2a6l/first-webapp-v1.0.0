<%@ page import="controller.PersonController" %>

<%@ page import="model.entity.Person" %>
<%--
  Created by IntelliJ IDEA.
  User: abolfazl.m
  Date: 7/4/2023
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        PersonController personController = new PersonController();
        Person person = new Person();
        person.setId(request.getParameter("id"));
        person.setName(request.getParameter("name"));
        person.setFamily(request.getParameter("family"));
        personController.insert(person);
    %>
done
</body>
</html>
