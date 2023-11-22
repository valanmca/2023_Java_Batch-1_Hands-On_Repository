package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        out.print("<h1><font color='red'>Welcome to Servlet</font></h1>");
        
        int fact = 1;
        int val = 0;
        for (int n = 1; n <=6; n++) {
            fact = fact * n;
            val++;

        }
out.println("<tr><th>" + val + "</th><th>" + fact + "</th></tr>");
        out.close();
	}

}
