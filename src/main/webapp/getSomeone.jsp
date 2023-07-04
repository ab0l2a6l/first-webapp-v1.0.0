
<%@page import="model.entity.Person" %>
<%@ page import="controller.PersonController" %><%--

  Created by IntelliJ IDEA.
  User: abolfazl.m
  Date: 7/4/2023
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>getSomeone</title>
</head>
<body>
    <table>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>family</td>
        </tr>

        <%
            PersonController personController = new PersonController();
            Person person = new Person();

            person=personController.getSomeone(request.getParameter("id"));

        %>
        <tr>
            <td><%=person.getId()%></td>
            <td><%=person.getName()%></td>
            <td><%=person.getFamily()%></td>
        </tr>
    </table>

</body>
</html>
