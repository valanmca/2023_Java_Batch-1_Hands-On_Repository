package com.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		           String userName=request.getParameter("uname");
		           String password=request.getParameter("pwd");
		
		 PrintWriter out =response.getWriter();// response user writer in method 
         if(password.equals("123")) {
        	  //response.sendRedirect("LoginSuccess.jsp?userName="+userName);
        	 /// In this method used in Subtract JSP file create with Success.
        	 RequestDispatcher rd=request.getRequestDispatcher("LoginSuccess.jsp");
        	 request.setAttribute("userName", userName);
             rd.forward(request, response);
         }
         else{
        	 RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
        	 rd.include(request, response);
        	 out.println("<font color='red'><b>Invalid username or password</b></font> ");
         }
         

         out.close();
	}
}
