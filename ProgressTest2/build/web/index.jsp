<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="my" uri="WEB-INF/myTag.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3> List All </h3>     
        <my:CustomTag/>
        <h3>List by ID </h3>
        <my:CustomTag id="P001"></my:CustomTag>
        <h3>Hit count:<h3> ${hit}
    </body>
</html>
