<%@ page import="platform.model.users.entity.UserEnity" %>
<%@ page import="java.util.List" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Users</title>
</head>
<body>
<ol>
    <% for (UserEnity ue:(List<UserEnity>)request.getAttribute("users")){%>
    <li>名字：<%out.print(ue.getName());%>,年龄：<%out.print(ue.getPasswd());%><%out.print(ue.getAge());%></li>
    <%}%>
</ol>
<a href="adduser">添加用户</a>
</body>
</html>