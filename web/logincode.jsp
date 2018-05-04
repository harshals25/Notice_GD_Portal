<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<html> <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>JSP Page</title>
    </head> 
    <body> 
        <% 
        String enrollno=request.getParameter("enrollno");
        String password=request.getParameter("password");
        if(enrollno.equals("") || password.equals(""))
        {
            response.sendRedirect("signin.html");
        }
        else
        {       
        response.setHeader("Pragma","no-cache");
        response.setHeader("Cache-Control","no-store");
        response.setHeader("Expires","0");
        response.setDateHeader("Expires",-1);

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        PreparedStatement st=con.prepareStatement("select * from studreg where enrollno=? and password=?");
        st.setString(1,enrollno);
        st.setString(2,password);
        ResultSet rs=st.executeQuery();
        while(rs.next())
        {
            String username=rs.getString("name");
         if(session.getAttribute("username")== null)
            {
               session.setAttribute("username",username);
               session.setAttribute("enrollment",enrollno);
               response.sendRedirect("StudentAfterLogin.html");
            } 
            else
            {                
                out.println("Session not terminated");
                response.sendRedirect("error.jsp");
            }
        }
        }       
        %> </body> 
</html>
