package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ASMD")
public class ASMD extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("add");
	       String Number3 = request.getParameter("d1");
	       String Number4 = request.getParameter("d2");
	       int a = Integer.parseInt(Number3);
	       int b = Integer.parseInt(Number4);
	       if(action.equals("Add"))
	       {
	           RequestDispatcher rd = request.getRequestDispatcher("ASMD.jsp");
	           rd.include(request, response);
	           int sum = 0;
	           sum = a + b;
	           PrintWriter out = response.getWriter();
	           out.println("<font color='red'><b>\nSum of the given Numbers is : </b></font>" + sum);
	       }
	       if(action.equals("Sub"))
	       {
	           RequestDispatcher rd = request.getRequestDispatcher("ASMD.jsp");
	           rd.include(request, response);
	           int sub = 0;
	           sub = a - b;
	           PrintWriter out = response.getWriter();
	           out.println("<font color='red'><b>\nSub of the given Numbers is : </b></font>" + sub);
	       }
	       if(action.equals("Div"))
	       {
	           RequestDispatcher rd = request.getRequestDispatcher("ASMD.jsp");
	           rd.include(request, response);
	           int div = 0;
	           div = a / b;
	           PrintWriter out = response.getWriter();
	           out.println("<font color='red'><b>\nDiv of the given Numbers is : </b></font>" + div);
	       }
	       if(action.equals("Mul"))
	       {
	           RequestDispatcher rd = request.getRequestDispatcher("ASMD.jsp");
	           rd.include(request, response);
	           int mul = 0;
	           mul = a * b;
	           PrintWriter out = response.getWriter();
	           out.println("<font color='red'><b>\nMul of the given Numbers is : </b></font>" + mul);
	       }

	}

}
