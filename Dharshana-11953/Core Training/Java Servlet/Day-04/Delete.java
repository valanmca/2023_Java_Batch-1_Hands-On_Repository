package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Delete")
public class Delete extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Reading username from the session
		HttpSession session = request.getSession();
		String userName = session.getAttribute("userName").toString();
		
		PrintWriter out = response.getWriter();
		out.println("<h1 style='color : green;'>");
		out.println("<br><p align='right'>Welcome " + userName + "</p>");
		out.println("<br><br> This is "+ userName + " Delete Page");
		out.println("</h1>");
		out.println("<br><a href='Inbox'>Click here to got to Inbox page</a>");
		out.println("<br><a href='SentItem'>Click here to got to Sent Items page</a>");
		out.close();
	}

}
