package com.servlet.day_03;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		int sum = n1 + n2;
		int sub = n1 - n2;
		int mul = n1 * n2;
		int div = n1 / n2;

		PrintWriter out = response.getWriter();
		String action = request.getParameter("button");

		if (action.equals("Add")) {
			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("<br><b>Sum : " + sum + "</b>");
		}
		if (action.equals("Sub")) {
			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("<br><b>Subtraction : " + sub + "</b>");
		}
		if (action.equals("Mul")) {
			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("<br><b>Multiplication : " + mul + "</b>");
		}
		if (action.equals("Div")) {
			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			out.println("<br><b>Division : " + div + "</b>");
		}
	}

}
