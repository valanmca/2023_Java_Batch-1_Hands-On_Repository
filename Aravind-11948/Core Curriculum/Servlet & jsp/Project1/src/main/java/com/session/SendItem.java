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

/**
 * Servlet implementation class SendItem
 */
@WebServlet("/SendItem")
public class SendItem extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
	
		
		HttpSession session=request.getSession();
		
		String userName=session.getAttribute("username").toString();
		
		Cookie ck[]=request.getCookies();
		 String userName1=ck[0].getValue().toString();
		
		out.println("<h1>Welcome "+userName+" to send Item box session </h1>");
		out.println("<h1>Welcome "+userName1+" to send Item box  cookie</h1>");
//		session.setMaxInactiveInterval(20000);
//		session.invalidate();
		out.println("<a href='Draft'>click here to go to inbox page</a>");
	}

}
