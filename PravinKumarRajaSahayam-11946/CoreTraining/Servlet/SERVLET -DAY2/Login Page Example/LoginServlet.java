//Using service,DoPost,and,DoGet method
package Factorial_Example1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	//protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String UserName = request.getParameter("uname");
		String PassWord = request.getParameter("pwd");
		PrintWriter out = response.getWriter();
		/*if(UserName.equals("Admin") && PassWord.equals("123"))
			//out.println("<font color='green'><b> Welcome Admin</b></font>");
		response.sendRedirect("LoginSuccess.jsp");
		else
			//out.println("<font color='red'><b> Invalid Data Please try again with correct username and password</b></font>");
			response.sendRedirect("LoginFail.jsp");*/
		if(PassWord.equals("123"))
			//out.println("<font color='green'><b> Welcome Admin</b></font>");
		response.sendRedirect("LoginSuccess.jsp?UserName="+UserName);
		else
			//out.println("<font color='red'><b> Invalid Data Please try again with correct username and password</b></font>");
			response.sendRedirect("LoginFail.jsp");
		out.close();
	}

}
