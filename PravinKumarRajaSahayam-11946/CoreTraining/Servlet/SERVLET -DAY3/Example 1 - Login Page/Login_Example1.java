//Dispatcher
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
 * Servlet implementation class Login_Example1
 */
@WebServlet("/Login_Example1")
public class Login_Example1 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String UserName = request.getParameter("uname");
		String PassWord = request.getParameter("pwd");
		PrintWriter out = response.getWriter();
		if (PassWord.equals("123")) {
			RequestDispatcher rd = request.getRequestDispatcher("LoginSuccess_Example.jsp");
			request.setAttribute("UserName", UserName);
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Login_Example.jsp");
			rd.include(request, response);
			out.println("<font color='red'><b>Invalid data username and password</b></font>");
		}
		out.close();
	}

}
