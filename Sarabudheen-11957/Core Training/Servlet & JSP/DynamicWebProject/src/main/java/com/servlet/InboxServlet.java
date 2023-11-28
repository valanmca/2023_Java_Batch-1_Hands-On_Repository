package com.servlet;

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
		//String userName = request.getParameter("uname");
		String userName=null;
		
		HttpSession session = request.getSession();
		
		if (session.getAttribute("userName") == null) {
			userName = request.getParameter("uname");
			session.setAttribute("userName", userName);
		} else
			userName = session.getAttribute("userName").toString();
		
		
		
		PrintWriter out = response.getWriter();
		out.print("<h1 style='color : green;'>");
		out.print("<br><p align='right'>Welcome "+userName +"</p>");
		out.print("<br><br> This is "+userName+ " Inbox page");
		out.print("</h1>");
		out.print("<br><a href='SentItem'>Click here to go to Sent Item Page</a>");
		out.close();
		
//		//Writing user data into the session
//		HttpSession session = request.getSession();
//		session.setAttribute("userName", userName);
//		
		/*//Writing user data into the cookie
		Cookie cookie = new Cookie("UserName",userName);
		response.addCookie(cookie);*/
		
		
		
	}

}
