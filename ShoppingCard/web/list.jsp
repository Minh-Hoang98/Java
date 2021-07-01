<%@page import="model.Customer"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>

<!-- start the middle column -->

<section>
    <%
        Customer cus = (Customer) session.getAttribute("cus");
        if (cus != null) {          
            out.print("<h2>Xin Chào " + cus.getcName() + ", Mời bạn chọn sản phẩm: </h2>");      
        } else {
        %>
        <h2>Bạn cần phải đăng nhập, Please!!!</h2>
    <%
        }
    %>
    <h1><pre><strong>      Danh sách sản phẩm</pre></strong></h1>
    <table style="width:90%;height:300px" border="1" cellpadding="8" cellspacing="2">
        <tr>
            <th>ID</th>
            <th>Tên</th>
            <th>Giá</th>
            <th></th>

        </tr>
        <%Product a = new Product();
            for (Product s : a.list()) {
                out.write("<TR><TD>" + s.getProductID() + "</TD><TD>" + s.getProductName() + "</TD><TD>" + s.getPrice() + "</TD><td><a href=buy?ProductID=" + s.getProductID() + ">");
        %>
            <input type="submit" value="Mua" />   
        </TD></tr>
        <% }
        %>   
    </table>
    </br>
    <a href= shoppingcard.jsp >View Shopping Card</a>
</section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>
