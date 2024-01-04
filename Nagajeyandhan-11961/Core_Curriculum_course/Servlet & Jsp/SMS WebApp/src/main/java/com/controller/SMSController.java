package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Student;
import com.dao.StudentDAO;

@WebServlet("/SMSController")
public class SMSController extends HttpServlet {
	
	StudentDAO dao = new StudentDAO();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestFrom = request.getParameter("sms_button");
		
		if(requestFrom.equals("InsertStudent")) {
		
			int rollNo = Integer.parseInt(request.getParameter("rno"));
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String section = request.getParameter("section");
			String location = request.getParameter("location");
			
			Student bean = new Student(rollNo, name, email, section,location);
			int n = dao.insertStudent(bean);
			
			if(n==1) {
				response.sendRedirect("InsertSuccess.jsp");
			}else {
				response.sendRedirect("InsertFailure.jsp");
			}
		}
		
		if(requestFrom.equals("UpdateStudent")) {
			
			int rollNo = Integer.parseInt(request.getParameter("rno"));
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String section = request.getParameter("section");
			String location = request.getParameter("location");
			
			Student bean = new Student(rollNo, name, email, section,location);
			int n = dao.updateStudent(bean);
			
			if(n==1) {
				response.sendRedirect("UpdateSuccess.jsp");
			}else {
				response.sendRedirect("UpdateFailure.jsp");
			}
		}
		
		if(requestFrom.equals("DeleteStudent")) {
			
			int rollNo = Integer.parseInt(request.getParameter("rno"));
			
			int n = dao.deleteStudent(rollNo);
			
			if(n==1) {
				response.sendRedirect("DeleteSuccess.jsp");
			}else {
				response.sendRedirect("DeleteFailure.jsp");
			}
		}
		
		if(requestFrom.equals("FindStudent")) {
			
			int rollNo = Integer.parseInt(request.getParameter("rno"));
			
			Student bean = dao.findStudent(rollNo);
			
			RequestDispatcher rd = request.getRequestDispatcher("FindSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);
		}
	}
	 @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String s= request.getParameter("id");
		 	List<Student> list= dao.findAllStudent();
		        
		        if(s==null) {
		        	RequestDispatcher rd = request.getRequestDispatcher("ViewStudents.jsp");
					request.setAttribute("list",list);
					rd.forward(request, response);
		        }
		        else {
		        RequestDispatcher rd = request.getRequestDispatcher("Delete.jsp");
		        request.setAttribute("list", list);
		        rd.forward(request, response);
		        }
	}
}
