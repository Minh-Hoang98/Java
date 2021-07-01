<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>

<!-- start the middle column -->

<section>
   
    <h1><pre><strong>         Login Student to FPT University</strong></pre></h1>
    <form action="Login" method="POST">
        <label> User ID </label> <input type ="text" name="user"/><BR>
        <label> Password </label> <input type ="password" name="pw"/><BR>
        <input type="submit" value=" Login" />
    </form>

</section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>
