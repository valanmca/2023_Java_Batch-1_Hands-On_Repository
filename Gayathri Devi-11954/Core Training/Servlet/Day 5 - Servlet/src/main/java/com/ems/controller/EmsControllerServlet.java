package com.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.bean.EmployeeBean;
import com.ems.dao.EmployeeDAO;

/**
 * Servlet implementation class EmsControllerServlet
 */
@WebServlet("/EmsControllerServlet")
public class EmsControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	EmployeeDAO dao = new EmployeeDAO();
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String operation = request.getParameter("ems_button");
		EmployeeDAO dao = new EmployeeDAO();

		if (operation.equals("Insert Employee")) {
			int id = Integer.parseInt(request.getParameter("eid"));
			String name = request.getParameter("ename");
			String dept = request.getParameter("edept");
			int salary = Integer.parseInt(request.getParameter("esalary"));

			EmployeeBean bean = new EmployeeBean(id, name, dept, salary);
			int n = dao.insert(bean);

			if (n == 1)
				response.sendRedirect("InsertSuccess.jsp");
			else
				response.sendRedirect("InsertFail.jsp");
		}
		// update
		if (operation.equals("Update Employee")) {
			int id = Integer.parseInt(request.getParameter("eid"));
			String name = request.getParameter("ename");
			String dept = request.getParameter("edept");
			int salary = Integer.parseInt(request.getParameter("esalary"));

			EmployeeBean bean = new EmployeeBean(id, name, dept, salary);
			int n = dao.update(bean);

			if (n == 1)
				response.sendRedirect("UpdateSuccess.jsp");
			else
				response.sendRedirect("UpdateFail.jsp");
		}

		// delete
		if (operation.equals("Delete Employee")) {
			int id = Integer.parseInt(request.getParameter("eid"));

			int n = dao.delete(id);

			if (n == 1)
				response.sendRedirect("DeleteSuccess.jsp");
			else
				response.sendRedirect("DeleteFail.jsp");
		}
		// search/find
		if (operation.equals("Search Employee")) {
			int id = Integer.parseInt(request.getParameter("eid"));

			EmployeeBean bean = dao.find(id);
			
			RequestDispatcher rd = request.getRequestDispatcher("SearchSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);

		}
		
	}
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<EmployeeBean> list = dao.view();
        request.setAttribute("list", list);
        RequestDispatcher rd = request.getRequestDispatcher("ViewAll.jsp");
        rd.forward(request, response);
    }
}
