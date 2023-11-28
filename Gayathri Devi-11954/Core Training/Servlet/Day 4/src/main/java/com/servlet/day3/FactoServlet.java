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
 * Servlet implementation class FactoServlet
 */
@WebServlet("/FactoServlet")
public class FactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String val1 = request.getParameter("num");
		int n1 = Integer.parseInt(val1);
		int fact = 1;
		for (int i = 1; i <= n1; i++) {
			fact = fact * i;
		}
		RequestDispatcher rd = request.getRequestDispatcher("Factorial.jsp");
		rd.include(request, response);
		out.println("<h3>");
		out.println("Factorial of " + n1 + " : " + fact);
		out.println("</h3>");

		out.println(
				"<html><body><form action='Start.jsp'><input type='submit' value='Go to start page'></form></body></html>");

	}

}
