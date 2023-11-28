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
 * Servlet implementation class MyServlet1
 */
public class MyServlet1 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletConfig config = getServletConfig();
		String firstName = config.getInitParameter("fname");
		String lastName = config.getInitParameter("lname");
		
		ServletContext	context = getServletContext();
		String oraganization = context.getInitParameter("organization");

		PrintWriter out = response.getWriter();
		out.print("<br><br>First Name : " + firstName);
		out.print("<br><br>Last Name : " + lastName);
		out.print("<br><br>Oragnization Name : " + oraganization);
		out.close();

	}

}
