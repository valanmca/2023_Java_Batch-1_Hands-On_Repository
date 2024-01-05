<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
     href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
    crossorigin="anonymous">
<style>          
body {
  font-family: 'Nunito', sans-serif;
  color: #384047;
}
form {
  max-width: 500px;
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
  height:70%;
  outline: 0;
  padding: 15px;
  width: 100%;
  background-color: #e8eeef;
  color: #8a97a0;
  box-shadow: 0 1px 0 rgba(0,0,0,0.03) inset;
  margin-bottom: 30px;
}
button {
  padding: 10px 39px 10px 39px;
  color: #FFF;
  background-color: #4bc970;
  font-size: 18px;
  text-align: center;
  font-style: normal;
  border-radius: 5px;
  width: 100%;
  height:60%;
  border: 1px solid #3ac162;
  border-width: 1px 1px 3px;
  box-shadow: 0 -1px 0 rgba(255,255,255,0.1) inset;
  margin-bottom: 10px;
  height:80%;
}
label {
  display: block;
  margin-bottom: 8px;
}


div{
	margin-bottom: 20px;
}
</style>

</head>
<body>
<br>

<form action="PerformInsert" method ="post" class="was-validated">
          <label>Laptop Id:</label>
          <input type="text" id ="id"name="lapId" required class="form-control">
       
          <label>Brand Name:</label>
          <input type="text" name="brandName" required class="form-control">
          
          <label>Model Name:</label>
          <input type="text" name="modelName" required class="form-control">
        
          <label>Laptop Price:</label>
          <input type="text" name="lapPrice" required class="form-control">
          <button>Insert Laptop</button>
</form>
</div>

</body>
</html>