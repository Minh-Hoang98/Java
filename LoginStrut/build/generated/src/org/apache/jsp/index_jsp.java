package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
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
      out.write('\n');
      out.write("\n");
      out.write(" \n");
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
      out.write("\n");
      out.write("<aside id=\"sidebarA\">\n");
      out.write("    <nav>\n");
      out.write("      <ul>\n");
      out.write("          <li><a class=\"current\" href=\"index.jsp\">\n");
      out.write("                  Home</a></li>\n");
      out.write("                  <li><a href=");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write(">\n");
      out.write("                 Student Login</a></li>\n");
      out.write("                 <li><a href=");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write(">\n");
      out.write("                  Change Password</a></li>\n");
      out.write("                  <li><a href=");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write(">\n");
      out.write("                  Student Enroll</a></li>\n");
      out.write("                  <li><a href=");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write(">\n");
      out.write("                  Student Information</a></li>\n");
      out.write("                  <li><a href=");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write(">\n");
      out.write("                  Book Search</a></li>\n");
      out.write("                  <li><a href=");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write(">\n");
      out.write("                  Student Logs</a></li>\n");
      out.write("                  <li><a href=");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write(">\n");
      out.write("                  Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("</aside>");
      out.write("\n");
      out.write("\n");
      out.write("<!-- start the middle column -->\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("    <h1>Welcome to FPT Library Management System</h1>\n");
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
      model.Counter counter = null;
      synchronized (application) {
        counter = (model.Counter) _jspx_page_context.getAttribute("counter", PageContext.APPLICATION_SCOPE);
        if (counter == null){
          try {
            counter = (model.Counter) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "model.Counter");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "model.Counter", exc);
          }
          _jspx_page_context.setAttribute("counter", counter, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <p>Hit counter ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${applicationScope.counter.count }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&copy; Copyright ");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("login");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("changepass");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("enroll.jsp");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("sinfo.jsp");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("search");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("viewlog.jsp");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("logout");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }
}
