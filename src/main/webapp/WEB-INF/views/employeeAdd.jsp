<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 30/05/2022
  Time: 06:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Employee add</title>
</head>
<body>
<h3>Dodaj pracownika</h3>
<%--@elvariable id="employee" type=""--%>
<form:form method="post" modelAttribute="employee">

    <label>Imię: </label>
    <form:input path="firstName"/><br><br>
    <label>Nazwisko: </label>
    <form:input path="lastName"/><br><br>

    <label>Rodzaj stanowiska: </label>
    <form:select path="employeeTypeEnum">
        <form:option value="-" label="--Wybierz--"/>
        <form:options item="${employeeTypeEnum}"/>

    </form:select>

    <%--    Rodzaj zatrudnienia: <form:radiobuttons path="type" element="enum"/><br><br>--%>
    <%--    <form:input path="type"/><br><br>--%>
    <%--    <form:radiobuttons path="type" itemValue="DM"/><br><br>--%>
    <input type="submit" value="Zapisz"/>
</form:form>
</body>
</html>
