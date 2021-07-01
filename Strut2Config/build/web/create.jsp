<%-- 
    Document   : create
    Created on : Mar 15, 2019, 11:04:04 AM
    Author     : huynhducduy
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Account</title>
        <s:head />
    </head>
    <body>
        <h1>Create new account</h1>
        <s:form action="create">
            <s:textfield name="username" label="Username" />
            <s:label value="e.g 6 - 20 chars"/>
            <s:password name="password" label="Password" />
            <s:label value="e.g 6 - 30 chars"/>
            <s:password name="confirm" label="Confirm"/>
            <s:textfield name="fullName" label="Full name" />
            <s:label value="e.g 2 - 50 chars" />
            <s:submit value="Create new account"/>
            <s:reset />
        </s:form>
        <s:if test="exception.getMessage().contains('uplicate')">
            <s:property value="username"/> is existed!
        </s:if>
    </body>
</html>
