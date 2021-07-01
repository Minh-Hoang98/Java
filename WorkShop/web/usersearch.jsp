<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<section>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page for User</title>
        <s:head/>
    </head>
    <body>
        <font color="Red">
        Welcome, <s:property value="#session.USERNAME"/>
        </font>
        <br>
        <br>
        <s:form action="usersearch">
            <label>From price</label> <input type="text" name="fromprice"/><P>
                <label>To price</label> <input type="text" name="toprice"/><P><P>

                <input type="submit" value="Search"/>
            </s:form>
                
                <br>
 
           <s:if test="!fromprice.isEmpty() && !toprice.isEmpty()">
                <s:if test="listProduct!=null">
                <table border="1">
                    <thead>
                        <tr>
                            <th>Product ID</th>
                            <th>Product Name</th>
                            <th>Price</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator  value="listProduct" status="counter">
                            <s:form action="addToCart" theme="simple">
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
                                        <s:hidden name="product" value="%{productName}"/>                           
                                        <s:hidden name="price" value="%{price}"/>
                                        <s:submit value="Add to cart"/>
                                    </td>
                                </tr>
                            </s:form>
                        </s:iterator>
                    </tbody>
                </table>

            </s:if>
        </s:if>      
        <a href="viewCart">Xem giỏ hàng</a>
    </body>
</section>
<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>

