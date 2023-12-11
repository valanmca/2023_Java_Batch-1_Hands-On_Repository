package com.servlet.conf;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletConfig config = getServletConfig();
		String firstName = config.getInitParameter("fname");
		String lastName = config.getInitParameter("lname");

		ServletContext context = getServletContext();
		context.setInitParameter("email","sss@gmail.com");
		String org = context.getInitParameter("organization");
		
		
		
		PrintWriter out = response.getWriter();
		out.println("<br><b>FirstName : " + firstName);
		out.println("<br><br><b>LastName : " + lastName);
		out.println("<br><br><b>Organization Name : " + org);

		out.close();
	}

}
