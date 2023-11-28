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
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pr=response.getWriter();
		pr.println("<html>");
		pr.println("<body>");
		pr.println("<center>");
		pr.println("<table border=1 width='60%'>");
		pr.println("<tr><th>Number</th><th>Factorial</th></tr>");
		
		for(int n=1;n<=5;n++)
		{
			 int fact = 1;
			 for(int i=1;i<=n;i++)
				 fact=fact*i;
			 
			 pr.println("<tr><td>"+n+"</td><td>"+fact+"</td></tr>");
		}
		
		pr.println("</table>");
		pr.println("</center>");
		pr.println("</body>");
		pr.println("</html>");
					
	}

}
