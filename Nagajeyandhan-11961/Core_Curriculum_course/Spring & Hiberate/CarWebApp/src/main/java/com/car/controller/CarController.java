package com.car.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.car.bean.Car;
import com.car.dao.CarDAO;

public class CarController extends HttpServlet {

	CarDAO dao = new CarDAO();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestForm = request.getParameter("car_button");
		
		if(requestForm.equals("InsertCar")) {	
			String carNo = request.getParameter("carNo");
			String manufacture = request.getParameter("manufacture");
			String model = request.getParameter("model");
			int kmsRan = Integer.parseInt(request.getParameter("kmsRan"));
			int priceExcepted = Integer.parseInt(request.getParameter("priceExcepted"));
			int noOfOwners = Integer.parseInt(request.getParameter("noOfOwners"));
			
			
			Car bean = new Car(carNo, manufacture, model, kmsRan, priceExcepted, noOfOwners);
			int n = dao.insertCar(bean);
			if(n==1) {
				response.sendRedirect("InsertCarSuccess.jsp");
			}else {
				response.sendRedirect("InsertCarFail.jsp");
			}
		}
	}
}
