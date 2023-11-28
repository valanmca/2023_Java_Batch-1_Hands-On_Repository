package com.servlet.day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NameServlet
 */
@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 * response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("<html><body><form action='NameServlet'>");
		out.println("Enter 2nd name : <input type='text' name='sname' />");
		out.println("<input type='submit' value='Get full name'");
		out.println("</form></body></html>");
		String firstName = request.getParameter("fname");
		String secondName = request.getParameter("sname");

		// String fullName = firstName + secondName;

//		out.println(fullName);
	}

}
