package com.teac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.teacher.bean.Teacher;
import com.teacher.dao.TeacherDAO;


@Controller
public class TMScontroller {
	
	@Autowired
	TeacherDAO dao;

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

	@RequestMapping("InsertTeacher")
	public ModelAndView loadinsertStudent() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("InsertTeacher");
		return mv;
	}

	@RequestMapping("PerformInsert")
	public ModelAndView performinsertstudent(@ModelAttribute("bean") Teacher bean) {
		dao.insertTeacher(bean);
		ModelAndView mv = new ModelAndView("InsertTeacherSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("UpdateTeacher")
	public ModelAndView loadupdateTeacher() {
		ModelAndView mv = new ModelAndView("UpdateTeacher");
		return mv;
	}

	@RequestMapping("PerformUpdate")
	public ModelAndView performupdateTeacher(@ModelAttribute("bean") Teacher bean) {
		dao.updateTeacher(bean);
		ModelAndView mv = new ModelAndView("UpdateTeacherSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("DeleteTeacher")
	public ModelAndView loaddeleteTeacher() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("DeleteTeacher");
		mv.addObject("idList", list);
		return mv;

	}

	@RequestMapping("PerformDelete")
	public ModelAndView performdeleteTeacher(@ModelAttribute("bean") Teacher bean) {
		dao.deleteTeacher(bean);
		ModelAndView mv = new ModelAndView("DeleteTeacherSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("FindTeacher")
	public ModelAndView loadfinTeacher() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("FindTeacher");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("PerformFind")
	public ModelAndView performfindStudent(@ModelAttribute("bean") Teacher bean) {
		Teacher tea = dao.findTeacher(bean);
		ModelAndView mv = new ModelAndView("FindTeacherSuccess");
		mv.addObject("bean", tea);
		return mv;
	}

	@RequestMapping("FindAllTeacher")
	public ModelAndView loadfindallTeacher() {
		List<Teacher> teaList = dao.getTeachers();
		ModelAndView mv = new ModelAndView("FindAllTeacher");
		mv.addObject("idList", teaList);
		return mv;
	}


}
