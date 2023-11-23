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
 * Servlet implementation class SentItem
 */
@WebServlet("/SentItem")
public class SentItem extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		HttpSession session = request.getSession();
//		String userName = session.getAttribute("UserName").toString();
		
		Cookie cookie[] = request.getCookies();
		String userName = cookie[0].getValue().toString();
		
		PrintWriter out = response.getWriter();
		out.println("<h1 style=color:red;>");
		out.println("<br><p align='right'>Welcome " +userName + "</p>");
		out.println("<br> <br> This is " + userName + "Inbox page");
		out.println("</h1>");
		out.println("<br><a href='InboxServlet'>Click here to go to Inbox Page</a>");
		out.close();
	
	}

}
