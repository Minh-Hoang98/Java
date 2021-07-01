<%-- 
    Document   : staffsearch
    Created on : Mar 17, 2019, 10:51:20 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page Staff Only</title>
    </head>
    <body>
        <font color="Red">
        Welcome, <s:property value="#attr.USERNAME"/>
        </font>
        <s:form action="logout">
            <s:submit value="Log out"/>
        </s:form>
        <s:form action="staffsearch">
            <s:textfield name="searchValue" label="Search Value"/>
            <s:submit value="Search"/>
        </s:form>
        <s:if test="!searchValue.isEmpty()">
            <s:if test="listmobile != null">
                <table border="1">
                    <thead>
                        <tr>
                            <th>No</th>
                            <th>Mobile ID</th>
                            <th>Mobile Name</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Year Of Production</th>
                            <th>Description</th>
                            <th>On sale</th>
                            <th>Delete</th>
                            <th>Update</th>
                        </tr>
                    </thead>
                    <tbody>

                        <s:iterator value="listmobile" status="counter">
                            <s:form action="update" theme="simple">
                                <tr>
                                    <td>
                                        <s:property value="#counter.count"/>
                                    </td>
                                    <td>
                                        <s:property value="mobileId"/>
                                        <s:hidden name="mobileId"/>
                                    </td>
                                    <td>
                                        <s:property value="mobileName"/>
                                    </td>
                                    <td>
                                        <s:textfield name="price"/>
                                    </td>
                                    <td>
                                        <s:textfield name="quantity"/>
                                    </td>
                                    <td>
                                        <s:property value="yearOfProduction"/>
                                    </td>
                                    <td>
                                        <s:textfield name="description"/>
                                    </td>
                                    <td>
                                        <s:checkbox name="isNotSale"/>
                                    </td>
                                    <td>
                                        <s:url action="delete" id="delLink">
                                            <s:param name="pk" value="mobileId"/>
                                            <s:param name="lastSearchValue" value="searchValue"/>
                                        </s:url>
                                        <s:a href="%{delLink}">Delete</s:a>
                                        </td>
                                        <td>
                                        <s:hidden name="lastSearchValue" value="%{searchValue}"/>
                                        <s:submit value="Update"/>
                                    </td>
                                </tr>
                            </s:form>
                        </s:iterator>
                    </tbody>
                </table>
            </s:if>
            <s:else>
                Not Found
            </s:else>
        </s:if>
        <s:a href="create">Create New Mobile</s:a>          
    </body>
</html>
