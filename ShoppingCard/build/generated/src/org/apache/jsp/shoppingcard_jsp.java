package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ShopCart;
import model.Customer;
import model.Product;
import model.ProductLine;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class shoppingcard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
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
      out.write("          <li><a class=\"current\" href=\"index.jsp\">\n");
      out.write("                  Home</a></li>  \n");
      out.write("                  <li><a class=\"current\" href=\"login.jsp\">\n");
      out.write("                  Login</a></li> \n");
      out.write("                  <li><a class=\"current\" href=\"register.jsp\">\n");
      out.write("                  Register</a></li> \n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("</aside>");
      out.write("\n");
      out.write("\n");
      out.write("<!-- start the middle column -->\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("    <h1>Gi??? H??nh C???a B???n</h1>\n");
      out.write("    ");

        Customer cus = (Customer) session.getAttribute("cus");
        if (cus != null) {
            out.print("<h3> Kh??ch H??ng : " + cus.getcName() + "</h3>");
    
      out.write("\n");
      out.write("    <p>H??nh th???c thanh to??n:\n");
      out.write("        <select name=\"Select\">\n");
      out.write("            <option value=\"cash\"> Ti???n m???t</option>\n");
      out.write("            <option value=\"ATM\"> Th???</option>\n");
      out.write("        </select></p>\n");
      out.write("        ");

        } else {
        
      out.write("\n");
      out.write("        <h2>B???n c???n ph???i ????ng nh???p!!!</h2>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("\n");
      out.write("    ");
 ArrayList<ProductLine> card = new ShopCart().cardL;
        double total = 0;
        out.println("<pre><strong>ID   S??? L?????ng   Gi??</pre>");
        for (ProductLine b : card) {
            total += b.getPrice() * b.getQuantity();
            out.write("<pre> " + b.getProductID() + "       " + b.getQuantity() + "       " + b.getPrice()
                    + "<a href=delete?productID=" + b.getProductID() + ">");
    
      out.write("   <input type=\"submit\" value=\"X??a\" /></a>\n");
      out.write("\n");
}
    out.println("<pre><strong>T???ng :" + total);

      out.write("\n");
      out.write("<form action=\"confirm\" method=\"POST\">\n");
      out.write("    <a><input type=\"submit\" value=\"?????ng ??\"/>   <a href=list.jsp ><input type=\"submit\" value=\"Quay l???i\"/></a>\n");
      out.write("</form>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!-- end the middle column -->\n");
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
}
