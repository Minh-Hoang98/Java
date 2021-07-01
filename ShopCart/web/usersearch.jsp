<%-- 
    Document   : usersearch
    Created on : Mar 17, 2019, 10:51:10 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page for User</title>
        <s:head/>
    </head>
    <body>
        <font color="Red">
        Welcome, <s:property value="#attr.USERNAME"/>
        </font>
        <s:form action="logout">
            <s:submit value="Log out"/>
        </s:form>
        <s:form action="usersearch">
            <s:textfield name="fromprice" label="From price" />
            <s:textfield name="toprice" label="To price " />
            <s:submit value="Search" />
        </s:form>
        <s:if test="!fromprice.isEmpty() && !toprice.isEmpty()">
            <s:if test="listmobile!=null">
                <table border="1">
                    <thead>
                        <tr>
                            <th>No</th>
                            <th>Mobile ID</th>
                            <th>Mobile Name</th>
                            <th>Price</th>
                            <th>Description</th>
                            <th>On sale</th>
                            <th>Add To Cart</th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator  value="listmobile" status="counter">
                            <s:form action="addtocart" theme="simple">
                                <tr>
                                    <td>
                                        <s:property value="%{#counter.count}"/>
                                    </td>
                                    <td>
                                        <s:property value="mobileId"/>
                                    </td>
                                    <td>
                                         <s:property value="mobileName"/>
                                    </td>
                                    <td>
                                         <s:property value="price"/>
                                    </td>
                                    <td>
                                         <s:property value="description"/>
                                    </td>
                                    <td>
                                        <s:checkbox name="isNotSale"/>
                                    </td>
                                    <td>
                                        <s:hidden name="mobilename" value="%{mobileName}"/>
                                        <s:hidden name="fromprice" value="%{fromprice}"/>
                                        <s:hidden name="toprice" value="%{toprice}"/>
                                        <s:submit value="Add to cart"/>
                                    </td>
                                </tr>
                            </s:form>
                        </s:iterator>


                    </tbody>
                </table>

            </s:if>
        </s:if>
            <s:url action="viewcart" id="viewlink">
                <s:param name="fromprice" value="fromprice"/>
                <s:param name="toprice" value="toprice"/>
            </s:url>
        <s:a href="%{viewlink}">Click here to view your cart</s:a>
    </body>
</html>
