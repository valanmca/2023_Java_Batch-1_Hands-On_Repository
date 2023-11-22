package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Factorial() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String number = request.getParameter("fnum");
		  
		
		 int fact = 1;
			int n = Integer.parseInt(number);;
			for (int i =1; i<=n; i++) {
				fact = fact * i;
				
			}
			RequestDispatcher rd = request.getRequestDispatcher("Factorial.jsp");
			request.setAttribute("fact",fact);
			rd.include(request, response);
			out.println("Factorial of "+n+" :" + fact);

	}

}
