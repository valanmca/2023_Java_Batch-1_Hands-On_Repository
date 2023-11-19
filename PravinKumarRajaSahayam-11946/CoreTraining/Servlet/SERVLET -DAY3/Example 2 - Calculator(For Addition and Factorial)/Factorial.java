package Example;

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
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Number3 = request.getParameter("factorials");
		int p = Integer.parseInt(Number3);
		int fact = 1;
		for(int i=1 ; i<=p ; i++)
		{
			fact = fact * i;
		}
		RequestDispatcher rd = request.getRequestDispatcher("Factorial.jsp");
		rd.include(request, response);
		PrintWriter out = response.getWriter();
		//out.println(sum);
		out.println("<font color='red'><b>\nFactorail for given Number </b></font>" + p + "<font color='red'><b> is : </b></font>" + fact);
	}

}