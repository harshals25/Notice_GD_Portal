<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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

    <title>Display</title>

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

<body background="download_1.jpg">

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
                  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <h4 style=" color: grey">
            <% String a=session.getAttribute("username").toString();
            out.println("Hello "+a); %>
        </h4>
             
                  </div>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
              <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>      
						<a href="StudentAfterLogin.html"><button class='btn btn-conf btn-green' style="float:right">Student Home</button> </a>     
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
                        <h1 style="font-size:40px ;color:white;padding-top:180px; font-weight:bold">AITR</h1>
                        <hr class="small">
                        <span class="subheading" style="font-size:45px ; color:white;">Acropolis Institute of Technology & Research</span>
                    </div>
                </div>
            </div>
        </div>
    </header>

    <!-- Main Content -->
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                <div class="post-preview">
                    <h1>This is to inform you that:</h1>
                        <%      
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
                       PreparedStatement st=con.prepareStatement("select * from notice  ");
                       ResultSet rs=st.executeQuery();
                       String date2="";
                
                       if(request.getParameter("counter")==null)
                       {         
                for(int i=1;i<=5;i++)
                {
                    if(rs.next() == false)
                    {
                       break;
                    }
                    else
                    {
                        Date startDate=new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("date"));
                        date2 = new SimpleDateFormat("dd-MM-yyyy").format(startDate);
                        %>
                <h2 class="post-title">
                   <%= rs.getString(2) %>
                        </h2>
                   <p class="post-meta">Posted on <%= date2 %></p>
                    <hr>
                  
                        <% }
                  }
                       }                      
                       else
                       {
                           int count=Integer.parseInt(request.getParameter("counter"));
                         for(int i=1;i<=count;i++)
                {
                    if(rs.next() == false)
                    {
                       break;
                    }
                    else
                    {
               Date startDate=new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("date"));
               date2 = new SimpleDateFormat("dd-MM-yyyy").format(startDate);
                        
                        
                        %>
                <h2 class="post-title">
                   <%= rs.getString(2) %>
                        </h2>
                   <p class="post-meta">Posted on <%= date2 %></p>
                    <hr>
                  
                        <% }
                  }
                       }
                %>
                
                </div>
            </div>
        </div>
    </div>
                  

    <!-- Footer -->
    
        <div class="container" >
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                    
                   <form action="home.jsp" method="post">
                       Select the number of notices you want to be displayed <input type="number" min="5" max="20" value="5" step="5" name="counter">
                  <input type="submit" value="view">
                  </form>
                 
                    <br>
                    <br>

                   
                </div>
            </div>
        </div>
   

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/clean-blog.min.js"></script>

</body>

</html>
