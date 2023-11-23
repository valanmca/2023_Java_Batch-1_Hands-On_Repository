package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Maths")
public class Maths extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action=request.getParameter("button");
                           
    if(action.equals("Addition")) {
        	 RequestDispatcher rd=request.getRequestDispatcher("clac.jsp");
             rd.forward(request, response);
         }
    if(action.equals("Factorial")){
        	 RequestDispatcher rd=request.getRequestDispatcher("Factorial.jsp");
        	 rd.forward(request,response);
        	 
         }	
	}
}
