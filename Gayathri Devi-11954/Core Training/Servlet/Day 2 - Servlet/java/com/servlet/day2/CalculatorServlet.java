package com.servlet.day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String val1 = request.getParameter("num1");
		int n1 = Integer.parseInt(val1);

		String val2 = request.getParameter("num2");
		int n2 = Integer.parseInt(val2);

		String oper = request.getParameter("oper");

		if (oper.equals("Add")) {
			int a_ans = n1 + n2;
			out.println(a_ans);
		} 
		else if (oper.equals("Sub")) {
			float s_ans = n1 - n2;
			out.println(s_ans);
		} 
		else if (oper.equals("Mul")) {
			int m_ans = n1 * n2;
			out.println(m_ans);
		}
		else if (oper.equals("Div")) {
			float d_ans = n1 / n2;
			out.println(d_ans);
		}
		else
			out.println("Give valid one");
	}

}
