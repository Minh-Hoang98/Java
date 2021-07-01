<%-- 
    Document   : Student
    Created on : 16-Sep-2019, 17:04:28
    Author     : Laptop88
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<section>
    <h1><pre><strong>              Delete Info Student</strong></pre></h1>  
    <form action="Delete" method="POST">
    <label> Student ID </label> <input type ="text" name="id"/><BR>
    <input type="submit" value="Delete" />
    </form>             
</section>
