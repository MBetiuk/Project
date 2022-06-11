<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 11/06/2022
  Time: 09:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>User edit</title>
</head>
<body>
<h3>Edytuj dane użytkownika</h3>
<%--@elvariable id="employee" type=""--%>
<form:form method="post" modelAttribute="user">

    <label>Nick: </label>
    <form:input path="nick"/><br><br>
    <label>Email: </label>
    <form:input path="email"/><br><br>
    <label>Hasło: </label>
    <form:input path="password"/><br><br>


    <label>Użytkownik / Administrator: </label>
    <form:select path="userTypeEnum">
        <%--        <form:option value="-" label="--Wybierz--"/>--%>
        <%--@elvariable id="superVisors" type="java.util.List"--%>
        <form:options items="${userTypeEnum}"/>
    </form:select>
    <input type="submit" value="Zapisz"/>
</form:form>
</body>
</html>
