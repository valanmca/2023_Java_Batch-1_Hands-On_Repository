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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("uname");
		String password=request.getParameter("pwd");
		
		PrintWriter out=response.getWriter();
		
		if ( password.equals("123"))
		{
//			out.println("<font color='green'><b> Welcome Admin </b></font>");-not in mvc artitecture
//			response.sendRedirect("LoginSuccess.jsp?username="+userName);//dynamic webpage client side redirect
			RequestDispatcher rd=request.getRequestDispatcher("LoginSuccess.jsp");
			request.setAttribute("username", userName);
			request.setAttribute("pass", password);
			rd.forward(request, response);
			}
		else
		{
//			RequestDispatcher rd=request.getRequestDispatcher("LoginFailure.jsp");
//			request.setAttribute("pass", password);
//			rd.forward(request, response);
//			
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			
            rd.include(request, response);
			out.println("<br><br><center>");
			out.println("<font color='red'><b>Invalid username or password  </b></font>");
			out.println("</center>");
//			response.sendRedirect("LoginFailure.jsp?pass="+password);
			
			
			
		}
		out.close();
		
	}

}
