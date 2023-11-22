package com.factorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyFactorial")
public class MyFactorial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public MyFactorial() {
        super();
        
    }

	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<boby>");
		out.println("<center>");
		out.println("<table border = 1 width = '60%'>");
		out.println("<tr><th>Number</th><th>Factorial</th></tr>");
		int fact = 1;
       int val = 0;
       for (int n = 1; n <=5; n++) {
           fact = fact * n;
           val++;
       }
       out.println("<tr><th>" + val + "</th><th>" + fact + "</th></tr>");
       out.println("</table>");
		out.println("</center>");
		out.println("</boby>");
		out.println("</html>");

	}

}
