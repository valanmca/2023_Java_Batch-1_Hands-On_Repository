package com.sms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.bean.StudentServ;
import com.sms.dao.StudentDAO;

@WebServlet("/SMSController")
public class SMSController extends HttpServlet {

	StudentDAO dao = new StudentDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestFrom = request.getParameter("sms_button");

		if (requestFrom.equals("Insert Student")) {
			int id = Integer.parseInt(request.getParameter("StuId"));
			String name = request.getParameter("StuName");
			String depart = request.getParameter("StuDepart");

			StudentServ bean = new StudentServ(id, name, depart);
			int n = dao.insertStudent(bean);

			if (n == 1) {
				response.sendRedirect("InsertStudentSuccess.jsp");
			} else {
				response.sendRedirect("InsertStudentFail.jsp");
			}

		}

		if (requestFrom.equals("Update Student")) {
			int id = Integer.parseInt(request.getParameter("StuId"));
			String name = request.getParameter("StuName");
			String depart = request.getParameter("StuDepart");

			StudentServ bean = new StudentServ(id, name, depart);
			int n = dao.updateStudent(bean);

			if (n == 1) {
				response.sendRedirect("UpdateStudentSuccess.jsp");
			} else {
				response.sendRedirect("UpdateStudentFail.jsp");
			}

		}
		if (requestFrom.equals("Delete Student")) {
			int id = Integer.parseInt(request.getParameter("StuId"));

			int n = dao.deleteStudent(id);

			if (n == 1) {
				response.sendRedirect("DeleteStudentSuccess.jsp");
			} else {
				response.sendRedirect("DeleteStudentFail.jsp");
			}

		}

		if (requestFrom.equals("Find Student")) {
			int id = Integer.parseInt(request.getParameter("StuId"));

			StudentServ bean = dao.findStudent(id);

			RequestDispatcher rd = request.getRequestDispatcher("FindStudentSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);

		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String requestfrom = request.getParameter("delete");
		if (requestfrom == null) {
			List<StudentServ> list = dao.findAllStudent();
			request.setAttribute("list", list);
			RequestDispatcher rd = request.getRequestDispatcher("FindAll.jsp");
			rd.forward(request, response);

		} else {

			List<StudentServ> list = dao.findAllStudent();
			request.setAttribute("msg", list);
			RequestDispatcher rd = request.getRequestDispatcher("DeleteStudent.jsp");
			rd.forward(request, response);
		}
	}

}
