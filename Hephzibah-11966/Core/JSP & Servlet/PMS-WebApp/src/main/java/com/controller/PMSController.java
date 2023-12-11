package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Patient;
import com.dao.PatientDAO;


@WebServlet("/PMSController")
public class PMSController extends HttpServlet {
	PatientDAO dao= new PatientDAO();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestForm = request.getParameter("pms_button");
		
		if(requestForm.equals("InsertPatient")) {
			int Id= Integer.parseInt(request.getParameter("Id"));
			String Name=request.getParameter("Name");
			int Age=Integer.parseInt(request.getParameter("Age"));
			String Email=request.getParameter("Email");
			String BloodGroup=request.getParameter("BloodGroup");
			String Location=request.getParameter("Location");
			
			Patient bean=new Patient(Id,Name,Age,Email,BloodGroup,Location);
			int n=dao.insertPatient(bean);
			if(n==1) {
				response.sendRedirect("InsertPatientSuccess.jsp");
			}
			else {
				response.sendRedirect("InsertPatientFail.jsp");
			}
		}
		
		if(requestForm.equals("UpdatePatient")) {
			int Id= Integer.parseInt(request.getParameter("Id"));
			String Name=request.getParameter("Name");
			int Age=Integer.parseInt(request.getParameter("Age"));
			String Email=request.getParameter("Email");
			String BloodGroup=request.getParameter("BloodGroup");
			String Location=request.getParameter("Location");
			
			Patient bean=new Patient(Id,Name,Age,Email,BloodGroup,Location);
			int n=dao.updatePatient(bean);
			if(n==1) {
				response.sendRedirect("UpdatePatientSuccess.jsp");
			}
			else {
				response.sendRedirect("UpdatePatientFail.jsp");
			}
		}
		if(requestForm.equals("DeletePatient")) {
			int Id= Integer.parseInt(request.getParameter("Id"));
			
			
			int n=dao.deletePatient(Id);
			
			if(n==1) {
				response.sendRedirect("DeletePatientSuccess.jsp");
			}
			else {
				response.sendRedirect("DeletePatientFail.jsp");
			}
		}
		if(requestForm.equals("FindPatient")) {
			int Id= Integer.parseInt(request.getParameter("Id"));
			
			
			Patient bean=dao.findPatient(Id);
			
			RequestDispatcher rd=request.getRequestDispatcher("FindPatientSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);
			
		}
				
	}
	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value=request.getParameter("auto");
        String value1=request.getParameter("auto1");
        
        List<Patient> list = dao.findAllPatient();
        
        if(value1==null)
        {
        RequestDispatcher rd=request.getRequestDispatcher("DeletePatient.jsp");
        request.setAttribute("list", list);
        rd.forward(request, response);
        }
        
        if(value==null)
        {
        RequestDispatcher rd=request.getRequestDispatcher("FindAllPatient.jsp");
        request.setAttribute("list", list);
        rd.forward(request, response);
        }
		}

}
