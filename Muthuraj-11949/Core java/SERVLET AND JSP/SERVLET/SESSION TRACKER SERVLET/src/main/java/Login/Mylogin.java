package Login;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Mylogin")
public class Mylogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String userName=request.getParameter("uname");
      
      
      
      PrintWriter out=response.getWriter();
      out.print("<h1 style='color' : green;>");
      out.println("<br><p align='right'>Welcome"+userName +"</p>");
      out.println("<br><br> This is "+  userName +"Inbox page");
      out.println("</h1>");
      out.println("<br><a href='SendServlet'>Click here to go to Sent Items Page</a>");
      out.close();
      
      /*//writing user data into the session
      HttpSession session=request.getSession();
      session.setAttribute("userName", userName);
      */
      ///Writing user data into the cookie
    
      Cookie cookie=new Cookie("UserName",userName);
      response.addCookie(cookie);    
	}
}
