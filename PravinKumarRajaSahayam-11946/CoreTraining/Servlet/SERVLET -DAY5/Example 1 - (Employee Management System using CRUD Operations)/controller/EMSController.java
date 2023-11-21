package com.ems.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

/**
 * Servlet implementation class EMSController
 */
@WebServlet("/EMSController")
public class EMSController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestForm = request.getParameter("ems_button");
		EmployeeDAO dao = new EmployeeDAO();
		if(requestForm.equals("Insert Employee"))
		{
			int Employee_id = Integer.parseInt(request.getParameter("eid"));
			String Employee_name = request.getParameter("ename");
			String Employee_department = request.getParameter("edepartment");
			Employee bean = new Employee(Employee_id,Employee_name,Employee_department);
			int n = dao.InsertEmployee(bean);
			if(n == 1)
			{
				response.sendRedirect("InsertEmployeeSuccess.jsp");
			}
			else
			{
				response.sendRedirect("InsertEmployeeFail.jsp");
			}
		}
		if(requestForm.equals("Update Employee"))
		{
			int Employee_id = Integer.parseInt(request.getParameter("eid"));
			String Employee_name = request.getParameter("ename");
			String Employee_department = request.getParameter("edepartment");
			Employee bean = new Employee(Employee_id,Employee_name,Employee_department);
			int n = dao.UpdateEmployee(bean);
			if(n == 1)
			{
				response.sendRedirect("UpdateEmployeeSuccess.jsp");
			}
			else
			{
				response.sendRedirect("UpdateEmployeeFail.jsp");
			}
		}
		if(requestForm.equals("Delete Employee"))
		{
			int Employee_id = Integer.parseInt(request.getParameter("eid"));
			int n = dao.DeleteEmployee(Employee_id);
			if(n == 1)
			{
				response.sendRedirect("DeleteEmployeeSuccess.jsp");
			}
			else
			{
				response.sendRedirect("DeleteEmployeeFail.jsp");
			}
		}
		if(requestForm.equals("Find Employee"))
		{
			int Employee_id = Integer.parseInt(request.getParameter("eid"));
			Employee bean = dao.FindEmployee(Employee_id);
			RequestDispatcher rd = request.getRequestDispatcher("FindEmployeeSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);
			
		}
		if(requestForm.equals("Find All Employee"))
		{
			List<Employee> lists = dao.FindAllEmployee();
			request.setAttribute("lists",lists);
			RequestDispatcher rd = request.getRequestDispatcher("FindAllEmployeeSuccess.jsp");
			rd.forward(request,response);
			
		}
	}

}
