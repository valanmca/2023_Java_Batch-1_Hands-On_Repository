package com.sms.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.sms.bean.Students;
import com.sms.dao.StudentDAO;

/**
 * Servlet implementation class SMSController
 */
@WebServlet("/SMSController")
public class SMSController extends HttpServlet {

	StudentDAO dao = new StudentDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestFrom = request.getParameter("sms_button");

		if (requestFrom.equals("Insert Student")) {

			int id = Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");

			Students bean = new Students(id, name);
			int n = dao.InsertStudent(bean);

			if (n == 1) {
				response.sendRedirect("InsertSuccessPage.jsp");
			} else {
				response.sendRedirect("InsertFailPage.jsp");
			}

		}

		if (requestFrom.equals("Delete Student")) {

			int id = Integer.parseInt(request.getParameter("sid"));

			int n = dao.deleteStudent(id);

			if (n == 1) {
				response.sendRedirect("DeleteSuccessPage.jsp");
			} else {
				response.sendRedirect("DeleteFailPage.jsp");
			}

		}

		if (requestFrom.equals("Update Student")) {

			int id = Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");

			Students bean = new Students(id, name);
			int n = dao.updateStudent(bean);

			if (n == 1) {
				response.sendRedirect("UpdateSuccessPage.jsp");
			} else {
				response.sendRedirect("UpdateFailPage.jsp");
			}

		}

		if (requestFrom.equals("Find Student")) {

			int id = Integer.parseInt(request.getParameter("sid"));

			Students bean = dao.findStudent(id);

			RequestDispatcher rd = request.getRequestDispatcher("FindSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);

		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Students> list = new LinkedList<Students>();

		list = dao.findAllStudent();

		RequestDispatcher rd = request.getRequestDispatcher("FindAllStudents.jsp");

		request.setAttribute("list", list);
		rd.forward(request, response);
	}

}
