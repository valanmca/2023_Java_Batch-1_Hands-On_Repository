package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Practice
 */
@WebServlet("/PracticeServlet")
public class PracticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String table = request.getParameter("value");
		
		PrintWriter out = response.getWriter();
		
		int num = Integer.parseInt(table);
		out.println("<html><head>");
		out.println("<body>");
		
		RequestDispatcher rd = request.getRequestDispatcher("Practice.jsp");
		rd.include(request, response);
		for(int j = 1;j<=num;j++) {
			out.println("<table border =3px solid black>");
			for(int i=1;i<=10;i++) {
				out.println("<tr><td>"+i+"</td>"+"<td> * </td>"+"<td>"+j+"</td>"+"<td> = </td>"+"<td>"+(i*j)+"</td>");
			}
			out.println("</table>");
		}
		
		out.println("</body>");
		out.println("</html></head>");
		out.close();
		
		
	}

}
