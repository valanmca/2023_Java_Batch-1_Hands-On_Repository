package com.aravind;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aravind.bean.Student;
import com.aravind.dao.StudentDAO;

@Controller
public class SMSController {
	
	
@Autowired
StudentDAO dao;

	@RequestMapping("Welcome")
	public ModelAndView locateWelcome()
	{
		ModelAndView mv=new ModelAndView("Welcome");
		return mv;
	}
	@RequestMapping("Home")
	public ModelAndView locateHome()
	{
		ModelAndView mv=new ModelAndView("Home");
		return mv;
	}
	
	
	@RequestMapping("Links")
	public ModelAndView locateLinks()
	{
		ModelAndView mv=new ModelAndView("Links");
		return mv;
	}
	
	@RequestMapping("InsertStudent")
	public ModelAndView locateInsert()
	{
		ModelAndView mv=new ModelAndView("InsertStudent");
		return mv;
	}
	
	@RequestMapping("PerformInsert")
	public ModelAndView performInsert(@ModelAttribute("bean") Student bean)
	{
		ModelAndView mv=new ModelAndView();
		
		try {
			dao.insertStudent(bean);
			
			mv.addObject("value",bean);
			mv.setViewName("InsertStudentSuccess");
			
			
		}catch(Exception e)
		{
			mv.setViewName("InsertStudentFail");
		}
		return mv;
		
	}
	
	@RequestMapping("UpdateStudent")
	public ModelAndView locateUpdate()
	{
		ModelAndView mv=new ModelAndView("UpdateStudent");
		return mv;
	}
	
	@RequestMapping("PerformUpdate")
	public ModelAndView performUpdate(@ModelAttribute("bean") Student bean)
	{
		ModelAndView mv=new ModelAndView();
		try {
			dao.updateStudent(bean);
			mv.setViewName("UpdateStudentSuccess");
			mv.addObject("value",bean);
			
		}catch(Exception e)
		{
			mv.setViewName("UpdateStudentFail");
		}
		
		
		
		return mv;
	}
	
	@RequestMapping("DeleteStudent")
	public ModelAndView locateDelete()
	{
		List<Integer> list=dao.getIdList();
		ModelAndView mv=new ModelAndView("DeleteStudent");
		mv.addObject("msg",list);
		return mv;
	}
	
	
	@RequestMapping("PerformDelete")
	public ModelAndView performDelete(@ModelAttribute("bean") Student bean)
	{
		dao.deleteStudent(bean);
		ModelAndView mv=new ModelAndView("DeleteStudentResult");
		mv.addObject("value",bean);
		
		return mv;
	}
	
	@RequestMapping("FindStudent")
	public ModelAndView locateFind()
	{
		List<Integer> list=dao.getIdList();
		ModelAndView mv=new ModelAndView("FindStudent");
		mv.addObject("msg",list);
		return mv;
	}
	
	@RequestMapping("PerformFind")
	public ModelAndView performFind(@ModelAttribute("bean") Student bean)
	{
		Student stu=dao.findStudent(bean);
		ModelAndView mv=new ModelAndView("FindStudentResult");
		
		mv.addObject("bean",stu);
		
		return mv;
	}
	
	@RequestMapping("FindAllStudentResult")
	public ModelAndView performFindall()
	{
		List<Integer> list=dao.getAllList();
		ModelAndView mv=new ModelAndView("FindAllStudentResult");
		mv.addObject("msg",list);
		return mv;
	}
	
	
	

}
