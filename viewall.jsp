<%@include file="connection.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<center><u>UnRegister Student</u><br />
<table border="7" bordercolor="#CCCC00" bgcolor="#CC6699" >

<tr style="color:#FFFFFF"><th >Student Id</th><th>Student Name</th><th>Email Id</th><th>Faculty Name </th><th>Student Amount Paid</th></tr>

<%
try{
String q="SELECT * from niitragister;";
rs=st.executeQuery(q);
while(rs.next())
{
    %>
<tr style="color:#66FFFF"><td><%= rs.getString(1) %></td><td><%= rs.getString(2) %></td><td><%= rs.getString(4) %></td><td><%= rs.getString(5) %></td></tr>
<%}
}
catch(Exception ex)
{
    ex.printStackTrace();
}

%>
</table>