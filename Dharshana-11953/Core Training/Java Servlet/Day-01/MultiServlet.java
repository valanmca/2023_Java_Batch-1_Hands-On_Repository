package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultiServlet
 */
@WebServlet("/MultiServlet")
public class MultiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("button");
		
		if(action.equals("Factorial")) {
			RequestDispatcher rd = request.getRequestDispatcher("Factorial.jsp");
			rd.forward(request, response);
		}
		if(action.equals("Addition")) {
			RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
			rd.forward(request, response);
		}


		
	}

}
