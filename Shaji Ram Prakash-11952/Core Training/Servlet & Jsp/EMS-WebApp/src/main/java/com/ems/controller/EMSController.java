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

/**
 * Servlet implementation class EMSController
 */
@WebServlet("/EMSController")
public class EMSController extends HttpServlet {
	
	EmployeeDAO dao = new EmployeeDAO();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestFrom = request.getParameter("ems_button");
		
		if(requestFrom.equals("InsertEmployee")) {
			int id = Integer.parseInt(request.getParameter("Id"));
			String name = request.getParameter("ename");
			int salary = Integer.parseInt(request.getParameter("eSalary"));
			int deptNo = Integer.parseInt(request.getParameter("deptNo"));
			
			Employee bean = new Employee(id, name, salary, deptNo);
			int n = dao.insertEmployee(bean);
			
			if(n==1) {
				response.sendRedirect("InsertEmployeeSuccess.jsp");
			}else {
				response.sendRedirect("InsertEmployeeFail.jsp");
			}
		}
		
		if(requestFrom.equals("UpdateEmployee")) {
			int id = Integer.parseInt(request.getParameter("Id"));
			String name = request.getParameter("ename");
			int salary = Integer.parseInt(request.getParameter("eSalary"));
			int deptNo = Integer.parseInt(request.getParameter("deptNo"));
			
			Employee bean = new Employee(id, name, salary, deptNo);
			int n = dao.updateEmployee(bean);
			
			if(n==1) {
				response.sendRedirect("UpdateEmployeeSuccess.jsp");
			}else {
				response.sendRedirect("UpdateEmployeeFail.jsp");
			}
		}
		
		if(requestFrom.equals("DeleteEmployee")) {
			int id = Integer.parseInt(request.getParameter("eid"));
			int n = dao.deleteEmployee(id);
			
			if(n==1) {
				response.sendRedirect("DeleteEmployeeSuccess.jsp");
			}else {
				response.sendRedirect("DeleteEmployeeFail.jsp");
			}
		}
		
		if(requestFrom.equals("FindEmployee")) {
			int id = Integer.parseInt(request.getParameter("eid"));
			Employee bean = dao.findEmployee(id);
			
			RequestDispatcher rd = request.getRequestDispatcher("FindEmployeeFail.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);
			
		}
	}
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			List<Employee> list = dao.findAllEmployee();
			
//			RequestDispatcher rd = req.getRequestDispatcher("FindAllEmployee.jsp");
//			req.setAttribute("list", list);
//			rd.forward(req, resp);
			
			String rid=req.getParameter("del");
			String rid1=req.getParameter("find");
			String rid2=req.getParameter("findAll");
			
			if(rid1==null && rid2==null) {
		        
		        RequestDispatcher rd = req.getRequestDispatcher("DeleteEmployee.jsp");
		        req.setAttribute("list", list);
		        rd.forward(req, resp);
		        
		        }
		        if(rid==null && rid1==null) {
		            
		        RequestDispatcher rd = req.getRequestDispatcher("FindAllEmployee.jsp");
		        req.setAttribute("list", list);
		        rd.forward(req, resp);
		        }
		        
		        if(rid==null && rid2==null) {
		            
		        RequestDispatcher rd = req.getRequestDispatcher("FindEmployee.jsp");
		        req.setAttribute("list", list);
		        rd.forward(req, resp);
		        }
			
		}

}
