<%@page import="com.sms.bean.StudentServ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="FindStudent.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
	<%
	StudentServ bean = (StudentServ) request.getAttribute("bean");
	   out.println("<table width='60%' align='center'>");
	   out.println("<tr><th>student Id </th><th>Student Name</th><th>Student Depart</th></tr>");
	   
	   if(bean != null){
	   	out.println("<tr><th>"+bean.getId()+"</th><th>"+bean.getName()+"</th><th>"+bean.getDept()+"</th></tr>");
	   }
	   out.println("</table>");
	   
	%>
	
	<div class="alert alert-primary w-50 align-items-center"
            role="alert">
            <div>
                <font color="green"> <b> Student Record Found
                        SuccessfullY!!</b></font>
            </div>
        </div>
</body>
</html>