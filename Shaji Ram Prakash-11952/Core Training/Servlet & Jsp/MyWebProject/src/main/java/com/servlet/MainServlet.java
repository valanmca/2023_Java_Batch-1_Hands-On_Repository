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
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String main = request.getParameter("button");

		if (main.equals("Factorial")) {
			RequestDispatcher rd = request.getRequestDispatcher("Factorial.jsp");
			rd.forward(request, response);
		}
		if (main.equals("Addition")) {
			RequestDispatcher rd = request.getRequestDispatcher("Addition.jsp");
			rd.forward(request, response);
		}
	}

}
