

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   
        <table border = "1">
            <tr>
                <th><pre>   Tên sản phâm   </pre></th>
                <th><pre>   Số lượng   </pre></th>
            </tr>
            <s:iterator value="list">
                <tr>
                    <td><pre>   <s:property value="key.productName"/>   </pre></td>
                    <td><pre>   <s:property value="value"/>   </pre></td>
                </tr>
            </s:iterator>
                  <tr>
                <th><pre>   <label>Tổng tiền:</label></pre></th>
                <th><pre>   <s:property value="total"/>   </pre></th>
            </tr>
        </table>
    
      
        <a href="list">Mua tiếp</a>
        <br>
         <a href="confirm">Mua</a>
         <br>
           <a href="logout">Thoát</a>
    </body>
</html>
