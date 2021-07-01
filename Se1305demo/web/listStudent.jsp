<%@page import="model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>

<section>
<h1><pre><strong>                   Add New Student</strong></pre></h1>  
    <form action="Student" method="POST">
        <label> Student ID </label> <input type ="text" name="id"/><BR>
        <label> Name </label> <input type ="text" name="name"/><BR>
        <label> Gender:</label> 
        <input type="radio" name="gender" value="Male" />Male
        <input type="radio" name="gender" value="Female" />Female<BR>
        <label> Date of birth </label> <input type ="text" name="dob"/><BR><BR>
        <input type="submit" value="Add" />
    </form> 
<br>
  <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>DOB</th>

            </tr>
            <% ArrayList<Student> listStudent = (ArrayList<Student>)application.getAttribute("list");
                for (Student s : listStudent) {
                    out.write("<TR><TD>" + s.getId() + "</TD><TD>" + s.getName() + "</TD><TD>" + s.getGender() + "</TD><TD>" + s.getDob() + "</TD></TR>");
                }
                out.write("</Table><A href='listStudent.jsp'></A>");
            %>

        </table>
    
</section>


<!-- end the middle column -->
<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>