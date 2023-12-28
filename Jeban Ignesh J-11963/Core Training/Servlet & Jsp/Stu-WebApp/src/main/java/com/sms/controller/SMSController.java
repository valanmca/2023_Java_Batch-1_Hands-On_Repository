package com.sms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.sms.bean.Sms;
import com.sms.dao.SmsDAO;

/**
 * Servlet implementation class SMSController
 */
@WebServlet("/SMSController")
public class SMSController extends HttpServlet {
	SmsDAO dao = new SmsDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestFrom = request.getParameter("sms_button");

		if (requestFrom.equals("Insert Student")) {
			int rno = Integer.parseInt(request.getParameter("srno"));
			String name = request.getParameter("sname");
			int email = Integer.parseInt(request.getParameter("semail"));
			int section = Integer.parseInt(request.getParameter("ssection"));

			Sms bean = new Sms(rno,name,email,section);
			int n = dao.insertStudent(bean);

			if (n == 1) {
				response.sendRedirect("InsertStuSuccess.jsp");
			} else {
				response.sendRedirect("InsertEmployeeFail.jsp");
			}

		}

	}

}
