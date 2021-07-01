<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>
<jsp:useBean id="Student" class="model.Student" scope="session"/>
<jsp:setProperty name="Student" property=""/>
<section>
    
    <h1><pre><strong>         Information of new Student</strong></pre></h1>  
    <form action="Student" method="POST">
        <label> Student ID </label>${Student.id}<BR>
        <label> Name </label>${Student.name}<BR>
        <label> Gender</label>${Student.gender}<BR>
        <label> Date of birth </label>${Student.dob}<BR>
        <input type="submit" value="Confirm" />
    </form>
</section>


<!-- end the middle column -->
<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>