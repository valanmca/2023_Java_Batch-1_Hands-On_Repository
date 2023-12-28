package com.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.student.bean.Student;
import com.student.dao.StudentDAO;

@Controller
public class SMScontroller {
	@Autowired
	StudentDAO dao;

	@RequestMapping("Heading")
	public ModelAndView loadHeading() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Heading");
		return mv;
	}

	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Links");
		return mv;
	}

	@RequestMapping("InsertStudent")
	public ModelAndView loadinsertStudent() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertStudent");
		return mv;
	}

	@RequestMapping("PerformInsert")
	public ModelAndView performinsertstudent(@ModelAttribute("bean") Student bean) {
		dao.insertStudent(bean);
		ModelAndView mv = new ModelAndView("InsertStudentSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("UpdateStudent")
	public ModelAndView loadupdateStudent() {
		ModelAndView mv = new ModelAndView("UpdateStudent");
		return mv;
	}

	@RequestMapping("PerformUpdate")
	public ModelAndView performupdateStudent(@ModelAttribute("bean") Student bean) {
		dao.updateStudent(bean);
		ModelAndView mv = new ModelAndView("UpdateStudentSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("DeleteStudent")
	public ModelAndView loaddeleteStudent() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("DeleteStudent");
		mv.addObject("idList", list);
		return mv;

	}

	@RequestMapping("PerformDelete")
	public ModelAndView performdeleteStudent(@ModelAttribute("bean") Student bean) {
		dao.deleteStudent(bean);
		ModelAndView mv = new ModelAndView("DeleteStudentSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("FindStudent")
	public ModelAndView loadfinStudent() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("FindStudent");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("PerformFind")
	public ModelAndView performfindStudent(@ModelAttribute("bean") Student bean) {
		Student stu = dao.findStudent(bean);
		ModelAndView mv = new ModelAndView("FindStudentSuccess");
		mv.addObject("bean", stu);
		return mv;
	}

	@RequestMapping("FindAllStudent")
	public ModelAndView loadfindallStudent() {
		List<Student> stuList = dao.getStudents();
		ModelAndView mv = new ModelAndView("FindAllStudent");
		mv.addObject("idList", stuList);
		return mv;
	}

}
