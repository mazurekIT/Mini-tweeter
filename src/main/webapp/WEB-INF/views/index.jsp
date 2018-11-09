<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<h1>DOM</h1>


<c:forEach items="${users}" var="user">
    <a href="/user/${user.id}/tweets">Tweets of User id ${user.id}</a><br>
</c:forEach>


<br>
########################<br>
<br>
<%--<a href="/user/search-tweets">Tweets with Prefix "t"</a><br>--%>
<a href="/user/search-tweets">Tweets with Prefix </a><br>
<br>
########################<br>
<br>
<a href="/user/add">User Add</a><br>
<a href="/user/all">User List All</a><br>
<br>
########################<br>
<br>
<a href="/tweet/add">Tweet Add</a><br>
<a href="/tweet/all">Tweet List All</a><br>

</body>
</html>
