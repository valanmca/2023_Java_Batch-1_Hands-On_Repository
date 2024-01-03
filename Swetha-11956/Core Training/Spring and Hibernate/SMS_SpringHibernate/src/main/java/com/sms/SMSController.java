package com.sms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sms.bean.Students;
import com.sms.dao.StudentsDAO;

@Controller
public class SMSController {

	@Autowired
	StudentsDAO dao;

	@RequestMapping("Link")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Link");
		return mv;
	}
	
	@RequestMapping("heading")
	public ModelAndView loadheading() {
		ModelAndView mv = new ModelAndView("heading");
		return mv;
	}

	@RequestMapping("InsertStudent")
	public ModelAndView loadInsertStudent() {
		ModelAndView mv = new ModelAndView("InsertStudent");
		return mv;
	}

	@RequestMapping("PerformInsert")
	public ModelAndView PerformInsertStudent(@ModelAttribute("bean") Students bean) {

		ModelAndView mv = new ModelAndView();

		try {
			dao.insertStudent(bean);
			mv.setViewName("InsertStudentSuccess");

		} catch (Exception e) {
			mv.setViewName("InsertStudentFail");
		}

		return mv;
	}

	@RequestMapping("UpdateStudent")
	public ModelAndView loadUpdateStudent() {
		ModelAndView mv = new ModelAndView("UpdateStudent");
		return mv;
	}

	@RequestMapping("PerformUpdate")
	public ModelAndView PerformUpdateStudent(@ModelAttribute("bean") Students bean) {
		dao.updateStudent(bean);
		ModelAndView mv = new ModelAndView("UpdateStudentSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("DeleteStudent")
	public ModelAndView loadDeleteStudent() {
		List<Integer> list = dao.getRnoList();
		ModelAndView mv = new ModelAndView("DeleteStudent");
		mv.addObject("rnoList", list);
		return mv;
	}

	@RequestMapping("PerformDelete")
	public ModelAndView PerformDeleteStudent(@ModelAttribute("bean") Students bean) {
		dao.deleteStudent(bean);
		ModelAndView mv = new ModelAndView("DeleteStudentSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("FindStudent")
	public ModelAndView loadFindStudent() {
		List<Integer> list = dao.getRnoList();
		ModelAndView mv = new ModelAndView("FindStudent");
		mv.addObject("rnoList", list);
		return mv;
	}

	@RequestMapping("PerformFind")
	public ModelAndView performFindStudent(@ModelAttribute("bean") Students bean) {
		Students stud = dao.findStudent(bean);
		ModelAndView mv = new ModelAndView("FindStudentSuccess");
		mv.addObject("bean", stud);
		return mv;
	}

	@RequestMapping("FindAllStudent")
	public ModelAndView loadFindAllStudent() {
		List<Students> studList = dao.getStudent();

		ModelAndView mv = new ModelAndView("FindAllStudent");
		mv.addObject("rnoList", studList);
		return mv;
	}

}
