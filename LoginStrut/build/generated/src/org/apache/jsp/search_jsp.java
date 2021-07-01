package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Search Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        Welcome, <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font></br>\n");
      out.write("        <h1>Search Page</h1>\n");
      out.write("    <form action=\"searchMobile\">\n");
      out.write("        <input type=\"text\" name=\"searchValue\" value=\"\" />\n");
      out.write("        <input type=\"submit\" value=\"Search\" />\n");
      out.write("    </form>\n");
      out.write("    <s:if test=\"%{list != null}\">\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Mobile name</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Quantity</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            <s:iterator value=\"%{list}\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <s:property value=\"mobileId\"/>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <s:property value=\"mobileName\"/>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <s:property value=\"price\"/>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <s:property value=\"quantity\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </s:iterator>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </s:if>\n");
      out.write("    <s:if test=\"list == null and searchValue != null\">\n");
      out.write("        <h2>\n");
      out.write("            No result found!!!\n");
      out.write("        </h2>\n");
      out.write("    </s:if>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
