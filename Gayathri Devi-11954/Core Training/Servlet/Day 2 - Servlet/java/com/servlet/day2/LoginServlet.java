package com.servlet.day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
//predefined interface from httpServlet.
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("uname");
		String passWord = request.getParameter("pwd");
		
		if (passWord.equals("123"))
			response.sendRedirect("LoginSuccess.jsp?userName=" +userName);
		else
			response.sendRedirect("LoginFail.jsp");


		
		out.close();
	}

}
