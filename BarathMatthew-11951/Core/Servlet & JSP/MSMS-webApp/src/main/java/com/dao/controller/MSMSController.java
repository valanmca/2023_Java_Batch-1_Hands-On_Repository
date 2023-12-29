package com.dao.controller;

import java.io.IOException;

import java.util.List;


import com.ems.dao.MobileDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.bean.Mobile;

/**
 * Servlet implementation class MSMSController
 */
@WebServlet("/MSMSController")
public class MSMSController extends HttpServlet {
	MobileDAO dao = new MobileDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String requestForm = request.getParameter("mob_button");

		if(requestForm.equals("Insert Mobile")) {
			int mobId = Integer.parseInt(request.getParameter("mid"));
			String brandName = request.getParameter("mname");
			String ModelName = request.getParameter("bname");
			int mobPrice =Integer.parseInt(request.getParameter("mprice"));
			Mobile bean = new Mobile(mobId,brandName,ModelName,mobPrice);
			
			int n = dao.insertMobile(bean);
			
			if (n==1) {
				response.sendRedirect("InsertEmployeeSuccess.jsp");
			}
			else {
				response.sendRedirect("InsertEmployeeFail.jsp");
			}
		}
		else if(requestForm.equals("Update Employee")) {
			int mobId = Integer.parseInt(request.getParameter("eid"));
			String brandName = request.getParameter("ename");
			String ModelName = request.getParameter("esalary");
			int mobPrice =Integer.parseInt(request.getParameter("edno"));
			Mobile bean = new Mobile(mobId,brandName,ModelName,mobPrice);

			int n = dao.updateMobile(bean);
			
			if (n==1) {
				response.sendRedirect("UpdateEmployeeSuccess.jsp");
			}
			else {
				response.sendRedirect("UpdateEmployeeFail.jsp");
			}
		}
		else if(requestForm.equals("Delete Employee")) {
			int id = Integer.parseInt(request.getParameter("eid"));
			int n = dao.deleteMobile(id);
			if (n==1) {
				response.sendRedirect("DeleteEmployeeSuccess.jsp");
			}
			else {
				response.sendRedirect("DeleteEmployeeFail.jsp");
			}
		}
		else if(requestForm.equals("Find Employee")) {
			int id = Integer.parseInt(request.getParameter("eid"));
			Mobile bean = dao.findMobile(id);
			RequestDispatcher rd = request.getRequestDispatcher("FindEmployeeSuccess.jsp");
			request.setAttribute("bean",bean);
			rd.forward(request, response);
		}	
	}

	
	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String rid=request.getParameter("id");
        String rid1=request.getParameter("id1");
        
        List<Mobile> list = dao.findAllMobile();
        
        if(rid1==null) {
        
        RequestDispatcher rd = request.getRequestDispatcher("DeleteEmployee.jsp");
        request.setAttribute("list", list);
        rd.forward(request, response);
        
        }
        if(rid==null) {
            
        RequestDispatcher rd = request.getRequestDispatcher("FindAllEmployee.jsp");
        request.setAttribute("list", list);
        rd.forward(request, response);
        }
        
        
    }

}
