package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class confirm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/column_left_home.jsp");
    _jspx_dependants.add("/includes/column_right_news.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Trường ĐẠI HỌC FPT </title>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/logo.ico\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/main.css\">\n");
      out.write("   <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.js\"></script>\n");
      out.write("</head>\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <img src=\"images/logo.jpg\" \n");
      out.write("             alt=\"Trường Đại học FPT\" width=\"243\" height=\"85\" >\n");
      out.write("        <h1>FPT University</h1>\n");
      out.write("        <h2>Trường Đại học FPT - Cơ sở Đà Nẵng</h2>\n");
      out.write("    </header>\n");
      out.write("    <nav id=\"nav_bar\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"searching.jsp\">\n");
      out.write("                    Searching</a></li>\n");
      out.write("                    <li><a href=\"staff.jsp\">\n");
      out.write("                    Staff</a></li>\n");
      out.write("            <li><a href=\"\">\n");
      out.write("                    News</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>");
      out.write('\n');
      out.write("<aside id=\"sidebarA\">\n");
      out.write("    <nav>\n");
      out.write("        <ul>\n");
      out.write("            <li><a class=\"current\" href=\"index.jsp\">\n");
      out.write("                    Home</a></li>\n");
      out.write("            <li><a href=\"login.jsp\">\n");
      out.write("                    Student Login</a></li>\n");
      out.write("            <li><a href=\"changePass.jsp\">\n");
      out.write("                    Student Change Password</a></li>\n");
      out.write("            <li><a href=\"checkbox.jsp\">\n");
      out.write("                    Choose Book</a></li>\n");
      out.write("            <li><a href=\"sinfo.jsp\">\n");
      out.write("                    Student Information</a></li>           \n");
      out.write("            <li><a href=\"addStudent.jsp\">\n");
      out.write("                    Add Student</a></li>\n");
      out.write("            <li><a href=\"viewlog.jsp\">\n");
      out.write("                    Student Logs</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("</aside>");
      out.write('\n');
      model.Student Student = null;
      synchronized (session) {
        Student = (model.Student) _jspx_page_context.getAttribute("Student", PageContext.SESSION_SCOPE);
        if (Student == null){
          Student = new model.Student();
          _jspx_page_context.setAttribute("Student", Student, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("Student"), "", request.getParameter(""), request, "", false);
      out.write("\n");
      out.write("<section>\n");
      out.write("    \n");
      out.write("    <h1><pre><strong>         Information of new Student</strong></pre></h1>  \n");
      out.write("    <form action=\"Student\" method=\"POST\">\n");
      out.write("        <label> Student ID </label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Student.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<BR>\n");
      out.write("        <label> Name </label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Student.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<BR>\n");
      out.write("        <label> Gender</label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Student.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<BR>\n");
      out.write("        <label> Date of birth </label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Student.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<BR>\n");
      out.write("        <input type=\"submit\" value=\"Confirm\" />\n");
      out.write("    </form>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- end the middle column -->\n");
      out.write("\n");
      out.write("<aside id=\"sidebarB\">\n");
      out.write("    <h1>New Release</h1>\n");
      out.write("    <img src=\"images/logo.jpg\" width=\"100\" \n");
      out.write("         alt=\"Activities Board\">\n");
      out.write("    <h2><a href=\"index.jsp\" class=\"no_underline\">\n");
      out.write("        FPT University News\n");
      out.write("    </a></h2>\n");
      out.write("    <p class=\"news_item\">Summer semester started on 13/05/2019.</p>\n");
      out.write("</aside>");
      out.write('\n');
      out.write("    <footer>\n");
      out.write("        <p>Hit Counter ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Counter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&copy; Copyright ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentYear}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" FPT University. \n");
      out.write("            All rights reserved.</p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
