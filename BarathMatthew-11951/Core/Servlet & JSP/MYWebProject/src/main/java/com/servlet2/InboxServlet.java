package com.servlet2;

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
		
		PrintWriter out = response.getWriter();
		out.println("<h1>");
		out.println("<br><p align='right'>Welcome "+userName+"</p>");
		out.println("<br> This is "+userName+"Inbox page");
		out.println("</h1>");
		out.println("<br> <a href = 'SentItem'>Click here to go to sent Item Page</a>");
		out.close();
		
		
		//writing user data into session 
		
//		
//		HttpSession session = request.getSession();
//		session.setAttribute("UserName",userName );
		

//		Writing user data into cookie
		
		Cookie cookie = new Cookie("UserName",userName);
		
		response.addCookie(cookie);
		
	}

}
