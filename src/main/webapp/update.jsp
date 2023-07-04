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
    <title>update</title>
</head>
<body>
    <%
        PersonController personController = new PersonController();
        Person person = new Person();
        person.setId(request.getParameter("id"));
        person.setName(request.getParameter("name"));
        person.setFamily(request.getParameter("family"));
        personController.update(person);
    %>
done
</body>
</html>
