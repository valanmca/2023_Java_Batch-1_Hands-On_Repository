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
 * Servlet implementation class Factorial
 */
@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num= request.getParameter("fact");
		
		PrintWriter out=response.getWriter();
		int fact=1;
		int n=Integer.parseInt(num);
		for (int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		RequestDispatcher rd=request.getRequestDispatcher("Factorial.jsp");
		rd.include(request, response);
		
//		out.println("<font color='red'><h1> Welcome </h1></font> ");
//		
		out.println("<h4>Factorial of "+n+" = "+fact+"</h4>");
	}

}
