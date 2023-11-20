package Inbox;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindItems
 */
@WebServlet("/FindItems")
public class FindItems extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie cookies[] = request.getCookies();
		String userName = cookies[1].getValue().toString();
		
		PrintWriter out = response.getWriter();
		out.println("<h1 style='color : green';>");
		out.println("<br><p align='right'>Welcome" + " " + userName + "</p>");
		out.println("<br><br> This is a" + " " + userName + " " + "Find the Items Pages");
		out.println("</h1>");
		out.println("<br><a href='Inbox'>Click here to go to the Inbox Page</a>");
	}

}
