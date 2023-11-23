package com.servlet.day04;

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
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
	
		
//		HttpSession session = request.getSession();
//		session.setAttribute("UserName", userName);
		
		Cookie cookie = new Cookie("UserName", userName);
		response.addCookie(cookie);
		
		PrintWriter out = response.getWriter();
		out.println("<h1 style=color:green;>");
		out.println("<br><p align='center'>Welcome " +userName + "</p>");
		out.println("<br> <br> This is " + userName + "Inbox page");
		out.println("</h1>");
		out.println("<br><a href='SentItem'>Click here to go to Sent Items Page</a>");
		out.close();
	}

}
