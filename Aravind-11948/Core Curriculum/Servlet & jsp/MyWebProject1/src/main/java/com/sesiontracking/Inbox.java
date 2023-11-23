package com.sesiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Inbox")
public class Inbox extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
				
		String userName=request.getParameter("uname");
		
		
		// writing data  into the cookie
		Cookie cookie =new Cookie("User",userName);
		response.addCookie(cookie);
		
		PrintWriter out=response.getWriter();
		out.println("<h1 style='color:red;'>");
		out.println("<p align=center>Welcome "+userName+"</p>");
		out.println("<br> <br> This is "+userName+" Inbox page");
		out.println("</h1>");
		out.println("<a href='SentItem'> Click here To go to sent item page</a>");
		out.close();
		
//		// writing data  into the session
//		HttpSession session =request.getSession();
//		session.setAttribute("User", userName);
		
		
		
		
		
		
		
	}

}
