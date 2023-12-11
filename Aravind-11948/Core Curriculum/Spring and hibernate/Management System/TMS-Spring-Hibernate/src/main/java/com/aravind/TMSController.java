package com.aravind;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aravind.bean.Teacher;
import com.aravind.dao.TeacherDAO;

@Controller
public class TMSController {
	@Autowired
	TeacherDAO dao;
	
	@RequestMapping("Links")
	public ModelAndView locateLink()
	{
		ModelAndView mv=new ModelAndView("Links");
		return mv;
	}
	
	@RequestMapping("InsertTeacher")
	public ModelAndView insertTeacher()
	{
		ModelAndView mv=new ModelAndView("InsertTeacher");
		return mv;
	}
	
	@RequestMapping("PerformInsert")
	public ModelAndView Performinsert(@ModelAttribute("bean") Teacher bean)
	
	{
		dao.insertTeacher(bean);
		
		ModelAndView mv=new ModelAndView("InsertTeacherSuccess");
		mv.addObject("value",bean);
		return mv;
	}
	
	@RequestMapping("DeleteTeacher")
	public ModelAndView deleteTeacher()
	{
		List<Integer> list=dao.getIdList();
		ModelAndView mv=new ModelAndView("DeleteTeacher");
		mv.addObject("Idlist",list);
		return mv;
	}
	
	
	@RequestMapping("PerformDelete")
	public ModelAndView PerformDelete(@ModelAttribute("bean") Teacher bean)
	
	{
		dao.deleteTeacher(bean);
		
		ModelAndView mv=new ModelAndView("DeleteTeacherResult");
		mv.addObject("value",bean);
		return mv;
	}
	
	
	
	
	
	@RequestMapping("UpdateTeacher")
	public ModelAndView updateTeacher()
	{
		ModelAndView mv=new ModelAndView("UpdateTeacher");
		return mv;
	}
	
	@RequestMapping("PerformUpdate")
	public ModelAndView PerformUpdate(@ModelAttribute("bean") Teacher bean)
	
	{
		dao.updateTeacher(bean);
		
		ModelAndView mv=new ModelAndView("UpdateTeacherSuccess");
		mv.addObject("value",bean);
		return mv;
	}
	
	
	@RequestMapping("FindTeacher")
	public ModelAndView findTeacher()
	{
		List<Integer> list=dao.getIdList();
		ModelAndView mv=new ModelAndView("FindTeacher");
		mv.addObject("Idlist",list);
		return mv;
	}
	
	@RequestMapping("PerformFind")
	public ModelAndView Performfind(@ModelAttribute("bean") Teacher bean)
	
	{
		Teacher teach=dao.findTeacher(bean);
		
		ModelAndView mv=new ModelAndView("FindTeacherResult");
		mv.addObject("value",bean);
		mv.addObject("list",teach);
		return mv;
	}
	

}
