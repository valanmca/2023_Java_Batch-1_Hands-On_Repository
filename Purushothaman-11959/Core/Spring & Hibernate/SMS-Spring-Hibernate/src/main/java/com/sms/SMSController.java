package com.sms;

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
	
	@RequestMapping("Welcome")
	public ModelAndView loadWelcome() {
		ModelAndView mv=new ModelAndView("Welcome");
		return mv;
	}
	
	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv=new ModelAndView("Links");
		return mv;
	}
	
	@RequestMapping("Navbar")
	public ModelAndView loadNavbar() {
		ModelAndView mv=new ModelAndView("Navbar");
		return mv;
	}
	
	@RequestMapping("InsertStudent")
	public ModelAndView loadInsertStudent() {
		ModelAndView mv=new ModelAndView("InsertStudent");
		return mv;
	}
	
	@RequestMapping("PerformInsert")
	public ModelAndView performInsert(@ModelAttribute("bean") Student bean) {
		ModelAndView mv=new ModelAndView();
		try {
		dao.insertStudent(bean);
		mv.addObject("bean",bean);
		mv.setViewName("InsertStudentSuccess");
		} catch(Exception e) {
			mv.setViewName("InsertStudentFail");
		}
		return mv;
	}
	
	@RequestMapping("DeleteStudent")
	public ModelAndView loadDeleteStudent() {
		List<Integer> idList=dao.getIdList();
		ModelAndView mv=new ModelAndView("DeleteStudent");
		mv.addObject("idList",idList);
		return mv;
	}
	
	@RequestMapping("PerformDelete")
	public ModelAndView performDelete(@ModelAttribute("bean") Student bean) {
	    dao.deleteStudent(bean);;
		ModelAndView mv=new ModelAndView("DeleteStudentSuccess");
		mv.addObject("bean",bean);
		return mv;
	}

	
	@RequestMapping("UpdateStudent")
	public ModelAndView loadUpdateStudent() {
		ModelAndView mv=new ModelAndView("UpdateStudent");
		return mv;
	}
	
	@RequestMapping("PerformUpdate")
	public ModelAndView performUpdate(@ModelAttribute("bean") Student bean) {
	    dao.updateStudent(bean);
		ModelAndView mv=new ModelAndView("UpdateStudentSuccess");
		mv.addObject("bean",bean);
		return mv;
	}
	
	@RequestMapping("FindStudent")
	public ModelAndView loadFindStudent() {
		List<Integer> idList=dao.getIdList();
		ModelAndView mv=new ModelAndView("FindStudent");
		mv.addObject("idList",idList);
		return mv;
	}
	
	@RequestMapping("PerformFind")
	public ModelAndView performFind(@ModelAttribute("bean") Student bean) {
	    dao.findStudent(bean);;
		ModelAndView mv=new ModelAndView("FindStudentSuccess");
		mv.addObject("bean",bean);
		return mv;
	}
	
	@RequestMapping("FindAllStudent")
	public ModelAndView loadFindAllStudent() {
		List<Student> stdList=dao.getAllStudent();
		ModelAndView mv=new ModelAndView("FindAllStudent");
		mv.addObject("stdList",stdList);
		return mv;
	}
	



}
