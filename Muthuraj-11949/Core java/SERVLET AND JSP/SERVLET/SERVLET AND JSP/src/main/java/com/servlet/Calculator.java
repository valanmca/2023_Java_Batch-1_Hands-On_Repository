package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   PrintWriter out=response.getWriter();
	   int x= Integer.parseInt(request.getParameter("num1"));
	   int y=Integer.parseInt(request.getParameter("num2"));
	   int Z=x+y;
	   out.println("Addition is:"+Z);
	   out.close();	
	}
}
