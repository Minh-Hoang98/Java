<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create New Mobile Page</title>
        <s:head/>
    </head>
    <body>
        <h1>Create New Mobile</h1>
        <s:form action="createnewmobile">
            <s:textfield name="mobileid" label="Mobile ID"/>
            <s:textfield name="mobilename" label="Mobile Name"/>
            <s:textfield name="price" label="Price"/>
            <s:textfield name="quantity" label="Quantity"/>
            <s:textfield name="yearofproduction" label="Year Of Production"/>
            <s:textfield name="description" label="Description"/>
            <s:checkbox name="chksale" label="On Sale" />
            <s:submit value="Create"/>
        </s:form>
        <s:if test="exception.message.contains('duplicate')">
            <font color="Red">
                <s:property value="mobileid"/> is existed !
            </font>
        </s:if>
    </body>
</html>
