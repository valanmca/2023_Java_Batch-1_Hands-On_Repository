package Factorial_Example1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Factorial_Examples1
 */
@WebServlet("/Factorial_Examples1")
public class Factorial_Examples1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<table border=1 width='60%'>");
		out.println("<tr><th>Number</th><th>Factorial</th></tr>");
		String Number = request.getParameter("factorail");
		int s = Integer.parseInt(Number);
		int fact = 1;
		int a = 0;
			for (int i = 1; i <= s; i++)
				fact = fact * i;
			//s++;
			out.println("<tr><td>" + s + "</td><td>" + fact + "</td></tr>");
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
