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
 * Servlet implementation class AddTwoNumbers
 */
@WebServlet("/AddTwoNumbers")
public class AddTwoNumbers extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		
		int k=i+j;
		
		//Request Dispatcher, Redirect
		
//		PrintWriter out =response.getWriter();
//		out.println("Result is :"+k);
		
		request.setAttribute("k", k);
		
		RequestDispatcher rd = request.getRequestDispatcher("SqServlet");
		rd.forward(request, response);
	}

}
