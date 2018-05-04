<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<% 
    String name=request.getParameter("username");
    String enrollno=request.getParameter("enrollno");
    String password=request.getParameter("password");
    String branch=request.getParameter("branch");

    int i=0;
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
    
    if(name=="" || enrollno=="" || password=="" || branch=="")
    {
        session.setAttribute("check1","empty");
        response.sendRedirect("index.html"); 
    }
    else{
            PreparedStatement st1=con.prepareStatement("select * from studreg where enrollno=?");
            st1.setString(1,enrollno);
            ResultSet rs=st1.executeQuery();
            while(rs.next())
            {
             i=1;   
            }
            if(i==1)
            {
                session.setAttribute("check1","noenrollno");
                response.sendRedirect("index.jsp");
                out.println("Enrollment no already Exists");
            }
            else
            {
                PreparedStatement st=con.prepareStatement("insert into studreg values(?,?,?,?)");
                st.setString(2,name);
                st.setString(1,enrollno);
                st.setString(3,password);
                st.setString(4,branch);
                st.executeUpdate();
                out.println("Record Submitted");
                session.setAttribute("check1","submitted");
                response.sendRedirect("index.html");
            }
    }
 %>