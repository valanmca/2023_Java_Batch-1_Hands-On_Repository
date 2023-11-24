<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function checkID(){ 
var value=document.getElementById("id").value;
xmlHttp=GetXmlHttpObject();
var url="id.jsp";
url=url+"?id="+value;
xmlHttp.onreadystatechange=stateChanged ;
xmlHttp.open("GET",url,true);
xmlHttp.send(null);
}
function stateChanged(){ 
if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){ 
    var showdata = xmlHttp.responseText; 
    alert(showdata);
 } 
}
function GetXmlHttpObject(){
var xmlHttp=null;
try{
  xmlHttp=new XMLHttpRequest();
}
catch(e){
 try{
  xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
  }
  catch(e){
  xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
}
return xmlHttp;
}

function showData(){ 
xmlHttp=GetXmlHttpObject()
    var id=document.getElementById("id").value;
var url="data.jsp";
url=url+"?id="+id;
xmlHttp.onreadystatechange=stateChanged1 
xmlHttp.open("GET",url,true)
xmlHttp.send(null);
}
function stateChanged1(){ 
if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){ 
    var showdata = xmlHttp.responseText; 
    var strar = showdata.split(":");
      if(strar.length>1){
        var strname = strar[1];
        document.getElementById("type").value= strar[1];
        document.getElementById("price").value= strar[2];
         }
       } 
     }

</script>
</head>
<body>
<br><br>
<table >
<tr><td>ID:</td><td><input type="text" id="id" name="id" onkeyup="checkID();"></td></tr>
<tr><td>Product Type:</td><td><input type="text" id="type" name="name" onclick="showData();"></td></tr>
<tr><td>Price:</td><td><input type="text" id="price" name="address"></td></tr>
</table>
</body>
</html>
