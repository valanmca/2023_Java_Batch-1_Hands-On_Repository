package com.sms.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;


@WebServlet("/SMSController")
public class SMSController extends HttpServlet {
	
	StudentDAO dao=new StudentDAO();
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestForm=request.getParameter("sms");
		
		if(requestForm.equals("Insert Student")) {
			int sRoll=Integer.parseInt(request.getParameter("srollno"));
			String sName=request.getParameter("sname");
			String sEmail=request.getParameter("semail");
			String sSec=request.getParameter("ssec");
			int sStd=Integer.parseInt(request.getParameter("sstd"));
			String sLoc=request.getParameter("sloc");
			
			Student bean=new Student(sRoll,sName,sEmail,sSec,sStd,sLoc);
			int n=dao.insertEmployee(bean);
			
			if(n==1) {
				response.sendRedirect("InsertStudentSuccess.jsp");
			} else {
				response.sendRedirect("InsertStudentFail.jsp");
			}	
		}
		
		if(requestForm.equals("Update Student")) {
			int sRoll=Integer.parseInt(request.getParameter("srollno"));
			String sName=request.getParameter("sname");
			String sEmail=request.getParameter("semail");
			String sSec=request.getParameter("ssec");
			int sStd=Integer.parseInt(request.getParameter("sstd"));
			String sLoc=request.getParameter("sloc");
			
			Student bean=new Student(sRoll,sName,sEmail,sSec,sStd,sLoc);
			int n=dao.updateEmployee(bean);
			
			if(n==1) {
				response.sendRedirect("UpdateStudentSuccess.jsp");
			} else {
				response.sendRedirect("UpdateStudentFail.jsp");
			}
		}
		
		if(requestForm.equals("Delete Student")) {
			int sRoll=Integer.parseInt(request.getParameter("srollno"));
			int n=dao.deleteEmployee(sRoll);
			
			if(n==1) {
				response.sendRedirect("DeleteStudentSuccess.jsp");
			} else {
				response.sendRedirect("DeleteStudentFail.jsp");
			}
		}
		
		if(requestForm.equals("Find Student")) {
			int sRoll=Integer.parseInt(request.getParameter("srollno"));
			
			Student bean = dao.findStudent(sRoll);

			RequestDispatcher rd1 = request.getRequestDispatcher("FindStudentSuccess.jsp");
			request.setAttribute("bean", bean);
			rd1.forward(request, response);
		}
		
	}

   @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String s=request.getParameter("id");
	   
	   List<Student> list=dao.viewAllStudent();
	   
	  if(s.equalsIgnoreCase("a")) {
			  RequestDispatcher rd = request.getRequestDispatcher("DeleteStudent.jsp");
			  request.setAttribute("list", list);
			  rd.forward(request, response);
			  }
	   
	  if(s.equalsIgnoreCase("b")) {
			  RequestDispatcher rd = request.getRequestDispatcher("FindStudent.jsp");
			  request.setAttribute("list", list);
			  rd.forward(request, response);
			  }
	   
	  if(s.equalsIgnoreCase("c")) {
	  RequestDispatcher rd = request.getRequestDispatcher("FindAllStudent.jsp");
	  request.setAttribute("list", list);
	  rd.forward(request, response);
	  }
}

}
	


	
	
