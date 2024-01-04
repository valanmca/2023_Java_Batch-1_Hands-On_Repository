package com.jeyandhan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jeyandhan.bean.Employee;
import com.jeyandhan.dao.EmployeeDAO;

@Controller
public class EMSController {
	
	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}
	
	@RequestMapping("InsertEmployee")
	public ModelAndView loadInsertEmployee() {
		ModelAndView mv = new ModelAndView("InsertEmployee");
		return mv;
	}
	
	@RequestMapping("performInsert")
	public ModelAndView performInsert(@ModelAttribute("bean") Employee bean) {
		
		dao.insertEmployee(bean);
		
		ModelAndView mv = new ModelAndView("InsertEmployeeSuccess");
		mv.addObject("bean",bean);
		return mv;
	}
	
	@RequestMapping("UpdateEmployee")
	public ModelAndView loadUpdateEmployee() {
		ModelAndView mv = new ModelAndView("UpdateEmployee");
		return mv;
	}
	
	@RequestMapping("performUpdate")
	public ModelAndView performUpdate(@ModelAttribute("bean") Employee bean) {
		
		dao.updateEmployee(bean);
		
		ModelAndView mv = new ModelAndView("UpdateEmployeeSuccess");
		return mv;
	}
	
	@RequestMapping("DeleteEmployee")
	public ModelAndView loadDeleteEmployee() {
		ModelAndView mv = new ModelAndView("DeleteEmployee");
		return mv;
	}
	
	@RequestMapping("performDelete")
	public ModelAndView performDelete(@ModelAttribute("bean") Employee bean) {
		
		dao.DeleteEmployee(bean);
		
		ModelAndView mv = new ModelAndView("UpdateEmployeeSuccess");
		return mv;
	}
}
