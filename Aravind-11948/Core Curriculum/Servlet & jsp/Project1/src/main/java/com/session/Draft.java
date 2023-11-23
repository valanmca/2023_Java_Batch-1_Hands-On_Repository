package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Draft
 */
@WebServlet("/Draft")
public class Draft extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		
		String userName=session.getAttribute("username").toString();
		
		out.println("<h1>Welcome "+userName+" to send Draft box </h1>");
//		session.setMaxInactiveInterval(20000);
//		session.invalidate();
//		out.println("<a href='Inbox'>click here to go to inbox page</a>");
	}

}
