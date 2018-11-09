<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users List</title>
</head>
<body>
<h1>Lista Users</h1>

<c:forEach items="${tweets}" var="x">
    ${x.title} - ${x.tweetText}
    <br>

</c:forEach>
<br><a href="/home">DOM</a>

</body>
</html>
