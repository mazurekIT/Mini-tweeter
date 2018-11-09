<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Twiter</title>
</head>
<body>

<h1>Logowanie</h1>

<form:form method="post" modelAttribute="loginDto">
    Login:<form:input path="login"/><br>
    Hasło:<form:password path="password"/><br>
    <input type="submit" value="Zaloguj się">
</form:form>
</body>
</html>
