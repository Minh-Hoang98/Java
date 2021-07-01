package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Student;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Trường ĐẠI HỌC FPT </title>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\">\n");
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
      out.write("            <li><a class=\"current\" href=\"home.jsp\">\n");
      out.write("                    Home</a></li>\n");
      out.write("            <li><a href=\"listStudent\">\n");
      out.write("                    List Student</a></li>\n");
      out.write("            <li><a href=\"createStudent.jsp\">Create Student</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("</aside>");
      out.write("\n");
      out.write("\n");
      out.write("<!-- start the middle column -->\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("    <table border=\"1\" cellpadding=\"5\" cellspacing=\"1\" >\n");
      out.write("        ");
 ArrayList<Student> sList=(ArrayList)application.getAttribute("sList");
        
      out.write("\n");
      out.write("         <h1><pre><strong>      List Student to FPT University</strong></pre></h1> \n");
      out.write("        <tr>\n");
      out.write("            <th>ID</th>\n");
      out.write("            <th> Name</th>\n");
      out.write("            <th>Gender</th>\n");
      out.write("            <th>DOB</th>\n");
      out.write("            <th>Update</th>\n");
      out.write("            <th>Delete Student</th>\n");
      out.write("        </tr>\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("          \n");
      out.write("    </table>\n");
      out.write("        \n");
      out.write("    <a href=\"home.jsp\">Home</a>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- end the middle column -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<aside id=\"sidebarB\">\n");
      out.write("    <h1>New Release</h1>\n");
      out.write("    <img src=\"images/logo.jpg\" width=\"100\" \n");
      out.write("         alt=\"Activities Board\">\n");
      out.write("    <h2><a href=\"catalog/product/8601\" class=\"no_underline\">\n");
      out.write("        FPT University News\n");
      out.write("    </a></h2>\n");
      out.write("    <p class=\"news_item\">Summer semester started on 13/05/2019.</p>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("student");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>    \n");
          out.write("                <td>\n");
          out.write("                    <a href=\"UpdateServlet?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Update</a>\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    <a href=\"deleteStudent?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Delete</a>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
