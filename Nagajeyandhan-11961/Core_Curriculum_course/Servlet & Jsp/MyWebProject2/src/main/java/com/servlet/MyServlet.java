package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config= getServletConfig();
		String firstName = config.getInitParameter("fname");
		String lastName = config.getInitParameter("lname");
		
		ServletContext context = getServletContext();
		
		String org = context.getInitParameter("organization");
		
		PrintWriter out = response.getWriter();
		out.println("<b>First Name: "+firstName+"</b><br><br>");
		out.println("<b> Last Name: "+lastName+"</b><br><br>");
		out.println("<b>Organization Name: "+org+"</b>");
		
		out.close();
	}

}
