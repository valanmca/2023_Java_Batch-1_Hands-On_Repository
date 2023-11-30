<%@page import="com.sms.bean.StudentServ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@include file="FindStudent.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
th,td{
	text-align:center;
}
</style>
</head>
<body>
<br>
	<%
	StudentServ bean = (StudentServ) request.getAttribute("bean");
	if(bean != null){
	   out.println("<table align='center' class='table table-stripped w-75'><thead class='table table-info'>");
	   out.println("<tr><th>Student Id </th><th>Student Name</th><th>Student Depart</th></thead></tr>");
	  
	   
	   	out.println("<tr><td>"+bean.getId()+"</td><td>"+bean.getName()+"</td><td>"+bean.getDept()+"</td></tr>");
	   
	   out.println("</table>");
	   }
	   else{
		   out.println("<br><center><div class='alert alert-danger w-50 align-items-center'> <strong>Student Record not Found!</strong> </div></center>");
	   }
	  
	%>
</body>
</html>
