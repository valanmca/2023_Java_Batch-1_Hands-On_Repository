package com.dao.controller;

import java.io.IOException;

import java.util.List;

import com.msms.bean.Mobile;
import com.msms.dao.MobileDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class EMSController
 */
@WebServlet("/MSMSController")
public class MSMSController extends HttpServlet {
	
	MobileDAO dao = new MobileDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String requestForm = request.getParameter("mob_button");

		if(requestForm.equals("Insert Mobile")) {
			int mobId = Integer.parseInt(request.getParameter("mid"));
			String mobName = request.getParameter("mname");
			String braName = request.getParameter("bname");
			int mobPrice =Integer.parseInt(request.getParameter("mprice"));
			Mobile bean = new Mobile(mobId,mobName,braName,mobPrice);
			
			int n = dao.insertMobile(bean);
			
			if (n==1) {
				response.sendRedirect("InsertMobileSuccess.jsp");
			}
			else {
				response.sendRedirect("InsertMobileFail.jsp");
			}
		}
		else if(requestForm.equals("Update Mobile")) {
			int mobId = Integer.parseInt(request.getParameter("mid"));
			String mobName = request.getParameter("mname");
			String braName = request.getParameter("bname");
			int mobPrice =Integer.parseInt(request.getParameter("mprice"));
			Mobile bean = new Mobile(mobId,mobName,braName,mobPrice);
			
			int n = dao.updateMobile(bean);
			
			if (n==1) {
				response.sendRedirect("UpdateMobileSuccess.jsp");
			}
			else {
				response.sendRedirect("UpdateMobileFail.jsp");
			}
		}
		else if(requestForm.equals("Delete Mobile")) {
			int id = Integer.parseInt(request.getParameter("mid"));
			int n = dao.deleteMobile(id);
			if (n==1) {
				response.sendRedirect("DeleteMobileSuccess.jsp");
			}
			else {
				response.sendRedirect("DeleteMobileFail.jsp");
			}
		}
		else if(requestForm.equals("Find Mobile")) {
			int id = Integer.parseInt(request.getParameter("mid"));
			Mobile bean = dao.findMobile(id);
			
			RequestDispatcher rd = request.getRequestDispatcher("FindMobileSuccess.jsp");
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
        
        RequestDispatcher rd = request.getRequestDispatcher("DeleteMobile.jsp");
        request.setAttribute("list", list);
        rd.forward(request, response);
        
        }
        if(rid==null) {
            
        RequestDispatcher rd = request.getRequestDispatcher("FindAllMobile.jsp");
        request.setAttribute("list", list);
        rd.forward(request, response);
        }
        
        
    }
}