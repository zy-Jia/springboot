<%--
  Created by IntelliJ IDEA.
  User: gyofu
  Date: 2022/1/25
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/update" method="post">
    <input type="text" name="id" value="${user.id}" readonly/><br/>
    <input type="text" name="name" value="${user.name}"/><br/>
    <input type="submit"/><br/>
</form>
</body>
</html>