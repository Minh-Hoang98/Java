<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Product</h1>
        <form action="AddProduct" method="POST">
            <label>Product ID</label>
            <input type="text" name="id" placeholder="P001" required/><br>
            <label>Product Name</label>
            <input type="text" name="name" required/><br>
            <label>Product Unit</label>
            <select name="unit" required>
                <option name="Set">Set</option>
                <option name="Item">Item</option>
            </select>
            <br>
            <label>Product Price</label>
            <input type="text" name="price" required/><br>
            <input type="submit" value="Add new Product"/>
        </form>
        <a href="index.jsp"><button>Back</button></a><br>
        <jsp:include page="hitcount.jsp"></jsp:include>
    </body>
</html>
