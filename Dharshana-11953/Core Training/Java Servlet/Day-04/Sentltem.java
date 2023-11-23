package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Sentltem")
public class Sentltem extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Reading username from the session
				HttpSession session = request.getSession();
				String userName = session.getAttribute("userName").toString();
				
//				//Reading user data from cookie
//				Cookie cookies[] = request.getCookies();
//				String userName = cookies[0].getValue().toString();
				
				 
				PrintWriter out = response.getWriter();
				out.println("<h1 style='color : green;'>");
				out.println("<br><p align='right'>Welcome " + userName + "</p>");
				out.println("<br><br> This is "+ userName + " Sent Item Page");
				out.println("</h1>");
				out.println("<br><a href='Inbox'>Click here to got to Inbox page</a>");
				out.println("<br><a href='Delete'>Click here to got to Delete page</a>");
				out.close();
	}

}
