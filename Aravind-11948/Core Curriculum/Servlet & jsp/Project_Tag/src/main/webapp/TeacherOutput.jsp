<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Welcome</b>
<jsp:useBean id="obj" class="com.bean.Teacher">


</jsp:useBean>
<jsp:setProperty  name="obj"  property="*"></jsp:setProperty>
Teacher Id:<jsp:getProperty  name="obj"  property="id"/>
Teacher Name:<jsp:getProperty  name="obj"  property="name"/>
Teacher Subject:<jsp:getProperty  name="obj"  property="subject"/>








</body>
</html>