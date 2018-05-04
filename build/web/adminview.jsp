<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>

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
						<h2>View Notices</h2>
					</header>
					
					
                        
                         
<%
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
                PreparedStatement st=con.prepareStatement("select * from notice");
                ResultSet rs=st.executeQuery();
        %>
            <% while(rs.next()){ %>
            <h2>
                
                <%= rs.getString(2)%> </h2> 
                <p >Posted on <%= rs.getString(3) %></p> 
                 <hr>
         <% } %>
        
                  
					
				</div>
			</section>
		
		
		<!---- insert NOTICE--->
		
		<footer id="footer">
		<a name="insert"></a>
				<div class="inner">
				<h2 style="color:white; font-weight:bold; margin-top:15px">Insert Notice</h2>
						
					
					<form action="AdminEntry.jsp" method="post">
			<textarea name="notice" cols="50" rows="10" style="background-color:black"></textarea>

        <br>
        <br>
            <button class='btn btn-conf btn-green' style="background-color:white; float:center" type="submit" value="Submit" name="submit">SUBMIT</button>    
			  
        </form>

				</div>
			</footer>
			
		
	<!---- delete NOTICE--->	
		<section id="three" class="wrapper">
			<a name="delete"></a>
				<div class="inner">
					<h2 style="color:black; font-weight:bold; margin-top:15px; margin-left:400px">Select Date to Delete Entries</h2>
				 <div class="post-preview">
					 <form action="deletecheck.jsp" method="post">    
						<br>
							<input type="date" name="date2">

							<input type="submit" value="Submit Date">
               
						<br>
                      </form>
				 </div>
				</div>
			</section>
			 <!--        Notices Which are Already in Database
                       </h2>
        <%
             
                
                PreparedStatement st1=con.prepareStatement("select * from notice");
                ResultSet rs1=st1.executeQuery();
        %>
         <h3 class="post-subtitle">
                
        <input type="checkbox" id="s1" name="s1">Select all
         </h3> 
        
         
            <% while(rs1.next()){ int i=0;
            if(request.getParameterValues("s1")!=null)
            {%>
            <br>
            <h3 class="post-subtitle">
            
                
                 <input type="checkbox" name="check" checked value=<%= rs1.getString(1)%>> 
           <%         
        } else
            {%>
                 <input type="checkbox" name="check" value=<%= rs1.getString(1)%>>
               <%  }%>  
            
                  
                      <%= rs1.getString(2) %> </h3>
                 <p class="post-meta">Posted on <%= rs1.getString(3) %></p> 
                 <hr>
            
         
<% }%>
        
        
        
        <input type="submit" value="delete" onclick="check()">
        <%
            String select[]=request.getParameterValues("check");
       
         if(select!=null && select.length!=0)
        {
            for(int j=0;j<select.length;j++)
            {
            
          
                PreparedStatement st2=con.prepareStatement("delete from admintable1 where serialno=(?)");
                st2.setInt(1,Integer.parseInt(select[j]));
                st2.executeUpdate();
                         
            //out.println(select[i]);
            }
            response.sendRedirect("AdminDelete.jsp");
        }
         
           %>
		
		
		
				
				
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