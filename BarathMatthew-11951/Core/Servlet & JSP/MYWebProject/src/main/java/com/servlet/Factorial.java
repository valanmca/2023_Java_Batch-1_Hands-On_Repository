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
 * Servlet implementation class Factorial
 */
@WebServlet("/Factorial")
public class Factorial extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		int num =5;
		String fact = request.getParameter("fact");
		int temp = Integer.parseInt(fact);
		while (num !=1) {
			temp*=(num-1);
			num--;
		}
		RequestDispatcher rd = request.getRequestDispatcher("Fact.jsp");
		rd.include(request, response);
		out.print("<h3>"+temp+"</h3>");
	
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
