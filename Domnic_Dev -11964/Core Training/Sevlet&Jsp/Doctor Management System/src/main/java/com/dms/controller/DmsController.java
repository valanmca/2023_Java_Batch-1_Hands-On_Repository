package com.dms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dms.bean.Doctor;
import com.dms.dao.DoctorDAO;



@WebServlet("/DmsController")
public class DmsController extends HttpServlet {
	DoctorDAO dao = new DoctorDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestFrom = request.getParameter("dms_button");

		if (requestFrom.equals("Insert Doctor")) {
			int id = Integer.parseInt(request.getParameter("did"));
			String name = request.getParameter("dname");
			int age = Integer.parseInt(request.getParameter("dage"));
			String email = request.getParameter("demail");
			String spec = request.getParameter("dspec");
			int phno = Integer.parseInt(request.getParameter("dphno"));
			String loc = request.getParameter("dloc");

			Doctor bean = new Doctor(id, name, age, email, spec, phno, loc);
			int n = dao.insertDoctor(bean);

			if (n == 1) {
				response.sendRedirect("InsertDoctorSuccess.jsp");
			} else {
				response.sendRedirect("InsertDoctorFail.jsp");

			}

		}
		
		if (requestFrom.equals("Delete Doctor")) {
			int id = Integer.parseInt(request.getParameter("did"));

			int n = dao.deleteDoctor(id);

			if (n == 1) {
				response.sendRedirect("DeleteDoctorSuccess.jsp");
			} else {
				response.sendRedirect("DeleteDoctorFail.jsp");

			}
		}
		

		if (requestFrom.equals("Update Doctor")) {
			int id = Integer.parseInt(request.getParameter("did"));
			String name = request.getParameter("dname");
			int age = Integer.parseInt(request.getParameter("dage"));
			String email = request.getParameter("demail");
			String spec = request.getParameter("dspec");
			int phno = Integer.parseInt(request.getParameter("dphno"));
			String loc = request.getParameter("dloc");

			Doctor bean = new Doctor(id, name, age, email, spec, phno, loc);
			int n = dao.updateDoctor(bean);

			if (n == 1) {
				response.sendRedirect("UpdateDoctorSuccess.jsp");
			} else {
				response.sendRedirect("UpdatetDoctorFail.jsp");

			}

		}
		
		if (requestFrom.equals("Find Doctor")) {
			int id = Integer.parseInt(request.getParameter("did"));

			Doctor bean = dao.findDoctor(id);

			RequestDispatcher rd = request.getRequestDispatcher("FindDoctorSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);
		}
		
		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String s1=request.getParameter("delete")	;
		
		
		
		if(s1==null) {
			List<Doctor> list = dao.findAllDoctors();
			
			RequestDispatcher rd = request.getRequestDispatcher("FindAllDoctors.jsp");
			request.setAttribute("list", list);
			rd.forward(request, response);
			
			
			
		}
		else
		{
			
			List<Doctor> list = dao.findAllDoctors();
			RequestDispatcher rd1=request.getRequestDispatcher("DeleteDoctor.jsp");
			
			request.setAttribute("list", list);
			rd1.forward(request, response);
		}
		
		
		
		
	}

	

}
