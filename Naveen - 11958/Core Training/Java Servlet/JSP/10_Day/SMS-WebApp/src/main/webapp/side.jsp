<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet">
<style>
th {
	text-align: center;
}

 #hover1:hover{
    background: #A4D0FF;
}
table{
	margin-left: 10px;
}
a {
	text-decoration: none;
	color: black;
}
</style>
</head>
<body>
<table align="center" width="50%" class="table">
		<tr>
			<th id="hover1" align="center"><a
				href="InsertStudent.jsp" target="content"><font color='green'>INSERT</font></a></th>
		</tr>
		<tr>
			<th id="hover1" ><a href="SMSController?delete=a"
				target="content"><font color='red'>DELETE</font></a></th>
		</tr>
		<tr>
			<th id="hover1" ><a href="UpdateStudent.jsp"
				target="content"><font color='blue'>UPDATE</font></a></th>
		</tr>
		<tr>
			<th id="hover1" ><a href="FindStudent.jsp"
				target="content"><font color='#FFCC00'>FIND</font></a></th>
		</tr>
		<tr>
			<th id="hover1" ><a href="SMSController"
				target="content"><font color='purple'>FIND ALL</font></a></th>
		</tr>
	</table>
</body>
</html>