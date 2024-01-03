package com.ems.controller;

import java.io.IOException;
import java.util.ArrayList;

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
	
	EmployeeDAO dao=new EmployeeDAO();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestFrom=request.getParameter("ems_button");
		
		
		if(requestFrom.equals("Insert Employee")) {
			
			int id=Integer.parseInt(request.getParameter("eid"));
			String name=request.getParameter("ename");
			int salary=Integer.parseInt(request.getParameter("esalary"));
			int dno=Integer.parseInt(request.getParameter("edno"));
			
			Employee bean=new Employee(id,name,salary,dno);
			int n=dao.insertEmployee(bean);
			
			if(n==1) {
				response.sendRedirect("InsertEmployeeSuccess.jsp");
				
			}
			else {
				response.sendRedirect("InsertEmployeeFail.jsp");
			}
			
		}
if(requestFrom.equals("Update Employee")) {
			
			int id=Integer.parseInt(request.getParameter("eid"));
			String name=request.getParameter("ename");
			int salary=Integer.parseInt(request.getParameter("esalary"));
			int dno=Integer.parseInt(request.getParameter("edno"));
			
			Employee bean=new Employee(id,name,salary,dno);
			int n=dao.updateEmployee(bean);
			
			if(n==1) {
				response.sendRedirect("UpdateEmployeeSuccess.jsp");
				
			}
			else {
				response.sendRedirect("UpdateEmployeeFail.jsp");
			}
			
		}


if(requestFrom.equals("Delete Employee")) {
	
	int id=Integer.parseInt(request.getParameter("eid"));
	
	
	
	int n=dao.deleteEmployee(id);
	
	if(n==1) {
		response.sendRedirect("DeleteEmployeeSuccess.jsp");
		
	}
	else {
		response.sendRedirect("DeleteEmployeeFail.jsp");
	}
	
}

if(requestFrom.equals("Find Employee")) {
	
	int id=Integer.parseInt(request.getParameter("eid"));
	
	Employee bean=dao.findEmployee(id);
	
	RequestDispatcher rd=request.getRequestDispatcher("FindEmployeeSuccess.jsp");
	request.setAttribute("bean", bean);
	rd.forward(request, response);
	
}
			
		
		
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Employee> list = dao.findAllEmployee();

        RequestDispatcher rd = request.getRequestDispatcher("FindAllEmployeeSuccess.jsp");
        request.setAttribute("list", list);
        rd.forward(request, response);
    }
}
