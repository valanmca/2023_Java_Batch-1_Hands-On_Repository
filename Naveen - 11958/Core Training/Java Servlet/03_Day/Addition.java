package com.servlet.day_03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addition
 */
@WebServlet("/Addition")
public class Addition extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		int sum = n1 + n2;
		
		RequestDispatcher rd = request.getRequestDispatcher("Addition.jsp");
		rd.include(request, response);
		
		PrintWriter out = response.getWriter();
		out.println("<br><b>Sum : " + sum +"</b");
	}

}
