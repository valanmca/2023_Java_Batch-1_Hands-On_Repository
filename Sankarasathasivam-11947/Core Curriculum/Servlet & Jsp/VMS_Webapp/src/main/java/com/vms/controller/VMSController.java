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

@WebServlet("/VMSController")
public class VMSController extends HttpServlet {

	VehicleDAO dao = new VehicleDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String requestFrom = request.getParameter("vms_button");

		if (requestFrom.equals("InsertVehicles")) {

			int number = Integer.parseInt(request.getParameter("v_no"));
			String brand = request.getParameter("v_brand");
			Float mileage = Float.parseFloat(request.getParameter("v_mileage"));

			Vehicle bean = new Vehicle(number, brand, mileage);
			int n = dao.insertVehicle(bean);

			if (n == 1) {
				response.sendRedirect("InsertVehiclesSuccess.jsp");
			} else {
				response.sendRedirect("InsertVehiclesFailed.jsp");
			}
		}

		if (requestFrom.equals("UpdateVehicles")) {

			int number = Integer.parseInt(request.getParameter("v_no"));
			String brand = request.getParameter("v_brand");
			Float mileage = Float.parseFloat(request.getParameter("v_mileage"));

			Vehicle bean = new Vehicle(number, brand, mileage);
			int n = dao.UpdateVehicle(bean);

			if (n == 1) {
				response.sendRedirect("UpdateVehiclesSuccess.jsp");
			} else {
				response.sendRedirect("UpdateVehiclesFailed.jsp");
			}
		}

		if (requestFrom.equals("DeleteVehicles")) {

			int number = Integer.parseInt(request.getParameter("v_no"));

			int n = dao.deleteVehicle(number);

			if (n == 1) {
				response.sendRedirect("DeleteVehiclesSuccess.jsp");
			} else {
				response.sendRedirect("DeleteVehiclesFailed.jsp");
			}
		}

		if (requestFrom.equals("FindVehicles")) {

			int number = Integer.parseInt(request.getParameter("v_no"));

			Vehicle bean = dao.viewVehicle(number);

			RequestDispatcher rd = request.getRequestDispatcher("FindVehiclesSuccess.jsp");

			request.setAttribute("bean", bean);
			rd.forward(request, response);
		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Vehicle> list = dao.viewAllVehicle();

		RequestDispatcher rd = request.getRequestDispatcher("FindAllVehiclesSuccess.jsp");

		request.setAttribute("list", list);
		rd.forward(request, response);
	}

}
