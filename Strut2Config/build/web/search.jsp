<%-- 
    Document   : search
    Created on : Mar 13, 2019, 10:50:56 AM
    Author     : Microsoft Windows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>
    <body>
        <font color="red">
        Welcome, <s:property value="#session.USERNAME"/>
        </font>
        <h1>Search Page</h1>
        
        <s:property value="thisUsername"/>
        <s:form action="searchLastName">
            <s:textfield name="searchValue" label="Search Value"/>
            <s:submit value="Search"/>
        </s:form>
        
        <s:if test="!searchValue.isEmpty()">
            <s:if test="listAccounts != null">
                <table border="1">
                    <thead>
                        <tr>
                            <th>No.</th>
                            <th>Username</th>
                            <th>Password</th>
                            <th>Last name</th>
                            <th>Role</th>
                            <th>Delete</th>
                            <th>Update</th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator value="listAccounts" status="counter">
                            <s:form action="update" method="GET" theme="simple">
                                <tr>
                                    <td>
                                        <s:property value="#counter.count"/>
                                    </td>
                                    <td>
                                        <s:property value="username"/>
                                        <s:hidden name="username"/>
                                    </td>
                                    <td>
                                        <s:textfield name="password" value="password"/>
                                    </td>
                                    <td>
                                        <s:textfield name="lastname"/>
                                    </td>
                                    <td>
                                        <s:checkbox name="role" />
                                    </td>
                                    <td>
                                        
                                        <s:set var="date2" value="%{date}"/>
                                        <s:textfield value="%{date2}"/>
                                        <s:url action='delete' var='delLink'>
                                            <s:param name='pk' value='username'/>
                                            <s:param name='lastSearchValue' value='searchValue'/>
                                            <s:param name='date' value='date'/>
                                        </s:url>
                                        <s:a href="%{delLink}">Delete</s:a>
                                    </td>
                                    <td>
                                        <s:submit value="Update"/>
                                        <s:hidden name="lastSearchValue" value="%{searchValue}"/>
                                    </td>
                                </tr>
                            </s:form>
                        </s:iterator>                                          
                    </tbody>
                </table>
            </s:if>
            <s:else>
                <h2>No Record is found</h2>
            </s:else>
        </s:if>
        
    </body>
</html>
