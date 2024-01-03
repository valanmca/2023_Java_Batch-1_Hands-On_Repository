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
 * Servlet implementation class Inbox
 */
@WebServlet("/Inbox")
public class Inbox extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String userName=request.getParameter("uname");
		
		
		HttpSession session=request.getSession();
		//Initializing session object, Storing in key value pair.
		String userName=null;
		if(session.getAttribute("UserName")==null) {
			userName=request.getParameter("uname");
			session.setAttribute("UserName", userName);
		}
		
		else {
			userName=session.getAttribute("UserName").toString();
		}
		
		PrintWriter out=response.getWriter();
		out.println("<h1>");
		out.println("<br><p align='right'> Welcome "+ userName+"</p>");
		out.println("<br><br><p align='center'> This is "+userName +" Inbox page</p>");
		out.println("</h1>");
		out.println("<br> <a href='SentItem'>Click here to go to Sent Items page</a>");// it will go to sentIntem servlet
		out.close();
		
		//1.Writing user data into the session (use the uname to second page ...)
		
		
	
		
//		//2. writing user data into the cookie
//		//Creating a cookie.
//		Cookie cookie=new Cookie("UserName",userName);
//		response.addCookie(cookie); //Writing cookie in client side, adding the cookie(addCookie())
		
		
		
}
}
