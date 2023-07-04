<%@ page import="controller.PersonController" %>
<%@ page import="model.entity.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: abolfazl.m
  Date: 7/4/2023
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>family</td>
    </tr>
    <%
        List<Person> list = new ArrayList<>();
        PersonController personController = new PersonController();
        list = personController.getPerson();
        for (Person person : list) {
    %>
        <tr>
            <td><%= person.getId() %></td>
            <td><%= person.getName()%></td>
            <td><%= person.getFamily()%></td>
        </tr>
    <%
        }
    %>

</table>

</body>
</html>
