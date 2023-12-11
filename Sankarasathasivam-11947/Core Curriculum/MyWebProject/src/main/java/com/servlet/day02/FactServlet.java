package com.servlet.day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FactServlet")
public class FactServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String number = request.getParameter("fact");

		int n = Integer.parseInt(number);

		PrintWriter ps = response.getWriter();

		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		RequestDispatcher rd = request.getRequestDispatcher("Fact.jsp");
		rd.include(request, response);

		ps.println("<b>The Factorial of " + n + " : " + fact);

		ps.close();
	}

}
