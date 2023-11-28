package com.servlet.day4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SentItem
 */
@WebServlet("/SentItem")
public class SentItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// reading username from the session
		HttpSession session = request.getSession();
		String userName = session.getAttribute("UserName").toString();

//Reading userName fromt he cookie
		// Cookie cookie[] = request.getCookies();
//		String userName = cookie[0].getValue();//1st cookie is our session id
		// String userName = cookie[0].getValue().toString();
//		
		PrintWriter out = response.getWriter();
		out.println("<h1 style='color:red; text-align:center;'");

		out.println("<br>This is " + userName + " send item page</h1>");
		out.println("<br><br><a href='ThirdServlet'>Click here to sent to the ThirdServlet page");
		out.close();

	}

}
