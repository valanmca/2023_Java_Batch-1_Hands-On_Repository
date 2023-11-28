<%@page import="com.sms.bean.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="SearchStudent.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</style>
</head>
<body>
<%
	StudentBean bean = (StudentBean) request.getAttribute("bean");
if(bean != null){
	out.println("<br><center><div class='alert alert-success w-50 align-items-center'><strong><h3>Record Searched Successfully !.</h3></strong> </div></center>'");
	
	out.println("<table align='center' class='table table-hover w-75'> <thead class='table' style='background-color:#000066;color:white;'>");
	out.println("<tr><th>Student ID</th><th>Student Name</th><th>Student Department</th></tr></thead><tbody style='background-color:#e6ffff;'>");
	out.println("<tr><td>"+bean.getsId()+"</td><td>"+bean.getsName()+"</td><td>"+bean.getsDept()+"</td></tr></tbody>");
	out.println("</table>");
}
else{
	out.println("<br><center><div class='alert alert-danger w-50 align-items-center'> <strong><h3>Record not available in the database.</h3></strong> </div></center>");
}
	
%>

</body>
</html>

<%-- 

@ include - include a file/resources
@page - import page
@tag -  add tag - to create a own tag in jsp
<% %> - Script tag - write any business logic
<%= %> = Expression tag --%>