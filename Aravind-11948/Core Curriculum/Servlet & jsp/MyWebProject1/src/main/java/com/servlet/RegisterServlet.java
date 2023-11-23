package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String age=request.getParameter("age");
		String dob=request.getParameter("dob");
		String email=request.getParameter("email");
		PrintWriter out=response.getWriter();
		
 response.sendRedirect("details.jsp?uname="+name+"&age1="+age+"&dob1="+dob+"&email1="+email);

//		out.println("<h1>"+name+"</h1>");
//		out.println("<h1>"+age+"</h1>");
//		out.println("<h1>"+dob+"</h1>");
//		out.println("<h1>"+email+"</h1>");
	}

}
