package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class AdminDelete_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Notice</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/clean-blog.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  <script>\n");
      out.write("            function check()\n");
      out.write("            {\n");
      out.write("                String select[]=request.getParameterValues(\"check\");\n");
      out.write("        if(select!=null && select.length!=0)\n");
      out.write("        {\n");
      out.write("            for(int i=0;i<select.length;i++)\n");
      out.write("            {\n");
      out.write("            out.println(\"You have selected\");\n");
      out.write("            out.println(select[i]);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Navigation -->\n");
      out.write("    <nav class=\"navbar navbar-default navbar-custom navbar-fixed-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header page-scroll\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li>      \n");
      out.write("                    <a href=\"adminview.jsp\">View</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"AdminInsert.jsp\">Insert</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"AdminDelete.jsp\">Delete</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"logout.jsp\">Logout</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("        <!-- Page Header -->\n");
      out.write("    <!-- Set your background image for this header on the line below. -->\n");
      out.write("    <header class=\"intro-header\" style=\"background-image: url('img/home-bg.jpg')\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1\">\n");
      out.write("                    <div class=\"site-heading\">\n");
      out.write("                        <h1>AITR</h1>\n");
      out.write("                        <hr class=\"small\">\n");
      out.write("                        <span class=\"subheading\">Acropolis Institute of Technology & Research</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1\">\n");
      out.write("                <div class=\"post-preview\">\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <form action=\"deletecheck.jsp\" method=\"post\">    \n");
      out.write("          <h2 class=\"post-title\"> Select Date to Delete Entries</h2>\n");
      out.write("           <br>\n");
      out.write("           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"date\" name=\"date2\">\n");
      out.write("\n");
      out.write("               <input type=\"submit\" value=\"Submit Date\">\n");
      out.write("               \n");
      out.write("           <br>\n");
      out.write("                            </form>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("                   <!--        Notices Which are Already in Database\n");
      out.write("                       </h2>\n");
      out.write("        ");

             
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
                PreparedStatement st=con.prepareStatement("select * from admintable1");
                ResultSet rs=st.executeQuery();
        
      out.write("\n");
      out.write("         <h3 class=\"post-subtitle\">\n");
      out.write("                \n");
      out.write("        <input type=\"checkbox\" id=\"s1\" name=\"s1\">Select all\n");
      out.write("         </h3> \n");
      out.write("        \n");
      out.write("         \n");
      out.write("            ");
 while(rs.next()){ int i=0;
            if(request.getParameterValues("s1")!=null)
            {
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <h3 class=\"post-subtitle\">\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                 <input type=\"checkbox\" name=\"check\" checked value=");
      out.print( rs.getString(2));
      out.write("> \n");
      out.write("           ");
         
        } else
            {
      out.write("\n");
      out.write("                 <input type=\"checkbox\" name=\"check\" value=");
      out.print( rs.getString(2));
      out.write(">\n");
      out.write("               ");
  }
      out.write("  \n");
      out.write("            \n");
      out.write("                  \n");
      out.write("                      ");
      out.print( rs.getString(1) );
      out.write(" </h3>\n");
      out.write("                 <p class=\"post-meta\">Posted on ");
      out.print( rs.getString(3) );
      out.write("</p> \n");
      out.write("                 <hr>\n");
      out.write("            \n");
      out.write("         \n");
 }
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"delete\" onclick=\"check()\">\n");
      out.write("        ");

            String select[]=request.getParameterValues("check");
       
         if(select!=null && select.length!=0)
        {
            for(int j=0;j<select.length;j++)
            {
            //out.println("\n You have selected function "+select[j]);
            Class.forName("com.mysql.jdbc.Driver");
                Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
                PreparedStatement st1=con1.prepareStatement("delete from admintable1 where serialno=(?)");
                st1.setInt(1,Integer.parseInt(select[j]));
                st1.executeUpdate();
                         
            //out.println(select[i]);
            }
            response.sendRedirect("AdminDelete.jsp");
        }
         
           
      out.write("\n");
      out.write("        </form>-->\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme JavaScript -->\n");
      out.write("    <script src=\"js/clean-blog.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
