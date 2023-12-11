package com.servlet.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String f = request.getParameter("button");

		String number1 = request.getParameter("num1");
		String number2 = request.getParameter("num2");

		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);

		PrintWriter out = response.getWriter();

		if (f.equals("Addition")) {
			RequestDispatcher rd = request.getRequestDispatcher("Start.jsp");
			rd.include(request, response);

			int sum = n1 + n2;

			out.println("<b><center>Addition of " + n1 + " and " + n2 + " : " + sum);
		}

		if (f.equals("Subtraction")) {
			RequestDispatcher rd = request.getRequestDispatcher("Start.jsp");
			rd.include(request, response);

			int sub = n1 - n2;

			out.println("<b><center>Subtraction of " + n1 + " and " + n2 + " : " + sub);
		}

		if (f.equals("Multiplication")) {
			RequestDispatcher rd = request.getRequestDispatcher("Start.jsp");
			rd.include(request, response);

			int Mul = n1 * n2;

			out.println("<b><center>Multiplication of " + n1 + " and " + n2 + " : " + Mul);
		}

		if (f.equals("Division")) {
			RequestDispatcher rd = request.getRequestDispatcher("Start.jsp");
			rd.include(request, response);

			int Div = n1 / n2;

			out.println("<b><center>Division of " + n1 + " and " + n2 + " : " + Div);
		}
	}

}
