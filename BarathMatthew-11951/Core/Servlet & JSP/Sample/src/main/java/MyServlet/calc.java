package MyServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calc
 */
@WebServlet("/calc")
public class calc extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String val1 = request.getParameter("num1");
		String val2 = request.getParameter("num1");
		
		int num1 =Integer.parseInt(val1);
		int num2 =Integer.parseInt(val2);
		int result = num1+num2;
		
		response.sendRedirect("add.jsp?result="+result);
		
		
	}

}
