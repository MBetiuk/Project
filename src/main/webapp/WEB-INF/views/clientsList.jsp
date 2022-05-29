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
<jsp:useBean id="clientsList" scope="application" type="java.util.List"/>
<c:forEach items="${clientsList}" var="client">

    <c:out value="${client.firstName}"/>
    <c:out value="${client.lastName}"/>
    <c:out value="${client.pesel}"/>




</c:forEach>
 </body>
</html>
