package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

@Controller
public class SMSController {

	@Autowired
	StudentDAO dao;

	@RequestMapping("header")
	public ModelAndView loadheader() {
		ModelAndView mv = new ModelAndView("header");
		return mv;
	}

	@RequestMapping("Home")
	public ModelAndView loadhome() {
		ModelAndView mv = new ModelAndView("Home");
		return mv;
	}

	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}

	@RequestMapping("InsertStudent")
	public ModelAndView loadInsertstudent() {
		ModelAndView mv = new ModelAndView("InsertStudent");

		return mv;
	}

	@RequestMapping("PerformInsert")
	public ModelAndView performInsert(@ModelAttribute("bean") Student bean) {

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
	public ModelAndView loadUpdatestudent() {
		ModelAndView mv = new ModelAndView("UpdateStudent");
		return mv;
	}

	@RequestMapping("PerformUpdate")
	public ModelAndView performUpdate(@ModelAttribute("bean") Student bean) {

		dao.updateStudent(bean);
		ModelAndView mv = new ModelAndView("UpdateStudentSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("DeleteStudent")
	public ModelAndView loadDeleteStudent() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteStudent");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("PerformDelete")
	public ModelAndView performDelete(@ModelAttribute("bean") Student bean) {

		dao.deleteStudent(bean);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteStudentSuccess");
		mv.addObject("bean", bean);

		return mv;
	}

	@RequestMapping("FindStudent")
	public ModelAndView FindStudent() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindStudent");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("PerformFind")
	public ModelAndView performFind(@ModelAttribute("bean") Student bean) {

		Student emp = dao.findStudent(bean);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindStudentSuccess");
		mv.addObject("bean", emp);

		return mv;
	}

	@RequestMapping("FindAllStudentSuccess")
	public ModelAndView FindAllStudent() {
		List<Integer> list = dao.getAllList();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindAllStudentSuccess");
		mv.addObject("idList", list);
		return mv;
	}

}
