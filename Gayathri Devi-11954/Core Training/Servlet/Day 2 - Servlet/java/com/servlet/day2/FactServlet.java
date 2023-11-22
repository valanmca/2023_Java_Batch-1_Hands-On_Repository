package com.servlet.day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FactServlet
 */
@WebServlet("/FactServlet")
public class FactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String number = request.getParameter("factnumber");
		
		int num = Integer.parseInt(number);
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		String ans = Integer.toString(fact);
		//ans = fact;
		//response.sendRedirect("Factorial.jsp?ans=" + URLEncoder.encode(ans, "UTF-8"));
		//request.getSession().setAttribute("ans", ans);
		//response.sendRedirect("adminHome.jsp");
		
		//response.sendRedirect("LoginSuccess.jsp?userName=" +userName);
		//response.sendRedirect("Factorial.jsp?ans=" +fact);
		out.println("<font color='green'<b>"+fact+"</b></font>");
		out.close();
		
	}

}
