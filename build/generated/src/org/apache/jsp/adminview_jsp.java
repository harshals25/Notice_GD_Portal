package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public final class adminview_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<!--\r\n");
      out.write("\tProjection by TEMPLATED\r\n");
      out.write("\ttemplated.co @templatedco\r\n");
      out.write("\tReleased for free under the Creative Commons Attribution 3.0 license (templated.co/license)\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Welcome Admin</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t.bg{\r\n");
      out.write("\t\t\t\tpadding: 8em 0 9em 0;\r\n");
      out.write("\t\t\t\tbackground-image: url(images/home1-bg.jpg);\r\n");
      out.write("\t\t\t\tbackground-size: cover;\r\n");
      out.write("\t\t\t\tbackground-position: bottom;\r\n");
      out.write("\t\t\t\tbackground-attachment: fixed;\r\n");
      out.write("\t\t\t\tbackground-repeat: no-repeat;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t\tposition: relative;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\n");
      out.write("\t\t\n");
      out.write("\t\t  <script>\n");
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
      out.write("    </script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body class=\"subpage\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Header -->\r\n");
      out.write("\t\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index.html\" class=\"logo\"><strong>Notic & GD Portal</strong></a>\r\n");
      out.write("\t\t\t\t\t<nav id=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"adminafterlogin.html\">Admin Home</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#notice\">View</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#insert\">Insert</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#delete\">Delete</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"logout.jsp\">Logout</a>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t<a href=\"#navPanel\" class=\"navPanelToggle\"><span class=\"fa fa-bars\"></span></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Three -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<section class=\"bg\">\r\n");
      out.write("\t\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t\t\t<h3 style=\"font-size:40px ;color:white;padding-top:180px; font-weight:bold\">Welcome Admin</h3>\r\n");
      out.write("\t\t\t\t\t\t<h2 style=\"font-size:55px ; color:white; font-weight:bold \">Acropolis Institute of Technology & Research</h2>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t<!---- view NOTICE--->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t<section id=\"three\" class=\"wrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t<a name=\"notice\"></a>\r\n");
      out.write("\t\t\t\t\t<header class=\"align-center\">\r\n");
      out.write("\t\t\t\t\t\t<h2>View Notices</h2>\r\n");
      out.write("\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                        \r\n");
      out.write("                         \r\n");

                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
                PreparedStatement st=con.prepareStatement("select * from admintable1");
                ResultSet rs=st.executeQuery();
        
      out.write("\r\n");
      out.write("            ");
 while(rs.next()){ 
      out.write("\r\n");
      out.write("            <h2>\r\n");
      out.write("                \r\n");
      out.write("                ");
      out.print( rs.getString(1));
      out.write(" </h2> \r\n");
      out.write("                <p >Posted on ");
      out.print( rs.getString(3) );
      out.write("</p> \r\n");
      out.write("                 <hr>\r\n");
      out.write("         ");
 } 
      out.write("\r\n");
      out.write("        \r\n");
      out.write("                  \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<!---- insert NOTICE--->\n");
      out.write("\t\t\n");
      out.write("\t\t<footer id=\"footer\">\n");
      out.write("\t\t<a name=\"insert\"></a>\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t<h2 style=\"color:white; font-weight:bold; margin-top:15px\">Insert Notice</h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<form action=\"AdminEntry.jsp\" method=\"post\">\n");
      out.write("\t\t\t<textarea name=\"notice\" cols=\"50\" rows=\"10\" style=\"background-color:black\"></textarea>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("            <button class='btn btn-conf btn-green' style=\"background-color:white; float:center\" type=\"submit\" value=\"Submit\" name=\"submit\">SUBMIT</button>    \n");
      out.write("\t\t\t  \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</footer>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t<!---- delete NOTICE--->\t\n");
      out.write("\t\t<section id=\"three\" class=\"wrapper\">\r\n");
      out.write("\t\t\t<a name=\"delete\"></a>\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t<h2 style=\"color:black; font-weight:bold; margin-top:15px; margin-left:400px\">Select Date to Delete Entries</h2>\n");
      out.write("\t\t\t\t <div class=\"post-preview\">\n");
      out.write("\t\t\t\t\t <form action=\"deletecheck.jsp\" method=\"post\">    \n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"date\" name=\"date2\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Submit Date\">\n");
      out.write("               \n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("                      </form>\n");
      out.write("\t\t\t\t </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t <!--        Notices Which are Already in Database\n");
      out.write("                       </h2>\n");
      out.write("        ");

             
                
                PreparedStatement st1=con.prepareStatement("select * from admintable1");
                ResultSet rs1=st1.executeQuery();
        
      out.write("\n");
      out.write("         <h3 class=\"post-subtitle\">\n");
      out.write("                \n");
      out.write("        <input type=\"checkbox\" id=\"s1\" name=\"s1\">Select all\n");
      out.write("         </h3> \n");
      out.write("        \n");
      out.write("         \n");
      out.write("            ");
 while(rs1.next()){ int i=0;
            if(request.getParameterValues("s1")!=null)
            {
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <h3 class=\"post-subtitle\">\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                 <input type=\"checkbox\" name=\"check\" checked value=");
      out.print( rs1.getString(2));
      out.write("> \n");
      out.write("           ");
         
        } else
            {
      out.write("\n");
      out.write("                 <input type=\"checkbox\" name=\"check\" value=");
      out.print( rs1.getString(2));
      out.write(">\n");
      out.write("               ");
  }
      out.write("  \n");
      out.write("            \n");
      out.write("                  \n");
      out.write("                      ");
      out.print( rs1.getString(1) );
      out.write(" </h3>\n");
      out.write("                 <p class=\"post-meta\">Posted on ");
      out.print( rs1.getString(3) );
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
            
          
                PreparedStatement st2=con.prepareStatement("delete from admintable1 where serialno=(?)");
                st2.setInt(1,Integer.parseInt(select[j]));
                st2.executeUpdate();
                         
            //out.println(select[i]);
            }
            response.sendRedirect("AdminDelete.jsp");
        }
         
           
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<footer>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<a href=\"#top\"><button class='btn btn-conf btn-green' style=\"float:right\">Top</button> </a>     \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Scripts -->\r\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/skel.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/util.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
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
