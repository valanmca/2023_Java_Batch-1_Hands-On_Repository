package com.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.conn.DBConnection;
import com.dao.TeacherDAO;
import com.entity.Teacher;
@WebServlet("/register")
public class RegisterServlet  extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int experience = Integer.parseInt(req.getParameter("experience"));
		String qualification = req.getParameter("qualification");
		int   contact = Integer.parseInt(req.getParameter("contact"));
		String email = req.getParameter("email");
		
		System.out.println(id+name+experience+qualification+contact+email);
		Teacher teacher=new Teacher(id,name,experience,qualification,contact,email);
		TeacherDAO dao=new TeacherDAO (DBConnection.getConn());
		
		
	           
	
		HttpSession session=req.getSession();
		boolean f=dao.addTeacher(teacher);
		if(f) {
			session.setAttribute("sucuessMessage","Teacher Details Submit Sucessfully");
			resp.sendRedirect("add_teacher.jsp");
			//System.out.println("Teacher Details Submit Sucessfully");
		}else {
			session.setAttribute("errorMessage","Something wrong on server");
			resp.sendRedirect("add_teacher.jsp");
			//System.out.println("Something wrong on server");	
		}
		
	}
}
