<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mateusz
  Date: 07.11.18
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>errors</title>
</head>
<body>

<c:forEach items="${validate}" var="val">
    ${val.propertyPath} - ${val.message}<br>
    -----------------------<br>
</c:forEach>


</body>
</html>
