package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlets
 */
public class Servlets extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context = getServletContext();
		String Organization = context.getInitParameter("Organization");
		String email = context.getInitParameter("email");
		PrintWriter out = response.getWriter();
		out.println("<br><b>Organization Name is : " + Organization);
		out.println("<br><b>Email id is : " + email);
		out.close();
	}

}
