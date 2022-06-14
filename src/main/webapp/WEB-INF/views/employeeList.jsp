<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 10/06/2022
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>EmployeeList</title>
</head>
<body>
<%--@elvariable id="filter" type=""--%>
<h3> -- Filtruj -- </h3>
<form:form method="post"  modelAttribute="filter">

<label>Rodzaj stanowiska: </label>
<form:select path="employee">
    <form:option value="" label="--Wybierz stanowisko--"/>
    <%--@elvariable id="employee" type=""--%>
    <form:options item="{employeeTypeEnum}"/>

</form:select><br><br>
    <input type="submit" value="Filtruj"/>
    <br><br>
    <label>Przełożony: </label>
    <form:select path="employee">
        <form:option value="" label="--Wybierz--"/>
        <form:options itemLabel="superVisor.lastName" items="${superVisorList}"/>
    </form:select>
    <br><br>
    <input type="submit" value="Filtruj"/>
</form:form>



<h3> -- Lista pracowników -- </h3>
<style>
    table {
        margin-bottom: 20px;
        border-spacing: 0;
        border: 1px solid lightgrey;

    }

    th, td {
        font-size: 12px;
        padding: 7px;
        border: 1px solid lightgrey;
        border-top-width: 0;
        border-left-width: 0;
    }

    body {
        font-size: 12px;
        margin: 30px;
    }

    input {
        display: block;
        /*margin-bottom: 10px;*/
        margin: 0 15px 0 15px ;
    }

    a {
        padding: 5px;
        text-decoration: none;
        color: black;
    }

    button {
        margin: 0px 15px 0px 15px;
    }
</style>


<table >
    <thead>
    <th>Imię</th>
    <th>Nazwisko</th>
    <th>Stanowisko</th>
    <th>Przełożony</th>
    <th>Akcje</th>

    </thead>
    <tbody>
    <c:forEach items="${employeeList}" var="employee">
        <tr>
            <td><c:out value="${employee.firstName}"/></td>
            <td><c:out value="${employee.lastName}"/></td>
            <td><c:out value="${employee.employeeTypeEnum}"/></td>
            <td><c:out value="${employee.superVisor.firstName}${employee.superVisor.lastName}"/></td>

            <td>
                <a href="/empl/update/${employee.id}"> Edytuj</a>
                <a href="/empl/question/${employee.id}"> Usuń</a>

            </td>


        </tr>



    </c:forEach>
    </tbody>
</table>
<br>
<br>
<table>
    <thead>
    <tr>
        <td>

            <a href="/empl/add"> Dodaj pracownika</a>
        </td>
    </tr>
    </thead>


</table>
</body>
