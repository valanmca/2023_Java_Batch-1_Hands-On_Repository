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
 * Servlet implementation class AdditionServlet
 */
@WebServlet("/AdditionServlet")
public class AdditionServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String num1 = request.getParameter("add1");
		String num2 = request.getParameter("add2");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		int sum = n1 + n2;
		RequestDispatcher rd = request.getRequestDispatcher("Addition.jsp");
		rd.include(request, response);
		PrintWriter out = response.getWriter();
		out.println("Addition:" + sum);

	}

}
