<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href ="css/bootstrap.css">
<style>          
body {
  font-family: 'Nunito', sans-serif;
  color: #384047;
}
form {
  max-width: 300px;
  margin: 10px auto;
  padding: 10px 20px;
  background: #f4f7f8;
  border-radius: 8px;
}
input[type="text"]{
  background: rgba(255,255,255,0.1);
  border: none;
  font-size: 16px;
  height: auto;
  margin: 0;
  outline: 0;
  padding: 15px;
  width: 100%;
  background-color: #e8eeef;
  color: #8a97a0;
  box-shadow: 0 1px 0 rgba(0,0,0,0.03) inset;
  margin-bottom: 30px;
}
button {
  padding: 15px 25px 15px 25px;
  color: #FFF;
  background-color: #4bc970;
  font-size: 18px;
  text-align: center;
  font-style: normal;
  border-radius: 5px;
  width: 100%;
  border: 1px solid #3ac162;
  border-width: 1px 1px 3px;
  box-shadow: 0 -1px 0 rgba(255,255,255,0.1) inset;
  margin-bottom: 10px;
}
label {
  display: block;
  margin-bottom: 8px;
}

@media screen and (min-width: 440px) {

  form {
    max-width: 550px;
  }

}
</style>

</head>
<body>
<form action="PMSController" method ="post">

	 <label>Product Id:</label>
          <input type="text" name="pid" required></td>
        
          <label>Product Name:</label>
          <input type="text" name="pname" required></td>
       
          <label>Product Quantity:</label>
          <input type="text" name="pqnt" required></td>
        
          <label>Product Price:</label>
          <input type="text" name="pprice" required>
          <button type="submit" value ="Update Product"" name="pms_button">Update Product</button>	
</form>

</body>
</html>