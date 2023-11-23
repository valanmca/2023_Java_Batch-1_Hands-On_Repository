package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context=getServletContext();
		String Org=context.getInitParameter("Organization");
		PrintWriter out=response.getWriter();
		out.println("<font color=red >"+"Organization Name = "+Org+"</font>");
	}

}
