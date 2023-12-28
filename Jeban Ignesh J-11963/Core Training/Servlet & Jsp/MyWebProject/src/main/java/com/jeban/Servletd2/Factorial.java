package com.jeban.Servletd2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Factorial
 */
@WebServlet("/Factorial")
public class Factorial extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String number = request.getParameter("num");
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<table border=4 width='60%'>");
		out.println("<tr><th>Number</th><th>Factorial</th></tr>");
		int digit = Integer.parseInt(number);
		int fact = 1;

		for (int n = 1; n <= digit; n++) {
			fact = fact * n;

		}
		out.println("<tr><th>" + digit + "</th><th>" + fact + "</th></tr>");
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}
