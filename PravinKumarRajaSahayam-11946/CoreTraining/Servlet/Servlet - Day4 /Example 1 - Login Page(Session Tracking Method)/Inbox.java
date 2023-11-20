package Inbox;

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
		// TODO Auto-generated method stub
		String userName = request.getParameter("uname");
		/*HttpSession session = request.getSession();
		if(session.getAttribute("UserName") == null) 
		{
			userName = request.getParameter("uname");
			session.setAttribute("UserName", userName);
		}
		else
		{
			userName = session.getAttribute("UserName").toString();
		}*/
		Cookie cookies = new Cookie("UserName",userName);
		Cookie cookieas[] = request.getCookies();
		if(cookies.getValue() == null)
		{
			userName = cookieas[1].getValue().toString();
		}
		else
		{
			response.addCookie(cookies);
			userName = cookies.getValue().toString();
		}
		PrintWriter out = response.getWriter();
		out.println("<h1 style='color : green'>");
		out.println("<br><p align='right'>Welcome" + " " + userName + "</p>");
		out.println("<br><br> This is a" + " " +  userName + " Inbox Page");
		out.println("</h1>");
		out.println("<br><a href='SendItems'>Click here to go to the Sent Items Page</a>");
		out.close();
		/*
		//Writing user data into the sessions
		HttpSession session = request.getSession();
		session.setAttribute("UserName",userName);
		*/
		
		
		/*//Writing user data into the sessions
		Cookie cookies = new Cookie("UserName",userName);
		response.addCookie(cookies);*/
	}

}