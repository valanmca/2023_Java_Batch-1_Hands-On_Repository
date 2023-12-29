package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int sum = num1+num2;
		
//		PrintWriter out = response.getWriter();
//		out.println("Sum of two no : "+sum);
//		out.close();
		
//		Session Management -------------------------------
		
//		Request-Dispatcher(request) ------------------------
		
//		request.setAttribute("sum", sum);
//		RequestDispatcher rq = request.getRequestDispatcher("FirstDivServlet");
//		rq.forward(request, response);
		
//		Send-Redirect(response) ----------------------------
//		we pass value in url its doget(service)
		
//		response.sendRedirect("FirstDivServlet?sum="+sum);
		
		
//		HTTPSession ----------------------------
		
		HttpSession session = request.getSession();
		
		session.setAttribute("sum", sum);
		
		response.sendRedirect("FirstDivServlet");
		
	}

}
