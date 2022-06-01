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


<table border="1">
    <thead>
    <th>Imię</th>
    <th>Nazwisko</th>
    <th>Pesel</th>

    </thead>
<tbody>
<c:forEach items="${clientsList}" var="client">
<tr>
   <td><c:out value="${client.firstName}"/></td>
    <td><c:out value="${client.lastName}"/></td>
    <td><c:out value="${client.pesel}"/></td>
<td>
    <a href="/clients/update/${client.id}"> Edytuj</a>
</td>


</tr>



</c:forEach>
</tbody>
</table>
<br>
<br>
<a href="/clients/add"> Dodaj klienta</a>
</body>
</html>
