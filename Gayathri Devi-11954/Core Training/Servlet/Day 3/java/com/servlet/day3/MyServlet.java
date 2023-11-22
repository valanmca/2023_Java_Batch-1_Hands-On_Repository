package com.servlet.day3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       		//PrintWriter out = response.getWriter();
       		
       		String action = request.getParameter("button");
       		
       		if(action.equals("Factorial")) {
       			RequestDispatcher rd1 = request.getRequestDispatcher("Factorial.jsp");
       			rd1.forward(request, response);
       			
       		}
       		if(action.equals("Calculator")) {
       			RequestDispatcher rd2 = request.getRequestDispatcher("Calculator.jsp");
       			rd2.forward(request, response);
       		}
	}

}
