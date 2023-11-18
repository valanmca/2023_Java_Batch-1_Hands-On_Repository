package com.servlet.day_03;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("button");
		
		if(action.equals("Factorial")) {
			RequestDispatcher rd = request.getRequestDispatcher("Fact.jsp");
			rd.forward(request, response);
		}
		if(action.equals("Addition")) {
			RequestDispatcher rd = request.getRequestDispatcher("Addition.jsp");
			rd.forward(request, response);
		}
		
	}

}

