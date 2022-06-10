<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 10/06/2022
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Employee edit</title>
</head>
<body>
<h3>Edytuj pracownika</h3>
<%--@elvariable id="employee" type=""--%>
<form:form method="post" modelAttribute="employee">

    <label>Imię: </label>
    <form:input path="firstName"/><br><br>
    <label>Nazwisko: </label>
    <form:input path="lastName"/><br><br>

    <label>Rodzaj stanowiska: </label>
    <form:select path="employeeTypeEnum">
<%--        <form:option value="-" label="--Wybierz--"/>--%>
        <form:options item="${employeeTypeEnum}"/>

    </form:select>

    <label>Przełożony: </label>
    <form:select path="superVisor.id">
<%--        <form:option value="-" label="--Wybierz--"/>--%>
        <%--@elvariable id="superVisors" type="java.util.List"--%>
        <form:options items="${superVisors}"/>
    </form:select>
    <input type="submit" value="Zapisz"/>
</form:form>
</body>
</html>
