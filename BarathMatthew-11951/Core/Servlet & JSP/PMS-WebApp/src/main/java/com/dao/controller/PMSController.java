package com.dao.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.pms.bean.Product;
import com.pms.dao.ProductDAO;

/**
 * Servlet implementation class PMSController
 */
@WebServlet("/PMSController")
public class PMSController extends HttpServlet {
	ProductDAO dao = new ProductDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String requestForm = request.getParameter("pms_button");

		if(requestForm.equals("Insert Product")) {
			int id = Integer.parseInt(request.getParameter("pid"));
			String name = request.getParameter("pname");
			int qnt = Integer.parseInt(request.getParameter("pqnt"));
			int price =Integer.parseInt(request.getParameter("pprice"));
			Product bean = new Product(id,name,qnt,price);
			
			int n = dao.insertProduct(bean);
			
			if (n==1) {
				response.sendRedirect("InsertProductSuccess.jsp");
			}
			else {
				response.sendRedirect("InsertProductFail.jsp");
			}
		}
		else if(requestForm.equals("Update Product")) {
			int id = Integer.parseInt(request.getParameter("pid"));
			String name = request.getParameter("pname");
			int salary = Integer.parseInt(request.getParameter("pqnt"));
			int dno =Integer.parseInt(request.getParameter("pprice"));
			Product bean = new Product(id,name,salary,dno);
			
			int n = dao.updateProduct(bean);
			
			if (n==1) {
				response.sendRedirect("UpdateProductSuccess.jsp");
			}
			else {
				response.sendRedirect("UpdateProductFail.jsp");
			}
		}
		else if(requestForm.equals("Delete Product")) {
			int id = Integer.parseInt(request.getParameter("pid"));
			int n = dao.deleteProduct(id);
			if (n==1) {
				response.sendRedirect("DeleteProductSuccess.jsp");
			}
			else {
				response.sendRedirect("DeleteProductFail.jsp");
			}
		}
		else if(requestForm.equals("Find Product")) {
			int id = Integer.parseInt(request.getParameter("pid"));
			Product bean = dao.findProduct(id);
			
			RequestDispatcher rd = request.getRequestDispatcher("FindProductSuccess.jsp");
			request.setAttribute("bean",bean);
			rd.forward(request, response);
			
		}	
	}

	
	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String rid=request.getParameter("id");
        
        List<Product> list = dao.findAllProduct();
        
        if(rid.equals("a")) {
        
        RequestDispatcher rd = request.getRequestDispatcher("DeleteProduct.jsp");
        request.setAttribute("list", list);
        rd.forward(request, response);
        
        }
        
        if(rid.equals("b")) {
        RequestDispatcher rd = request.getRequestDispatcher("FindAllProduct.jsp");
        request.setAttribute("list", list);
        rd.forward(request, response);
        }
        
        
    }

}
