<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>notice</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/clean-blog.min.css" rel="stylesheet">
	<style type="text/css">
button {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 50%;
  box-shadow: 0 9px #999;
}

button:hover {background-color: #3e8e41}

button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
		</style>
		
		
    </head>
   
        <body>

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-custom navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>      
						<a href="adminview.jsp"><button class='btn btn-conf btn-green' style="float:right">view</button> </a>     
                    </li>
                    <li>
						<a href="logout.jsp"><button class='btn btn-conf btn-green' style="float:right">logout</button> </a>     
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

        <!-- Page Header -->
    <!-- Set your background image for this header on the line below. -->
    <header class="intro-header" style="background-image: url(images/home1-bg.jpg)">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                    <div class="site-heading" style="margin-top:50px">
                        <h1 style="margin-top:10px">AITR</h1>
                        <hr class="small">
                        <span class="subheading" style="margin-top: 70px;font-size:30px ; color:white ">Acropolis Institute of Technology & Research</span>
                    </div>
                </div>
            </div>
        </div>
    </header>

<%                 
                
               
                String date2 = request.getParameter("date2");
                //out.println("\n String"+date2);
                      
               // String date5=request.getParameter("date2");
               // out.println("Is this showing null"+date5);                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
                PreparedStatement st=con.prepareStatement("select * from notice where date=(?)");
                st.setString(1,date2);
                ResultSet rs=st.executeQuery();
                
        %>
             
        
<div class="container" style="background-color:grey">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                <div class="post-preview">
                    
                        <h2 class="post-title">
                        Notices Which are Already in Database
                                           </h2>
                                <%  
               
                while(rs.next()){  
                   
             %> 
             <form > 
             <h3 class="post-subtitle">
                 <input type="checkbox" name="check" id="check" value=<%= rs.getString(1) %>> 
                
                 <input type="text" hidden name="needdate" id="needdate" value=<%= rs.getString(3) %>>
                
                
                
                
                <%= rs.getString(2)%> </h3> 
                <p class="post-meta">Posted on <%= rs.getString(3) %></p> 
             
                 <hr>
         <% } %>
        
        <input type="submit" value="Delete" onclick="check1()">
        </form>
                </div>
            </div>
        </div>
</div>
        
        
        
        <%
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
        %>

                <% } 
                        else {
                            %>
                            <b>myText is 
                                <%= needdate %></b>
                            <%
                            }%>

                            
                            
         <%
             }   
                 //out.println("Still giving (null) "+date6);
                  String select[]=request.getParameterValues("check");
                  if(select!=null && select.length!=0)
        {
            for(int j=0;j<select.length;j++)
            {
                
                
               out.println("\n date is "+needdate);
                PreparedStatement st1=con.prepareStatement("delete from notice where serialno=? and date=? ");
                st1.setInt(1,Integer.parseInt(select[j]));
                st1.setString(2,needdate);
                st1.executeUpdate();
                
            }
        response.sendRedirect("adminview.jsp");
        }
                  
%>

        
</body>
</html>
