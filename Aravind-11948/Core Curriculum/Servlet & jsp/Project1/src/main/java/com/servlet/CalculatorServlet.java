package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("button");
		
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		PrintWriter out=response.getWriter();
		ServletContext context=getServletContext();
		String fname=context.getInitParameter("fname");
		
		out.println("<font color=violet>"+"first name = "+fname+"</font>");
		
		
		
		if(action.equalsIgnoreCase("Addition"))
		{
			int sum=n1+n2;
			RequestDispatcher  rd=request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			
			
			
			out.println("<br><br> <font color=red>");
			out.println("Addition of "+n1+"+"+n2+"="+sum);
			out.println("</font>");
		}
		
		else if(action.equalsIgnoreCase("Subtration"))
		{
			
			int sum=n1-n2;
			RequestDispatcher  rd=request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			
           
			
			out.println("Subtraction of "+n1+"-"+n2+"="+sum);
		}
		else if(action.equalsIgnoreCase("Multiplication"))
		{
			int sum=n1*n2;
			RequestDispatcher  rd=request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			
            
			
			out.println("Multiplication of "+n1+"*"+n2+"="+sum);
		}
		else if(action.equalsIgnoreCase("Division"))
		{
			
			int sum=n1/n2;
			RequestDispatcher  rd=request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			
          
			
			out.println("Division of "+n1+"/"+n2+"="+sum);
		}
	}

}
