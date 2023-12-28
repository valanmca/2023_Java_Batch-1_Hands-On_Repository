package com.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.student.bean.Student;
import com.student.dao.StudentDAO;

/**
 * Servlet implementation class SMScontroller
 */
@WebServlet("/SMScontroller")
public class SMScontroller extends HttpServlet {
	StudentDAO dao = new StudentDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestFrom = request.getParameter("sms_button");

		if (requestFrom.equals("Insert Student")) {

			int rno = Integer.parseInt(request.getParameter("srno"));
			String name = request.getParameter("sname");
			String email = request.getParameter("semail");
			String section = request.getParameter("ssec");
			String location = request.getParameter("sloc");

			Student bean = new Student(rno, name, email, section, location);
			int n = dao.insertStudent(bean);
			if (n == 1) {
				response.sendRedirect("InsertStudentSuccess.jsp");
			} else {
				response.sendRedirect("InsertStudentFail.jsp");
			}
		}
		if (requestFrom.equals("Update Student")) {
			int rno = Integer.parseInt(request.getParameter("srno"));
			String name = request.getParameter("sname");
			String email = request.getParameter("semail");
			String section = request.getParameter("ssec");
			String location = request.getParameter("sloc");

			Student bean = new Student(rno, name, email, section, location);
			int n = dao.updateStudent(bean);
			if (n == 1) {
				response.sendRedirect("UpdateStudentSuccess.jsp");
			} else {
				response.sendRedirect("UpdateStudentFail.jsp");
			}

		}
		if (requestFrom.equals("Delete Student")) {
			int id = Integer.parseInt(request.getParameter("srno"));

			int n = dao.deleteStudent(id);

			if (n == 1) {
				response.sendRedirect("DeleteStudentSuccess.jsp");
			} else {
				response.sendRedirect("DeleteStudentFail.jsp");
			}

		}
		if (requestFrom.equals("Find Student")) {

			int id = Integer.parseInt(request.getParameter("srno"));

			Student bean = dao.findStudent(id);

			RequestDispatcher rd = request.getRequestDispatcher("FindStudentSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);

		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String rid = request.getParameter("id");
		String rid1 = request.getParameter("id1");
		String rid2 = request.getParameter("id2");

		List<Student> list = dao.findallStudent();

		if (rid1 == null && rid2 == null) {

			RequestDispatcher rd = request.getRequestDispatcher("DeleteStudent.jsp");
			request.setAttribute("list", list);
			rd.forward(request, response);

		}
		if (rid == null && rid2 == null) {

			RequestDispatcher rd = request.getRequestDispatcher("FindAllStudent.jsp");
			request.setAttribute("list", list);
			rd.forward(request, response);
		}

		if (rid == null && rid1 == null) {

			RequestDispatcher rd = request.getRequestDispatcher("FindStudent.jsp");
			request.setAttribute("list", list);
			rd.forward(request, response);
		}

	}

}
