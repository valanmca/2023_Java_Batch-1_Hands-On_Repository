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
 * Servlet implementation class Calculatora
 */
@WebServlet("/Calculatora")
public class Calculatora extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("add");
		String Number4 = request.getParameter("d3");
		String Number5 = request.getParameter("d5");
		int e = Integer.parseInt(Number4);
		int p = Integer.parseInt(Number5);
		if(action.equals("Add"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Calculator9.jsp");
			rd.include(request, response);
			int sum = 0;
			sum = e + p;
			PrintWriter out = response.getWriter();
			out.println("<font color='red'><b>\nSum of the given Numbers is : </b></font>" + sum);
		}
		if(action.equals("Sub"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Calculator9.jsp");
			rd.include(request, response);
			int sub = 0;
			sub = e - p;
			PrintWriter out = response.getWriter();
			out.println("<font color='red'><b>\nSub of the given Numbers is : </b></font>" + sub);
		}
		if(action.equals("Div"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Calculator9.jsp");
			rd.include(request, response);
			int div = 0;
			div = e / p;
			PrintWriter out = response.getWriter();
			out.println("<font color='red'><b>\nDiv of the given Numbers is : </b></font>" + div);
		}
		if(action.equals("Mul"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Calculator9.jsp");
			rd.include(request, response);
			int mul = 0;
			mul = e * p;
			PrintWriter out = response.getWriter();
			out.println("<font color='red'><b>\nMul of the given Numbers is : </b></font>" + mul);
		}
	}

}