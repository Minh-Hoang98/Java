<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>

<section> 
    <h1><pre><strong>         Add Student to FPT University</strong></pre></h1>  
    <form action="createStudent" method="GET">
        <label> Name </label> <input type ="text" name="name" placeholder="Hoang"/><BR>
        <label>Gender</label>
        <input type="radio" name="gender" value="1" class="gender"> Male
        <input type="radio" name="gender" value="0" class="gender">Female<BR>   
        <label>Date Of Birth</label>
        <input type="date" name="dob" placeholder="1997-09-12"><br>
        <input type="submit" value="Create" />
    </form>
</section>


<!-- end the middle column -->
<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>