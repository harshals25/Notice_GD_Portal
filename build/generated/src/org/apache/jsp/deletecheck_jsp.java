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

public final class deletecheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>notice</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/clean-blog.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("button {\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 15px 25px;\n");
      out.write("  font-size: 24px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  outline: none;\n");
      out.write("  color: #fff;\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  box-shadow: 0 9px #999;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {background-color: #3e8e41}\n");
      out.write("\n");
      out.write("button:active {\n");
      out.write("  background-color: #3e8e41;\n");
      out.write("  box-shadow: 0 5px #666;\n");
      out.write("  transform: translateY(4px);\n");
      out.write("}\n");
      out.write("\t\t</style>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("        <body>\n");
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
      out.write("\t\t\t\t\t\t<a href=\"adminview.jsp\"><button class='btn btn-conf btn-green' style=\"float:right\">view</button> </a>     \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("\t\t\t\t\t\t<a href=\"logout.jsp\"><button class='btn btn-conf btn-green' style=\"float:right\">logout</button> </a>     \n");
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
      out.write("    <header class=\"intro-header\" style=\"background-image: url(images/home1-bg.jpg)\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1\">\n");
      out.write("                    <div class=\"site-heading\" style=\"margin-top:50px\">\n");
      out.write("                        <h1 style=\"margin-top:10px\">AITR</h1>\n");
      out.write("                        <hr class=\"small\">\n");
      out.write("                        <span class=\"subheading\" style=\"margin-top: 70px;font-size:30px ; color:white \">Acropolis Institute of Technology & Research</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
                 
                
               
                String date2 = request.getParameter("date2");
                //out.println("\n String"+date2);
                      
               // String date5=request.getParameter("date2");
               // out.println("Is this showing null"+date5);                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
                PreparedStatement st=con.prepareStatement("select * from admintable1 where date=(?)");
                st.setString(1,date2);
                ResultSet rs=st.executeQuery();
                
        
      out.write("\n");
      out.write("             \n");
      out.write("        \n");
      out.write("<div class=\"container\" style=\"background-color:grey\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1\">\n");
      out.write("                <div class=\"post-preview\">\n");
      out.write("                    \n");
      out.write("                        <h2 class=\"post-title\">\n");
      out.write("                        Notices Which are Already in Database\n");
      out.write("                                           </h2>\n");
      out.write("                                ");
  
               
                while(rs.next()){  
                   
             
      out.write(" \n");
      out.write("             <form > \n");
      out.write("             <h3 class=\"post-subtitle\">\n");
      out.write("                 <input type=\"checkbox\" name=\"check\" id=\"check\" value=");
      out.print( rs.getString(2) );
      out.write("> \n");
      out.write("                \n");
      out.write("                 <input type=\"text\" hidden name=\"needdate\" id=\"needdate\" value=");
      out.print( rs.getString(3) );
      out.write(">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");
      out.print( rs.getString(1));
      out.write(" </h3> \n");
      out.write("                <p class=\"post-meta\">Posted on ");
      out.print( rs.getString(3) );
      out.write("</p> \n");
      out.write("             \n");
      out.write("                 <hr>\n");
      out.write("         ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"Delete\" onclick=\"check1()\">\n");
      out.write("        </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

                String needdate=request.getParameter("needdate");
                //out.println("Date 8 has "+needdate);
                
                
                if (needdate == null) {
                // myText is null when the page is first requested, 
                // so do nothing
                } 
                else { 
                        if (needdate.length() == 0) {
                        // There was a querystring like ?myText=
                        // but no text, so myText is not null, but 
                        // a zero length string instead.
        
      out.write("\n");
      out.write("\n");
      out.write("                ");
 } 
                        else {
                            
      out.write("\n");
      out.write("                            <b>myText is \n");
      out.write("                                ");
      out.print( needdate );
      out.write("</b>\n");
      out.write("                            ");

                            }
      out.write("\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("         ");

             }   
                 //out.println("Still giving (null) "+date6);
                  String select[]=request.getParameterValues("check");
                  if(select!=null && select.length!=0)
        {
            for(int j=0;j<select.length;j++)
            {
                
                
               out.println("\n date is "+needdate);
                PreparedStatement st1=con.prepareStatement("delete from admintable1 where serialno=? and date=? ");
                st1.setInt(1,Integer.parseInt(select[j]));
                st1.setString(2,needdate);
                st1.executeUpdate();
                
            }
        response.sendRedirect("adminview.jsp");
        }
                  

      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("</body>\n");
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
