package com.servlet.day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdditionServlet")
public class AdditionServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");

		int n = Integer.parseInt(num1);
		int m = Integer.parseInt(num2);

		PrintWriter ps = response.getWriter();

		int sum = n + m;

		RequestDispatcher rd = request.getRequestDispatcher("Addition.jsp");
		rd.include(request, response);

		ps.println("<b>Addition of " + n + " and " + m + " : " + sum );
		ps.close();
	}

}
