package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Factorial
 */
@WebServlet("/Factorial")
public class Factorial extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num=Integer.parseInt(request.getParameter("num1"));
		
		PrintWriter out=response.getWriter();
		
		
		int fact = 1;
        for (int i = 1; i<=num; i++) {
            fact = fact * i;       
        }
        RequestDispatcher rd=request.getRequestDispatcher("Factor.jsp");
        rd.include(request, response);
        
        out.println("Factorial is:"+fact);
		
	}

	}

