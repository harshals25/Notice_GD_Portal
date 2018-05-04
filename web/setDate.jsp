<%
            String date="";
            String date2 = request.getRequestURL().append("?").append(request.getQueryString()).toString();
               
            char[] ch=new char[10];
            int j=0;
            int a=date2.length();
            for(int i=a-10;i<a;i++,j++)
            {
               ch[j]=date2.charAt(i);
            }
           
            date=new String(ch);
           session.setAttribute("date1",date);
           response.sendRedirect("ViewDeleteComment.jsp");
          // String str=session.getAttribute("date1").toString();
          // out.println(str);
%>