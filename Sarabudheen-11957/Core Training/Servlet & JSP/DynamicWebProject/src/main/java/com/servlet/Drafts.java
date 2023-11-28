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
 * Servlet implementation class Drafts
 */
@WebServlet("/Drafts")
public class Drafts extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Reading userName from the session
		//HttpSession session = request.getSession();
		//String userName = session.getAttribute("userName").toString();
		
		//Reading userName from the cookie
		Cookie cookie[] = request.getCookies();
		String userName = cookie[0].getValue().toString();
		
		PrintWriter out = response.getWriter();
		out.print("<h1 style='color : green;'>");
		out.print("<br><p align='right'>Welcome "+userName +"</p>");
		out.print("<br><br> This is "+userName+ " Draft page");
		out.print("</h1>");
		out.print("<br><a href='InboxServlet'>Click here to go to Inbox Page</a>");
		out.close();
	}

}
