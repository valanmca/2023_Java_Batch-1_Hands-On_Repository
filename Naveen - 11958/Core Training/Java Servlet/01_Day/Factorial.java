package com.servlet;

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

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<table border = 1 width = '60%'>");
		out.println("<tr><th>Number</th><th>Factorial</th></tr>");
		
		for(int n=1; n<=5; n++) {
			int fact = 1;
			for(int i=1; i<=5; i++) {
				fact =fact * i;
				
				out.println("<tr><td>"+i+"</td><td>"+fact+"</td></tr>");
			}
			
			out.println("</table>");
			out.println("</center>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		}
	}

}
