package com.ems.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.bean.Student;
import com.ems.dao.StudentDAO;

@WebServlet("/EMS_Servlet")
public class EMS_Servlet extends HttpServlet {
	StudentDAO dao = new StudentDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String requestFrom = request.getParameter("sms_button");

		if (requestFrom.equals("Insert Student")) {
			int id = Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");
			String section = request.getParameter("ssection");

			Student bean = new Student(id, name, section);
			int n = dao.insertStudent(bean);

			if (n == 1) {
				response.sendRedirect("InsertStudentSuccess.jsp");
			} else {
				response.sendRedirect("InsertStudentFail.jsp");

			}
		}

		if (requestFrom.equals("Update Student")) {
			int id = Integer.parseInt(request.getParameter("sid"));
			String name = request.getParameter("sname");
			String section = request.getParameter("ssection");

			Student bean = new Student(id, name, section);
			int n = dao.updateStudent(bean);

			if (n == 1) {
				response.sendRedirect("UpdateStudentSuccess.jsp");
			} else {
				response.sendRedirect("UpdateStudentFail.jsp");

			}
		}

		if (requestFrom.equals("Delete Student")) {
			int id = Integer.parseInt(request.getParameter("sid"));

			int n = dao.deleteStudent(id);

			if (n == 1) {
				response.sendRedirect("DeleteStudentSuccess.jsp");
			} else {
				response.sendRedirect("DeleteStudentFail.jsp");

			}
		}

		if (requestFrom.equals("Find Student")) {
			int id = Integer.parseInt(request.getParameter("sid"));

			Student bean = dao.findStudent(id);

			RequestDispatcher rd = request.getRequestDispatcher("FindStudentSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);
		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Student> list = dao.findAllStudents();
		RequestDispatcher rd = request.getRequestDispatcher("FindAll.jsp");
		request.setAttribute("list", list);
		rd.forward(request, response);
	}
}
