package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class addcomment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String username=session.getAttribute("username").toString();
        String enrollno=session.getAttribute("enrollment").toString();
        String comment=request.getParameter("comment");
        int serial=1;
        if(comment.equals(""))
        {
            response.sendRedirect("DisplayComment.jsp");
        }
        else
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");   
        int spoof=0;
        PreparedStatement st=con.prepareStatement("select * from comment order by serialno");
        //st.setString(1,enrollno);
        //st.setString(1,date);
        ResultSet rs=st.executeQuery();
        while(rs.next())
        {
             spoof=rs.getInt("serialno");
             serial++;
        }
        if(serial>1)
        {
                serial=spoof+1;
                PreparedStatement st2=con.prepareStatement("insert into comment values(?,?,?,?,?)");
                st2.setString(1,comment);
                st2.setString(2,username); //to be added by session
                st2.setString(3,enrollno);
                st2.setString(4,date);
                st2.setInt(5,serial);
                st2.executeUpdate();
                response.sendRedirect("TopicComment.jsp");
            }
       else{  
        //PreparedStatement st1=con.prepareStatement("select * from comment");
//        ResultSet rs1=st1.executeQuery();
//        while(rs1.next())
//        {
//            serial++;
//                
//        }
//        out.println(serial);
//         // get name via session compare with database give serial no   
        PreparedStatement st3=con.prepareStatement("insert into comment values(?,?,?,?,?)");

        st3.setString(1,comment);
        st3.setString(2,username); //to be added by session
        st3.setString(3,enrollno);
        st3.setString(4,date);
        st3.setInt(5,serial);
        st3.executeUpdate();
        
        response.sendRedirect("TopicComment.jsp");
        }
        }

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
