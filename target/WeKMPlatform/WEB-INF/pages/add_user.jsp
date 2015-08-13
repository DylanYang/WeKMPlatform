<%@page pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add User</title>
</head>
<body>
    <form:form action="result" method="get" modelAttribute="user">
        名字：<form:input path="name"/><br>
        密码：<form:input path="passwd"/><br>
        年龄：<form:input path="age"/><br>
        <input type="submit">
    </form:form>
</body>
</html>