package com.servlet.day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String Number = request.getParameter("value");
		PrintWriter out = response.getWriter();

		int fact = 1;
		int n = Integer.parseInt(Number);
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		out.println("<h1>Factorial of "+n+" : " + fact + "</h1>");
	}

}
