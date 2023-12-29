package com.dao.controller;

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
	StudentDAO dao = new StudentDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String requestForm = request.getParameter("stu_button");

		if(requestForm.equals("Insert Student")) {
			int sid = Integer.parseInt(request.getParameter("sid"));
			String sname = request.getParameter("sname");
			int sclass = Integer.parseInt(request.getParameter("sclass"));
			String gender =request.getParameter("gender");
			Student bean = new Student(sid,sname,sclass,gender);
			
			int n = dao.insertStudent(bean);
			
			if (n==1) {
				response.sendRedirect("InsertStudentSuccess.jsp");
			}
			else {
				response.sendRedirect("InsertStudentFail.jsp");
			}
		}
		else if(requestForm.equals("Update Student")) {
			int sid = Integer.parseInt(request.getParameter("sid"));
			String sname = request.getParameter("sname");
			int sclass = Integer.parseInt(request.getParameter("sclass"));
			String gender =request.getParameter("gender");
			Student bean = new Student(sid,sname,sclass,gender);
			
			int n = dao.updateStudent(bean);
			
			if (n==1) {
				response.sendRedirect("UpdateStudentSuccess.jsp");
			}
			else {
				response.sendRedirect("UpdateStudentFail.jsp");
			}
		}
		
		
		
//		else if(requestForm.equals("Delete Employee")) {
//			int id = Integer.parseInt(request.getParameter("eid"));
//			int n = dao.deleteEmployee(id);
//			if (n==1) {
//				response.sendRedirect("DeleteEmployeeSuccess.jsp");
//			}
//			else {
//				response.sendRedirect("DeleteEmployeeFail.jsp");
//			}
//		}
//		else if(requestForm.equals("Find Employee")) {
//			int id = Integer.parseInt(request.getParameter("eid"));
//			Employee bean = dao.findEmployee(id);
//			
//			RequestDispatcher rd = request.getRequestDispatcher("FindEmployeeSuccess.jsp");
//			request.setAttribute("bean",bean);
//			rd.forward(request, response);
//			
//		}	
//	}
//
//	
//	@Override
//		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//        String rid=request.getParameter("id");
//        String rid1=request.getParameter("id1");
//        
//        List<Employee> list = dao.findAllEmployee();
//        
//        if(rid1==null) {
//        
//        RequestDispatcher rd = request.getRequestDispatcher("DeleteEmployee.jsp");
//        request.setAttribute("list", list);
//        rd.forward(request, response);
//        
//        }
//        if(rid==null) {
//            
//        RequestDispatcher rd = request.getRequestDispatcher("FindAllEmployee.jsp");
//        request.setAttribute("list", list);
//        rd.forward(request, response);
//        }
        
        
    }
}
