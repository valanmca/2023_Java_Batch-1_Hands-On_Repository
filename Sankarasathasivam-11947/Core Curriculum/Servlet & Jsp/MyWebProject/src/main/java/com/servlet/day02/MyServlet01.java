package com.servlet.day02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet01")
public class MyServlet01 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String f = request.getParameter("button");

		if (f.equals("Factorial")) {
			RequestDispatcher rd = request.getRequestDispatcher("Fact.jsp");
			rd.forward(request, response);
		}

		if (f.equals("Addition")) {
			RequestDispatcher rd = request.getRequestDispatcher("Addition.jsp");
			rd.forward(request, response);
		}
	}

}
