package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class calculator extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String process = request.getParameter("button");
		PrintWriter out = response.getWriter();
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		
		if(process.equals("Add")) {
			RequestDispatcher rd = request.getRequestDispatcher("calc.jsp");
			rd.include(request, response);
			int sum = n1+n2;
			out.println(sum);
		}
		else if(process.equals("Sub")) {
			RequestDispatcher rd = request.getRequestDispatcher("calc.jsp");
			rd.include(request, response);
			int sub = n1-n2;
			out.println(sub);
		}
		else if(process.equals("Mul")) {
			RequestDispatcher rd = request.getRequestDispatcher("calc.jsp");
			rd.include(request, response);
			int mul = n1*n2;
			out.println(mul);
		}
		else if(process.equals("Div")) {
			RequestDispatcher rd = request.getRequestDispatcher("calc.jsp");
			rd.include(request, response);
			int div = n1/n2;
			out.println(div);
		}
	}

}
