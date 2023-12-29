package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<center>");
		out.print("<table border=1 width='60%'>");
		out.print("<tr><th>Number</th><th>Factorial</th></tr>");

		for (int n = 1; n <= 5; n++) {
			int fact = 1;
			for (int i = 1; i <= n; i++)
				fact = fact * i;

			out.print("<tr><td>" + n + "</td><td>" + fact + "</td></tr>");
		}

		out.print("</table>");
		out.print("</center>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}
