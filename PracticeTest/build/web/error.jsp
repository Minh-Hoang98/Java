<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
    <center>
        <h1 style="color: red"><%=request.getAttribute("MSG")%> </h1>
        <a href="product.jsp"><button>Back</button></a><br>
    </center>
</body>
</html>