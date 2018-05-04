<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>

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
                        <span class="subheading">Acropolis Institute of Technology & Research</span>
                    </div>
                </div>
            </div>
        </div>
    </header>


       
        <h3>Discussion :-</h3>
        <%  
//            String date="";
//            String date2 = request.getRequestURL().append("?").append(request.getQueryString()).toString();
//               
//            char[] ch=new char[10];
//            int j=0;
//            int a=date2.length();
//            for(int i=a-10;i<a;i++,j++)
//            {
//               ch[j]=date2.charAt(i);
//            }
//            date=new String(ch);
            String date3=session.getAttribute("date1").toString();
            //String date=request.getParameter("viewdate");
           //String enrollno=session.getAttribute("enrollno").toString();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            PreparedStatement st2=con.prepareStatement("select * from comment where date=?");
            st2.setString(1,date3);
            ResultSet rs2=st2.executeQuery();
            %>
            <form>
                <h3 class="post-subtitle">  <% while(rs2.next()){ %></h3>
            
            <tr>
                 <h4>
               <input type="checkbox" name="check" value=<%= rs2.getInt("serialno") %>>                 
                 <%= rs2.getString(2)   %> 
                 <p> posted by <%= rs2.getString(3) %></p> 
                
                 </h4>
            
           <% } 
           %>
        
       
        <input type="submit" value="submit" onclick="checkenroll()">
        <% String select[]=request.getParameterValues("check");
       String enrollno[]=request.getParameterValues("check1");
         if(select!=null && select.length!=0)
        {
            for(int k=0;k<select.length;k++)
            {
            
            //out.println("\n You have selected"+select[k]);
            PreparedStatement st3=con.prepareStatement("delete from comment where serialno=? and date=?");
            st3.setInt(1,Integer.parseInt(select[k]));
            //st3.setString(2,enrollno[k]);
            st3.setString(2,date3);
            st3.executeUpdate();
            }
            response.sendRedirect("ViewDeleteComment.jsp");
        }
        
         %>    
    </body>
</html>