<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 29/05/2022
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>ClientsList</title>
</head>
<body>
<h3> -- Lista klientów -- </h3>
<%--<jsp:useBean id="clientsList" scope="application" type="java.util.List"/>--%>

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
    <th>Pesel</th>
    <th>Akcje</th>

    </thead>
<tbody>
<c:forEach items="${clientsList}" var="client">
<tr>
   <td><c:out value="${client.firstName}"/></td>
    <td><c:out value="${client.lastName}"/></td>
    <td><c:out value="${client.pesel}"/></td>
<td>
    <a href="/clients/update/${client.id}"> Edytuj</a>
    <a href="/clients/question/${client.id}"> Usuń</a>
    <a href="/loan/add/${client.id}"> Dodaj pożyczke</a>


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

        <a href="/clients/add"> Dodaj klienta</a>
    </td>
</tr>
</thead>


</table>
</body>
</html>
