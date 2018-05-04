<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<html> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>JSP Page</title> 
    </head> 
    <body> 
        <%
        session.removeAttribute("username");
//        if(session!=null)
//        {
////        session.removeAttribute("password"); 
//        session.invalidate(); 
//        }
        session.invalidate();
                response.setHeader("Pragma","no-cache"); 
                response.setHeader("Cache-Control","no-store"); 
                response.setHeader("Expires","0"); 
                response.setDateHeader("Expires",-1); 
        out.println("<script> parent.location.href='index.html' </script>");
        
        %>
<h1>Logout was done successfully.</h1>
    </body> 
</html>

