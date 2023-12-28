package com.car.controller;

import java.io.IOException;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.car.dao.CarDAO;
import com.car.bean.Car;

@WebServlet("/CarController")
public class CarController extends HttpServlet {
	CarDAO dao = new CarDAO();
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requsestFrom = request.getParameter("cus_button");
		
		///System.out.println(requsestFrom);.
		/// INSERT:
		
		if (requsestFrom.equals("registerCarz")) {

			String no=request.getParameter("Carno");
			String  man= request.getParameter("Manufacture");
			String mod=request.getParameter("Model");
			int kms = Integer.parseInt(request.getParameter("KmsRan"));
			int price=Integer.parseInt(request.getParameter("PriceExpected"));
			int noOfOwn=Integer.parseInt(request.getParameter("NoOfOwners"));


			Car bean = new Car(no, man, mod, kms,price,noOfOwn );
			int n = dao.insertCar(bean);
			if (n == 1) {
			  request.setAttribute("sucuessMessage","CAR Record Added Successfully");
			  RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
			  rd.forward(request, response);
			}else {
			request.setAttribute("errorMessage","CAR wrong on server");
			response.sendRedirect("Register.jsp");
			}
		
		}
		
//		// UPDATED:
//		if (requsestFrom.equals("Update Customer")) {
//
//			String no=request.getParameter("Carno");
//			String  man= request.getParameter("Manufacture");
//			String mod=request.getParameter("Model");
//			int kms = Integer.parseInt(request.getParameter("KmsRan"));
//			int price=Integer.parseInt(request.getParameter("PriceExpected"));
//			int noOfOwn=Integer.parseInt(request.getParameter("NoOfOwners"));
//
//			Car bean = new Car(no, man, mod, kms,price,noOfOwn );
//
//			int n = dao.updateCar(bean);
//
//			if (n == 1) {
//				request.setAttribute("sucuessMessage","Customer Details Updated Sucessfully");
//				  RequestDispatcher rd=request.getRequestDispatcher("UpdateCustomer.jsp");
//				  rd.forward(request, response);
//
//				} else {
//
//				request.setAttribute("errorMessage","Customer wrong on server");
//
//				response.sendRedirect("UpdateCustomer.jsp");
//				}
//			}
//		
//		// DELETE:
//		if (requsestFrom.equals("DeleteCustomer")) {
//
//			int id = Integer.parseInt(request.getParameter("cusID"));
//
//			int n = dao.deleteCustomer(id);
//
//			if (n == 1) {
//				request.setAttribute("sucuessMessage","Customer Record Delete Sucessfully");
//				  RequestDispatcher rd=request.getRequestDispatcher("DeleteCustomer.jsp");
//				  rd.forward(request, response);
//
//				} else {
//
//				request.setAttribute("errorMessage","Customer wrong on server");
//
//				response.sendRedirect("DeleteCustomer.jsp");
//				}
//			}		
//	}
}}