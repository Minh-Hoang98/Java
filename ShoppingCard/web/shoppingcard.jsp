<%@page import="model.ShopCart"%>
<%@page import="model.Customer"%>
<%@page import="model.Product"%>
<%@page import="model.ProductLine"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>

<!-- start the middle column -->

<section>
    <h1>Giỏ Hành Của Bạn</h1>
    <%
        Customer cus = (Customer) session.getAttribute("cus");
        if (cus != null) {
            out.print("<h3> Khách Hàng : " + cus.getcName() + "</h3>");
    %>
    <p>Hình thức thanh toán:
        <select name="Select">
            <option value="cash"> Tiền mặt</option>
            <option value="ATM"> Thẻ</option>
        </select></p>
        <%
        } else {
        %>
        <h2>Bạn cần phải đăng nhập!!!</h2>
    <%
        }
    %>

    <% ArrayList<ProductLine> card = new ShopCart().cardL;
        double total = 0;
        out.println("<pre><strong>ID   Số Lượng   Giá</pre>");
        for (ProductLine b : card) {
            total += b.getPrice() * b.getQuantity();
            out.write("<pre> " + b.getProductID() + "       " + b.getQuantity() + "       " + b.getPrice()
                    + "<a href=delete?productID=" + b.getProductID() + ">");
    %>   <input type="submit" value="Xóa" /></a>

<%}
    out.println("<pre><strong>Tổng :" + total);
%>
<form action="confirm" method="POST">
    <a><input type="submit" value="Đồng ý"/>   <a href=list.jsp ><input type="submit" value="Quay lại"/></a>
</form>
</section>

<!-- end the middle column -->
<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>
