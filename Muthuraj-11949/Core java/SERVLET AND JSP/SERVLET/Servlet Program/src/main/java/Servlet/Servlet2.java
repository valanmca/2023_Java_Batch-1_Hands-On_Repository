package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response, String lastName) throws ServletException, IOException {

		ServletConfig config=getServletConfig();
		String lastName1 =config.getInitParameter("lname");
		
		PrintWriter out=response.getWriter();
		out.println("Last name:" +lastName1);
		out.close();
		}
	
	}


