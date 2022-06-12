<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 11/06/2022
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Loan add</title>
</head>
<body>
<h3>Dodaj pożyczkę</h3>
<%--@elvariable id="loan" type=""--%>
<form:form method="post" modelAttribute="loan">

    <label>Data zawarcia: </label>
    <form:input path="issueDate"/><br><br>
    <label>Okres trwania pożyczki w miesiącach: </label>
    <form:input path="term"/><br><br>
    <label>Kwota pożyczki: </label>
    <form:input path="value"/><br><br>


    <input type="submit" value="Zapisz"/>


</form:form>
</body>
</html>
