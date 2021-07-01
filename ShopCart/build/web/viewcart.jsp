<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart Page</title>
    </head>
    <body>
        <h1>Your Cart</h1>
        <s:if test="#session.CART != null">
            <table border="1">
                <thead>
                    <tr>
                        <td>No</td>
                        <th>Name</th>
                        <th>Quantity</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <s:form action="remove" theme="simple">
                        <s:iterator var="dto" value="#session.CART.items" status="counter">
                            <tr>
                                <td>
                                    <s:property value="#counter.count"/>
                                </td>
                                <td>
                                    <s:property value="key"/>
                                </td>
                                <td>
                                    <s:property value="value"/>
                                </td>
                                <td>
                                    <s:checkbox fieldValue="%{key}" name="itemList"/>
                                </td>
                            </tr>
                        </s:iterator>
                        <tr>
                            <td colspan="2"> 
                                <s:url action="backsearchpage" id="linkback">
                                    <s:param name="fromprice" value="fromprice"/>
                                    <s:param name="toprice" value="toprice"/>
                                </s:url>
                                <s:a href="%{linkback}">Click here back to shop</s:a>
                                </td>
                                <td>
                                <s:hidden name="fromprice" value="%{fromprice}" />
                                <s:hidden name="toprice" value="%{toprice}" />
                                <s:submit value="Remove Item"/>
                            </td>
                        </tr>
                    </s:form>
                </tbody>
            </table>
        </s:if>
    </body>
</html>
