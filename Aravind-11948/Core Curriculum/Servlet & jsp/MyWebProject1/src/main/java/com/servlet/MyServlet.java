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
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String action = request.getParameter("button");

		if (action.equals("Factorial")) {
			RequestDispatcher rd=request.getRequestDispatcher("Factorial.jsp");
			rd.forward(request, response);

		} else if (action.equals("Addition")) {
			RequestDispatcher rd=request.getRequestDispatcher("Addition.jsp");
			rd.forward(request, response); 
		}
		PrintWriter out = response.getWriter();
		out.println("<h1><font color='green'>welcome to servlet</h1>");
		out.close();
	}

	

}
