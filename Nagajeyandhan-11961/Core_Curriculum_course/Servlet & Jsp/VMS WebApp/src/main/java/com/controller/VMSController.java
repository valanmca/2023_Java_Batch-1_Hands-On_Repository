package com.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Vehicle;
import com.dao.VehicleDAO;

/**
 * Servlet implementation class VMSController
 */
@WebServlet("/VMSController")
public class VMSController extends HttpServlet {
	VehicleDAO dao = new VehicleDAO();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestForm = request.getParameter("vms_button");
		
		if(requestForm.equals("InsertVehicle")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			int price = Integer.parseInt(request.getParameter("price"));
			
			Vehicle bean = new Vehicle(id,name,price);
			int n = dao.insertVehicle(bean);
			if(n==1) {
				response.sendRedirect("InsertVehicleSuccess.jsp");
			}else {
				response.sendRedirect("InsertVehicleFail.jsp");
			}
		}
		
		if(requestForm.equals("UpdateVehicle")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			int price = Integer.parseInt(request.getParameter("price"));
			
			Vehicle bean = new Vehicle(id,name,price);
			int n = dao.updateVehicle(bean);
			if(n==1) {
				response.sendRedirect("UpdateVehicleSuccess.jsp");
			}else {
				response.sendRedirect("UpdateVehicleFail.jsp");
			}
		}
		
		if(requestForm.equals("DeleteVehicle")) {
			int id = Integer.parseInt(request.getParameter("id"));
			
			int n = dao.deleteVehicle(id);
			if(n==1) {
				response.sendRedirect("DeleteVehicleSuccess.jsp");
			}else {
				response.sendRedirect("DeleteVehicleFail.jsp");
			}
		}
		
		if(requestForm.equals("FindVehicle")) {
			int id = Integer.parseInt(request.getParameter("id"));
			
			Vehicle bean = dao.findVehicle(id);
			
			RequestDispatcher rd = request.getRequestDispatcher("FindVehicleSuccess.jsp");
			request.setAttribute("bean",bean);
			rd.forward(request, response);
		}
	}
	
	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			List<Vehicle> list = dao.findAllVehicle();
			
			// RequestDispatcher rd = request.getRequestDispatcher("FindAllVehicleSuccess.jsp");
			//request.setAttribute("list",list);
			//rd.forward(request, response);
			
			 String s= request.getParameter("id");
		        
		        
		        
		        if(s==null) {
		        	RequestDispatcher rd = request.getRequestDispatcher("FindAllVehicleSuccess.jsp");
					request.setAttribute("list",list);
					rd.forward(request, response);
		        }else {
		        RequestDispatcher rd = request.getRequestDispatcher("DeleteVehicle.jsp");
		        request.setAttribute("list", list);
		        rd.forward(request, response);
		        
		        }
	
			
		}

}
