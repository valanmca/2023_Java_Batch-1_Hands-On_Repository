package com.domnic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.domnic.bean.Student;
import com.sms.dao.StudentDAO;

@Controller
public class SMSController {

	@Autowired
	StudentDAO dao;

	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}

	@RequestMapping("InsertStudent")
	public ModelAndView loadInsertStudent() {
		ModelAndView mv = new ModelAndView("InsertStudent");
		return mv;
	}

	@RequestMapping("PerformInsert")
	public ModelAndView PerformInsert(@ModelAttribute("bean") Student bean) {
		dao.insertStudent(bean);
		ModelAndView mv = new ModelAndView("InsertStudentSuccess");
		mv.addObject("bean", bean);
		return mv;
	}
	@RequestMapping("UpdateStudent")
	public ModelAndView loadUpdateStudent() {
		ModelAndView mv = new ModelAndView("UpdateStudent");
		return mv;
	}

	@RequestMapping("PerformUpdate")
	public ModelAndView PerformUpdate(@ModelAttribute("bean") Student bean) {
		dao.updateStudent(bean);
		ModelAndView mv = new ModelAndView("UpdateStudentSuccess");
		mv.addObject("bean", bean);
		return mv;
	}
	
	@RequestMapping("DeleteStudent")
	public ModelAndView loadDeleteStudent() {
		List<Integer>list=dao.getIdList();
		
		ModelAndView mv = new ModelAndView("DeleteStudent");
		mv.addObject("idList",list);
		return mv;
	}

	@RequestMapping("PerformDelete")
	public ModelAndView PerformDelete(@ModelAttribute("bean") Student bean) {
		dao.deleteStudent(bean);
		ModelAndView mv = new ModelAndView("DeleteStudentSuccess");
		mv.addObject("bean", bean);
		return mv;
	}
	
	@RequestMapping("FindStudent")
	public ModelAndView loadFindStudent() {
		List<Integer>list=dao.getIdList();
		
		ModelAndView mv = new ModelAndView("FindStudent");
		mv.addObject("idList",list);
		return mv;
	}

	@RequestMapping("PerformFind")
	public ModelAndView PerformFind(@ModelAttribute("bean") Student bean) {
		Student stu=dao.findStudent(bean);
		ModelAndView mv = new ModelAndView("FindStudentSuccess");
		mv.addObject("bean",stu);
		return mv;
	}
	
	@RequestMapping("FindAllStudent")
    public ModelAndView loadFindAllStudent() {
        List<Student> List=dao.getStudent();
        ModelAndView mv=new ModelAndView("FindAllStudent");
        mv.addObject("idList",List);
        return mv;
    }
}
