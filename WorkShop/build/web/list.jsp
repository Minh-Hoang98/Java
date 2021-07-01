<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<section>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LIST</title>
    </head>
    <body>

        <font color="red">
        Xin chào <s:property value="#session.USERNAME"/>
        </font>

        <h1><pre  style="color: graytext" >     PRODUCT ITEMS</pre></h1>

        <table border="1" cellpadding="8" cellspacing="2">
            <tr>                    
                <th>No</th>
                <th>Name</th>
                <th>Giá</th>
                <th></th>              
            </tr>    
            <s:iterator  value="list" status="counter">              
                <tr>
                    <td>
                        <s:property value="productID"/>
                    </td>
                    <td>
                        <s:property value="productName"/>
                    </td>
                    <td>
                        <s:property value="price"/>
                    </td>   
                    <td>
                        <a href="addToCart?newProductId=<s:property value="productID"/>">Mua</a>
                    </td>
                </tr>
            </s:iterator>
        </table>
        <a href="index.jsp">Trang chủ</a>
        <a href="viewCart">Xem giỏ hàng</a>
    </body>
</section>
<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>