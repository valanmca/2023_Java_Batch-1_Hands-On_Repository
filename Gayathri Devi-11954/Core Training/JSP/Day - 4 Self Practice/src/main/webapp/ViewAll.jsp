<%@page import="java.util.List"%>
<%@page import="com.sms.bean.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%--  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
<style>
thead{

background-color:#000066;
}
th{
color:white;

}
tbody{
/* background-color:#e6ffff; */
}
.container{
/* margin-top:10px; */
padding-top:20px;
padding-bottom:30px;
border:4px solid navy;
width:70%;
}
</style>
</head>
<body>
<%-- JSTL Iterate code to iterate collection --%>
<%--          <table width='60%' align='center'>
         <tr><th>Student Id</th><th>Student Name</th><th>Student Salary</th><th>Student Department</th></tr>  
         <c:forEach items="${list}" var="a">
         <tr><td>${a.geteId()}</td><td>${a.geteName()}</td><td>${a.geteDept()}</td><td>${a.geteSalary()}</td></tr>
         </c:forEach>
         </table>
--%>         
<br><br><br>
<div class="container">
<%
 List <StudentBean> list = (List<StudentBean>) request.getAttribute("list");
 	out.println("<table align='center' class='table table-hover w-75'> <thead class='table'>");
 	out.println("<tr align='center'><th colspan='3' style='color:red;background-color:white;'><h1>Student Records</h1></th></tr>");
 	out.println("<tr><th>Student ID</th><th>Student Name</th><th>Student Department</th></tr></thead><tbody>");
 	for (StudentBean bean: list) {
 	out.println("<tr><td>"+bean.getsId()+"</td><td>"+bean.getsName()+"</td><td>"+bean.getsDept()+"</td></tr></tbody>");
 	}
	
 	 %>
</div>
</body>
</html>

<%-- 

@ include - include a file/resources
@page - import page
@tag -  add tag - to create a own tag in jsp
<% %> - Script tag - write any business logic
<%= %> = Expression tag --%>