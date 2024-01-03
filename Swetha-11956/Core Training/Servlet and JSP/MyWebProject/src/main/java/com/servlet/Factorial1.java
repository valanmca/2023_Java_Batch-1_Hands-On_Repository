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
 * Servlet implementation class Factorial1
 */
@WebServlet("/Factorial1")
public class Factorial1 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num=Integer.parseInt(request.getParameter("num1"));
		
		PrintWriter out=response.getWriter();
		
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		RequestDispatcher rd=request.getRequestDispatcher("Factorial1.jsp");
		rd.include(request, response);
		out.println("Factorial is : "+fact);
		
		
	}

}
