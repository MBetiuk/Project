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
<%--@elvariable id="client" type=""--%>
<form:form method="post" modelAttribute="client" action="/clients/add">


    Imię: <form:input path="firstName"/><br>
    Nazwisko: <form:input path="lastName"/><br>
    Pesel<form:input path="pesel"/><br>
    <input type="submit" value="Save">


</form:form>
</body>
</html>
