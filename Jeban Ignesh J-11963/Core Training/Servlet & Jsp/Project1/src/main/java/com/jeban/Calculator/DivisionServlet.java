package com.jeban.Calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DivisionServlet
 */
@WebServlet("/DivisionServlet")
public class DivisionServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("div1");
		String num2 = request.getParameter("div2");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		int Division = n1 / n2;
		RequestDispatcher rd = request.getRequestDispatcher("Division.jsp");
		rd.include(request, response);
		PrintWriter out = response.getWriter();
		out.println("Division:" + Division);
	}

}
