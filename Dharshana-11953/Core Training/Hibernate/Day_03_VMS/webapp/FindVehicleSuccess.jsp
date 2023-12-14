<%@page import="com.vms.bean.Vehicle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="FindVehicle.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
	<%
	Vehicle bean = (Vehicle) request.getAttribute("bean");
	   out.println("<table width='60%' align='center'>");
	   out.println("<tr><th>Vehicle Id </th><th>Vehicle Name</th><th>Vehicle No</th><th>Vehicle Owner</th></tr>");
	   
	   if(bean != null){
	   	out.println("<tr><th>"+bean.getId()+"</th><th>"+bean.getName()+"</th><th>"+bean.getNo()+"</th><th>"+bean.getOwner()+"</th></tr>");
	   }
	   out.println("</table>");
	   
	%>
	<br><br>
	<center>
	<div class="alert alert-primary w-50 align-items-center"
            role="alert">
            <div>
                <font color="green"> <b> Vehicle  Record Founded
                        SuccessfullY!!</b></font>
            </div>
        </div>
</center>
</body>
</html>