<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.DriverManager,java.sql.PreparedStatement,java.sql.ResultSet,java.sql.Connection"%>

<%
    //Date date=new Date();
    //String date1=date.toString();
    String notice=request.getParameter("notice");
    int count=0;
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
    PreparedStatement st1=con.prepareStatement("select * from notice");
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
    PreparedStatement st2= con.prepareStatement("select date1 from notice where serialno=?");
            st2.setInt(1,count);
            ResultSet rs1=st2.executeQuery();
           String date1="";
            while(rs1.next())
            {
            date1=rs1.getString("date1");
            
            }
        int sno=0;
        PreparedStatement st3=con.prepareStatement("select serialno from notice where date1=?");
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
    
            
            PreparedStatement st=con.prepareStatement("insert into notice values(?,?,?,?)");
            st.setInt(1,count);
            st.setString(2,notice);
            st.setDate(3,sqlDate);
            st.setString(4,date2);
            //st.setString(2,date1);
            st.executeUpdate();
    response.sendRedirect("adminview.jsp");
    
        
   %>