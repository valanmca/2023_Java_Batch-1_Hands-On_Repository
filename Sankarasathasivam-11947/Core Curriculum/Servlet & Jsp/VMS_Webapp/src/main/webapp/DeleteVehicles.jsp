<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="VMSController" method="post">
		<table width="60%" align="center" border="2px solidblack"
			position="absolute">
	
			<tr>
				<td>Vehicle Number</td>
				<td><input type="number" name="v_no" /></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="DeleteVehicles" name="vms_button" /></td>
			</tr>
		</table>
	</form>
</body>
</html>