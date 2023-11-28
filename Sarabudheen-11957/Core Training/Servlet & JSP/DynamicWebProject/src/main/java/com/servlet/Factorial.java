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
 * Servlet implementation class Factorial
 */
@WebServlet("/Factorial")
public class Factorial extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String number = request.getParameter("number");
		int n = Integer.parseInt(number);
		PrintWriter out = response.getWriter();
		
		
		RequestDispatcher rd = request.getRequestDispatcher("Factorial.jsp");
		rd.include(request, response);
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		out.print("Factorial of " + n + " is : " + fact);
	}

}
