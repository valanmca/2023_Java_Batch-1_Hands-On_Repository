package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/InboxServlet")
public class InboxServlet extends HttpServlet {
	
//   String userName=null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
//		HttpSession session=request.getSession();
//		
//		if(session.getAttribute("username")==null)
//		{
//			 userName=request.getParameter("uname");
//			 session.setAttribute("username", userName);
//		}
//		else
//		{
//			userName=session.getAttribute("username").toString();
//		}
//		
		
		//-----
		
		String userName=request.getParameter("uname");
		String userName1=request.getParameter("uname");
		
		HttpSession session=request.getSession();
		session.setAttribute("username", userName);
		
		Cookie cookie=new Cookie("username1",userName1);
		response.addCookie(cookie);
		
		PrintWriter out=response.getWriter();
		out.println("<h1>Welcome "+userName+" to inbox page session</h1>");
		out.println("<h1>Welcome "+userName1+" to inbox page cookie</h1>");
		out.println("<a href='SendItem'>click here to go to send item page</a>");
	}

	

}
