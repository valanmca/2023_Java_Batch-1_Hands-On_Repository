package com.servlet.day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
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
	private static final long serialVersionUID = 1L;

   	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String firstName = config.getInitParameter("fname");
		String lastName = config.getInitParameter("lname");
		PrintWriter out = response.getWriter();
		out.println("<h2>Servlet Config</h2>");
		out.println("First Name  : "+firstName);
		out.println("<br>Last Name  : "+lastName);
		
		ServletContext context = getServletContext();
		context.setInitParameter(firstName, lastName);
		String org = context.getInitParameter("organization");
		out.println("<h2>Servlet Context</h2>");
		out.println("Organization Name : "+org);
		out.close();
		
	}

}
