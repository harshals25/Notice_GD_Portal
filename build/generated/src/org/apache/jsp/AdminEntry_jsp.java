package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public final class AdminEntry_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    //Date date=new Date();
    //String date1=date.toString();
    String notice=request.getParameter("notice");
    int count=0;
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
    PreparedStatement st1=con.prepareStatement("select * from admintable1");
    ResultSet rs=st1.executeQuery();
    while(rs.next())
    {
        count++;
    }
    
   // count=count+1;
    
    //Timestamp date = new Timestamp(new java.util.Date().getTime());
    java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
    String date2 = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
    //int count2=count-1;
    PreparedStatement st2= con.prepareStatement("select date1 from admintable1 where serialno=?");
            st2.setInt(1,count);
            ResultSet rs1=st2.executeQuery();
           String date1="";
            while(rs1.next())
            {
            date1=rs1.getString("date1");
            
            }
        int sno=0;
        PreparedStatement st3=con.prepareStatement("select serialno from admintable1 where date1=?");
        st3.setString(1,date2);
        ResultSet rs2=st3.executeQuery();
        while(rs2.next())
        {
            sno=rs2.getInt("serialno");
        }
        if(date1.equals(date2))
            {
                count=count+1;
            }
        
        
        else
            {   
                
                
                    count=sno+1;
                //    count=1;
                
            }
    
            
            PreparedStatement st=con.prepareStatement("insert into admintable1 values(?,?,?,?)");
            st.setString(1,notice);
            st.setInt(2,count);
            st.setDate(3,sqlDate);
            st.setString(4,date2);
            //st.setString(2,date1);
            st.executeUpdate();
    response.sendRedirect("adminview.jsp");
    
    
   
   
    
   
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
