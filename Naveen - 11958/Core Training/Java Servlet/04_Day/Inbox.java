package com.servlet.day_04;

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
		
		
		String userName = request.getParameter("uname");
//		//Writing user data to cookie
//		Cookie cookie = new Cookie("userName", userName);
//		response.addCookie(cookie);
		
		
		
		
		//Writing user data into the session
		HttpSession session = request.getSession();  //Initialization of session object.
		//session.setAttribute("userName", userName);
		
		if(session.getAttribute("userName") == null) {
	          userName=request.getParameter("uname");
	          session.setAttribute("userName",userName); 
	      }
	      else 
	          userName=session.getAttribute("userName").toString();
			
	
		PrintWriter out = response.getWriter();
		out.println("<h1 style='color : green;'>");
		out.println("<br><p align='right'>Welcome " + userName + "</p>");
		out.println("<br><br> This is "+ userName + " Inbox Page");
		out.println("</h1>");
		out.println("<br><a href='SentItem'>Click here to got to Sent Items page</a>");
		out.println("<br><a href='Delete'>Click here to got to Delete page</a>");
		//Delete, Draft, to do
		out.close();
		
		
		
		
		
		
	}

}
