<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
       function validateform(){  
       var nameReqEx='^[A-Z a-z]+$';
       var passwordReqEx='^[0-9]+$';
       var name=document.getElementById("name").value;  // Validation by ID.
       var password=document.getElementById("password").value;  
  
      if (name==null || name==""){  
      alert("Name can't be blank");  
      return false;  
      }else if(password.length<6){  
      alert("Password must be at least 6 characters long.");  
      return false;  
      }  
      if(! name.match(nameReqEx)){
        alert("Enter valid username");
      }
      if (! password.match(passwordReqEx)){
        alert("Enter valid password");
      }
    }  
        </script>
    </head>
    <body>
        <div class="LoginDiv">
    <form name="myform">
    <table align="center">
        <tr>
            <th colspan="2"><h1>Login</h1></th></tr>
        <tr>
            <td><b>User Name:  </b></td>
            <td><input type="text" class="textbox" onfocus="this.placeholder=''" placeholder="Enter username" id="name"></td></tr>
        <tr>
            <td><b>Password: </b></td>
            <td><input type="text" class="textbox" onfocus="this.placeholder=''" placeholder="Enter password" id="password"></td></tr>
        <tr>
            <td></td>
            <td align="center"><button type="submit" onclick="validateform()">Login</button> <button type="button">Cancel</button></td></tr>
        <tr>
            <td colspan="2" align="right">New user! <button type="button">Sign up</button></td></tr>
    </table>
    </form>
        </div>
    </body>
</html>