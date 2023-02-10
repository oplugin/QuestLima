
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>

    <title>Users</title>
</head>
<body>
<%--requestScope отвечает на то чем обогатили реквест в классе users через
        request.setAttribute("users", users);
    sessionScope - если что-то положил в сессию, то можно получить через этот scope
    applicationScope - контекст основного сервлета
--%>
    <c:forEach var="user" items="${requestScope.users}">
        Edit user <a href="/user?id=${user.id}">${user.login}</a><br>
    </c:forEach>
<%--    ${requestScope.users}--%>
</body>
</html>
