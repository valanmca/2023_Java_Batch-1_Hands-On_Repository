package com.calc;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("button"); 
		String num1= request.getParameter("calc1");
		String num2=request.getParameter("calc2");
		 int x= Integer.parseInt(request.getParameter("num1"));
		 int y=Integer.parseInt(request.getParameter("num2"));

	    if(action.equals("Addition")) {
	    	int sum=x+y;
	        	 RequestDispatcher rd=request.getRequestDispatcher("calc.jsp");
	        	 rd.include(request, response);
	        	 PrintWriter out =response.getWriter();
	        	 out.println("Addition:"+sum);
	        	 
	         }
	    else if(action.equals("subtraction")){
	    	int sum=x-y;
	        	 RequestDispatcher rd=request.getRequestDispatcher("calc.jsp");
	        	 rd.include(request, response);
	        	 PrintWriter out=response.getWriter();
	        	 out.println("subtraction:"+sum);
	         }	
	    else   if(action.equals("Multiplication")){
	    	int sum=x*y;
	       	 RequestDispatcher rd=request.getRequestDispatcher("calc.jsp");
        	 rd.include(request, response);
        	 PrintWriter out=response.getWriter();
        	 out.println("Multiplication:"+sum);
	        }	
	    else if(action.equals("divison")){
	    	int sum=x/y;
       	 RequestDispatcher rd=request.getRequestDispatcher("calc.jsp");
    	 rd.include(request, response);
    	 PrintWriter out=response.getWriter();
    	 out.println("divison:"+sum);
       	 }	
	}
}