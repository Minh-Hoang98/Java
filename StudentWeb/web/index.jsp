<%@page import="java.util.ArrayList"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>

<!-- start the middle column -->

<section>
    <table border="1" cellpadding="5" cellspacing="1" >
        <% ArrayList<Student> sList=(ArrayList)application.getAttribute("sList");
        %>
         <h1><pre><strong>      List Student to FPT University</strong></pre></h1> 
        <tr>
            <th>ID</th>
            <th> Name</th>
            <th>Gender</th>
            <th>DOB</th>
            <th>Update</th>
            <th>Delete Student</th>
        </tr>
        <c:forEach items="${sList}" var="student" >
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.gender}</td>
                <td>${student.dob}</td>    
                <td>
                    <a href="UpdateServlet?id=${student.id}">Update</a>
                </td>
                <td>
                    <a href="deleteStudent?id=${student.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>          
    </table>
        
    <a href="home.jsp">Home</a>

</section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>
