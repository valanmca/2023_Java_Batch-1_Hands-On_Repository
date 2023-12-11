<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function validateform(){
var name1='^[A-Z a-z]+$';
var pass='^[0-9]+$';
var name=document.getElementById("name").value;  // Validation by ID.
var password=document.getElementById("fname").value;

if (name==null || name==""){  
    alert("Name can't be blank");  
    return false;  
    } else if(! name.match(name1)){
    	alert("Enter valid name");  
        return false; 
    }

if (password==null || password==""){  
    alert("pass can't be blank");  
    return false;  
    } else if(! name.match(name)){
    	alert("Enter valid pass");  
        return false; 
    }

}
</script>
</head>
<body>
<form name="myform">
<b>User name:</b><input type="text" id="name"><br>
<b>Father name:</b><input type="text" id="fname"><br>
<button type="submit" onclick="validateform()">Login</button>

</form>

</body>
</html>