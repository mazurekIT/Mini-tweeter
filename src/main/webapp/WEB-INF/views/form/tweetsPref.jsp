<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>tweets</title>
</head>
<body>

<h1>Tweets prefix</h1>
<c:forEach items="${tweets}" var="tweet">
    ${tweet.title} - ${tweet.tweetText}<br>
</c:forEach>

</body>
</html>
