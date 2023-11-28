package com.ems.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.model.Employee;
import com.ems.dao.*;

@WebServlet("/EMSController")
public class EMSController extends HttpServlet {
	
	EmployeeDAO dao = new EmployeeDAO();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String requestFrom = request.getParameter("stu_button");
		
		
		if (requestFrom.equals("Insert Employee")) {
			int id = Integer.parseInt(request.getParameter("stuid"));
			String name = request.getParameter("stuname");
			String dep = request.getParameter("studep");

			Employee bean = new Employee(id, name, dep);
			int n = dao.insertEmployee(bean);

			if (n == 1) {
				response.sendRedirect("InsertEmployeeSuccess.jsp");
			} else {
				response.sendRedirect("InsertEmployeeFail.jsp");
			}
		}

		if (requestFrom.equals("Update Employee")) {
			int id = Integer.parseInt(request.getParameter("stuid"));
			String name = request.getParameter("stuname");
			String dep = request.getParameter("studep");

			Employee bean = new Employee(id, name, dep);
			int n = dao.updateEmployee(bean);

			if (n == 1) {
				response.sendRedirect("UpdateEmployeeSuccess.jsp");
			} else {
				response.sendRedirect("UpdateEmployeeFail.jsp");
			}
		}

		if (requestFrom.equals("Delete Employee")) {
			int id = Integer.parseInt(request.getParameter("stuid"));

			int n = dao.deleteEmployee(id);

			if (n == 1) {
				response.sendRedirect("DeleteEmployeeSuccess.jsp");
			} else {
				response.sendRedirect("DeleteEmployeeFail.jsp");
			}
		}

		if (requestFrom.equals("Find Employee")) {
			int id = Integer.parseInt(request.getParameter("stuid"));

			Employee bean = dao.findEmployee(id);

			RequestDispatcher rd = request.getRequestDispatcher("FindEmployeeSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);

		}
		
//		if(requestFrom.equals("FindAll"))
//        {
//            ArrayList<Employee> list1=new ArrayList<Employee>();
//            
//            
//            list1= (ArrayList<Employee>) dao.findAllEmployee();
//            
//            RequestDispatcher rd=request.getRequestDispatcher("FindAllEmployeeSuccess.jsp");
//            
//            request.setAttribute("list", list1);
//            rd.forward(request, response);
//            
//            
//        }

	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ArrayList<Employee> list1=new ArrayList<Employee>();
         
         
         list1= (ArrayList<Employee>) dao.findAllEmployee();
         
         RequestDispatcher rd=request.getRequestDispatcher("FindAllEmployeeSuccess.jsp");
         
         request.setAttribute("list", list1);
         rd.forward(request, response);	
	
	}
}
