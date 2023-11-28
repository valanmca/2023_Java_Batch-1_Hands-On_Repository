package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Arithmetic
 */
@WebServlet("/Arithmetic")
public class Arithmetic extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num=request.getParameter("button");
		int num1=Integer.parseInt(request.getParameter("value1"));
		int num2=Integer.parseInt(request.getParameter("value2"));
		if(num.equals("Addition"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Arithmetic.jsp");
			rd.include(request, response);
			int sum=num1+num2;
			PrintWriter out=response.getWriter();
			out.println("Addition is "+sum);
			
		}
		 if(num.equals("Subtraction"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Arithmetic.jsp");
			rd.include(request, response);
			int sum1=num1-num2;
			PrintWriter out=response.getWriter();
			out.println("Subtraction is "+sum1);
		}
		 if(num.equals("Multiplication"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Arithmetic.jsp");
			rd.include(request, response);
			int sum=num1*num2;
			PrintWriter out=response.getWriter();
			out.println("Multiplication is "+sum);
		}
		 if(num.equals("Division"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Arithmetic.jsp");
			rd.include(request, response);
			int sum=num1/num2;
			PrintWriter out=response.getWriter();
			out.println("Division is "+sum);
		}
	}

}
