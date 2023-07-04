
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    for insert person
    <form action="one.jsp">
        <input type="text" name="id" placeholder="id">
        <input type="text" name="name" placeholder="name">
        <input type="text" name="family" placeholder="family">
        <input type="submit">
    </form>
    for delete person
    <form action="delete.jsp">
        <input type="text" name="id" placeholder="insert id for delete">
        <input type="submit">
    </form>
    for update person
    <form action="update.jsp">
        <input type="text" name="id" placeholder="id">
        <input type="text" name="name" placeholder="new name">
        <input type="text" name="family" placeholder="new family">
        <input type="submit">
    </form>
    for show person
    <form action="getSomeone.jsp">
        <input type="text" name="id" placeholder="insert id for show data">
        <input type="submit">
    </form>

    for show all person
    <a href="getPerson.jsp">getPersons</a>
</body>
</html>