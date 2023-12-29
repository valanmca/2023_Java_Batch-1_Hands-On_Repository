package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String firstName = config.getInitParameter("fname");
		String lastName = config.getInitParameter("lname");
		
		ServletContext context = getServletContext();
		String organization = context.getInitParameter("Organization");
		context.setInitParameter("Email", "b.shaji245@gmail.com");
		
		PrintWriter out = response.getWriter();
		out.print("<br><b>First Name : " + firstName);
		out.print("<br><b>Last Name : " + lastName);
		out.print("<br><b>Organization : " + organization);
		out.close();
		
	}

}
