package com.vms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vms.bean.Vehicle;
import com.vms.dao.VehicleDAO;

/**
 * Servlet implementation class VMSController
 */
@WebServlet("/VMSController")
public class VMSController extends HttpServlet {
	
	VehicleDAO dao = new VehicleDAO();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String requestFrom = request.getParameter("vms_button");
		

		if (requestFrom.equals("Insert Vehicle")) {
			int id = Integer.parseInt(request.getParameter("VecId"));
			String name = request.getParameter("VecName");
			int no = Integer.parseInt(request.getParameter("VecNo"));
			String owner = request.getParameter("VecOwner");

			Vehicle bean = new Vehicle(id, name, no, owner);
			int n = dao.insertVehicle(bean);

			if (n == 1) {
				response.sendRedirect("InsertVehicleSuccess.jsp");
			} else {
				response.sendRedirect("InsertVehicleFail.jsp");
			}

		}
		
		if (requestFrom.equals("Delete Vehicle")) {
			int id = Integer.parseInt(request.getParameter("VecId"));

			int n = dao.deleteVehicle(id);

			if (n == 1) {
				response.sendRedirect("DeleteVehicleSuccess.jsp");
			} else {
				response.sendRedirect("DeleteVehicleFail.jsp");
			}

		}
		
		if (requestFrom.equals("Update Vehicle")) {
			int id = Integer.parseInt(request.getParameter("VecId"));
			String name = request.getParameter("VecName");
			int no = Integer.parseInt(request.getParameter("VecNo"));
			String owner = request.getParameter("VecOwner");

			Vehicle bean = new Vehicle(id, name, no, owner);
			int n = dao.updateVehicle(bean);

			if (n == 1) {
				response.sendRedirect("UpdateVehicleSuccess.jsp");
			} else {
				response.sendRedirect("UpdateVehicleFail.jsp");
			}

		}
		
		if (requestFrom.equals("Find Vehicle")) {
			int id = Integer.parseInt(request.getParameter("VecId"));

			Vehicle bean = dao.findVehicle(id);

			RequestDispatcher rd = request.getRequestDispatcher("FindVehicleSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);

		}

		
	}
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		String requestfrom =request.getParameter("delete");
		
		if(requestfrom==null) {
        List<Vehicle> list = dao.findAllVehicle();
        request.setAttribute("list", list);
        RequestDispatcher rd = request.getRequestDispatcher("FindAll.jsp");
        rd.forward(request, response);
		}
		else {
			
	        List<Vehicle> list = dao.findAllVehicle();
	        request.setAttribute("msg", list);
	        RequestDispatcher rd = request.getRequestDispatcher("DeleteVehicle.jsp");
	        rd.forward(request, response);
			
		}

}

}
