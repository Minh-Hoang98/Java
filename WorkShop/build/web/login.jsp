<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>

<section>
    <h1>Welcome to FPT Library Management System</h1>
    <h2>Login System</h2>
    <form action="login" method="POST">
        <label>User ID</label> <input type="text" name="id"/><P>
        <label>Password</label> <input type="password" name="pass"/><P><P>
        <input type="submit" value="Login"/>
    </form>
    

</section>

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>