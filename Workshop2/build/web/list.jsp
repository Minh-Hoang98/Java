<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<jsp:useBean id="admin" class="model.Product" scope="session"></jsp:useBean>


<!-- start the middle column -->

<section>
    <h2>Welcome to FPT Shop Online </h2>
    Your cart: $(cart.count) Items.
    <table border="1">
        <tr><th>Product ID</th><th>Product Name</th><th>Price</th><th>Add to Cart</th></tr>
        <c:forEach items="${admin.getAllProduct()}" var="product">
            <tr><td>${product.productID}</td><td>${product.productName}</td><td>${product.price}</td><td><a href="addToCart?newProductId=${item.productID}">Mua</a></td></tr>
        </c:forEach>
    </table>

    <a href="viewcart">View your shopcart</a>

</section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>
