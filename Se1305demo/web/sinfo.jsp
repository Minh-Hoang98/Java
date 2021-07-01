<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>

<!-- start the middle column -->

<section>
    <h1><pre><strong>              Search Info Student</strong></pre></h1>  
    <form action="Search" method="POST">
    <label> Student ID </label> <input type ="text" name="id"/><BR>
    <input type="submit" value="Search" />
    </form>             
</section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>
