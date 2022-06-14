<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 11/06/2022
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3> -- Lista pożyczek klienta -- </h3>
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
    <th>Data zawarcia</th>
    <th>Okres trwania (w miesiącach)</th>
    <th>Kwota pożyczki</th>


    </thead>
    <tbody>
<c:forEach items="${loanList}" var="element">

        <tr>
            <td><c:out value="${element.issueDate}"/></td>
            <td><c:out value="${element.term}"/></td>
            <td><c:out value="${element.value}"/></td>
        </tr>

    </c:forEach>
    </tbody>
</table>
<br>
<br>

</body>
</html>
