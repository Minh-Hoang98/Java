<%-- 
    Document   : Student
    Created on : 16-Sep-2019, 17:04:28
    Author     : Laptop88
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<section>
    <h1>Student List </h1>
    <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>DOB</th>
                
            </tr>
            <%Student a = new Student();      
            for(Student s:a.listAll()){
                out.write("<TR><TD>"+s.getId()+"</TD><TD>"+s.getName()+"</TD><TD>"+s.getGender()+"</TD><TD>"+s.getDob()+"</TD></tr>");
            }
            out.write("</Table><A href='delete.jsp'>Delete more...</A>");
                    %>
            
        </table>
</section>
