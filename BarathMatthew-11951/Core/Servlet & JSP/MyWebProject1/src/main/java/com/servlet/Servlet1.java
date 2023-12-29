package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletConfig config = getServletConfig();
		String firstName = config.getInitParameter("fname");
		String lastName = config.getInitParameter("lname");
		
		ServletContext context = getServletContext();
		context.setInitParameter("email", "jabarath02@gmail.com");
		String organization = context.getInitParameter("organization");
		
		PrintWriter out = response.getWriter();
		out.println("<br><b>First Name : </b>"+firstName);
		out.println("<br><b>Last Name : </b>"+lastName);
		
		out.println("<br><b>Organization name : "+organization);
	}

}
