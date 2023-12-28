package com.jeban.Calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcultorServlet
 */
@WebServlet("/CalcultorServlet")
public class CalcultorServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("button");
		String num1 = request.getParameter("cal1");
		String num2 = request.getParameter("cal2");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		if (action.equals("Addition")) {
			int sum = n1 + n2;
			RequestDispatcher rd = request.getRequestDispatcher("Start.jsp");
			rd.include(request, response);
			PrintWriter out=response.getWriter();
			out.println("Addition:"+sum);
		}
		
		else if (action.equals("Subtraction")) {
			int sub=n1-n2;
			RequestDispatcher rd = request.getRequestDispatcher("Start.jsp");
			rd.include(request, response);
			PrintWriter out=response.getWriter();
			out.println("Subtraction:"+sub);
		}
		else if (action.equals("Multiplication")) {
			int mul=n1*n2;
			RequestDispatcher rd = request.getRequestDispatcher("Start.jsp");
			rd.include(request, response);
			PrintWriter out=response.getWriter();
			out.println("Multiplication:"+mul);
		}
		else if (action.equals("Division")) {
			int div=n1/n2;
			RequestDispatcher rd = request.getRequestDispatcher("Start.jsp");
			rd.include(request, response);
			PrintWriter out=response.getWriter();
			out.println("Division:"+div);
		}
	}

}
