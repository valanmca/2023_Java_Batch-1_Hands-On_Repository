package com.Servlet;

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
public class Servlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig config = getServletConfig();
		String FirstName = config.getInitParameter("fname");
		String LastName = config.getInitParameter("lname");
		ServletContext context = getServletContext();
		// context.setInitParameter("email", "pravinkumar146@gmail.com");
		String Organization = context.getInitParameter("Organization");
		PrintWriter out = response.getWriter();

		out.println("<br><b>First Name : " + FirstName + "<br><b>Last Name : " + LastName
				+ "<br><b>Organization Name is : " + Organization);
		out.close();
	}

}
