package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DivisionServlet")
public class DivisionServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		int sum=n1/n2;
		
		RequestDispatcher rd=request.getRequestDispatcher("Division.jsp");
		rd.include(request, response);
		PrintWriter out=response.getWriter();
		
		out.println("Division of "+n1+"/"+n2+"="+sum);
	}

}
