package com.ems.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;


@WebServlet("/EMSController")
public class EMSController extends HttpServlet {
	
	EmployeeDAO dao = new EmployeeDAO();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestForm = request.getParameter("ems_button");
		
		
		if(requestForm.equals("InsertEmployee")) {
			int id = Integer.parseInt(request.getParameter("emp_id"));
			String name = request.getParameter("ename");
			int salary = Integer.parseInt(request.getParameter("salary"));
			
			Employee bean = new Employee(id, name, salary);
			int n = dao.insertEmployee(bean);
			if(n==1) {
				response.sendRedirect("InsertEmployeeSuccess.jsp");
				
			}else {
				response.sendRedirect("InsertEmployeeFail.jsp");
				
			}
		}
		if(requestForm.equals("UpdateEmployee")) {
			int id = Integer.parseInt(request.getParameter("emp_id"));
			String name = request.getParameter("ename");
			int salary = Integer.parseInt(request.getParameter("salary"));
			
			Employee bean = new Employee(id, name, salary);
			int n = dao.updateEmployee(bean);
			
			if(n==1) {
				response.sendRedirect("UpdateEmployeeSuccess.jsp");
				
			}else {
				response.sendRedirect("UpdateEmployeeFail.jsp");
				
			}
		}
		
		if(requestForm.equals("DeleteEmployee")) {
			int id = Integer.parseInt(request.getParameter("emp_id"));
			int n = dao.deleteEmployee(id);
			if(n==1) {
				response.sendRedirect("DeleteEmployeeSuccess.jsp");
				
			}else {
				response.sendRedirect("DeleteEmployeeFail.jsp");
				
			}
		}
		
		if(requestForm.equals("FindEmployee")) {
			int id = Integer.parseInt(request.getParameter("emp_id"));
			Employee bean = dao.findEmployee(id);
			
			RequestDispatcher rd = request.getRequestDispatcher("FindEmployeeSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);
			
		}
	}	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> list = dao.findAllEmployee();
		RequestDispatcher rd = request.getRequestDispatcher("FindAllEmployeeSuccess.jsp");
		request.setAttribute("list", list);
		rd.forward(request, response);
	}
}
