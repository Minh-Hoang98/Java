<%-- 
    Document   : vote
    Created on : 15-Oct-2019, 11:08:42
    Author     : Laptop88
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<jsp:useBean id="list" class="model.StartVote" scope="session" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>RESULT VOTING</h1>
        <c:forEach var="star" items="${list.all}">
        <LI>${star.startName} ${star.numOfVote}</br>
        </c:forEach>
        <a href="vote.jsp">Vote</a>
    </body>
</html>
