package com.servlet.day02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");

		PrintWriter out = response.getWriter();

		if (password.equals("123")) {

//			out.println("<font color='green'<b>Welcome Admin</b></font>");

//			response.sendRedirect("LoginSuccess.jsp?userName="+userName);

			RequestDispatcher rd = request.getRequestDispatcher("LoginSuccess.jsp");
			request.setAttribute("userName", userName);

			rd.forward(request, response);

		} else {
//			out.println("<font color='red'><b>Invalid Username or Password</b></font>");
//			response.sendRedirect("LoginFailed.jsp");

			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);

			out.println("<font color='red'><b>Invalid Username or Password</b></font>");
		}
		out.close();
	}
}
