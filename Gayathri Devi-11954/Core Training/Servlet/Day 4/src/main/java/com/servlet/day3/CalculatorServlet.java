package com.servlet.day3;

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
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String val1 = request.getParameter("num1");
		int n1 = Integer.parseInt(val1);

		String val2 = request.getParameter("num2");
		int n2 = Integer.parseInt(val2);

		String oper = request.getParameter("oper");

		if (oper.equals("Add")) {
			RequestDispatcher rd1 = request.getRequestDispatcher("Calculator.jsp");
			rd1.include(request, response);
			int a_ans = n1 + n2;
			out.println("<h3 align='center'>");
			out.println("Addition Answer : " + a_ans);
			out.println("</h3>");
		} else if (oper.equals("Sub")) {
			RequestDispatcher rd2 = request.getRequestDispatcher("Calculator.jsp");
			rd2.include(request, response);
			float s_ans = n1 - n2;
			out.println("<h3 align='center'>");
			out.println("Subtraction Answer : " + s_ans);
			out.println("</h3>");
		} else if (oper.equals("Mul")) {
			RequestDispatcher rd3 = request.getRequestDispatcher("Calculator.jsp");
			rd3.include(request, response);
			int m_ans = n1 * n2;
			out.println("<h3 align='center'>");
			out.println("Multiplication Answer : " + m_ans);
			out.println("</h3>");
		} else if (oper.equals("Div")) {
			RequestDispatcher rd4 = request.getRequestDispatcher("Calculator.jsp");
			rd4.include(request, response);
			double d_ans = n1 / n2;
			out.println("<h3 align='center'>");
			out.println("Division Answer : " + d_ans);
			out.println("</h3>");
		} else
			out.println("Give valid one");

		out.println(
				"<html><body align='center'><form action='Start.jsp'><input type='submit' value='Go to start page'></form></body></html>");
	}
}
