<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Tweet</title>
</head>
<body>

<h1>Dodaj Tweet</h1>

<form:form method="post" modelAttribute="tweet">
    <table>
        <tr>
            <td>Tytul</td>
            <td><form:input path="title"/></td>
        </tr>
        <tr>
            <td>Wiadomosc</td>
            <td><form:input path="tweetText"/></td>
        </tr>
        <tr>
            <td>User</td>
            <td><form:select path="user" items="${users}" itemLabel="firstName" itemValue="id"/></td>
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
