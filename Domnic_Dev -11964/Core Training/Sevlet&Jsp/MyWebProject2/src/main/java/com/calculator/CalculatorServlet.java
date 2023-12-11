package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("button");

		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));

		if (action.equals("Addition")) {
			int sum = n1 + n2;

			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);

			PrintWriter out = response.getWriter();
			out.println(n1 + " + " + n2 + " = " + sum);

		}
		if (action.equals("Substraction")) {
			int sub = n1 - n2;

			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);

			PrintWriter out = response.getWriter();
			out.println(n1 + " - " + n2 + " = " + sub);
		}
		if (action.equals("Multiplication")) {
			int mul = n1 * n2;

			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);

			PrintWriter out = response.getWriter();
			out.println(n1 + " * " + n2 + " = " + mul);
		}
		if (action.equals("Division")) {
			int div = n1 / n2;

			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);

			PrintWriter out = response.getWriter();
			out.println(n1 + " / " + n2 + " = " + div);
		}
	}

}
