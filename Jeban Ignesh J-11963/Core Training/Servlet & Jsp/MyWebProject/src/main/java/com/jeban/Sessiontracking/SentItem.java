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
 * Servlet implementation class SentItem
 */
@WebServlet("/SentItem")
public class SentItem extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Reading user name from the session

		HttpSession session = request.getSession();
		String username = session.getAttribute("UserName").toString();

		// Reading user data from the cookie
//		Cookie cookies[]=request.getCookies();
//		String username=cookies[1].getValue();

		PrintWriter out = response.getWriter();
		
		out.println("<h1 style='color:green;'>");
		out.println("<br><p align='right'>Welcome" + username + "</p>");
		out.println("<br><br>This is" + username + "Sent Item page");
		out.println("</h1>");
		out.println("<br><a href='Drafts'>Click here to go to Inbox page Items Page</a>");
		out.close();

	}

}
