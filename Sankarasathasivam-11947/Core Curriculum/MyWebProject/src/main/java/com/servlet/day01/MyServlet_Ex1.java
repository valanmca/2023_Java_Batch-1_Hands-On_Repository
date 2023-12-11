package com.servlet.day01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet_Ex1")
public class MyServlet_Ex1 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body style='background-color:powderblue;'>");
		out.println("<center><h1 style='background-color:black; height:20%; color:white; border-radius:10px;'><b>Sankarasathasivam</b></h1></center>");
		out.println("</body>");
		out.println("</html>");
	}

}
