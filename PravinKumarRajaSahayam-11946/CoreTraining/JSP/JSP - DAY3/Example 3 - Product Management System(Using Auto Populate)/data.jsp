<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*" %> 
<%
String id = request.getParameter("id").toString();
System.out.println(id);
String data ="";
try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select * from test where id='"+id+"'");
while(rs.next())
{
 data = ":" + rs.getString("type") + ":" + rs.getInt("price");
}
  out.println(data);
  System.out.println(data);
}
catch(Exception e) {
System.out.println(e);
}
%>
