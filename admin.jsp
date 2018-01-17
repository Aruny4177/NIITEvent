<%@include file="connection.jsp" %>

<%
    String a1,a2,a3;
    a1=request.getParameter("un");
    a2=request.getParameter("up");
    a3="select * from admin where username='"+a1+"' and password='"+a2+"'";
    boolean x= false;
    rs=st.executeQuery(a3);
    x=rs.next();
    if(x==true)
    {%>
    <a href="aftradmin"></a> 
    <%
    }
    else
    {
        %>
        Worng password
        <%
    }
%> 