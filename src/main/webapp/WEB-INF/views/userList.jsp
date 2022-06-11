<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 11/06/2022
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>UserList</title>
</head>
<body>
<h3> -- Lista użytkowników -- </h3>

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
    <th>Nick</th>
    <th>Email</th>
    <th>Użytkownik / Administrator</th>
    <th>Akcje</th>

    </thead>
    <tbody>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td><c:out value="${user.nick}"/></td>
            <td><c:out value="${user.email}"/></td>
            <td><c:out value="${user.userTypeEnum}"/></td>

            <td>
                <a href="/user/update/${user.id}"> Edytuj</a>
                <a href="/user/delete/${user.id}"> Usuń</a>

            </td>


        </tr>



    </c:forEach>
    </tbody>
</table>
</body>
</html>
