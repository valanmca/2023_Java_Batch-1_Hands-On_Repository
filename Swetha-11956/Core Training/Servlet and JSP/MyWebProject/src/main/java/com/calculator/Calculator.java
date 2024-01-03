package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		
		PrintWriter out=response.getWriter();
		
		String action=request.getParameter("button");
		
		if(action.equals("Add")) {
			int sum=n1+n2;
			RequestDispatcher rd=request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("Addition is : "+sum);
		}
		else if(action.equals("Sub")) {
			int sub=n1-n2;
			RequestDispatcher rd=request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("Subtraction is : "+sub);
		}
		else if(action.equals("Mul")) {
			int mul=n1*n2;
			RequestDispatcher rd=request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("Multiplication is : "+mul);
		}
		else if(action.equals("Div")) {
			int div=n1/n2;
			RequestDispatcher rd=request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("Division is : "+div);
		}
		
		
	}

}
