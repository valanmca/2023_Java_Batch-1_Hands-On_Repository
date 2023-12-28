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
 * Servlet implementation class SubtractionServlet
 */
@WebServlet("/SubtractionServlet")
public class SubtractionServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("sub1");
		String num2 = request.getParameter("sub2");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		int Subtraction = n1 - n2;
		RequestDispatcher rd = request.getRequestDispatcher("Subtraction.jsp");
		rd.include(request, response);
		PrintWriter out = response.getWriter();
		out.println("Subtraction:" + Subtraction);

	}

}
