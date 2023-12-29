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
 * Servlet implementation class FirstDivServlet
 */
@WebServlet("/FirstDivServlet")
public class FirstDivServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		Request-Dispatcher(request)
//		int sum1 = (Integer)request.getAttribute("sum");

//		Send-Redirect(response)
//		int sum1 = Integer.parseInt(request.getParameter("sum")) ;
		
//		HTTPSession -------------------------------------
		HttpSession session = request.getSession();
		
//		session.removeAttribute("sum");
		
		
		int sum1 = (Integer) session.getAttribute("sum");		
		
		PrintWriter out = response.getWriter();
		int fact = 1;
		for(int i=1;i<=sum1;i++) {
			fact*=i;
		}
		out.println("Fact of "+sum1+":" +fact);
		out.close();
	}

}

