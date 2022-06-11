<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 11/06/2022
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><html>
<head>
    <title>Employee Question</title>
</head>
<body>
<h3> -- Czy chcesz usunąć pracownika? -- </h3>

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
    <tr>
        <td>
<%--@elvariable id="employee" type=""--%>
<form:form method="post" action="/empl/delete/${employee.id}" modelAttribute="employee">
<%--    <a href="/empl/delete/{id}"> Usuń</a>--%>

    <input type="submit" value="TAK">
</form:form>

        </td>

        <td>
<%--            <form:form method="get" action="/empl" modelAttribute="employee">--%>
                <a href="/empl/all"> Nie usuwaj</a>
<%--            </form:form>--%>

        </td>
    </tr>
    </thead>

</table>
</body>
</html>
