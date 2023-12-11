package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Factorial")
public class Factorial extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String number=request.getParameter("num");
		int num=Integer.parseInt(number);

		int fact = 1;

		
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		
		RequestDispatcher rd=request.getRequestDispatcher("Factorial.jsp");
		rd.include(request, response);
		out.println("Factorial of " + num + " is " + fact);

	

	}

}
