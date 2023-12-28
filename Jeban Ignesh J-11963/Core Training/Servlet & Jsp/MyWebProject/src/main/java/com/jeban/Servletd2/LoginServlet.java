package com.jeban.Servletd2;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final String RequestDispatcher = null;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");

		PrintWriter out = response.getWriter();

//		if(username.equals("Admin")&& password.equals("123"))
//			out.println("<font color='green'><b>Welcome Admin</b></font>");
//		if(password.equals("123"))
//			response.sendRedirect("LoginSuccess.jsp?username="+username);
		if (password.equals("123")) {
			RequestDispatcher rd = request.getRequestDispatcher("LoginSuccess.jsp");
			request.setAttribute("username", username);

			rd.forward(request, response);
		} else {

//			out.println("<font color='red'><b>Invalid Username & Password</b></font>");
//			response.sendRedirect("LoginFail.jsp");
			
            RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
            rd.include(request, response);
			out.println("<font color='red'><b>Invalid Username & Password</b><font>");
		}

		out.close();

	}

}
