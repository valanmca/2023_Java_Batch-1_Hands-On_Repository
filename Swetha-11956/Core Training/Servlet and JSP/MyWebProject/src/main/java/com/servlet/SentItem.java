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
 * Servlet implementation class SentItem
 */
@WebServlet("/SentItem")
public class SentItem extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.Reading data(username) from the session
		HttpSession session =request.getSession();
		String userName=session.getAttribute("UserName").toString();
		
		
//		//2.Reading data from cookie
//		Cookie[] cookies=request.getCookies();//returning array of cookies.
//		String userName=cookies[1].getValue().toString(); //cookie[0] will give the "ID" every cookie creates a unique ID , 
//				
		
		PrintWriter out=response.getWriter();
		out.println("<h1 style='color:green;'>");
		out.println("<br><p align='right'> Welcome "+ userName+"</p>");
		out.println("<br><br> <p align='center'>This is "+userName +" SenetItem page</p>");
		out.println("</h1>");
		out.println("<br><a href='Drafts'>Click here to go to Drafts page</a>");// it will go to Inbox servlet
		out.close();
	}

}
