package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class staff_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/column_left_admin.jsp");
    _jspx_dependants.add("/WEB-INF/tlds/mytag_library.tld");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Tr?????ng ?????I H???C FPT </title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.ico\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/main.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    ");
 request.setCharacterEncoding("UTF-8");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <img src=\"images/logo.jpg\" \n");
      out.write("                 alt=\"Tr?????ng ?????i h???c FPT\" width=\"243\" height=\"85\" >\n");
      out.write("            <h1>FPT University</h1>\n");
      out.write("            <h2>Tr?????ng ?????i h???c FPT - C?? s??? ???? N???ng</h2>\n");
      out.write("        </header>\n");
      out.write("        ");
      out.write('\n');
      out.write("<aside id=\"sidebarA\">\n");
      out.write("    <nav>\n");
      out.write("      <ul>\n");
      out.write("          <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("          <li><a href=\"staff.jsp\">Staff Menu</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("</aside>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- start the middle column -->\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("    <h1>Welcome to FPT Library Management System</h1>\n");
      out.write("    ");
      if (_jspx_meth_m_LoginCheck_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <p>Thanks for visiting. Make yourself at home. We \n");
      out.write("    hope you like it as much as we do.</p>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- end the middle column -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<aside id=\"sidebarB\">\n");
      out.write("    <h1>New Release</h1>\n");
      out.write("    <img src=\"images/logo.jpg\" width=\"100\" \n");
      out.write("         alt=\"Activities Board\">\n");
      out.write("    <h2><a href=\"catalog/product/8601\" class=\"no_underline\">\n");
      out.write("        FPT University News\n");
      out.write("    </a></h2>\n");
      out.write("    </br>\n");
      out.write("</aside>");
      out.write('\n');
      out.write("    <footer>\n");
      out.write("        <p>&copy; Copyright ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentYear}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" FPT University. \n");
      out.write("            All rights reserved.</p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\n');
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

  private boolean _jspx_meth_m_LoginCheck_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m:LoginCheck
    tags.LoginTagHandler _jspx_th_m_LoginCheck_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(tags.LoginTagHandler.class) : new tags.LoginTagHandler();
    _jspx_th_m_LoginCheck_0.setJspContext(_jspx_page_context);
    _jspx_th_m_LoginCheck_0.doTag();
    return false;
  }
}
