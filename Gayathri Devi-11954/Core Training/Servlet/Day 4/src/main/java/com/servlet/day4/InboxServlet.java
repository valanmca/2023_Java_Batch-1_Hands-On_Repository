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
 * Servlet implementation class InboxServlet
 */
@WebServlet("/InboxServlet")
public class InboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("uname");

		// writing user data into the session
		HttpSession session = request.getSession();
		if (session.getAttribute("UserName") == null) {
			userName = request.getParameter("uname");
			session.setAttribute("UserName", userName);
		} else
			userName = session.getAttribute("UserName").toString();
		// session.setAttribute("UserName",userName);//to store the value into the
		// session
		// session.invalidate(); //this will close the session

//		writing user data into the cookie
		Cookie cookie = new Cookie("UserName", userName);
		response.addCookie(cookie);

		PrintWriter out = response.getWriter();
		out.println("<h1 style='color:green; text-align:center;'");
		out.println("Welcome" + userName);
		out.println("<br>This is " + userName + " inbox page</h1>");
		out.println("<br><br><a href='SentItem'>Click here to send to the sentItem page");
		out.close();

//
	}

}
