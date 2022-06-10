<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 03/06/2022
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="label" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Dodaj adres </title>
</head>
<body>
<%--@elvariable id="address" type=""--%>
<form:form method="post" modelAttribute="address" >
<%--    <form:hidden path="client"/>--%>
    <label>Ulica: </label>
    <form:input path="streetName"/><br><br>
    <label>Nr domu: </label>
    <form:input path="houseNo"/><br><br>
    <label>Nr mieszkania: </label>
    <form:input path="flatNo"/><br><br>
    <label>Kod pocztowy: </label>
    <label:input path="postCode"/><br><br>
    <label>Poczta: </label>
    <form:input path="postTown"/><br><br>
    <label>Miejscowość: </label>
    <form:input path="town"/><br><br>

    <input type="submit" value="Zapisz">


</form:form>
</body>
</html>
