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
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String option = request.getParameter("button");
		int num1 = Integer.parseInt(request.getParameter("fnumber"));
		int num2 = Integer.parseInt(request.getParameter("snumber"));
		PrintWriter out = response.getWriter();

		if (option.equals("ADD")) {

			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			int sum = num1 + num2;

			out.print("Addition of " + num1 + " and " + num2 + " is : " + sum);
		}

		if (option.equals("SUB")) {

			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			int sub = num1 - num2;
			out.print("Subraction of " + num1 + " and " + num2 + " is : " + sub);
		}

		if (option.equals("MUL")) {

			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			int mul = num1 * num2;
			out.print("Multiplication of " + num1 + " and " + num2 + " is : " + mul);
		}

		if (option.equals("DIV")) {

			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.include(request, response);
			int div = num1 / num2;
			out.print("Division of " + num1 + " and " + num2 + " is : " + div);
		}
	}

}
