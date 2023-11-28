package com.sms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.bean.StudentBean;
import com.sms.dao.StudentDAO;

/**
 * Servlet implementation class SmsControllerServlet
 */
@WebServlet("/SmsControllerServlet")
public class SmsControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	StudentDAO dao = new StudentDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String operation = request.getParameter("sms_button");
		StudentDAO dao = new StudentDAO();

		if (operation.equals("Insert Student")) {
			int id = Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");
			String dept = request.getParameter("sdept");
			
			StudentBean bean = new StudentBean(id, name, dept);
			int n = dao.insertStudent(bean);

			if (n == 1)
				response.sendRedirect("InsertSuccess.jsp");
			else
				response.sendRedirect("InsertFail.jsp");
		}
		// update
		if (operation.equals("Update Student")) {
			int id = Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");
			String dept = request.getParameter("sdept");
			
			StudentBean bean = new StudentBean(id, name, dept);
			int n = dao.updateStudent(bean);

			if (n == 1)
				response.sendRedirect("UpdateSuccess.jsp");
			else
				response.sendRedirect("UpdateFail.jsp");
		}

		// delete
		if (operation.equals("Delete Student")) {
			int id = Integer.parseInt(request.getParameter("sid"));

			int n = dao.deleteStudent(id);

			if (n == 1)
				response.sendRedirect("DeleteSuccess.jsp");
			else
				response.sendRedirect("DeleteFail.jsp");
		}
		// search/find
		if (operation.equals("Search Student")) {
			int id = Integer.parseInt(request.getParameter("sid"));

			StudentBean bean = dao.findStudent(id);

			RequestDispatcher rd = request.getRequestDispatcher("SearchSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);

		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<StudentBean> list = dao.viewStudent();
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("ViewAll.jsp");
		rd.forward(request, response);
	}
}
