<%@page import="com.ems.bean.Employee"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@include file="FindEmployee.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Employee bean= (Employee)request.getAttribute("bean");
out.println("<br>");
out.println("<br>");
out.println("<table width ='80%' align='center'>");
out.println("<tr> <th>Employee Id</th> <th>Employee Name</th> <th>Employee Salary </th> <th>Employee DepartMent</th></tr>");
if(bean!=null)
{
	out.println("<tr> <td>"+bean.getId()+"</td><td>"+bean.getName()+"</td><td>"+bean.getSalary()+"</td><td>"+bean. getDno()+"</td></tr>");
}
else
{
	out.println("<p> <center><b> Record not found </b></center></p>");
}


out.println("</table>");






%>

</body>
</html>