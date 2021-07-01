<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>

<section>
    
    <h1><pre><strong>         Change PassWord to FPT University</strong></pre></h1>
    <form action="Change" method="POST">
        <label> User ID </label> <input type ="text" name="user"/><BR>
        <label> Old Password </label> <input type ="password" name="oldpassword"/><BR>
        <label> New Password </label> <input type ="password" name="newpassword"/><BR>
        <label> Confirm Password </label> <input type ="password" name="confirmpassword"/><BR>
        <input type="submit" value=" Change" />
    </form>
</section>


<!-- end the middle column -->
<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>