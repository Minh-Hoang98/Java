<%@page import="javax.swing.JOptionPane"%>
<%@page import="javax.swing.JFrame"%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>

<!-- start the middle column -->

<section>

    <h1><pre><strong>        Đăng nhập </pre></strong></h1>
    <form action="Login" method="POST">
        <label> ID </label> <input type ="text" name="customer" placeholder="PR001"/><BR>
        <label> Mật khẩu </label> <input type ="password" name="pw"/><BR>
        <input type="submit" class="submit" name="login" value="Đăng nhập" />
    </form>
    <%
        String err = request.getParameter("err");      
        if ("0".equals(err)) {
           out.println("<pre>                     Lỗi đăng nhập!!!");
        }
    %>
</section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>
