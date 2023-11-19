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
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Number1 = request.getParameter("d1");
		String Number2 = request.getParameter("d2");
		int s = Integer.parseInt(Number1);
		int a = Integer.parseInt(Number2);
		int sum = 0;
		sum = s + a;
		
		RequestDispatcher rd = request.getRequestDispatcher("Calculator.jsp");
		rd.include(request, response);
		PrintWriter out = response.getWriter();
		out.println("<font color='red'><b>\nSum of the given Numbers is : </b></font>" + sum);
	}

}