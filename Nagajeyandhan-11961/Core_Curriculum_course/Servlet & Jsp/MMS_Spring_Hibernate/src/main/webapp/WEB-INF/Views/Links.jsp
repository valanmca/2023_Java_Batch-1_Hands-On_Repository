<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<title>Insert title here</title>
<meta name="viewport" content="width=device-width,initial-scale=1.0">

<style>
  *{
    padding: 0;
    margin: 0;
    text-decoration: none;
    list-style: none;
    box-sizing: border-box;
  }
  body{
    font-family: montserrat;
  }
  nav{
    background: #0082e6;
    height: 80px;
    width:100%
  }
  nav ul{
    float: right;
    margin-right: 20px;
  }
  nav ul li{
    display: inline-block;
    line-height: 80px;
    margin: 0 5px;
  }
  nav ul li a{
    color:white;
    font-size: 17px;
    padding: 7px 13px;
    border-radius: 3px;
    text-transform: uppercase;
  }
  a.active,a:hover{
    background: #1b9bff;
    transition: .5s;
  }
  .checkbtn{
    font-style: 30px;
    color: white;
    float: right;
    line-height: 80px;
    margin-right: 40px;
    cursor: pointer;
    display: none;
  }
  #check{
    display: none;
  }
  label.header{
  	font-size:30px;
  	color:white;
  	line-height:80px;
  	font-weight:bold;
  }
  @media(max-width:952px){
    nav ul li a{
      font-size: 16px;
    }
  }

  @media(max-width:858px){
    .checkbtn{
      display: block;
    }
    ul{
      position: fixed;
      width: 100%;
      height: 100vh;
      background: #2c3e50;
      top: 80px;
      left: -100%;
      text-align: center;
      transition: all .5s;
    }


    nav ul li{
      display: block;
      margin: 50px 0;
      line-height: 30px;
    }

    nav ul li a{
      font-size: 15px;

    }
    a:hover, a.active{
      background: none;
      color: #0082e6;
    }

    #check:checked ~ ul{
      left: 0;
    }
  }

  
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<nav>
    <input type="checkbox" id="check">
    <label for="check" class="checkbtn">
      <i class="fa fa-bars"></i>
    </label>
    <i class="fa fa-mobile fa-3x"></i>
    <label class="header">Mobile Showroom Management System</label>
    <ul>
    	<li><a href="Home" target="content" >Home</a></li>
      <li><a href="InsertMobile" target="content" >Insert</a></li>
      <li><a href="UpdateMobile" target="content">Update</a></li>
      <li><a href="DeleteMobile" target="content">Delete</a></li>
      <li><a href="FindMobile" target="content">Find</a></li>
      <li><a href="FindAllMobile" target="content">Find All</a></li>
    </ul>
  </nav>
</body>
</html>