<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int n=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");

if (n==1 && name.equals("aravind"))
{
	%>
	<jsp:forward page="TeacherOutput.jsp"/>
	
<%} else { %>

<jsp:include page="TeacherInput.jsp"/>

<%

out.println("<b><font color=red> Invalid username</font><b>");
}
%>

</body>
</html>