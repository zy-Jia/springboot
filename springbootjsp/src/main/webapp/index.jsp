<%--
  Created by IntelliJ IDEA.
  User: gyofu
  Date: 2022/1/25
  Time: 10:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Index</h1>
    <table>
        <th>编号</th>
        <th>姓名</th>
        <th>操作</th>
        <c:forEach items="${list}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>
                    <a href="/user/deleteById/${user.id}">删除</a>
                    <a href="/user/findById/${user.id}">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
