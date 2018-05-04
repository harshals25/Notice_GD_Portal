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

    <title>Notice</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/clean-blog.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='http://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  <script>
            function check()
            {
                String select[]=request.getParameterValues("check");
        if(select!=null && select.length!=0)
        {
            for(int i=0;i<select.length;i++)
            {
            out.println("You have selected");
            out.println(select[i]);
            }
        }
    }
    </script>
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
                    <a href="adminview.jsp">View</a>
                    </li>
                    <li>
                        <a href="AdminInsert.jsp">Insert</a>
                    </li>
                    <li>
                        <a href="AdminDelete.jsp">Delete</a>
                    </li>


                    <li>
                        <a href="logout.jsp">Logout</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

        <!-- Page Header -->
    <!-- Set your background image for this header on the line below. -->
    <header class="intro-header" style="background-image: url('img/home-bg.jpg')">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                    <div class="site-heading">
                        <h1>AITR</h1>
                        <hr class="small">
                        <span class="subheading">Acropolis Institute of Technology & Research</span>
                    </div>
                </div>
            </div>
        </div>
    </header>


       
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                <div class="post-preview">
                    
                        
                            <form action="deletecheck.jsp" method="post">    
          <h2 class="post-title"> Select Date to Delete Entries</h2>
           <br>
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="date" name="date2">

               <input type="submit" value="Submit Date">
               
           <br>
                            </form>
                        
                </div>
            </div>
        </div>
    </div>
    
                   <!--        Notices Which are Already in Database
                       </h2>
        <%
             
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
                PreparedStatement st=con.prepareStatement("select * from notice");
                ResultSet rs=st.executeQuery();
        %>
         <h3 class="post-subtitle">
                
        <input type="checkbox" id="s1" name="s1">Select all
         </h3> 
        
         
            <% while(rs.next()){ int i=0;
            if(request.getParameterValues("s1")!=null)
            {%>
            <br>
            <h3 class="post-subtitle">
            
                
                 <input type="checkbox" name="check" checked value=<%= rs.getString(1)%>> 
           <%         
        } else
            {%>
                 <input type="checkbox" name="check" value=<%= rs.getString(1)%>>
               <%  }%>  
            
                  
                      <%= rs.getString(2) %> </h3>
                 <p class="post-meta">Posted on <%= rs.getString(3) %></p> 
                 <hr>
            
         
<% }%>
        
        
        
        <input type="submit" value="delete" onclick="check()">
        <%
            String select[]=request.getParameterValues("check");
       
         if(select!=null && select.length!=0)
        {
            for(int j=0;j<select.length;j++)
            {
            //out.println("\n You have selected function "+select[j]);
            Class.forName("com.mysql.jdbc.Driver");
                Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
                PreparedStatement st1=con1.prepareStatement("delete from notice where serialno=(?)");
                st1.setInt(1,Integer.parseInt(select[j]));
                st1.executeUpdate();
                         
            //out.println(select[i]);
            }
            response.sendRedirect("AdminDelete.jsp");
        }
         
           %>
        </form>-->
    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/clean-blog.min.js"></script>

</body>

</html>
