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
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig config=getServletConfig();
		String fName= config.getInitParameter("fname");
		String lName= config.getInitParameter("lname");
		
		ServletContext context=getServletContext();
		
//		context.setInitParameter("email", "aravind123@gmail.com");
		String Org=context.getInitParameter("Organization");
		
		PrintWriter out=response.getWriter();
		out.println("<font color=red >"+"Organization Name = "+Org+"</font>");
		out.println("<br>");
		
		
		
		out.println("<font color=red >"+"First Name = "+fName+"</font>");
		out.println("<br>");
		out.println("<font color=red >"+"Last Name = "+lName+"</font>");
	}

}
