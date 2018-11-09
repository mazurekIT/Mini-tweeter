<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Twiter</title>
</head>
<body>

<h1>Rejestracja</h1>

<form:form method="post" modelAttribute="registrationDto">
    Login:<form:input path="login"/><br>
    Email:<form:input path="email"/><br>

    Hasło:<form:password path="password"/><br>
    Powtórz Hasło:<form:password path="passwordRepeat"/><br>

    <input type="submit" value="Zaloguj się"><br>
    <form:errors path="*"></form:errors>
</form:form>
</body>
</html>
