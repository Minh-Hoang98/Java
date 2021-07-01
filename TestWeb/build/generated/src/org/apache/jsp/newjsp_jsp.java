package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Smart Health Care System</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"icon\" href=\"images/log.png\" type=\"image/png\" sizes=\"16x16\">\n");
      out.write("        <link rel=\"icon\" href=\"images/log.png\" type=\"image/png\" sizes=\"16x16\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <!-- template skin -->\n");
      out.write("        <link id=\"t-colors\" href=\"css/default.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/backNoWork.js\"></script>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            .regis{\n");
      out.write("                position: absolute;\n");
      out.write("                right: 0;\n");
      out.write("                margin: 0px;\n");
      out.write("                max-width: 500px;\n");
      out.write("                padding: 16px;\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .navbar-brand {\n");
      out.write("                padding: 0px;\n");
      out.write("            }\n");
      out.write("            .navbar-brand>img {\n");
      out.write("                height: 100%;\n");
      out.write("                padding: 15px;\n");
      out.write("                width: auto;\n");
      out.write("            }\n");
      out.write("            /* EXAMPLE 3\n");
      out.write("\n");
      out.write("            line height is 20px by default so add 30px top and bottom to equal the new .navbar-brand 80px height  */\n");
      out.write("\n");
      out.write("            .example3 .navbar-brand {\n");
      out.write("                height: 80px;\n");
      out.write("            }\n");
      out.write("            .example3 .nav >li >a {\n");
      out.write("                padding-top: 30px;\n");
      out.write("                padding-bottom: 30px;\n");
      out.write("            }\n");
      out.write("            .example3 .navbar-toggle {\n");
      out.write("                padding: 10px;\n");
      out.write("                margin: 25px 15px 25px 0;\n");
      out.write("            }\n");
      out.write("/*            body {\n");
      out.write("                background:url('images/pp2.png') no-repeat center center;\n");
      out.write("                background-size:cover;\n");
      out.write("\n");
      out.write("                 Workaround for some mobile browsers \n");
      out.write("                min-height:100%;\n");
      out.write("            }*/\n");
      out.write("            html{\n");
      out.write("                /* This image will be displayed fullscreen */\n");
      out.write("                background:url('images/bg1.jpg') no-repeat center center;\n");
      out.write("                /* Ensure the html element always takes up the full height of the browser window */\n");
      out.write("                height:100%;\n");
      out.write("                /* The Magic */\n");
      out.write("                background-size:cover;\n");
      out.write("            }\n");
      out.write("            #navbar3 li a:hover\n");
      out.write("            {\n");
      out.write("                color:lightseagreen;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"example3\">\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-static-top\" style=\"background-color: whitesmoke;\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar3\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"images/log.png\" alt=\"Dispute Bills\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"navbar3\" class=\"navbar-collapse collapse\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("                            <li><a href=\"Services.jsp\">Services</a></li>\n");
      out.write("                            <li><a href=\"About.jsp\">About Us</a></li>\n");
      out.write("                            <li><a href=\"Contact.jsp\">Contact Us</a></li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Sign Up <span class=\"caret\"></span></a>\n");
      out.write("                                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                    <li><a href=\"PatientForm.jsp\">Patient Sign Up</a></li>\n");
      out.write("                                    <li><a href=\"DoctorForm.jsp\">Doctor Sign Up</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Login <span class=\"caret\"></span></a>\n");
      out.write("                                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                    <li><a href=\"PatientLogin.jsp\">Patient Login</a></li>\n");
      out.write("                                    <li><a href=\"DoctorLogin.jsp\">Doctor Login</a></li>\n");
      out.write("                                    <li><a href=\"AdminForm.jsp\">Administrator Login</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!--/.nav-collapse -->\n");
      out.write("                </div>\n");
      out.write("                <!--/.container-fluid -->\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("<div class=\"regis\">\n");
      out.write("  <form onsubmit=\"sendEmail(event)\">\n");
      out.write("    <legend>Contact Form</legend>\n");
      out.write("    <div id=\"alert-field\" class=\"alert hidden\">\n");
      out.write("      <p>Uh oh! Something went wrong!</p>\n");
      out.write("    </div>    \n");
      out.write("    <div class=\"form-group col-xs-6\">\n");
      out.write("      <label for=\"name-field\">ID</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"name-field\" name=\"name-field\" required></br>\n");
      out.write("      <label for=\"name-field\">Email</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"name-field\" name=\"name-field\" placeholder=\"Your name\" required></br>\n");
      out.write("      <label for=\"name-field\">Contact No.</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"name-field\" name=\"name-field\" placeholder=\"Your name\" required></br>\n");
      out.write("      <label for=\"subject-field\">Patient Gender</label>\n");
      out.write("      <select class=\"form-control\" name=\"subject-gender\" onchange=\"changeSubject(event)\"  required>\n");
      out.write("        <option value=\"M\">Male</option>      \n");
      out.write("        <option value=\"F\">Female</option>\n");
      out.write("      </select>\n");
      out.write("      <label for=\"name-field\">Marital Status</label>\n");
      out.write("      <select class=\"form-control\" name=\"subject-marital\" onchange=\"changeSubject(event)\"  required>\n");
      out.write("        <option value=\"M\">Male</option>      \n");
      out.write("        <option value=\"F\">Female</option>\n");
      out.write("      </select>   \n");
      out.write("      <label for=\"name-field\">Select Disease</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"name-field\" name=\"name-field\" placeholder=\"Your name\" required></br>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"form-group col-xs-6\">\n");
      out.write("      <label for=\"email-field\">Email</label>\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"email-field\" name=\"email-field\" placeholder=\"Email address\" required>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("<!--    <div id=\"subject-select\" class=\"form-group col-xs-12\">\n");
      out.write("      <label for=\"subject-field\">Subject</label>\n");
      out.write("      <select class=\"form-control\" name=\"subject-field\" onchange=\"changeSubject(event)\"  required>\n");
      out.write("        <option value=\"Consulting\">#EdTech Consulting</option>\n");
      out.write("        <option value=\"Web Development\">Web Development projects</option>\n");
      out.write("        <option value=\"Google Scripts\">Google Apps Scripts</option>\n");
      out.write("        <option value=\"G Suite for Education\">G Suite for Education Tools</option>\n");
      out.write("        <option value=\"Other\">Other</option>\n");
      out.write("      </select>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id=\"hidden-other-subject\" class=\"form-group col-xs-6 hidden\">\n");
      out.write("      <label for=\"other-subject-field\">Other</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"other-subject-field\" name=\"other-subject-field\" placeholder=\"Other subject\" />\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"form-group col-xs-12\">\n");
      out.write("      <label for=\"body-field\">Message</label>\n");
      out.write("      <textarea id=\"body-field\" name=\"body-field\" class=\"form-control\" placeholder=\"Type your message here\" required></textarea>\n");
      out.write("    </div>-->\n");
      out.write("    \n");
      out.write("    <div class=\"form-group col-xs-12\">\n");
      out.write("      <button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\">Submit</button>  \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
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
