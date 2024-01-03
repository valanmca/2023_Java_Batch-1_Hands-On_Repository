package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */

//servlet context - global (used in both servlet1 and servlet2)
public class Servlet2 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext context=getServletContext();
		String organization=context.getInitParameter("organization");
		
		//Reading data from global area
		String email=context.getInitParameter("email");
		
		PrintWriter out=response.getWriter();
		out.println("Organization Name : "+organization);
		
	}

}
