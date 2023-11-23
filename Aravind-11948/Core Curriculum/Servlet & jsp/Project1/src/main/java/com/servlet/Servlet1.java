package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	@Override

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println(".div1{ background-color:red;"
				+ "height :150px;"
				+ "position:absolute;"
				+ "top:50px;"
				+ "width:100%;}");
		out.println("h1{color:pink;"
				+ "text-align:center;}");
		out.println("</style>");
		
		out.println("</head>");
	
		out.println("<body style=background-color:lightpink;>");
		out.println("<div class=div1>");
		out.println("<h1> welcome to servlet</h1>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}

}
