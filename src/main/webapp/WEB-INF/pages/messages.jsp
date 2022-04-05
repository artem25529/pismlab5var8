<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="<c:url value="/msg"/>">
        <c:forEach begin="0" end="2" varStatus="status">
            Message ${status.count}: <input name="msg${status.index}" value="${messages[status.index]}"><br/>
        </c:forEach>
        <input type="submit" value="change">
    </form>
</body>
</html>
