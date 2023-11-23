package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet2
 */
@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	
@Override
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<table border=2px solid black  width=60% >");
		out.println("<tr ><th>Number </th> <th> factorial</th> </tr>");
		for(int n=1;n<=5;n++)
		{
			int fact=1;
			for(int i=1;i<=n;i++)
			
				fact=fact*i;
			
			out.println("<tr><td>"+n+"</td><td>"+fact+"</td></tr>");
		}
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
	}

}
