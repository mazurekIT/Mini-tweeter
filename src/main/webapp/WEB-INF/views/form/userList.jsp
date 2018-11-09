<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users List</title>
</head>
<body>
<h1>Lista Users</h1>

<table border="1">
    <tr>
        <td>Imie</td>
        <td>Nazwisko</td>
        <td>email</td>
        <td>Akcja</td>
    </tr>
    <c:forEach items="${users}" var="x">
        <tr>
            <td>${x.lastName} </td>
            <td>${x.firstName}</td>
            <td>${x.email}</td>
            <td>
                <a href="/user/confirm/${x.id}">Usuń</a>
                <a href="/user/updateuser/${x.id}">Edycja</a>
            </td>
        </tr>

    </c:forEach>
</table>


<br><a href="/home">DOM</a>

</body>
</html>
