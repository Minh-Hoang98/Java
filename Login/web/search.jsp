<%-- 
    Document   : search
    Created on : 27-Oct-2019, 22:38:52
    Author     : Laptop88
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
    </head>
    <body>
        Welcome, <font color="red">${sessionScope.USER.fullName}</font></br>
        <h1>Search Page</h1>
    <s:form action="searchMobile">
        <s:textfield name="searchValue" label="Search value"/>
        <s:submit value="Search"/>
    </s:form>
    <s:if test="%{list != null}">
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Mobile name</th>
                    <th>Price</th>
                    <th>Quantity</th>
                </tr>
            </thead>
            <tbody>
            <s:iterator value="%{list}">
                <tr>
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
                        <s:property value="quantity"/>
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </s:if>
    <s:if test="list == null and searchValue != null">
        <h2>
            No result found!!!
        </h2>
    </s:if>
    </body>
</html>
