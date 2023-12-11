<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function validateform(){
var name="^[A-Z a-z]+$";
var pass="^[0-9]+$";
var eid=document.getElementById("eid").value;  
var ename=document.getElementById("ename").value;
var esalary=document.getElementById("esalary").value;
var edept=document.getElementById("edept").value;

if (eid==null || eid==""){  
    alert("Employee Id can't be blank");  
    return false;  
    } else if(! eid.match(pass)){
    	alert("Enter valid Employee Id");  
        return false; 
    }

if (ename==null || ename==""){  
    alert("Employee Name can't be blank");  
    return false;  
    } else if(! ename.match(name)){
    	alert("Enter valid Employee Name");  
        return false; 
    }

if (esalary==null || esalary==""){  
    alert("Salary can't be blank");  
    return false;  
    } else if(! esalary.match(pass)){
    	alert("Enter valid Salary");  
        return false; 
    }
    
if (edept==null || edept==""){  
    alert("Department Number can't be blank");  
    return false;  
    } else if(! edept.match(pass)){
    	alert("Enter valid Department Number");  
        return false; 
    }

}
</script>
</head>
<body>
<h3 align="center">Insert Employee</h3>
<form name="myform" action="EMSController" method="post">
<table width="60%" align="center">
   <tr><td>Enter Employee Id </td><td><input type="text" name="eid" id="eid"></td></tr>
   <tr><td>Enter Employee Name </td><td><input type="text" name="ename" id="ename"></td></tr>
   <tr><td>Enter Employee Salary </td><td><input type="text" name="esalary" id="esalary"></td></tr>
   <tr><td>Enter Employee Dept No</td><td><input type="text" name="edept" id="edept"></td></tr>
   <br>
   <tr><td><input type="submit" value="Insert Employee" onclick="validateform()" name="ems"/></td></tr>
</table>
</form>

</body>
</html>