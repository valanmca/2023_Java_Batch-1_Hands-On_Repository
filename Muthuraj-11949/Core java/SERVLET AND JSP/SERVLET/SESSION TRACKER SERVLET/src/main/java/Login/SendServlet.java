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


@WebServlet("/SendServlet")
public class SendServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			/*HttpSession session=request.getSession();	
			String userName=session.getAttribute("userName").toString();
	    	*/
			
            //Reading user data from the cookie
			
			Cookie cokkies[]=request.getCookies();
			String userName=cokkies[0].getValue();
			System.out.println(cokkies.length);


		      PrintWriter out=response.getWriter();
		      out.print("<h1 style=color : green;>Welcome"+userName +" </h1>");
		      //out.println("<br><p >Welcome"+userName +"</p>");
		      out.println("<br>This is "+  userName +"Sent Item page");
		     // out.println("</h1>");
		      out.println("<br><a href='Inbox'>Click here to go to Inbox Page</a>");
		      out.close();
		}
}
