package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s = request.getParameter("button");
		
		String number1 = request.getParameter("num1");
		String number2 = request.getParameter("num2");
		
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		
		PrintWriter out = response.getWriter();
		
		if(s.equals("Add")) {
			
			int sum = n1+n2;
			
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			
			out.println("<br><br><center><h3> The Addition of "+n1+" and "+n2+" is "+sum+"</h3></center>");
		}
		if(s.equals("Sub")) {
			
			int sub = n1-n2;
			
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			
			out.println("<br><br><center><h3> The Subtraction of "+n1+" and "+n2+" is "+sub+"</h3></center>");
		}
		if(s.equals("Mul")) {
			
			int mul = n1*n2;
			
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			
			out.println("<br><br><center><h3> The Multiplication of "+n1+" and "+n2+" is "+mul+"</h3></center>");
		}
		if(s.equals("Div")) {
			
			int div = n1/n2;
			
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			
			out.println("<br><br><center><h3> The Division of "+n1+" and "+n2+" is "+div+"</h3></center>");
		}
		
		out.close();
	}

}
