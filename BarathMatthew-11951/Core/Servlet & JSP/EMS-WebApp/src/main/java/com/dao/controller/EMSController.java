package com.dao.controller;

import java.io.IOException;

import java.util.List;

import com.ems.dao.EmployeeDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.bean.Employee;


/**
 * Servlet implementation class EMSController
 */
@WebServlet("/EMSController")
public class EMSController extends HttpServlet {
	
	EmployeeDAO dao = new EmployeeDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String requestForm = request.getParameter("ems_button");

		if(requestForm.equals("Insert Employee")) {
			int id = Integer.parseInt(request.getParameter("eid"));
			String name = request.getParameter("ename");
			int salary = Integer.parseInt(request.getParameter("esalary"));
			int dno =Integer.parseInt(request.getParameter("edno"));
			Employee bean = new Employee(id,name,salary,dno);
			
			int n = dao.insertEmployee(bean);
			
			if (n==1) {
				response.sendRedirect("InsertEmployeeSuccess.jsp");
			}
			else {
				response.sendRedirect("InsertEmployeeFail.jsp");
			}
		}
		else if(requestForm.equals("Update Employee")) {
			int id = Integer.parseInt(request.getParameter("eid"));
			String name = request.getParameter("ename");
			int salary = Integer.parseInt(request.getParameter("esalary"));
			int dno =Integer.parseInt(request.getParameter("edno"));
			Employee bean = new Employee(id,name,salary,dno);
			
			int n = dao.updateEmployee(bean);
			
			if (n==1) {
				response.sendRedirect("UpdateEmployeeSuccess.jsp");
			}
			else {
				response.sendRedirect("UpdateEmployeeFail.jsp");
			}
		}
		else if(requestForm.equals("Delete Employee")) {
			int id = Integer.parseInt(request.getParameter("eid"));
			int n = dao.deleteEmployee(id);
			if (n==1) {
				response.sendRedirect("DeleteEmployeeSuccess.jsp");
			}
			else {
				response.sendRedirect("DeleteEmployeeFail.jsp");
			}
		}
		else if(requestForm.equals("Find Employee")) {
			int id = Integer.parseInt(request.getParameter("eid"));
			Employee bean = dao.findEmployee(id);
			
			RequestDispatcher rd = request.getRequestDispatcher("FindEmployeeSuccess.jsp");
			request.setAttribute("bean",bean);
			rd.forward(request, response);
			
		}	
	}

	
	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String rid=request.getParameter("id");
        
        List<Employee> list = dao.findAllEmployee();
        
        if(rid.equals("a")) {
        
        RequestDispatcher rd = request.getRequestDispatcher("DeleteEmployee.jsp");
        request.setAttribute("list", list);
        rd.forward(request, response);
        
        }
        if(rid.equals("b")) {
            
        RequestDispatcher rd = request.getRequestDispatcher("FindAllEmployee.jsp");
        request.setAttribute("list", list);
        rd.forward(request, response);
        }
        
        
    }
}