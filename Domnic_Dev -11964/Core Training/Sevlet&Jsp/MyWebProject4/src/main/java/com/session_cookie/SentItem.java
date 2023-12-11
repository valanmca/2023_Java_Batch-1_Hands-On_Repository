package com.session_cookie;

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
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		//Reading username from the session
//		HttpSession session=request.getSession();
//		String userName=(String) session.getAttribute("UserName");
	
		//Reading user data from the cookie
		Cookie cookies[]=request.getCookies();
		String userName=(String) cookies[0].getValue();
		
		PrintWriter out=response.getWriter();
		out.println("<h1 style='color:green;'>");
		out.println("<br><p align='right'>Welcome"+userName+"</p>");
		out.println("<br><br> This is "+userName+"'s SentItem Page");
		out.println("</h1>");
		out.println("<br><a href='InboxServlet'>Click here to go to Inbox page</a>");
		out.close();
	}

}
