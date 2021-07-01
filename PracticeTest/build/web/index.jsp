<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<jsp:useBean id="list" class="model.ProductDB" scope="page"></jsp:useBean>

    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body>
        <center>
            <h1>All product</h1>
            <table border="1">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Unit</th>
                    <th>Price</th>
                </tr>
            <c:forEach items="${list.listAll()}" var="p">
                <tr>
                    <td>${p.productID}</td>
                    <td>${p.productName}</td>
                    <td>${p.unit}</td>
                    <td>${p.price}</td>
                </tr>
            </c:forEach>	
        </table>
        <br>
        <br>
        <a href="product.jsp"><button>Add new product</button></a><br>
        <jsp:include page="hitcount.jsp"></jsp:include>
    </center>
</body>
</html>
