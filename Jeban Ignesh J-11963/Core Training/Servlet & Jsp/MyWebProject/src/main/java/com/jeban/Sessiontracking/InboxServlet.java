package com.jeban.Sessiontracking;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("uname");
		
		// Writing user data into the session
		HttpSession session = request.getSession();
		
		if (session.getAttribute("UserName") == null) {
			username = request.getParameter("uname");
			session.setAttribute("UserName", username);
		} else
			username = session.getAttribute("UserName").toString();
		
		
		PrintWriter out = response.getWriter();
		out.println("<h1 style='color:green;'>");
		out.println("<br><p align='right'>Welcome" + username + "</p>");
		out.println("<br><br>This is" + username + "Inbox page");
		out.println("</h1>");
		out.println("<br><a href='SentItem'>Click here to go to Sent Items Pge</a>");
		out.close();

		
//		session.setAttribute("UserName", username);
		

		// Writing user data into the cookie
//		Cookie cookie=new Cookie("UserName",username);
//		response.addCookie(cookie);

	}

}
