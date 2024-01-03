package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



		PrintWriter out=response.getWriter();
		String val1=request.getParameter("num1");
		int a=Integer.parseInt(val1);
		
		String val2=request.getParameter("num2");
		int b=Integer.parseInt(val2);
		
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		out.println("Addition :"+sum);
		out.println("Subtraction :"+sub);
		out.println("Multiplication :"+mul);
		
		
		
	}

}
