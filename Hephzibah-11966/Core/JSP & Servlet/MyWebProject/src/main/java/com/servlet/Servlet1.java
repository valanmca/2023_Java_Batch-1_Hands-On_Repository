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
 * Servlet implementation class Servlet
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		String firstName=config.getInitParameter("fname");
		String lastName=config.getInitParameter("lname");
		
		ServletContext context = getServletContext();
		String organization = context.getInitParameter("organization");
		
		PrintWriter out = response.getWriter();
		out.println("<br><b>First Name:" +firstName);
		out.println("<br><b>Last Name:" +lastName);
		out.println("<br><b>Organization Name :" +organization);
		out.close();
	}

}
