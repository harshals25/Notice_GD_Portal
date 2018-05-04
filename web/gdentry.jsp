<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%  
    String topic=request.getParameter("gdtopic");
    String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    int count=0;
    if(topic.equals(""))
    {
    response.sendRedirect("AdminGDEntry.jsp");
    }
    else
    {    
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        PreparedStatement st=con.prepareStatement("select * from gdentry where date=?");
        st.setString(1,date);
        ResultSet rs=st.executeQuery();
        while(rs.next())
        {
            count++;
        }
        if(count==0)
        {
            PreparedStatement st1=con.prepareStatement("insert into gdentry values(?,?)");
            st1.setString(2,topic);
            st1.setString(1,date);
            st1.executeUpdate();
            response.sendRedirect("DisplayComment.jsp");
        }
        else
        {
            response.sendRedirect("AdminGDEntry.jsp");
        }
    }
    
 %>   