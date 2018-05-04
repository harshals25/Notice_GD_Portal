package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class DisplayComment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<!--\n");
      out.write("\tProjection by TEMPLATED\n");
      out.write("\ttemplated.co @templatedco\n");
      out.write("\tReleased for free under the Creative Commons Attribution 3.0 license (templated.co/license)\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Welcome Admin</title>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("\t\t\n");
      out.write("\t\t<style type=\"text/css\">\n");
      out.write("\t\t.bg{\n");
      out.write("\t\t\t\tpadding: 8em 0 9em 0;\n");
      out.write("\t\t\t\tbackground-image: url(images/home1-bg.jpg);\n");
      out.write("\t\t\t\tbackground-size: cover;\n");
      out.write("\t\t\t\tbackground-position: bottom;\n");
      out.write("\t\t\t\tbackground-attachment: fixed;\n");
      out.write("\t\t\t\tbackground-repeat: no-repeat;\n");
      out.write("\t\t\t\ttext-align: center;\n");
      out.write("\t\t\t\tposition: relative;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\t\t\n");
      out.write("\t\t    <script type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("            function setsession()\n");
      out.write("            {\n");
      out.write("            var userName = \"Shahid Bhat\";\n");
      out.write("            \n");
      out.write("            session.setAtribute(\"date1\",date);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            </script>\n");
      out.write("\t</head>\n");
      out.write("\t<body class=\"subpage\">\n");
      out.write("\n");
      out.write("\t\t<!-- Header -->\n");
      out.write("\t\t\t<header id=\"header\">\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t<a href=\"index.html\" class=\"logo\"><strong>Notic & GD Portal</strong></a>\n");
      out.write("\t\t\t\t\t<nav id=\"nav\">\n");
      out.write("\t\t\t\t\t\t<a href=\"adminafterlogin.html\">Admin Home</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#notice\">View</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#insert\">Insert</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#delete\">Delete</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"logout.jsp\">Logout</a>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t<a href=\"#navPanel\" class=\"navPanelToggle\"><span class=\"fa fa-bars\"></span></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</header>\n");
      out.write("\n");
      out.write("\t\t<!-- Three -->\n");
      out.write("\t\t\n");
      out.write("\t\t\t<section class=\"bg\">\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t\t<h3 style=\"font-size:40px ;color:white;padding-top:180px; font-weight:bold\">Welcome Admin</h3>\n");
      out.write("\t\t\t\t\t\t<h2 style=\"font-size:55px ; color:white; font-weight:bold \">Acropolis Institute of Technology & Research</h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t<!---- view NOTICE--->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\t<section id=\"three\" class=\"wrapper\">\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t<a name=\"notice\"></a>\n");
      out.write("\t\t\t\t\t<header class=\"align-center\">\n");
      out.write("\t\t\t\t\t\t<h2>View GD Topic</h2>\n");
      out.write("\t\t\t\t\t</header>                    \n");
      out.write("                         \n");

                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
                PreparedStatement st=con.prepareStatement("select * from admintable1");
                ResultSet rs=st.executeQuery();
        
      out.write("\n");
      out.write("            \n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1\">\n");
      out.write("                <div class=\"post-preview\">\n");
      out.write("\t\t\t\t\t\t<a name=\"view topic\"></a>\n");
      out.write("                        <h2 class=\"post-title\">\n");
      out.write("                             Topics Which are Already in Database\n");
      out.write("                        </h2>\n");
      out.write("            ");
 while(rs.next()){ 
           
            
      out.write("\n");
      out.write("              <a href=");
      out.print( "\"setCDate.jsp?Id=" + rs.getString(2) + "\"" );
      out.write(" > ");
      out.print( rs.getString(1) );
      out.write("</a> \n");
      out.write("<p class=\"post-meta\">Posted on  ");
      out.print( rs.getString(2) );
      out.write(" </p>\n");
      out.write("                          <hr>\n");
      out.write("           ");
 } 
      out.write("\n");
      out.write("      \n");
      out.write("<!--        \n");
      out.write("        To delete comment click on topic\n");
      out.write("        ");

            ResultSet rs1=st.executeQuery();
       
      out.write("\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Topic</th>\n");
      out.write("                <th>Date</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 while(rs1.next()){ 
           
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    <a href=");
      out.print( "\"setDate.jsp?Id=" + rs1.getString(2) + "\"" );
      out.write(" > ");
      out.print( rs1.getString(1) );
      out.write("</a> \n");
      out.write("                    \n");
      out.write("                    </td>\n");
      out.write("                <td> ");
      out.print( rs1.getString(2) );
      out.write(" </td>\n");
      out.write("                           </tr>\n");
      out.write("           ");
 } 
      out.write("\n");
      out.write("                  \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<!---- insert NOTICE--->\n");
      out.write("\t\t\n");
      out.write("\t\t<footer id=\"footer\">\n");
      out.write("\t\t<a name=\"insert\"></a>\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t<h2 style=\"color:white; font-weight:bold; margin-top:15px\">Insert GD Topic</h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<form action=\"gdentry.jsp\" method=\"post\" name=\"form1\">\n");
      out.write("\t\t\t<textarea name=\"notice\" cols=\"50\" rows=\"10\" style=\"background-color:black\"></textarea>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("            <button class='btn btn-conf btn-green' style=\"background-color:white; float:center\" type=\"submit\" value=\"Publish\" onclick=\"check()\" >SUBMIT</button> \n");
      out.write("\t\t\t  \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</footer>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t<!---- delete NOTICE--->\t\n");
      out.write("\t\t<section id=\"three\" class=\"wrapper\">\n");
      out.write("\t\t\t<a name=\"delete\"></a>\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t<h2 style=\"color:black; font-weight:bold; margin-top:15px; margin-left:400px\">Select GD Topic To Delete </h2>\n");
      out.write("\t\t\t\t  <div class=\"post-preview\">\n");
      out.write("\t\t\t\t\t \t");

					
				PreparedStatement st1=con.prepareStatement("select * from gdentry");
                ResultSet rs2=st1.executeQuery();
        
      out.write("\n");
      out.write("             \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("      \n");
      out.write("            ");
 while(rs2.next()){ 
           
            
      out.write("\n");
      out.write("            \n");
      out.write("                    <a href=");
      out.print( "\"setDate.jsp?Id=" + rs2.getString(2) + "\"" );
      out.write(" >\n");
      out.write("                        \n");
      out.write("                    <h2 class=\"post-subtitle\">");
      out.print( rs2.getString(1) );
      out.write(" </h2></a>\n");
      out.write("                  <p class=\"post-meta\">Posted on   ");
      out.print( rs2.getString(2) );
      out.write("</p>\n");
      out.write("                  <hr>\n");
      out.write("           ");
 } 
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"#top\"><button class='btn btn-conf btn-green' style=\"float:right\">Top</button> </a>     \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t</footer>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Scripts -->\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/skel.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/util.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\t</body>\n");
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
