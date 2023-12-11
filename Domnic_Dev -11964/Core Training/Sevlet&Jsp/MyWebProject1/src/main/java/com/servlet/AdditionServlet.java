package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdditionServlet")
public class AdditionServlet extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	int f1=Integer.parseInt(request.getParameter("fname"));
	int f2=Integer.parseInt(request.getParameter("sname"));

	int add=f1+f2;
	
	RequestDispatcher rd=request.getRequestDispatcher("Addition.jsp");
	rd.include(request, response);
	
	PrintWriter out=response.getWriter();
	
	out.println(f1+" + "+f2+" = "+add);
	}

}
