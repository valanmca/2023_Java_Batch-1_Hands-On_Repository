package com.servlet.day_02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fact_day
 */
@WebServlet("/Fact_day")
public class Fact_day extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String number = request.getParameter("fnum");
		   
		 
		 int fact = 1;
			int n = Integer.parseInt(number);
			for (int i =1; i<=n; i++) {
				fact = fact * i;
				
			}
			RequestDispatcher rd = request.getRequestDispatcher("Fact.jsp");
			request.setAttribute("fact",fact);
			rd.include(request, response);
			out.println("Factorial of "+n+" :" + fact);
		
		
	}

}
