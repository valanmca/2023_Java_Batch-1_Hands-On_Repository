package com.jeban.Servlet;

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
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
        String Name= config.getInitParameter("fname");
        String SName= config.getInitParameter("sname");
        
        ServletContext context=getServletContext();
        
        String organization= context.getInitParameter("Organization");
        
        PrintWriter out=response.getWriter();
        
        out.println("<font color=red >"+"First Name = "+Name+"</font>");
        out.println("<font color=red >"+"Second Name = "+SName+"</font>");
        out.println("<font color=red >"+"Organization = "+organization+"</font>");
	}

}
