<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User</title>
</head>
<body>

<h1>Dodaj User</h1>

<form:form method="post" modelAttribute="user">
    <table>
        <tr>
            <td>Imię</td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td>Nazwisko</td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save"></td>
        </tr>
    </table>
    <form:errors path="*"/>

</form:form>

</body>
</html>
