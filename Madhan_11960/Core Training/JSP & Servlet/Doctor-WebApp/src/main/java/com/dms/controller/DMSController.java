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

/**
 * Servlet implementation class DMSController
 */
@WebServlet("/DMSController")
public class DMSController extends HttpServlet {
	DoctorDAO dao= new DoctorDAO();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestForm = request.getParameter("dms_button");
		
		if(requestForm.equals("InsertDoctor")) {
			int docId= Integer.parseInt(request.getParameter("doctorId"));
			String docName=request.getParameter("doctorName");
			int docAge=Integer.parseInt(request.getParameter("doctorAge"));
			String docEmail=request.getParameter("doctorEmail");
			String docSpecialist=request.getParameter("doctorSpecialization");
			String docContact=request.getParameter("doctorContact");			
			String docLocation=request.getParameter("doctorLocation");
			
			
			Doctor bean=new Doctor(docId,docName,docAge,docEmail,docSpecialist,docContact,docLocation);
			int n=dao.insertDoctor(bean);
			if(n==1) {
				response.sendRedirect("InsertDoctorSuccess.jsp");
			}
			else {
				response.sendRedirect("InsertDoctorFail.jsp");
			}
		}
		
		if(requestForm.equals("UpdateDoctor")) {
			int docId= Integer.parseInt(request.getParameter("doctorId"));
			String docName=request.getParameter("doctorName");
			int docAge=Integer.parseInt(request.getParameter("doctorAge"));
			String docEmail=request.getParameter("doctorEmail");
			String docSpecialist=request.getParameter("doctorSpecialization");
			String docContact=request.getParameter("doctorContact");			
			String docLocation=request.getParameter("doctorLocation");
			
			
			Doctor bean=new Doctor(docId,docName,docAge,docEmail,docSpecialist,docContact,docLocation);
			int n=dao.updateDoctor(bean);
			if(n==1) {
				response.sendRedirect("UpdateDoctorSuccess.jsp");
			}
			else {
				response.sendRedirect("UpdateDoctorFail.jsp");
			}
		}
		
		if(requestForm.equals("DeleteDoctor")) {
			int docId= Integer.parseInt(request.getParameter("doctorId"));
			
			
			int n=dao.deleteDoctor(docId);
			
			if(n==1) {
				response.sendRedirect("DeleteDoctorSuccess.jsp");
			}
			else {
				response.sendRedirect("DeleteDoctorFail.jsp");
			}
		}
		if(requestForm.equals("FindDoctor")) {
			int docId= Integer.parseInt(request.getParameter("doctorId"));
			
			
			Doctor bean=dao.findDoctor(docId);
			
			RequestDispatcher rd=request.getRequestDispatcher("FindDoctorSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);
			
		}
				
	}
	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value=request.getParameter("id");
		String value1=request.getParameter("id1");
		
		List<Doctor> list = dao.findAllDoctor();
		
		if(value1==null)
		{
		RequestDispatcher rd=request.getRequestDispatcher("DeleteDoctor.jsp");
		request.setAttribute("list", list);
		rd.forward(request, response);
		}
		
		if(value==null)
		{
		RequestDispatcher rd=request.getRequestDispatcher("FindAllDoctor.jsp");
		request.setAttribute("list", list);
		rd.forward(request, response);
		}
	}

}


