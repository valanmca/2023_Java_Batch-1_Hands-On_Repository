package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Drafts
 */
@WebServlet("/Drafts")
public class Drafts extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		String username=session.getAttribute("UserName").toString();
		
		PrintWriter out=response.getWriter();
		out.println("<h1 style='color:blue;'>");
		out.println("<br><p align='right'> Welcome"+username +"</p>");
		out.println("<br><br><p align='center'>This is "+username+" draft page</p>" );
		out.println("</h1");
		out.println("<br><a href='Spam'>Click here to go to Spam page</a>");
		out.close();
		
		
	}

}
