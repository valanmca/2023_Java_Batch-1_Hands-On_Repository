package com.jeban.Sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Drafts
 */
@WebServlet("/Drafts")
public class Drafts extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = session.getAttribute("UserName").toString();

		// Reading user data from the cookie
//		Cookie cookies[]=request.getCookies();
//		String username=cookies[1].getValue();

		PrintWriter out = response.getWriter();

		out.println("<h1 style='color:green;'>");
		out.println("<br><p align='right'>Welcome" + username + "</p>");
		out.println("<br><br>This is" + username + "Draft page");
		out.println("</h1>");
		out.println("<br><a href='InboxServlet'>Click here to go to Inbox page Items Page</a>");
		out.close();
	}

}
