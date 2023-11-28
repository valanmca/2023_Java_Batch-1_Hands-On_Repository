package com.pms.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pms.bean.Products;
import com.pms.dao.ProductDAO;

/**
 * Servlet implementation class PMSController
 */
@WebServlet("/PMSController")
public class PMSController extends HttpServlet {

	ProductDAO dao = new ProductDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String requestFrom = request.getParameter("pms_button");

		if (requestFrom.equals("Insert Product")) {
			int id = Integer.parseInt(request.getParameter("pid"));
			String name = request.getParameter("pname");
			int quantity = Integer.parseInt(request.getParameter("pquantity"));
			float price = Float.parseFloat(request.getParameter("pprice"));

			Products bean = new Products(id, name, quantity, price);
			int n = dao.insertProduct(bean);

			if (n == 1) {
				response.sendRedirect("InsertProductSuccess.jsp");
			} else {
				response.sendRedirect("InsertProductFailed.jsp");
			}

		}

		if (requestFrom.equals("Update Product")) {
			int id = Integer.parseInt(request.getParameter("pid"));
			String name = request.getParameter("pname");
			int quantity = Integer.parseInt(request.getParameter("pquantity"));
			float price = Float.parseFloat(request.getParameter("pprice"));

			Products bean = new Products(id, name, quantity, price);
			int n = dao.updateProduct(bean);

			if (n == 1) {
				response.sendRedirect("UpdateProductSuccess.jsp");
			} else {
				response.sendRedirect("UpdateProductFailed.jsp");
			}

		}

		if (requestFrom.equals("Delete Product")) {
			int id = Integer.parseInt(request.getParameter("pid"));
			int n = dao.deleteProduct(id);

			if (n == 1) {
				response.sendRedirect("DeleteProductSuccess.jsp");
			} else {
				response.sendRedirect("DeleteProductFailed.jsp");
			}
		}

		if (requestFrom.equals("Find Product")) {
			int id = Integer.parseInt(request.getParameter("pid"));

			Products bean = dao.findProduct(id);

			RequestDispatcher rd = request.getRequestDispatcher("FindProductSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);

		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Products> list = new LinkedList<Products>();

		list = dao.findAllProducts();

		RequestDispatcher rd = request.getRequestDispatcher("FindAllProducts.jsp");

		request.setAttribute("list", list);
		rd.forward(request, response);

	}

}
