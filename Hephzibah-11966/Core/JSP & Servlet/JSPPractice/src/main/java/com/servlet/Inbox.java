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
 * Servlet implementation class Inbox
 */
@WebServlet("/Inbox")
public class Inbox extends HttpServlet {
	
	String userName = null;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      String userName=request.getParameter("uname");
        
//     Writing user data using Session
         
        HttpSession session=request.getSession(); 
//      session.setAttribute("User",userName); 
        
        // Writing user data using Cookie
//        Cookie cook=new Cookie("UserName",userName);
//        response.addCookie(cook);
//         
            
          if(session.getAttribute("UserName") == null) {
              userName=request.getParameter("uname");
              session.setAttribute("UserName",userName); 
         
         
          }
          else 
          {
              userName=session.getAttribute("UserName").toString();
          }
            
            PrintWriter out = response.getWriter();
            out.println("<h1 style='color:green;'>");
            out.println("<br><p align='right'> Welcome " +userName +"</p>");
            out.println("<br>This is"+ userName + "Inbox Page");
            out.println("</h1>");
            out.println("<br><a href='SentItem1'>Click here to go to Sent Item Page</a>");
            out.close();
            
            
        }
}
