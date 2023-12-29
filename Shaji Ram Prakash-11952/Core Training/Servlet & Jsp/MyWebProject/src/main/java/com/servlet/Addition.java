package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addition
 */
@WebServlet("/Addition")
public class Addition extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<body>");
			int n1 = Integer.parseInt(request.getParameter("num1"));
			int n2 = Integer.parseInt(request.getParameter("num2"));
			int sum = n1+n2;
			
			RequestDispatcher rd = request.getRequestDispatcher("Addition.jsp");
			rd.include(request, response);

			out.println("<font color='green'>Sum is:" + sum + "</font>");
			out.print("</body>");
			out.print("</html>");
			out.close();
	}

}
