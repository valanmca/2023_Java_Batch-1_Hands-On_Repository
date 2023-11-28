package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FactAndAddServlet
 */
@WebServlet("/FactAndAddServlet")
public class FactAndAddServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String option = request.getParameter("button");
		
		if (option.equals("Factorial")) {
			RequestDispatcher rd = request.getRequestDispatcher("Factorial.jsp");
			rd.forward(request, response);
			
		}
		
		else {
			RequestDispatcher rd = request.getRequestDispatcher("Addition.jsp");
			rd.forward(request, response);
		}
	}

}
