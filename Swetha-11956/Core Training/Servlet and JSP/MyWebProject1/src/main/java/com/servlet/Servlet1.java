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

//Config servlet - Private for particular servlet (servlet1)

public class Servlet1 extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletConfig config=getServletConfig();
		String firstName=config.getInitParameter("fname");
		String lastName=config.getInitParameter("lname");
		
		//servlet2 data
		ServletContext context=getServletContext();
		String organization=context.getInitParameter("organization");
		
		//writing data 
		String Organization=context.getInitParameter("organization");
		
		PrintWriter out=response.getWriter();
		out.println("<br><br><b>First Name :</b>"+firstName);
		out.println("<br><br><b>Last Name :</b>"+lastName);
		out.println("<br><br><b>Organization Name : </b>"+organization);
		
		out.close();
	}

}
