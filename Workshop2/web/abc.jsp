<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@ include file="/includes/header.jsp" %>
<%@ include file="/includes/column_left_home.jsp" %>
<%@taglib prefix="my" uri="WEB-INF/m.tld" %>
<jsp:useBean id="admin" class="model.Product" scope="session"></jsp:useBean>


    <!-- start the middle column -->

    <section> 
    <my:Product/>   
</section>


<!-- end the middle column -->

<%@ include file="/includes/column_right_news.jsp" %>
<%@ include file="/includes/footer.jsp" %>
