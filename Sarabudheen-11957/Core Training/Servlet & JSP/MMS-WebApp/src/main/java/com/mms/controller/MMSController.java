package com.mms.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.bean.Movies;
import com.mms.dao.MoviesDAO;

/**
 * Servlet implementation class MMSController
 */
@WebServlet("/MMSController")
public class MMSController extends HttpServlet {

	MoviesDAO dao = new MoviesDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String requestFrom = request.getParameter("mms_button");

		if (requestFrom.equals("Insert Movie")) {
			int id = Integer.parseInt(request.getParameter("mid"));
			String name = request.getParameter("mname");
			String type = request.getParameter("mtype");
			String language = request.getParameter("mlang");
			String duration = request.getParameter("mduration");

			Movies bean = new Movies(id, name, type, language, duration);
			int n = dao.insertMovie(bean);

			if (n == 1) {
				response.sendRedirect("InsertMovieSuccess.jsp");
			} else {
				response.sendRedirect("InsertMovieFail.jsp");
			}
		}

		if (requestFrom.equals("Update Movie")) {
			int id = Integer.parseInt(request.getParameter("mid"));
			String name = request.getParameter("mname");
			String type = request.getParameter("mtype");
			String language = request.getParameter("mlang");
			String duration = request.getParameter("mduration");

			Movies bean = new Movies(id, name, type, language, duration);
			int n = dao.updateMovie(bean);

			if (n == 1) {
				response.sendRedirect("UpdateMovieSuccess.jsp");
			} else {
				response.sendRedirect("UpdateMovieFail.jsp");
			}
		}

		if (requestFrom.equals("Delete Movie")) {
			int id = Integer.parseInt(request.getParameter("mid"));
			int n = dao.deleteMovie(id);

			if (n == 1) {
				response.sendRedirect("DeleteMovieSuccess.jsp");
			} else {
				response.sendRedirect("DeleteMovieFail.jsp");
			}
		}

		if (requestFrom.equals("Find Movie")) {
			int id = Integer.parseInt(request.getParameter("mid"));

			Movies bean = dao.findMovie(id);

			RequestDispatcher rd = request.getRequestDispatcher("FindMovieSuccess.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);

		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Movies> list = new LinkedList<Movies>();

		list = dao.findAllMovies();

		RequestDispatcher rd = request.getRequestDispatcher("FindAllMovies.jsp");

		request.setAttribute("list", list);
		rd.forward(request, response);
	}

}
