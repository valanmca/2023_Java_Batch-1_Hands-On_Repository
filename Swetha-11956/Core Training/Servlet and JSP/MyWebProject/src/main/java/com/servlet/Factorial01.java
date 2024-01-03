package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Factorial01
 */
@WebServlet("/Factorial01")
public class Factorial01 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n=Integer.parseInt(request.getParameter("facto"));
		
		PrintWriter out= response.getWriter();
		
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		out.println("The factorial is :  "+fact);
		
		RequestDispatcher rd =request.getRequestDispatcher("LoginSuccess.jsp");
		request.setAttribute("userName",n);
		rd.forward(request,response);
		//response.sendRedirect("fact.jsp");
		
		out.close();
		
	}

}
