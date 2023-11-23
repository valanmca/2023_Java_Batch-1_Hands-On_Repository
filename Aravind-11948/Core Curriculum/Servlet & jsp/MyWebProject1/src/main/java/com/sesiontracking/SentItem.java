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


@WebServlet("/SentItem")
public class SentItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		HttpSession session =request.getSession();
//		String userName= session.getAttribute("User").toString();
		
	
		Cookie ck[] =request.getCookies();
		String userName= (String)ck[0].getValue();
	
		PrintWriter out=response.getWriter();
		out.println("<h1 style='color:red;'>");
		out.println("<p align=center>Welcome "+userName+"</p>");
		out.println("<br> <br> This is "+userName+" Sent Item page");
		out.println("</h1>");
		out.println("<a href='Inbox'> Click here To go to Inbox item page</a>");
		out.close();
		
		
		
		
		
	}

}
