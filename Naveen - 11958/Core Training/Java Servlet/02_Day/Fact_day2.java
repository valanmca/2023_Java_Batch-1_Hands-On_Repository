package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fact_day2
 */
@WebServlet("/Fact_day2")
public class Fact_day2 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		int fact = 1;
		int n = 5;
		for (int i =1; i<=n; i++) {
			fact = fact * i;
			
		}
		out.println("Factorial : " + fact);
	}

}
