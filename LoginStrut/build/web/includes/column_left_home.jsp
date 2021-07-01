<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<aside id="sidebarA">
    <nav>
      <ul>
          <li><a class="current" href="index.jsp">
                  Home</a></li>
                  <li><a href=<c:url value="login"/>>
                 Student Login</a></li>
                 <li><a href=<c:url value="changepass"/>>
                  Change Password</a></li>
                  <li><a href=<c:url value="enroll.jsp"/>>
                  Student Enroll</a></li>
                  <li><a href=<c:url value="sinfo.jsp"/>>
                  Student Information</a></li>
                  <li><a href=<c:url value="search"/>>
                  Book Search</a></li>
                  <li><a href=<c:url value="viewlog.jsp"/>>
                  Student Logs</a></li>
                  <li><a href=<c:url value="logout"/>>
                  Logout</a></li>
      </ul>
    </nav>
</aside>