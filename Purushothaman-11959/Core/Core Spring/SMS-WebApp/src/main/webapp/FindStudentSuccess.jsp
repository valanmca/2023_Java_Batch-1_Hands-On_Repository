
<%@page import="com.sms.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="FindStudent.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
tr{
    text-align:center;
  }
</style>
</head>
<body>
<br>
<br><br>
  <%
     Student bean=(Student) request.getAttribute("bean");
      if(bean!=null){
    	  %>
    	  <table width="80%" align="center">
    	  <tr><th>Student RollNo</th><th>Student Name</th><th>Student Email</th><th>Student Section</th><th>Student Standard</th><th>Student Location</th><tr>
    	  <% 
    	   out.println("<tr><td>"+bean.getStdRollNo()+"</td><td>"+bean.getStdName()+"</td><td>"+bean.getStdEmail()+"</td><td>"+bean.getStdSection()+"</td><td>"+bean.getStdStandard()+"</td><td>"+bean.getStdLocation()+"</td></tr>");
    	   out.println("</table>");
           } else {
    	  %>
    	  <font color="red"><p align="center"><b>Record not found</b></p></font>
    	  <% } %>
      
</body>
</html>