<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Twiter</title>
</head>
<body>

<h1>Rejestracja</h1>

<form:form method="post" modelAttribute="registrationDto">
    Login:<form:input path="login"/>
    <form:errors path="login"></form:errors><br>
    Email:<form:input path="email"/>
    <form:errors path="email"></form:errors><br>

    Hasło:<form:password path="password"/><br>
    Powtórz Hasło:<form:password path="passwordRepeat"/>
    <form:errors path="password"></form:errors><br>

    <input type="submit" value="Zaloguj się"><br>
</form:form>
</body>
</html>
