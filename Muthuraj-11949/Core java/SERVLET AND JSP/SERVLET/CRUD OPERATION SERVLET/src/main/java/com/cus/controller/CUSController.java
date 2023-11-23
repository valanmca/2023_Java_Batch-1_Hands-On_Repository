package com.cus.controller;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cus.bean.Customer;
import com.cus.dao.CustomerDAO;

@WebServlet("/CUSController")
public class CUSController extends HttpServlet {
	CustomerDAO dao = new CustomerDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requsestFrom = request.getParameter("cus_button");
		/// INSERT:
		if (requsestFrom.equals("Insert Customer")) {

			int id = Integer.parseInt(request.getParameter("cusID"));
			String name = request.getParameter("cusname");
			String email = request.getParameter("cusEmail");
			int ConNumber = Integer.parseInt(request.getParameter("cusContactNumber"));
			String Location = request.getParameter("cusLocation");

			Customer bean = new Customer(id, name, email, ConNumber, Location);
			int n = dao.insertCustomer(bean);

			if (n == 1) {
				response.sendRedirect("InsertCustomerSuccess.jsp");

			} else {
				response.sendRedirect("InsertCustomerFail.jsp");
			}
		}
		// UPDATED:
		if (requsestFrom.equals("Update Customer")) {

			int id = Integer.parseInt(request.getParameter("cusID"));
			String name = request.getParameter("cusname");
			String email = request.getParameter("cusEmail");
			int ConNumber = Integer.parseInt(request.getParameter("cusContactNumber"));
			String Location = request.getParameter("cusLocation");

			Customer bean = new Customer(id, name, email, ConNumber, Location);
			int n = dao.updateCustomer(bean);

			if (n == 1) {
				response.sendRedirect("UpdateCustomerSuccess.jsp");

			} else {
				response.sendRedirect("UpdateCustomerFail.jsp");
			}
		}
		// DELETE:
		if (requsestFrom.equals("Delete Customer")) {

			int id = Integer.parseInt(request.getParameter("cusID"));

			int n = dao.deleteCustomer(id);

			if (n == 1) {
				response.sendRedirect("DeleteCustomerSuccess.jsp");

			} else {
				response.sendRedirect("DeleteCustomerFail.jsp");
			}
		}

		// FIND:
		if (requsestFrom.equals("FindCustomer")) {
			int id = Integer.parseInt(request.getParameter("cusID"));

			Customer bean = dao.findCustomer(id);

			RequestDispatcher rd = request.getRequestDispatcher("FindCustomerSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);
		}

	}
	//FINDALL
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		List<Customer> list =dao.findAllCustomer();
		RequestDispatcher rd = request.getRequestDispatcher("FindAllCustomerSuccess.jsp");
		request.setAttribute("list", list);
		rd.forward(request, response);
	}
}