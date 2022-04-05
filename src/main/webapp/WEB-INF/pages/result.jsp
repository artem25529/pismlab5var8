<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="<c:url value="/msg"/>">
        <c:forEach begin="0" end="2" varStatus="status">
            Message ${status.count}: <c:out value="${messages[status.index]}"/>  <br/>
        </c:forEach>
        <input type="submit" value="change">
    </form>
</body>

<a href="<c:url value="/msgJsp"/>">Change</a>
</html>
