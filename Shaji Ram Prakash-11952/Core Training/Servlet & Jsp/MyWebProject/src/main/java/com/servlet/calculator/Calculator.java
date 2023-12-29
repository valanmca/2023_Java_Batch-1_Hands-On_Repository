package com.servlet.calculator;

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
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String button = request.getParameter("button");
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		
		if(button.equals("Add")) {
			int sum = n1+n2;
			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("<font color='green'>Addition is:" + sum + "</font>");
		}
		else if(button.equals("Sub")) {
			int sub = n1-n2;
			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("<font color='green'>Subtraction is:" + sub + "</font>");
		}
		else if(button.equals("Mul")) {
			int mul = n1*n2;
			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("<font color='green'>Multiplication is:" + mul + "</font>");
		}
		else if(button.equals("Div")) {
			int div = n1/n2;
			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("<font color='green'>Division is:" + div + "</font>");
		}
		
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

}
