<%-- 
    Document   : Student
    Created on : 16-Sep-2019, 17:04:28
    Author     : Laptop88
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<section>
    <h1>Add Student</h1>
        
    <form action="student" method="POST">        
        <label> Name </label> <input type ="text" name="name"/><BR>
        <label> Gender:</label> 
        <input type="radio" name="gender" value="Male" />Male
        <input type="radio" name="gender" value="Female" />Female<BR>
        <label> Date of birth </label> <input type ="text" name="dob"/><BR><BR>
        <input type="submit" value="Add" />
    </form>
</section>
