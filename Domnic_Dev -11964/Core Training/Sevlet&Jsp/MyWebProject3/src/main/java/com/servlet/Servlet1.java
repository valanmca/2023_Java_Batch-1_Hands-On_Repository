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

	ServletConfig config=getServletConfig();
	String firstName=config.getInitParameter("fname");
	String lastName=config.getInitParameter("lname");
	
	ServletContext context=getServletContext();
	// vcontext.setInitParameter("email", "domnic@gmail.com");
	String Company=context.getInitParameter("Company");	
	
	PrintWriter out=response.getWriter();
	out.println("<br><b>First Name : "+firstName);
	out.println("<br><b>Last Name : "+lastName);
	out.println("<br><b>Company Name : "+Company);
	out.close();
	}

}
