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


@WebServlet("/SentItem")
public class SentItem extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		Reading username from the session
		
//		HttpSession session = request.getSession();
//		String userName = session.getAttribute("UserName").toString();
		
//		Reading User name using cookie
		Cookie[] cookies = request.getCookies();
		   String userName = null;
		 if (cookies != null) {
		       for (Cookie cookie : cookies) {
		               userName = cookie.getValue();
		               break;
		       }
		   } 
		PrintWriter out = response.getWriter();
		out.println("<h1>");
		out.println("<br><p align='right'>Welcome   "+userName+"</p>");
		out.println("<br> This is "+userName+"Sent Item page");
		out.println("</h1>");
		out.println("<br> <a href = 'InboxServlet'>Click here to go to Inbox Page</a>");
		out.close();
		

	}

}
