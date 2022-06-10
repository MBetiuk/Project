<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 28/05/2022
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Client add</title>
</head>
<body>
<h3>Dodaj klienta</h3>
<%--@elvariable id="client" type=""--%>
<form:form method="post" modelAttribute="client" action="/clients/add">

    <label>Imię: </label>
    <form:input path="firstName"/><br><br>
    <label>Nazwisko: </label>
    <form:input path="lastName"/><br><br>
    <label>Pesel: </label>
    <form:input path="pesel"/><br><br>

    <input type="submit" value="Zapisz"/>


</form:form>
</body>
</html>
