<%@include file="connection.jsp" %>

<%
    String a1,a2,a3;
    a1=request.getParameter("si");
    a2=request.getParameter("ps");
    a3="select * from niitragister where sid='"+a1+"' and pass='"+a2+"'";
    boolean x= false;
    rs=st.executeQuery(a3);
    x=rs.next();
    if(x==true)
    {
      response.sendRedirect("afterlogin.html");
       // RequestDispatcher rd=request.getRequestDispatcher("/afterlogin.html");
        //rd.forward(request, response);
        %>
        
      
        
        <%
    }else
{%>
        Wrong password
<%}
%>