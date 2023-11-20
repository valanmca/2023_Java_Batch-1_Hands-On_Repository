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
 * Servlet implementation class SendItems
 */
@WebServlet("/SendItems")
public class SendItems extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Reading username from the previous sessions
	    /*HttpSession session = request.getSession();
		String userName = session.getAttribute("UserName").toString();*/
		//Reading the username details from the previous cookies
		Cookie cookies[] = request.getCookies();
		String userName = cookies[1].getValue().toString();
		
		PrintWriter out = response.getWriter();
		out.println("<h1 style='color : green';>");
		out.println("<br><p align='right'>Welcome" + " " + userName + "</p>");
		out.println("<br><br> This is a" + " " + userName + " " + "Sent Items Pages");
		out.println("</h1>");
		out.println("<br><a href='FindItems'>Click here to go to the Find the Items Page</a>");
	}

}
