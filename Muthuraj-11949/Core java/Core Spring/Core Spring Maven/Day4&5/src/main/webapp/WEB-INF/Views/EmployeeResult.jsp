<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page isELIgnored = "false" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="EmployeeInput.jsp"></jsp:include>
<br><b>Employee Id: ${emp.id}</b>
<br><b>Employee Name: ${emp.name}</b>
<br><b>Employee Salary: ${emp.salary}</b>
</body>
</html>