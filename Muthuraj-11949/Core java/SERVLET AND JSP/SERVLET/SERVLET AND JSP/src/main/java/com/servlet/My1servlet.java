package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.RequestDispatcher;
@WebServlet("/My1servlet")
public class My1servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String firstName=request.getAttribute("firstName").toString();
    PrintWriter out=response.getWriter();
    out.println("<html><body>");
    out.println("<form action='Final");
    request.setAttribute("firstName",firstName);
    
	
	}

}
