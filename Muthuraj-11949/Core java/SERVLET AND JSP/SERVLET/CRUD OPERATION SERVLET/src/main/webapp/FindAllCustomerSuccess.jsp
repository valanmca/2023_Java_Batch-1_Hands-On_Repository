<%@page import="java.util.LinkedList"%>
<%@page import="com.cus.bean.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
			<h3 align="center">CUSTOMER DETAILS</h3>

<table>
<form action="CUSController" method="Get">
<br>
<%       
            LinkedList<Customer> list=(LinkedList<Customer>)request.getAttribute("list");  
             out.println("<table width='60%' align='center'>");
             out.println("<tr><th>Customer Id</th><th>Customer Name</th><th>Customer Email</th><th>Customer Contact</th><th>Customer Location</th></tr>");
             for(Customer a:list) {
            	   out.println("<tr><th>"+a.getId()+"</th><th>"+a.getName()+"</th><th>"+a.getEmail()+"</th><th>"+a.getConNmuber()+"</th><th>"+a.getLocation()+"</th></tr>");
             }
             out.println("</table>");
      %>
      </form>
      </table>
</body>
</html>