<%@page import="javax.swing.JOptionPane"%>
<%@page import="javax.swing.JFrame"%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>

<!-- start the middle column -->

<section>

    <h1><pre><strong>        Đăng Kí </pre></strong></h1>
    <form action="register" method="POST">        
        <label> ID </label> <input type ="text" name="id"/><BR>
        <label> Tên</label> <input type ="text" name="name"/>     
        <label> Mật khẩu </label> <input type ="password" name="pw"/><BR><BR>
        <input type="submit" value="Đăng Kí" />
    </form>
</section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>
