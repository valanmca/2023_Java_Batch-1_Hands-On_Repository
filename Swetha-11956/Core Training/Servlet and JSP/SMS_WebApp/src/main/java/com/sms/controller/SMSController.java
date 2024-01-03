package com.sms.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

/**
 * Servlet implementation class SMSController
 */
@WebServlet("/SMSController")

public class SMSController extends HttpServlet {
	
	StudentDAO dao=new StudentDAO();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestFrom=request.getParameter("sms_button");
		
		if(requestFrom.equals("Insert Student")) {
			int rno=Integer.parseInt(request.getParameter("sid"));
			String name= request.getParameter("sname");
			String dept=request.getParameter("sdept");
			
			Student bean= new Student(rno,name,dept);
			int n=dao.InsertStudent(bean);
			if(n==1) {
				response.sendRedirect("InsertStudentSuccess.jsp");
			}
			else {
				response.sendRedirect("InsertStudentFail.jsp");
			}
		}
		
		if(requestFrom.equals("Delete Student")) {
			
			int rno=Integer.parseInt(request.getParameter("sid"));
			int n=dao.DeleteStudent(rno);
			if(n==1) {
				response.sendRedirect("DeleteStudentSuccess.jsp");
			}
			else {
				response.sendRedirect("DeleteStudentFail.jsp");
			}
		}
		if(requestFrom.equals("Update Student")) {
			int rno=Integer.parseInt(request.getParameter("sid"));
			String name=request.getParameter("sname");
			String dept=request.getParameter("sdept");
			
			Student bean=new Student(rno,name,dept);
			int n=dao.UpdateStudent(bean);
			
			if(n==1) {
				response.sendRedirect("UpdateStudentSuccess.jsp");
				
			}
			else {
				response.sendRedirect("UpdateStudentFail.jsp");
			}
			
		}
		if(requestFrom.equals("Find Student")) {
			
			int rno=Integer.parseInt(request.getParameter("sid"));
			
			Student bean=dao.findStudent(rno);
			
			RequestDispatcher rd=request.getRequestDispatcher("FindingSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);
		}
	}
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
			String value=request.getParameter("id");
	        String value1=request.getParameter("id1");
	        
	        List<Student> list = dao.findAllStudent();
	        
	        if(value1==null)
	        {
	        RequestDispatcher rd=request.getRequestDispatcher("DeleteStudent.jsp");
	        request.setAttribute("list", list);
	        rd.forward(request, response);
	        }
	        
	        if(value==null)
	        {
	        RequestDispatcher rd=request.getRequestDispatcher("FindAllStudentSuccess.jsp");
	        request.setAttribute("list", list);
	        rd.forward(request, response);
	        }
	    }
		
		
		
	

}
