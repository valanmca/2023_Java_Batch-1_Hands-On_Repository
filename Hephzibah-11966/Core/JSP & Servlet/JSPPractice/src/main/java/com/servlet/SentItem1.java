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
 * Servlet implementation class SentItem1
 */
@WebServlet("/SentItem1")
public class SentItem1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
        String userName=session.getAttribute("UserName").toString();
        
        // Writing user data using Cookie
//        Cookie cookies[]=request.getCookies();
//        String userName=cookies[1].getValue().toString();
        
        PrintWriter out = response.getWriter();
        out.println("<h1 style='color:red;'>");
        out.println("<br><p align='right'> Welcome" +userName +"</p>");
        out.println("<br>This is "+ userName + "Sent Item Page");
        out.println("</h1>");
	}

}
