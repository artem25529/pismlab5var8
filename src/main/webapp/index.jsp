<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Check if credit card is valid</h2>
<form method="get" action="<c:url value="/msg"/>">
    <label for="date">Input card inspiration date: </label>
    <input id="date" name="date" value="${param.date}" placeholder="2022-10-05" pattern="\d{4}-\d{2}-\d{2}" size="6px"><br/>
    <input type="submit" value="Check">
</form>

<c:if test="${not empty res}">
    <c:out value="Your card is ${res ? 'valid' : 'unvalid'}"/>
</c:if>

</body>
</html>
