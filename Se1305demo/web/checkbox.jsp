<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>

<section>
    
<h1><pre><strong>          Choose Book to FPT University</strong></pre></h1>  
    <form method="POST">  
    <LI><input type="checkbox" name="BR" value="JPD211" > JPD211 </input>
    <LI><input type="checkbox" name="BR" value="PRJ321" > PRJ321 </input>
    <LI><input type="checkbox" name="BR" value="SWE111" > SWE111 </input><BR><BR>
        <P><input type="submit" value="Select" />
    </form>
    <% if(request.getMethod().equals("POST")){
       String[] br= request.getParameterValues("BR");
       out.write("<P>You choose: <BR>");
       for(String s:br) out.write("<LI>"+s);
    }
    %>
</section>


<!-- end the middle column -->
<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>