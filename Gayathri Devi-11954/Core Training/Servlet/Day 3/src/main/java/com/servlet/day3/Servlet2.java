package com.servlet.day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */

public class Servlet2 extends HttpServlet implements ServletContextListener{
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		String a= context.getInitParameter("MyName");
		 
		PrintWriter out=response.getWriter();
		out.print(a);
		
		String org = context.getInitParameter("organization");


		out.println("<h2>Servlet Context</h2>");
		out.println("Organization Name : "+org);
		

	}

}
