<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>
<!-- start the middle column -->
<section>
    <h3>Update Student</h3>
    <%
        Student student =(Student) request.getAttribute("student");%>
    <form action="${pageContext.request.contextPath}/Update" method="Post">
        <label> Id </label> <input type ="text" name="id" value="${student.id}"/><BR>
        <label> Name </label> <input type ="text" name="name" value="${student.name}"/><BR>
        <label>Gender</label>
        <input type="radio" name="gender" value="1" class="gender"> Male
        <input type="radio" name="gender"  value="0" class="gender">Female<BR>   
        <label>Date Of Birth</label>
        <input type="date" name="dob" value="${student.dob}"><br>
        <input type="submit" value="Update" />
    </form>
</section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>
