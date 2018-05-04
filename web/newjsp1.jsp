<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE HTML>
<!--
	Projection by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title>Welcome Admin</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
		
		<style type="text/css">
		.bg{
				padding: 8em 0 9em 0;
				background-image: url(images/home1-bg.jpg);
				background-size: cover;
				background-position: bottom;
				background-attachment: fixed;
				background-repeat: no-repeat;
				text-align: center;
				position: relative;
			}
		</style>
		
		    <script type="text/javascript">
            
            function setsession()
            {
            var userName = "Shahid Bhat";
            
            session.setAtribute("date1",date);
            }
            
            </script>
	</head>
	<body class="subpage">

		<!-- Header -->
			<header id="header">
				<div class="inner">
					<a href="index.html" class="logo"><strong>Notic & GD Portal</strong></a>
					<nav id="nav">
						<a href="adminafterlogin.html">Admin Home</a>
						<a href="#notice">View</a>
						<a href="#insert">Insert</a>
						<a href="#delete">Delete</a>
						<a href="logout.jsp">Logout</a>
					</nav>
					<a href="#navPanel" class="navPanelToggle"><span class="fa fa-bars"></span></a>
				</div>
			</header>

		<!-- Three -->
		
			<section class="bg">
				<div class="inner">
						<h3 style="font-size:40px ;color:white;padding-top:180px; font-weight:bold">Welcome Admin</h3>
						<h2 style="font-size:55px ; color:white; font-weight:bold ">Acropolis Institute of Technology & Research</h2>
						
				</div>
			</section>
			
			
		
	<!---- view NOTICE--->


	
		<section id="three" class="wrapper">
				<div class="inner">
				<a name="notice"></a>
					<header class="align-center">
						<h2>View GD Topic</h2>
					</header>                    
                         
<%
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
                PreparedStatement st=con.prepareStatement("select * from notice");
                ResultSet rs=st.executeQuery();
        %>
            
			<div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                <div class="post-preview">
						<a name="view topic"></a>
                        <h2 class="post-title">
                             Topics Which are Already in Database
                        </h2>
            <% while(rs.next()){ 
           
            %>
              <a href=<%= "\"setCDate.jsp?Id=" + rs.getString(1) + "\"" %> > <%= rs.getString(2) %></a> 
<p class="post-meta">Posted on  <%= rs.getString(1) %> </p>
                          <hr>
           <% } %>
      
<!--        
        To delete comment click on topic
        <%
            ResultSet rs1=st.executeQuery();
       %>
        <table border="0">
            <tr>
                <th>Topic</th>
                <th>Date</th>
            </tr>
            <% while(rs1.next()){ 
           
            %>
            <tr>
                <td>
                    
                    <a href=<%= "\"setDate.jsp?Id=" + rs1.getString(1) + "\"" %> > <%= rs1.getString(2) %></a> 
                    
                    </td>
                <td> <%= rs1.getString(1) %> </td>
                           </tr>
           <% } %>
                  
					
				</div>
		</section>
		
		
		<!---- insert NOTICE--->
		
		<footer id="footer">
		<a name="insert"></a>
				<div class="inner">
				<h2 style="color:white; font-weight:bold; margin-top:15px">Insert GD Topic</h2>
						
					
					<form action="gdentry.jsp" method="post" name="form1">
			<textarea name="gdtopic" cols="50" rows="10" style="background-color:black"></textarea>

        <br>
        <br>
            <button class='btn btn-conf btn-green' style="background-color:white; float:center" type="submit" value="Publish" onclick="check()" >SUBMIT</button> 
			  
        </form>

				</div>
			</footer>
			
		
	<!---- delete NOTICE--->	
		<section id="three" class="wrapper">
			<a name="delete"></a>
				<div class="inner">
					<h2 style="color:black; font-weight:bold; margin-top:15px; margin-left:400px">Select GD Topic To Delete </h2>
				  <div class="post-preview">
					 	<%
					
				PreparedStatement st1=con.prepareStatement("select * from gdentry");
                ResultSet rs2=st1.executeQuery();
        %>
                 
                
      
            <% while(rs2.next()){ 
           
            %>
            
                    <a href=<%= "\"setDate.jsp?Id=" + rs2.getString(1) + "\"" %> >
                        
                    <h2 class="post-subtitle"><%= rs2.getString(2) %> </h2></a>
                  <p class="post-meta">Posted on   <%= rs2.getString(1) %></p>
                  <hr>
           <% } %>
				</div>
				</div>
			</section>
			<footer>
						
					<a href="#top"><button class='btn btn-conf btn-green' style="float:right">Top</button> </a>     
											
			</footer>
		
		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>